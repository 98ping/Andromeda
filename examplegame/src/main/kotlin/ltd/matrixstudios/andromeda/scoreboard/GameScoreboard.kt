package ltd.matrixstudios.andromeda.scoreboard

import io.github.thatkawaiisam.assemble.AssembleAdapter
import ltd.matrixstudios.andromeda.Andromeda
import ltd.matrixstudios.andromeda.AndromedaPlugin
import ltd.matrixstudios.andromeda.game.state.GameState
import org.bukkit.Bukkit
import org.bukkit.ChatColor
import org.bukkit.entity.Player

class GameScoreboard() : AssembleAdapter {

     val mmssBuilder = ThreadLocal.withInitial { StringBuilder() }

    override fun getTitle(p0: Player?): String {
        return "${ChatColor.AQUA}${AndromedaPlugin.instance.gameInstance.uniqueId}"
    }

    override fun getLines(p0: Player?): MutableList<String> {
        val lines = arrayListOf<String>()

        lines.add("&7&m----------------")

        val gameInstance = AndromedaPlugin.instance.gameInstance

        if (gameInstance.gameState == GameState.WAITING_FOR_PLAYERS) {
            lines.add("&fWaiting for players...")
            lines.add("${ChatColor.GOLD}" + gameInstance.playersToStart.minus(Bukkit.getOnlinePlayers().size).toString() + " remaining")
            lines.add(" ")
        }

        if (gameInstance.gameState == GameState.STARTING) {
            lines.add("&a&l&oStarting In...")
            lines.add("&f" + formatIntoMMSS(AndromedaPlugin.instance.gameCountdown.totalGameSeconds))
        }

        if (gameInstance.gameState == GameState.STARTED) {
            lines.add("&fPeople Remaining: &6" + gameInstance.aliveParticipants.size)
            lines.add("&fTeams Remaining: &6" + Andromeda.INSTANCE.gameTeamService.teams.values.filter { it.membersAlive.size != 0 }.count())
            lines.add(" ")
            lines.add("&fPlaying on: &6" + gameInstance.activeArena!!.id)
        }

        lines.add("&7&m----------------")

        return lines
    }

    fun formatIntoMMSS(secs: Int): String? {
        val seconds = secs % 60
        val minutesCount = ((secs - seconds) / 60).toLong()
        val minutes = minutesCount % 60L
        val hours = (minutesCount - minutes) / 60L
        val result: StringBuilder = mmssBuilder.get()
        result.setLength(0)
        if (hours > 0L) {
            if (hours < 10L) {
                result.append("0")
            }
            result.append(hours)
            result.append(":")
        }
        if (minutes < 10L) {
            result.append("0")
        }
        result.append(minutes)
        result.append(":")
        if (seconds < 10) {
            result.append("0")
        }
        result.append(seconds)
        return result.toString()
    }
}