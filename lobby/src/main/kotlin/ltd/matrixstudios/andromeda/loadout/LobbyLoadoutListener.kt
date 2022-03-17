package ltd.matrixstudios.andromeda.loadout

import ltd.matrixstudios.andromeda.menu.ServerGamemodeMenu
import org.bukkit.ChatColor
import org.bukkit.Material
import org.bukkit.event.EventHandler
import org.bukkit.event.Listener
import org.bukkit.event.entity.EntityDamageByEntityEvent
import org.bukkit.event.entity.EntityDamageEvent
import org.bukkit.event.inventory.InventoryMoveItemEvent
import org.bukkit.event.player.PlayerInteractEvent
import org.bukkit.event.player.PlayerJoinEvent
import org.bukkit.inventory.ItemStack

object LobbyLoadoutListener : Listener {

    lateinit var serverselector: ItemStack
    lateinit var stats: ItemStack

    fun loadItems() {
        val statStack = ItemStack(Material.EMERALD)

        val itemMeta = statStack.itemMeta

        itemMeta.displayName = ChatColor.translateAlternateColorCodes('&', "&eYou")

        statStack.itemMeta = itemMeta

        val serverSelectorStack = ItemStack(Material.WATCH)

        val itemMeta2 = serverSelectorStack.itemMeta

        itemMeta2.displayName = ChatColor.translateAlternateColorCodes('&', "&eSelect a Server")

        serverSelectorStack.itemMeta = itemMeta2

        serverselector = serverSelectorStack
        stats = statStack
    }

    @EventHandler
    fun join(event: PlayerJoinEvent) {
        val player = event.player

        player.inventory.setItem(0, serverselector)
        player.inventory.setItem(8, stats)

        player.updateInventory()

    }

    @EventHandler
    fun damagePlayer(event: EntityDamageByEntityEvent) {
        event.isCancelled = true
    }

    @EventHandler
    fun damage(event: EntityDamageEvent) {
        event.isCancelled = true
    }

    @EventHandler
    fun interact(event: PlayerInteractEvent) {
        val player = event.player

        if (player.itemInHand != null) {

            if (player.itemInHand.isSimilar(serverselector)) {
                ServerGamemodeMenu(player).updateMenu()
            }

            if (player.itemInHand.isSimilar(stats)) {
                player.sendMessage("${ChatColor.RED}Not yet made!")
            }
        }
    }
}