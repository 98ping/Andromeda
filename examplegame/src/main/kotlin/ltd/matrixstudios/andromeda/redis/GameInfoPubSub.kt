package ltd.matrixstudios.andromeda.redis

import ltd.matrixstudios.andromeda.backend.databases.packets.RedisPacket
import ltd.matrixstudios.andromeda.backend.serialization.SerializationManager
import ltd.matrixstudios.andromeda.chest.ChestLoader
import redis.clients.jedis.JedisPubSub

class GameInfoPubSub : JedisPubSub() {

    override fun onMessage(channel: String?, message: String?) {
        when (message) {
            "LOAD_CHESTS" ->
            {
                ChestLoader.loadChests()
            }
        }
    }
}