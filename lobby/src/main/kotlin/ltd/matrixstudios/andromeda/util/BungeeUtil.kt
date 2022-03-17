package ltd.matrixstudios.andromeda.util

import ltd.matrixstudios.andromeda.AndromedaLobby
import org.bukkit.entity.Player
import java.io.ByteArrayOutputStream
import java.io.DataOutputStream
import java.io.IOException


object BungeeUtil {

    fun send(player: Player, server: String?) {
        val b = ByteArrayOutputStream()
        val out = DataOutputStream(b)
        try {
            out.writeUTF("Connect")
            out.writeUTF(server)
        } catch (ignored: IOException) {
        }
        player.sendPluginMessage(AndromedaLobby.instance, "BungeeCord", b.toByteArray())
    }

    fun sendAll(server: String?) {
        val b = ByteArrayOutputStream()
        val out = DataOutputStream(b)
        try {
            out.writeUTF("Connect")
            out.writeUTF(server)
        } catch (ignored: IOException) {
        }
        for (player in AndromedaLobby.instance.server.onlinePlayers) {
            player.sendPluginMessage(AndromedaLobby.instance, "BungeeCord", b.toByteArray())
        }
    }
}
