package ltd.matrixstudios.andromeda.arena

import ltd.matrixstudios.andromeda.Andromeda
import ltd.matrixstudios.andromeda.modes.Gamemode

class GameArenaService {

    fun getArena(name: String) : GameArena? {
        return getGameArenas().find { it.id.equals(name, ignoreCase = true) }
    }

    fun saveGameArena(gameArena: GameArena?) {
        Andromeda.INSTANCE.andromedaMongo.save(gameArena, gameArena!!.id, "arenas")
    }

    fun findFirstAvailableArena(gamemode: Gamemode) : GameArena? {
        return getGameArenas().find { it.gamemode == gamemode }
    }

    fun getGameArenas() : ArrayList<GameArena> {
        return Andromeda.INSTANCE.andromedaMongo.pullAndDeserialize(GameArena::class.java, "arenas")
    }
}