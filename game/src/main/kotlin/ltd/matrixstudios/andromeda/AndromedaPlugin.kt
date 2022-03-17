package ltd.matrixstudios.andromeda

import co.aikar.commands.BukkitCommandManager
import ltd.matrixstudios.andromeda.commands.ForceStartGameCommand
import ltd.matrixstudios.andromeda.commands.GameArenaCommands
import ltd.matrixstudios.andromeda.game.Game
import ltd.matrixstudios.andromeda.game.GameCountdown
import ltd.matrixstudios.andromeda.game.GameService
import ltd.matrixstudios.andromeda.game.state.GameState
import ltd.matrixstudios.andromeda.game.task.GameHeartbeatTask
import ltd.matrixstudios.andromeda.game.team.TeamSizeType
import ltd.matrixstudios.andromeda.modes.Gamemode
import org.bukkit.Bukkit
import org.bukkit.Material
import org.bukkit.plugin.Plugin
import org.bukkit.plugin.java.JavaPlugin
import java.util.*


class AndromedaPlugin : JavaPlugin() {

    companion object {
        lateinit var instance: AndromedaPlugin
    }

    lateinit var gameInstance: Game

    lateinit var gameService: GameService

    lateinit var commandHandler: BukkitCommandManager

    lateinit var gameHeartbeatTask: GameHeartbeatTask
    lateinit var gameCountdown: GameCountdown


    override fun onEnable() {
        saveDefaultConfig()
        instance = this

        Andromeda.INSTANCE.load("mongodb://localhost:27017", "Andromeda", "127.0.0.1", this)

        gameService = GameService()

        gameHeartbeatTask = GameHeartbeatTask()
        gameCountdown = GameCountdown()

        commandHandler = BukkitCommandManager(this).apply {
            registerCommand(ForceStartGameCommand())
            registerCommand(GameArenaCommands())
        }

        createGamemode()

        //delete the entire key so that in case a server was caught it can refresh itself. Would do this more often but it may cause some issues
        val entries = Andromeda.INSTANCE.andromedaRedis.resource.hgetAll("Andromeda::games::")
        for (entry in entries) {
            Andromeda.INSTANCE.andromedaRedis.resource.hdel("Andromeda::games::", entry.key)
        }

        if (!config.getBoolean("lobby")) {
            loadGame()
        }

        gameHeartbeatTask.startTask() //last thing we do so it can create the task & whatnot
    }

    //delete the game once done.
    override fun onDisable() {
        Andromeda.INSTANCE.andromedaRedis.resource.hdel("Andromeda::games::", gameInstance.internalId)
    }





    fun createGamemode() {

        if (Andromeda.INSTANCE.gamemodeService.getGamemodes().find { it.id.equals(config.getString("game.gamemode"), ignoreCase = true) } == null && !config.getBoolean("lobby"))
        {
            val gamemode = Gamemode(config.getString("game.gamemode"),
                Pair(Material.REDSTONE, 0),
                config.getString("game.gamemode").toLowerCase(),
                config.getString("game.abbreviatedName"),
                config.getInt("game.maxTeams"),
                config.getInt("game.teamSize"),
                true)

            Andromeda.INSTANCE.gamemodeService.createGamemode(gamemode)
            println("Created a gamemode with the name " + gamemode.displayableName)
        }
    }






    fun loadGame() {
        val gamemode: Gamemode? = Andromeda.INSTANCE.gamemodeService.getGamemodes()
                .find { it.id.equals(config.getString("game.gamemode"), ignoreCase = true) }




        if (gamemode == null) {
            println("Gamemode was null even though we created it. Shutting down LOL")
            Bukkit.shutdown()
        }

        val teamSizeType: TeamSizeType = if (config.getInt("game.teamSize") === 1) TeamSizeType.SOLO else TeamSizeType.TEAM


        gameInstance = Game(
            config.getString("game.internalId"),
            "game-" + gamemode!!.abbreviatedName + "-" + UUID.randomUUID().toString().substring(0, 4),
            arrayListOf(),
            arrayListOf(),
            GameState.WAITING_FOR_PLAYERS,
            null,
            gamemode,
            teamSizeType,
            4,
            Bukkit.getOnlinePlayers().size,
            config.getString("game.bungeeServerName")
        )

        gameService.publishGame(gameInstance)

        //I can do this here because solo teams depend on the amount of people that are actually in the game.
        if (teamSizeType == TeamSizeType.TEAM) {
            gameInstance.setupTeamTeams()
        }

    }
}