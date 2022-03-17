package ltd.matrixstudios.andromeda.chest.command

import co.aikar.commands.BaseCommand
import co.aikar.commands.annotation.CommandAlias
import co.aikar.commands.annotation.CommandPermission
import ltd.matrixstudios.andromeda.chest.ChestLoader
import org.bukkit.ChatColor
import org.bukkit.entity.Player

class SetChestInventoryCommand : BaseCommand() {

    @CommandAlias("forceresetchests")
    @CommandPermission("andromeda.game.chests")
    fun forceReloadChests(player: Player) {
        ChestLoader.loadChests()
        player.sendMessage("${ChatColor.GREEN}Chests forcefully loaded")
    }

    @CommandAlias("setchestinventory")
    @CommandPermission("andromeda.game.chests")
    fun setChestInventory(player: Player) {
        val inventory = player.inventory

        ChestLoader.saveChestInventoryToRedis(inventory)
        player.sendMessage("${ChatColor.GREEN}Saved your current inventory as the default chest inventories!")
    }
}