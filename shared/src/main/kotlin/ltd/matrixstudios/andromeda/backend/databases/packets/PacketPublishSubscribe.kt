package ltd.matrixstudios.andromeda.backend.databases.packets

import ltd.matrixstudios.andromeda.backend.serialization.SerializationManager
import redis.clients.jedis.JedisPubSub

class PacketPublishSubscribe : JedisPubSub() {

    override fun onMessage(channel: String?, message: String?) {
        val packet = SerializationManager.GSON.fromJson(message, RedisPacket::class.java)

        packet?.action()
        println("[Packet] Received packet " + packet.packetId)
    }
}