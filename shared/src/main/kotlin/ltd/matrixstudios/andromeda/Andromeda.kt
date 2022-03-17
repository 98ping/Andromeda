package ltd.matrixstudios.andromeda

import ltd.matrixstudios.andromeda.arena.GameArena
import ltd.matrixstudios.andromeda.arena.GameArenaService
import ltd.matrixstudios.andromeda.backend.databases.AndromedaMongo
import ltd.matrixstudios.andromeda.backend.databases.AndromedaRedis
import ltd.matrixstudios.andromeda.backend.serialization.SerializationManager
import ltd.matrixstudios.andromeda.menu.listener.MenuListener
import ltd.matrixstudios.andromeda.modes.GamemodeService
import ltd.matrixstudios.andromeda.statistics.SaveableStatisticService
import ltd.matrixstudios.andromeda.teams.GameTeamService
import org.bukkit.plugin.Plugin



enum class Andromeda {


    INSTANCE;


    //databases
    lateinit var andromedaMongo: AndromedaMongo
    lateinit var andromedaRedis: AndromedaRedis

    //services
    lateinit var statisticService: SaveableStatisticService
    lateinit var gamemodeService: GamemodeService
    lateinit var gameTeamService: GameTeamService
    lateinit var gameArenaService: GameArenaService

    fun load(mongoConnectionURI: String, mongoDatabase: String, redisConnectionHost: String, plugin: Plugin) {
        andromedaMongo = AndromedaMongo().apply {
            loadMongo(mongoConnectionURI, mongoDatabase)
        }

        andromedaRedis = AndromedaRedis().apply {
            loadRedis(redisConnectionHost)
        }

        plugin.server.pluginManager.registerEvents(MenuListener(), plugin)

        SerializationManager.loadLocalSerialization()

        loadRedisItems()
    }

    fun loadRedisItems()
    {
        statisticService = SaveableStatisticService()
        gamemodeService = GamemodeService()
        gameTeamService = GameTeamService()
        gameArenaService = GameArenaService()

        statisticService.loadStatistics()
    }
}