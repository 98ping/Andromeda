package ltd.matrixstudios.andromeda.game

import ltd.matrixstudios.andromeda.Andromeda
import ltd.matrixstudios.andromeda.AndromedaPlugin
import ltd.matrixstudios.andromeda.game.state.GameState
import org.bukkit.Bukkit
import org.bukkit.ChatColor
import org.bukkit.scheduler.BukkitRunnable

class GameCountdown {

    var totalGameSeconds = 60

    fun startGameCountdown(game: Game) {
        game.gameState = GameState.STARTING

        object : BukkitRunnable() {
            override fun run() {
                when (totalGameSeconds) {
                    60 -> {
                        Bukkit.broadcastMessage(ChatColor.translateAlternateColorCodes('&', "&eGame is starting in &c1 minute"))
                    }

                    45 -> {
                        Bukkit.broadcastMessage(ChatColor.translateAlternateColorCodes('&', "&eGame is starting in &c45 seconds"))
                    }

                   30 -> {
                        Bukkit.broadcastMessage(ChatColor.translateAlternateColorCodes('&', "&eGame is starting in &c30 seconds"))
                    }

                    15 -> {
                        Bukkit.broadcastMessage(ChatColor.translateAlternateColorCodes('&', "&eGame is starting in &c15 seconds"))
                    }

                    0 -> {
                        Bukkit.broadcastMessage(ChatColor.translateAlternateColorCodes('&', "&eGame is starting &cNow"))
                        AndromedaPlugin.instance.gameService.startGame(AndromedaPlugin.instance.gameInstance)
                    }


                }

                totalGameSeconds--
            }

        }.runTaskTimer(AndromedaPlugin.instance, 0L, 20L)
    }
}