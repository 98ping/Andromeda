package ltd.matrixstudios.andromeda.menu.buttons

import ltd.matrixstudios.andromeda.menu.Button
import ltd.matrixstudios.andromeda.menu.UniqueModeGamesMenu
import ltd.matrixstudios.andromeda.modes.Gamemode
import org.bukkit.ChatColor
import org.bukkit.Material
import org.bukkit.entity.Player
import org.bukkit.event.inventory.ClickType
import java.util.*

class ServerGamemodeButton(
    val gamemode: Gamemode
) : Button() {

    //will add data @ some point
    override fun getMaterial(player: Player): Material {
        return gamemode.material.first
    }

    override fun getDescription(player: Player): MutableList<String>? {
        return listOf(" ", ChatColor.translateAlternateColorCodes('&', "&a&lClick to select this gamemode!")," ").toCollection(arrayListOf())
    }

    override fun getDisplayName(player: Player): String? {
        return ChatColor.translateAlternateColorCodes('&', "&6" + gamemode.displayableName)
    }

    override fun onClick(player: Player, slot: Int, type: ClickType) {
        UniqueModeGamesMenu(player, gamemode).updateMenu()
    }
}