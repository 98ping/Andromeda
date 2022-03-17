package ltd.matrixstudios.andromeda.teams

import ltd.matrixstudios.andromeda.modes.Gamemode
import java.util.*

data class GameTeam(
    val abbreviatedId: String,
    val teamMembers: MutableList<UUID>,
    var membersAlive: MutableList<UUID>,
    val targetGameMode: Gamemode
) {

    fun teamIsFull() : Boolean {
        return teamMembers.size == targetGameMode.teamSize
    }


}