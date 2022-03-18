package ltd.matrixstudios.andromeda.backend.databases.packets

import ltd.matrixstudios.andromeda.Andromeda
import ltd.matrixstudios.andromeda.backend.serialization.SerializationManager
import java.util.concurrent.ForkJoinPool

object RedisPacketDistributor {

    fun loadPubSub() {
        //Andromeda.INSTANCE.andromedaRedis.resource.subscribe(PacketPublishSubscribe(), "Andromeda::packets::mainPacketChannel")
    }

    fun sendGeneralMessage(message: String) {
        ForkJoinPool.commonPool().execute {
            Andromeda.INSTANCE.andromedaRedis.secondaryPacketPool.resource.publish("Andromeda::packets::secondaryPacketChannel", message)
        }
    }

    fun send(redisPacket: RedisPacket) {
        ForkJoinPool.commonPool().execute {
            val dataToSend = "${redisPacket.packetId}||${SerializationManager.GSON.toJson(redisPacket)}"

            Andromeda.INSTANCE.andromedaRedis.resource.publish("Andromeda::packets::mainPacketChannel", dataToSend)
        }
    }
}