package ltd.matrixstudios.andromeda.listener

import ltd.matrixstudios.andromeda.Andromeda
import ltd.matrixstudios.andromeda.AndromedaPlugin
import ltd.matrixstudios.andromeda.game.TemporaryStatisticService
import ltd.matrixstudios.andromeda.game.state.GameState
import org.bukkit.ChatColor
import org.bukkit.GameMode
import org.bukkit.entity.Player
import org.bukkit.event.EventHandler
import org.bukkit.event.Listener
import org.bukkit.event.block.BlockBreakEvent
import org.bukkit.event.block.BlockPlaceEvent
import org.bukkit.event.entity.EntityDamageByEntityEvent
import org.bukkit.event.entity.PlayerDeathEvent
import org.bukkit.event.player.PlayerMoveEvent

class GameEventsListener : Listener {

    @EventHandler
    fun break1(event: BlockBreakEvent) {
        if (event.player.gameMode != GameMode.CREATIVE) {
            event.isCancelled = true
        }
    }

    @EventHandler
    fun place(event: BlockPlaceEvent) {
        if (event.player.gameMode != GameMode.CREATIVE) {
            event.isCancelled = true
        }
    }

    @EventHandler
    fun die(event: PlayerDeathEvent) {
        val team = Andromeda.INSTANCE.gameTeamService.teams.values.find { it.teamMembers.contains(event.entity.uniqueId) }

        if (team != null) {
            team.membersAlive.remove(event.entity.uniqueId)
            event.entity.sendMessage("${ChatColor.RED}You were eliminated")
        }
    }

    @EventHandler
    fun tryAndMove(event: PlayerMoveEvent) {
        val loc1 = event.from
        val loc2 = event.to
        val player = event.player

        if (AndromedaPlugin.instance.gameService.restrictedMovementList.contains(player.uniqueId)) {

            if (loc1.x != loc2.x || loc1.y != loc2.y || loc1.z != loc2.z) {
                player.teleport(loc1)
            }
        }
    }

    @EventHandler
    fun damage(event: EntityDamageByEntityEvent) {
        if (AndromedaPlugin.instance.gameInstance.gameState != GameState.STARTED) {
            event.isCancelled = true
        }
    }

    @EventHandler
    fun kill(event: PlayerDeathEvent) {
        if (event.entity.killer is Player) {
            TemporaryStatisticService.incrementKills(event.entity.killer)

            val stat = Andromeda.INSTANCE.statisticService.getStatistic(event.entity.killer)

            stat.kills++

            Andromeda.INSTANCE.statisticService.saveStatistic(event.entity.player, stat)
        }
    }

}