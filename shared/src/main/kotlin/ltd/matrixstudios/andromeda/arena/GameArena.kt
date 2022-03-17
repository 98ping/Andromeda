package ltd.matrixstudios.andromeda.arena

import ltd.matrixstudios.andromeda.modes.Gamemode
import ltd.matrixstudios.andromeda.util.Cuboid
import org.bukkit.Bukkit
import org.bukkit.Location
import org.bukkit.WorldCreator
import java.util.logging.Level

data class GameArena(
    val id: String,
    val spawnLocations: ArrayList<Location>,
    var location1: Location?,
    var location2: Location?,
    var gamemode: Gamemode?,
    val available: Boolean
) {

    fun constructCuboid() : Cuboid{
        return Cuboid(location1!!, location2!!)
    }

}