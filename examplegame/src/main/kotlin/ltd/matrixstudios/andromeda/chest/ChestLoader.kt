package ltd.matrixstudios.andromeda.chest

import com.google.gson.reflect.TypeToken
import ltd.matrixstudios.andromeda.Andromeda
import ltd.matrixstudios.andromeda.AndromedaPlugin
import ltd.matrixstudios.andromeda.backend.serialization.SerializationManager
import org.bukkit.Bukkit
import org.bukkit.Material
import org.bukkit.block.Block
import org.bukkit.block.Chest
import org.bukkit.inventory.Inventory
import org.bukkit.inventory.ItemStack
import java.lang.reflect.Type
import java.util.*
import java.util.concurrent.ForkJoinPool
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


    fun getBlocksThatAreChests() : MutableList<Chest> {
        val localGame = AndromedaPlugin.instance.gameInstance

        val gameArena = localGame.activeArena

        if (gameArena == null) {
            println("Game arena was not found while loading chests.")
            return arrayListOf()
        }

        val arenaCuboid = gameArena.constructCuboid()

        val chestsOnly: MutableList<Chest> = arrayListOf()

        arenaCuboid.world.loadedChunks.forEach { chunk ->
            chunk.tileEntities.filterIsInstance<Chest>().forEach {
                chestsOnly.add(it)
            }
        }

        return chestsOnly
    }


    fun loadChests() {
        Bukkit.getScheduler().runTask(AndromedaPlugin.instance) {
            val chestsOnly = getBlocksThatAreChests()

            chestsOnly.forEach { block ->
                    val chestData = block

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
