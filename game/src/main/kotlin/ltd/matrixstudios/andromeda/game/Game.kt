package ltd.matrixstudios.andromeda.game

import ltd.matrixstudios.andromeda.Andromeda
import ltd.matrixstudios.andromeda.arena.GameArena
import ltd.matrixstudios.andromeda.game.state.GameState
import ltd.matrixstudios.andromeda.game.team.TeamSizeType
import ltd.matrixstudios.andromeda.modes.Gamemode
import ltd.matrixstudios.andromeda.teams.GameTeam
import org.bukkit.Bukkit
import org.bukkit.ChatColor
import org.bukkit.Location
import org.bukkit.entity.Player
import java.util.*

data class Game(
    val internalId: String,
    val uniqueId: String,
    var allParticipants: MutableList<UUID>,
    var aliveParticipants: MutableList<UUID>,
    var gameState: GameState,
    var activeArena: GameArena?,
    var gamemode: Gamemode,
    var teamSizeType: TeamSizeType,
    var playersToStart: Int,
    var allOnlinePlayers: Int,
    var bungeeServer: String
) {

    fun setupSoloTeams() {
        if (teamSizeType == TeamSizeType.SOLO) {
            var int = 0
            for (player in Bukkit.getOnlinePlayers()) {
                int++
                Andromeda.INSTANCE.gameTeamService.teams[int] = GameTeam(
                    gamemode.abbreviatedName + "-solo-" + int,
                    Collections.singletonList(player.uniqueId),
                    Collections.singletonList(player.uniqueId),
                    gamemode
                )
            }
        }
    }

    fun setupTeamTeams() {
        for (int in 0 until gamemode.maxTeams) {
            Andromeda.INSTANCE.gameTeamService.teams[int] = GameTeam(
                gamemode.abbreviatedName + "-team-" + int,
                arrayListOf(),
                arrayListOf(),
                gamemode
            )
        }
    }

    //solo-dependent functions. Teams will come later

    fun teleportToRandomArenaSpawn(player: Player) {
        val locationMap = hashMapOf<UUID, Location>() //keeping track of uuids & locations
        val firstLocation = activeArena!!.spawnLocations[Random().nextInt(activeArena!!.spawnLocations.size)]

        for (entry in locationMap.entries) {
            if (entry.value == firstLocation) {
                teleportToRandomArenaSpawn(player)
                println("Spawn location was already found. Finding one")
            }
        }

        locationMap[player.uniqueId] = firstLocation
        player.teleport(firstLocation)
        player.sendMessage("${ChatColor.YELLOW}Teleporting you to your spawn location...")

    }

    fun teleportTeamMembersToSpawn(gameTeam: GameTeam) {
        val locationMap = hashMapOf<GameTeam, Location>()
        val firstLocation = activeArena!!.spawnLocations[Random().nextInt(activeArena!!.spawnLocations.size)]

        for (entry in locationMap.entries) {
            if (entry.value == firstLocation) {
                teleportTeamMembersToSpawn(gameTeam)
                println("Spawn location was already found. Finding one")
            }
        }

        locationMap[gameTeam] = firstLocation
        gameTeam.teamMembers.map { Bukkit.getPlayer(it) }.filter { Objects.nonNull(it) }.forEach {
            it.teleport(firstLocation)
            it.sendMessage("${ChatColor.YELLOW}Teleporting you to your spawn location...")
        }

    }

    fun transportParticipantsToArena() {
        val playerList = allParticipants

        if (teamSizeType == TeamSizeType.SOLO) {
            setupSoloTeams()
            for (player in playerList) {
                teleportToRandomArenaSpawn(Bukkit.getPlayer(player))
            }
        } else {
            for (team in Andromeda.INSTANCE.gameTeamService.teams.values) {
                teleportTeamMembersToSpawn(team)
            }
        }

        Andromeda.INSTANCE.gameTeamService.teams.entries.forEach {
            val team = it.value
            val int = it.key

            team.membersAlive = team.teamMembers

            Andromeda.INSTANCE.gameTeamService.teams[int] = team

            Andromeda.INSTANCE.gameTeamService.sendTeamsToRedis()
        }

        println(allParticipants.toString())
        println(teamSizeType.name)
        println(aliveParticipants.toString())

    }
}