package ltd.matrixstudios.andromeda.menu

import ltd.matrixstudios.andromeda.AndromedaPlugin
import ltd.matrixstudios.andromeda.menu.buttons.UniqueModeGamesMenuButton
import ltd.matrixstudios.andromeda.menu.pagination.PaginatedMenu
import ltd.matrixstudios.andromeda.modes.Gamemode
import org.bukkit.entity.Player

class UniqueModeGamesMenu(player: Player, val gamemode: Gamemode) : PaginatedMenu(
    18,
    player
) {

    override fun getPagesButtons(player: Player): MutableMap<Int, Button> {
        val buttons = hashMapOf<Int, Button>()

        var index = 0

        for (game in AndromedaPlugin.instance.gameService.getGames().filter { it.gamemode ==  gamemode }) {
            buttons[index++] = UniqueModeGamesMenuButton(game)
        }

        return buttons
    }

    override fun getTitle(player: Player): String {
        return gamemode.displayableName
    }
}