package ltd.matrixstudios.andromeda.menu.buttons

import ltd.matrixstudios.andromeda.game.Game
import ltd.matrixstudios.andromeda.menu.Button
import ltd.matrixstudios.andromeda.util.BungeeUtil
import org.bukkit.ChatColor
import org.bukkit.Material
import org.bukkit.entity.Player
import org.bukkit.event.inventory.ClickType
import java.util.*

class UniqueModeGamesMenuButton(val game: Game) : Button() {

    override fun getMaterial(player: Player): Material {
        return Material.WOOL
    }

    override fun getDescription(player: Player): MutableList<String>? {
        val list = arrayListOf<String>()
        list.add(" ")
        list.add("${ChatColor.YELLOW}Players: ${ChatColor.WHITE}${game.allOnlinePlayers}")
        list.add("${ChatColor.YELLOW}Needed To Start: ${ChatColor.WHITE}${game.playersToStart}")
        list.add(" ")
        list.add("${ChatColor.GREEN}Click to Join!")

        return list
    }

    override fun getDisplayName(player: Player): String? {
        return "${ChatColor.GOLD}${game.uniqueId}"
    }

    override fun onClick(player: Player, slot: Int, type: ClickType) {
        BungeeUtil.send(player, game.bungeeServer)
    }
}