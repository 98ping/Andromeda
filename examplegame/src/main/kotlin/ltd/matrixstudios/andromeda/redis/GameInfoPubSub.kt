package ltd.matrixstudios.andromeda.redis

import ltd.matrixstudios.andromeda.AndromedaSGGame
import ltd.matrixstudios.andromeda.backend.databases.packets.RedisPacket
import ltd.matrixstudios.andromeda.backend.serialization.SerializationManager
import ltd.matrixstudios.andromeda.chest.ChestLoader
import ltd.matrixstudios.andromeda.game.TemporaryGeneratedStatistic
import ltd.matrixstudios.andromeda.game.TemporaryStatisticService
import org.bukkit.Bukkit
import redis.clients.jedis.JedisPubSub

class GameInfoPubSub : JedisPubSub() {

    override fun onMessage(channel: String?, message: String?) {
        when (message) {
            "LOAD_CHESTS" ->
            {
                ChestLoader.loadChests()
            }

            "SETUP_STATS" ->
            {
                Bukkit.getOnlinePlayers().forEach {
                    TemporaryStatisticService.statistics[it.uniqueId] = TemporaryGeneratedStatistic(0, 0)
                }
            }
        }
    }
}