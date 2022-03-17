package ltd.matrixstudios.andromeda.chest

import com.google.gson.reflect.TypeToken
import ltd.matrixstudios.andromeda.Andromeda
import ltd.matrixstudios.andromeda.AndromedaPlugin
import ltd.matrixstudios.andromeda.backend.serialization.SerializationManager
import org.bukkit.Material
import org.bukkit.block.Chest
import org.bukkit.inventory.Inventory
import org.bukkit.inventory.ItemStack
import java.lang.reflect.Type
import java.util.*
import kotlin.random.Random

object ChestLoader {

    val TYPE: Type = object : TypeToken<Array<ItemStack?>?>() {}.getType()

    lateinit var chestinventory: Array<ItemStack?>

    fun load() {
        chestinventory = SerializationManager.GSON.fromJson(Andromeda.INSTANCE.andromedaRedis.resource.hget("Andromeda::games::chests::", "main"), TYPE)
    }


    fun saveChestInventoryToRedis(inventory: Inventory) {


        Andromeda.INSTANCE.andromedaRedis.executeRedisCommand {
            it.hset("Andromeda::games::chests::", "main", SerializationManager.GSON.toJson(inventory.contents))
        }

        chestinventory = inventory.contents
    }


    fun loadChests() {
        val localGame = AndromedaPlugin.instance.gameInstance

        val gameArena = localGame.activeArena

        if (gameArena == null) {
            println("Game arena was not found while loading chests.")
            return
        }

        val arenaCuboid = gameArena.constructCuboid()

        val chestsOnly = arenaCuboid.blocks.filter { it.type == Material.CHEST }.toCollection(arrayListOf())

        chestsOnly.forEach { block ->

            if (block.state is Chest) { //stupid check but for some reason it doesnt work w/out it
                val chestData = block.state as Chest

                chestData.blockInventory.clear()

                val chestInventory = chestinventory.filter { Objects.nonNull(it) }

                val RandomItems = listOf(
                    chestInventory[Random.nextInt(chestInventory.size)],
                    chestInventory[Random.nextInt(chestInventory.size)],
                    chestInventory[Random.nextInt(chestInventory.size)]
                )


                RandomItems.forEach { chestData.blockInventory.setItem(Random.nextInt(chestInventory.size), it) }

                chestData.update()
                
            }
        }
    }
}