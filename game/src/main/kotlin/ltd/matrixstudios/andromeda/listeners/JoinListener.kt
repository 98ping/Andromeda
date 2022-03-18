package ltd.matrixstudios.andromeda.listeners

import ltd.matrixstudios.andromeda.Andromeda
import ltd.matrixstudios.andromeda.AndromedaPlugin
import ltd.matrixstudios.andromeda.statistics.GlobalSaveableStatistic
import org.bukkit.event.EventHandler
import org.bukkit.event.Listener
import org.bukkit.event.player.PlayerJoinEvent

class JoinListener : Listener {

    @EventHandler
    fun mainJoinEvent(event: PlayerJoinEvent) {
        if (!AndromedaPlugin.instance.config.getBoolean("lobby"))
        {
            if (!Andromeda.INSTANCE.statisticService.statistics.containsKey(event.player.uniqueId)) {
                Andromeda.INSTANCE.statisticService.statistics[event.player.uniqueId] = GlobalSaveableStatistic(0, 0, 0, 0)
            }
        }



    }
}