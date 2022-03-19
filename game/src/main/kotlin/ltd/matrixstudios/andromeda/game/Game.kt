package ltd.matrixstudios.andromeda.game

import ltd.matrixstudios.andromeda.Andromeda
import ltd.matrixstudios.andromeda.AndromedaPlugin
import ltd.matrixstudios.andromeda.arena.GameArena
import ltd.matrixstudios.andromeda.game.state.GameState
import ltd.matrixstudios.andromeda.game.team.TeamSizeType
import ltd.matrixstudios.andromeda.modes.Gamemode
import ltd.matrixstudios.andromeda.teams.GameTeam
import org.bukkit.Bukkit
import org.bukkit.ChatColor
import org.bukkit.Location
import org.bukkit.entity.Player
import org.bukkit.metadata.FixedMetadataValue
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

    fun teleportToRandomArenaSpawn(uuids: MutableList<UUID>) {
        val locationMap = hashMapOf<UUID, Location>() //keeping track of uuids & locations

        for (uuid in uuids) {
            val player = Bukkit.getPlayer(uuid)

            val firstLocation = activeArena!!.spawnLocations.find { !locationMap.containsValue(it) }

            if (firstLocation == null) {
                println("ran out of arena spawns")
                return
            }

            locationMap[uuid] = firstLocation
            player.teleport(firstLocation)
        }

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

    fun transportParticipantsToArena(restrictMovement: Boolean) {
        val playerList = allParticipants

        if (teamSizeType == TeamSizeType.SOLO) {
            setupSoloTeams()
            teleportToRandomArenaSpawn(playerList)
            for (player in playerList) {
                if (restrictMovement) {
                    AndromedaPlugin.instance.gameService.restrictedMovementList.add(player)
                }
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


    }
}