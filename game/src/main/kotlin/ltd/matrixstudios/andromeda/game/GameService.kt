package ltd.matrixstudios.andromeda.game

import ltd.matrixstudios.andromeda.Andromeda
import ltd.matrixstudios.andromeda.AndromedaPlugin
import ltd.matrixstudios.andromeda.backend.serialization.SerializationManager
import ltd.matrixstudios.andromeda.game.state.GameState
import ltd.matrixstudios.andromeda.game.team.TeamSizeType
import org.bukkit.Bukkit

class GameService {

    fun getGames() : MutableList<Game> {
        val redisGames = Andromeda.INSTANCE.andromedaRedis.resource.hgetAll("Andromeda::games::")

        var games = arrayListOf<Game>()

        games = redisGames.map { SerializationManager.GSON.fromJson(it.value, Game::class.java) }.toCollection(arrayListOf())

        return games
    }

    fun refreshCurrentGame() {
        publishGame(AndromedaPlugin.instance.gameInstance)
    }

    fun publishGame(game: Game) {
        Andromeda.INSTANCE.andromedaRedis.resource.hset("Andromeda::games::", game.internalId, SerializationManager.GSON.toJson(game))
    }

    fun startGame(game: Game) {
        game.gameState = GameState.STARTED

        game.allParticipants = Bukkit.getOnlinePlayers().map { it.uniqueId }.toCollection(arrayListOf())

        game.aliveParticipants = game.allParticipants

        AndromedaPlugin.instance.gameInstance = game

        game.transportParticipantsToArena()








    }
}
