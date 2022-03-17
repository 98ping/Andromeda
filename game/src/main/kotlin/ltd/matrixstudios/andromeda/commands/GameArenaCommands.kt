package ltd.matrixstudios.andromeda.commands

import co.aikar.commands.BaseCommand
import co.aikar.commands.annotation.CommandAlias
import co.aikar.commands.annotation.CommandPermission
import co.aikar.commands.annotation.HelpCommand
import co.aikar.commands.annotation.Subcommand
import ltd.matrixstudios.andromeda.Andromeda
import ltd.matrixstudios.andromeda.arena.GameArena
import ltd.matrixstudios.andromeda.modes.Gamemode
import org.bukkit.ChatColor
import org.bukkit.command.CommandSender
import org.bukkit.entity.Player

@CommandAlias("arena")
class GameArenaCommands : BaseCommand() {

    @HelpCommand
    @CommandPermission("andromeda.arena.admin")
    fun doHelp(sender: CommandSender) {
        sender.sendMessage(ChatColor.translateAlternateColorCodes('&', "&7&m------------------------"))
        sender.sendMessage(ChatColor.translateAlternateColorCodes('&', "&6&lFramework &7(Arenas)"))
        sender.sendMessage(" ")
        sender.sendMessage("${ChatColor.WHITE}/arena create <arena>")
        sender.sendMessage("${ChatColor.WHITE}/arena setgamemode <arena> <gamemode>")
        sender.sendMessage("${ChatColor.WHITE}/arena addspawn <arena>")
        sender.sendMessage("${ChatColor.WHITE}/arena position <arena> <1, 2>")
        sender.sendMessage(" ")
        sender.sendMessage(ChatColor.translateAlternateColorCodes('&', "&7&m------------------------"))
    }

    @Subcommand("setgamemode")
    @CommandPermission("andromeda.arena.admin")
    fun setGamemode(player: Player, name: String, gamemode: String) {
        if (Andromeda.INSTANCE.gameArenaService.getArena(name) == null) {
            player.sendMessage("${ChatColor.RED}Arena doesnt exist.")
            return
        }

        val arena = Andromeda.INSTANCE.gameArenaService.getArena(name)
        val gamemode = Andromeda.INSTANCE.gamemodeService.getGamemodes().first { it.id.equals(gamemode, ignoreCase = true) }

        if (gamemode == null) {
            player.sendMessage("${ChatColor.RED}Gamemode does not exist.")
        }

        arena!!.gamemode = gamemode
        Andromeda.INSTANCE.gameArenaService.saveGameArena(arena)

        player.sendMessage("${ChatColor.GREEN}Set this arena's gamemode")
    }

    @Subcommand("position")
    @CommandPermission("andromeda.arena.admin")
    fun addPosition(player: Player, name: String, position: String) {
        if (Andromeda.INSTANCE.gameArenaService.getArena(name) == null) {
            player.sendMessage("${ChatColor.RED}Arena doesnt exist.")
            return
        }

        val arena = Andromeda.INSTANCE.gameArenaService.getArena(name)
        if (position == "1") {
            arena!!.location1 = player.location
        } else if (position == "2") {
            arena!!.location2 = player.location
        }

        Andromeda.INSTANCE.gameArenaService.saveGameArena(arena)

        player.sendMessage("${ChatColor.GREEN}Added a cuboid location")
    }


    @Subcommand("addspawn")
    @CommandPermission("andromeda.arena.admin")
    fun addSpawn(player: Player, name: String) {
        if (Andromeda.INSTANCE.gameArenaService.getArena(name) == null) {
            player.sendMessage("${ChatColor.RED}Arena doesnt exist.")
            return
        }

        val arena = Andromeda.INSTANCE.gameArenaService.getArena(name)
        arena!!.spawnLocations.add(player.location)
        Andromeda.INSTANCE.gameArenaService.saveGameArena(arena)

        player.sendMessage("${ChatColor.GREEN}Added a spawn location!")
    }

    @Subcommand("create")
    @CommandPermission("andromeda.arena.admin")
    fun createArena(sender: CommandSender, name: String) {
        if (Andromeda.INSTANCE.gameArenaService.getArena(name) != null) {
            sender.sendMessage("${ChatColor.RED}Arena already exists.")
            return
        }

        val arena = GameArena(name.toLowerCase(), arrayListOf(), null, null, null,false)
        Andromeda.INSTANCE.gameArenaService.saveGameArena(arena)
        sender.sendMessage("${ChatColor.GREEN}Created an arena!")
    }
}