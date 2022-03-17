package ltd.matrixstudios.andromeda.modes

import org.bukkit.Material

data class Gamemode(
    val id: String,

    //displayable features
    val material: Pair<Material, Int>,
    val displayableName: String,
    val abbreviatedName: String,

    //internal features
    val maxTeams: Int,
    val teamSize: Int,
    val factorTeams: Boolean,






) {
}