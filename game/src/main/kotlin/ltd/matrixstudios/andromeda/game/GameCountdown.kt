package ltd.matrixstudios.andromeda.game

import ltd.matrixstudios.andromeda.Andromeda
import ltd.matrixstudios.andromeda.AndromedaPlugin
import ltd.matrixstudios.andromeda.backend.databases.packets.RedisPacketDistributor
import ltd.matrixstudios.andromeda.game.state.GameState
import org.bukkit.Bukkit
import org.bukkit.ChatColor
import org.bukkit.scheduler.BukkitRunnable

class GameCountdown {

    var totalPreGameSeconds = 30
    var totalInGameSeconds = 0

    fun startGameCountdown(game: Game) {
        game.gameState = GameState.STARTING

        object : BukkitRunnable() {
            override fun run() {

                when (totalPreGameSeconds) {
                    30 -> {
                        game.activeArena = Andromeda.INSTANCE.gameArenaService.findFirstAvailableArena(game.gamemode)

                        Bukkit.broadcastMessage(
                            ChatColor.translateAlternateColorCodes(
                                '&',
                                "&eGame is starting in &c30 seconds"
                            )
                        )

                        RedisPacketDistributor.sendGeneralMessage("LOAD_CHESTS")

                        RedisPacketDistributor.sendGeneralMessage("SETUP_STATS")

                        game.transportParticipantsToArena(true)

                    }

                    15 -> {
                        Bukkit.broadcastMessage(
                            ChatColor.translateAlternateColorCodes(
                                '&',
                                "&eGame is starting in &c15 seconds"
                            )
                        )
                    }
                    0 -> {
                        Bukkit.broadcastMessage(ChatColor.translateAlternateColorCodes('&', "&eGame is starting &cNow"))
                        AndromedaPlugin.instance.gameService.startGame(AndromedaPlugin.instance.gameInstance)
                        startGameTime()
                    }


                }

                totalPreGameSeconds--
            }

        }.runTaskTimer(AndromedaPlugin.instance, 0L, 20L)
    }

    fun startGameTime() {
        object : BukkitRunnable() {
            override fun run() {
                when (totalInGameSeconds) {
                    100 -> {
                        Bukkit.broadcastMessage("${ChatColor.YELLOW}Chest refill will occur in ${ChatColor.RED}20 seconds")
                    }

                    120 -> {
                        RedisPacketDistributor.sendGeneralMessage("LOAD_CHESTS")
                    }
                }
                totalInGameSeconds++
            }
        }.runTaskTimer(AndromedaPlugin.instance, 0L, 20L)
    }
}