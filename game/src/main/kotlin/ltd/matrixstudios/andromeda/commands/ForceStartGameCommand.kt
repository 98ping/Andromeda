package ltd.matrixstudios.andromeda.commands

import co.aikar.commands.BaseCommand
import co.aikar.commands.annotation.CommandAlias
import co.aikar.commands.annotation.CommandPermission
import ltd.matrixstudios.andromeda.AndromedaPlugin
import ltd.matrixstudios.andromeda.game.state.GameState
import org.bukkit.ChatColor
import org.bukkit.command.CommandSender


class ForceStartGameCommand : BaseCommand() {

    @CommandAlias("forcestart")
    @CommandPermission("andromeda.forcestart")
    fun forcestart(sender: CommandSender) {
        val localGame = AndromedaPlugin.instance.gameInstance
        if (localGame == null) {
            sender.sendMessage("${ChatColor.RED}Game is null")
            return
        }

        if (localGame.gameState == GameState.STARTED || localGame.gameState == GameState.STARTING) {
            sender.sendMessage("${ChatColor.RED}Game is already in a started state.")
            return
        }

        AndromedaPlugin.instance.gameCountdown.startGameCountdown(localGame)
        sender.sendMessage("${ChatColor.GREEN}Started game!")



    }


}