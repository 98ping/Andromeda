package ltd.matrixstudios.andromeda.game

import ltd.matrixstudios.andromeda.Andromeda
import ltd.matrixstudios.andromeda.backend.serialization.SerializationManager
import ltd.matrixstudios.andromeda.statistics.GlobalSaveableStatistic
import org.bukkit.entity.Player
import java.util.*

object TemporaryStatisticService {

    val statistics = hashMapOf<UUID, TemporaryGeneratedStatistic>()

    fun incrementChests(player: Player) {
        statistics.getOrDefault(player.uniqueId, TemporaryGeneratedStatistic(0, 0)).chestsLooted++
    }

    fun incrementKills(player: Player) {
        statistics.getOrDefault(player.uniqueId, TemporaryGeneratedStatistic(0, 0)).kills++
    }


}