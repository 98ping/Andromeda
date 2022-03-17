package ltd.matrixstudios.andromeda.statistics

import ltd.matrixstudios.andromeda.Andromeda
import ltd.matrixstudios.andromeda.backend.serialization.SerializationManager
import org.bukkit.entity.Player
import java.util.*

class SaveableStatisticService {

    val statistics = hashMapOf<UUID, SaveableStatistic>()

    /**
     * Saves a stat to redis
     * @param player
     * @param saveable
     */
    fun saveStatistic(player: Player, saveable: SaveableStatistic) {
        Andromeda.INSTANCE.andromedaRedis.executeRedisCommand {
            it.hset("Andromeda::stats::", player.uniqueId.toString(), SerializationManager.GSON.toJson(saveable))
        }
        statistics[player.uniqueId] = saveable
    }


    fun loadStatistics() {
        val stats = Andromeda.INSTANCE.andromedaRedis.resource.hgetAll("Andromeda::stats::")

        stats.entries.forEach { statistics[UUID.fromString(it.key)] = SerializationManager.GSON.fromJson(it.value, SaveableStatistic::class.java) }
    }

    /**
     * Finds statistic or creates a new one
     * @param player
     */
    fun getStatistic(player: Player) : SaveableStatistic {
        return statistics.getOrDefault(player.uniqueId, SaveableStatistic(0, 0,0, 0))
    }


}