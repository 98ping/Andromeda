package ltd.matrixstudios.andromeda.game.task

import ltd.matrixstudios.andromeda.AndromedaPlugin
import org.bukkit.Bukkit
import java.util.concurrent.Executor
import java.util.concurrent.ExecutorService
import java.util.concurrent.Executors
import java.util.concurrent.TimeUnit

class GameHeartbeatTask {

    fun startTask() {
        val service = Executors.newSingleThreadScheduledExecutor()

        service.scheduleAtFixedRate({
            val game = AndromedaPlugin.instance.gameInstance

            game.allOnlinePlayers = Bukkit.getOnlinePlayers().size

            AndromedaPlugin.instance.gameService.publishGame(game)

        }, 0L, 100L, TimeUnit.MILLISECONDS)
    }
}