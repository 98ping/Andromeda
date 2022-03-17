package ltd.matrixstudios.andromeda.menu

import ltd.matrixstudios.andromeda.Andromeda
import ltd.matrixstudios.andromeda.menu.buttons.ServerGamemodeButton
import ltd.matrixstudios.andromeda.menu.pagination.PaginatedMenu
import org.bukkit.entity.Player

class ServerGamemodeMenu(val player: Player) : PaginatedMenu(
    9,
    player
) {



    override fun getPagesButtons(player: Player): MutableMap<Int, Button> {
        val buttons = hashMapOf<Int, Button>()

        var index = 0
        for (gamemode in Andromeda.INSTANCE.gamemodeService.getGamemodes()) {
            buttons[index++] = ServerGamemodeButton(gamemode)
        }

        return buttons
    }

    override fun getTitle(player: Player): String {
        return "Select a Gamemode"
    }
}