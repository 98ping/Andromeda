package ltd.matrixstudios.andromeda

import co.aikar.commands.BukkitCommandManager
import io.github.thatkawaiisam.assemble.Assemble
import io.github.thatkawaiisam.assemble.AssembleStyle
import ltd.matrixstudios.andromeda.chest.ChestLoader
import ltd.matrixstudios.andromeda.chest.command.SetChestInventoryCommand
import ltd.matrixstudios.andromeda.commands.WhoAmICommand
import ltd.matrixstudios.andromeda.listener.PlayerJoinListener
import ltd.matrixstudios.andromeda.redis.GameInfoPubSub
import ltd.matrixstudios.andromeda.scoreboard.GameScoreboard
import org.bukkit.Bukkit
import org.bukkit.event.player.PlayerJoinEvent
import org.bukkit.plugin.java.JavaPlugin
import kotlin.concurrent.thread

class AndromedaSGGame : JavaPlugin() {

    companion object {
        lateinit var instance: AndromedaSGGame
    }

    lateinit var commandHandler: BukkitCommandManager

    override fun onEnable() {
        instance = this

        val adapter = Assemble(this, GameScoreboard())
        adapter.ticks = 2
        adapter.assembleStyle = AssembleStyle.MODERN

        server.pluginManager.registerEvents(PlayerJoinListener(), this)

        commandHandler = BukkitCommandManager(this).apply {
            registerCommand(WhoAmICommand())
            registerCommand(SetChestInventoryCommand())
        }

        ChestLoader.load()

        thread {
            Andromeda.INSTANCE.andromedaRedis.packetPool.resource.subscribe(GameInfoPubSub(), "Andromeda::packets::secondaryPacketChannel")
        }

    }
}

