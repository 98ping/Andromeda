package ltd.matrixstudios.andromeda.listener

import ltd.matrixstudios.andromeda.Andromeda
import ltd.matrixstudios.andromeda.AndromedaPlugin
import org.bukkit.Bukkit
import org.bukkit.entity.Player
import org.bukkit.event.EventHandler
import org.bukkit.event.Listener
import org.bukkit.event.player.PlayerJoinEvent

class PlayerJoinListener : Listener {

    @EventHandler
    fun join(event: PlayerJoinEvent) {
        val player = event.player

        if (!AndromedaPlugin.instance.gameInstance.allParticipants.contains(player.uniqueId))
        {
            AndromedaPlugin.instance.gameInstance.allParticipants.add(player.uniqueId)
            AndromedaPlugin.instance.gameService.refreshCurrentGame()
        }

        player.teleport(Bukkit.getWorld("world").spawnLocation)
    }
}