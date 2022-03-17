package ltd.matrixstudios.andromeda.scoreboard

import io.github.thatkawaiisam.assemble.AssembleAdapter
import ltd.matrixstudios.andromeda.Andromeda
import ltd.matrixstudios.andromeda.AndromedaPlugin
import ltd.matrixstudios.andromeda.game.state.GameState
import org.bukkit.ChatColor
import org.bukkit.entity.Player

class LobbyScoreboard : AssembleAdapter {

    override fun getTitle(player: Player?): String {
        return ChatColor.translateAlternateColorCodes('&', "&b&lLOBBY")
    }

    override fun getLines(player: Player?): MutableList<String> {
        val list = arrayListOf<String>()
        list.add(" ")
        list.add("&6&lOpen Games")
        list.add("&f" + AndromedaPlugin.instance.gameService.getGames().filter { it.gameState == GameState.WAITING_FOR_PLAYERS }.count())
        list.add(" ")
        list.add("&6&lAll Games")
        list.add("&f" + AndromedaPlugin.instance.gameService.getGames().size)
        list.add(" ")
        list.add("&dtestplugin.xyz")
        return list
    }
}