package ltd.matrixstudios.andromeda.statistics

import ltd.matrixstudios.andromeda.Andromeda
import ltd.matrixstudios.andromeda.backend.serialization.SerializationManager
import org.bukkit.entity.Player
import java.util.*

class SaveableStatisticService {

    val statistics = hashMapOf<UUID, GlobalSaveableStatistic>()


    fun saveStatistic(player: Player, saveable: GlobalSaveableStatistic) {
        Andromeda.INSTANCE.andromedaRedis.executeRedisCommand {
            it.hset("Andromeda::stats::", player.uniqueId.toString(), SerializationManager.GSON.toJson(saveable))
        }
        statistics[player.uniqueId] = saveable
    }


    fun loadStatistics() {
        val stats = Andromeda.INSTANCE.andromedaRedis.resource.hgetAll("Andromeda::stats::")

        stats.entries.forEach { statistics[UUID.fromString(it.key)] = SerializationManager.GSON.fromJson(it.value, GlobalSaveableStatistic::class.java) }
    }

    fun getStatistic(player: Player) : GlobalSaveableStatistic {
        return statistics.getOrDefault(player.uniqueId, GlobalSaveableStatistic(0, 0,0, 0))
    }


}