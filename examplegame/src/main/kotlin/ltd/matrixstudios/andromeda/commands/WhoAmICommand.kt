package ltd.matrixstudios.andromeda.commands

import co.aikar.commands.BaseCommand
import co.aikar.commands.annotation.CommandAlias
import ltd.matrixstudios.andromeda.Andromeda
import org.bukkit.ChatColor
import org.bukkit.entity.Player

class WhoAmICommand : BaseCommand() {

    @CommandAlias("whoami")
    fun whoami(player: Player) {
        val playerTeam = Andromeda.INSTANCE.gameTeamService.teams.values.find { it.teamMembers.contains(player.uniqueId) }

        if (playerTeam == null) {
            player.sendMessage("${ChatColor.RED}No team found.")
            return
        }

        player.sendMessage("${ChatColor.GOLD}${ChatColor.BOLD.toString()}Your Team")
        player.sendMessage(" ")
        player.sendMessage("${ChatColor.WHITE}Unique Team Id: ${ChatColor.WHITE}${playerTeam.abbreviatedId}")
        player.sendMessage("${ChatColor.WHITE}Members Alive: ${ChatColor.WHITE}${playerTeam.membersAlive.size}/${playerTeam.teamMembers.size}")
        player.sendMessage(" ")


    }


}