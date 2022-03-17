package ltd.matrixstudios.andromeda


import io.github.thatkawaiisam.assemble.Assemble
import io.github.thatkawaiisam.assemble.AssembleStyle
import ltd.matrixstudios.andromeda.loadout.LobbyLoadoutListener
import ltd.matrixstudios.andromeda.modes.Gamemode
import ltd.matrixstudios.andromeda.scoreboard.LobbyScoreboard
import org.bukkit.Bukkit
import org.bukkit.GameMode
import org.bukkit.Material
import org.bukkit.plugin.java.JavaPlugin
import java.util.*

class AndromedaLobby : JavaPlugin() {

    companion object {
        lateinit var instance: AndromedaLobby
    }

    override fun onEnable() {
        saveDefaultConfig()
        instance = this

        LobbyLoadoutListener.loadItems()
        server.pluginManager.registerEvents(LobbyLoadoutListener, this)

        server.messenger.registerOutgoingPluginChannel(this, "BungeeCord")

        val adapter = Assemble(this, LobbyScoreboard())
        adapter.ticks = 2
        adapter.assembleStyle = AssembleStyle.MODERN
    }
}