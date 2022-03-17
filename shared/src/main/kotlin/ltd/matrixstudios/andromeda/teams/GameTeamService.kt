package ltd.matrixstudios.andromeda.teams

import ltd.matrixstudios.andromeda.Andromeda
import ltd.matrixstudios.andromeda.backend.serialization.SerializationManager
import org.bukkit.entity.Player

class GameTeamService {

    var teams = hashMapOf<Int, GameTeam>()


    /**
     * Send teams to redis so they can be pulls for things like:
     * Lobby, website data, etc.
     */
    fun sendTeamsToRedis()
    {
        Andromeda.INSTANCE.andromedaRedis.executeRedisCommand {
            for (entry in teams.entries)
            {
                it.hset("Andromeda::teams::", entry.key.toString(), SerializationManager.GSON.toJson(entry.value))
            }
        }
    }



}