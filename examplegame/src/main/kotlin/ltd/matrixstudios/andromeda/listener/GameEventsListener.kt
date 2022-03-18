package ltd.matrixstudios.andromeda.listener

import ltd.matrixstudios.andromeda.game.TemporaryStatisticService
import org.bukkit.entity.Player
import org.bukkit.event.EventHandler
import org.bukkit.event.Listener
import org.bukkit.event.entity.PlayerDeathEvent
import org.bukkit.event.player.PlayerMoveEvent

class GameEventsListener : Listener {

    @EventHandler
    fun kill(event: PlayerDeathEvent) {
        if (event.entity.killer is Player) {
            TemporaryStatisticService.incrementKills(event.entity.killer)
        }
    }

}