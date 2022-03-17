package ltd.matrixstudios.andromeda.backend.serialization

import com.google.gson.Gson
import com.google.gson.GsonBuilder
import com.google.gson.LongSerializationPolicy
import ltd.matrixstudios.andromeda.backend.serialization.adapters.CuboidAdapter
import ltd.matrixstudios.andromeda.backend.serialization.adapters.ItemstackAdapter
import ltd.matrixstudios.andromeda.backend.serialization.adapters.LocationAdapter
import ltd.matrixstudios.andromeda.util.Cuboid
import org.bukkit.Location
import org.bukkit.inventory.ItemStack

object SerializationManager {

    lateinit var GSON: Gson

    fun loadLocalSerialization() {
        GSON = GsonBuilder()
            .serializeNulls()
            .setPrettyPrinting()
            .setLongSerializationPolicy(LongSerializationPolicy.STRING)
            .registerTypeAdapter(Cuboid::class.java, CuboidAdapter)
            .registerTypeAdapter(Location::class.java, LocationAdapter())
            .registerTypeHierarchyAdapter(ItemStack::class.java, ItemstackAdapter())
            .create()
    }

    fun setGSONSerializer(gson: Gson) {
        GSON = gson
    }

}