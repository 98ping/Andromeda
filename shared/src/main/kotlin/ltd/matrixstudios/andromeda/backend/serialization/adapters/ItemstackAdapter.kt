package ltd.matrixstudios.andromeda.backend.serialization.adapters

import com.google.gson.*
import org.bukkit.Color
import org.bukkit.Material
import org.bukkit.enchantments.Enchantment
import org.bukkit.inventory.ItemStack
import org.bukkit.inventory.meta.*
import org.bukkit.potion.PotionEffect
import java.lang.reflect.Type
import java.util.*


class ItemstackAdapter : JsonDeserializer<ItemStack?>, JsonSerializer<ItemStack?> {
    override fun serialize(item: ItemStack?, type: Type, context: JsonSerializationContext): JsonElement {
        return serialize(item)
    }

    @Throws(JsonParseException::class)
    override fun deserialize(element: JsonElement?, type: Type?, context: JsonDeserializationContext?): ItemStack {
        return deserialize(element)
    }

    object Key {
        const val ID = "id"
        const val COUNT = "count"
        const val NAME = "name"
        const val LORE = "lore"
        const val ENCHANTMENTS = "enchants"
        const val BOOK_TITLE = "title"
        const val BOOK_AUTHOR = "author"
        const val BOOK_PAGES = "pages"
        const val LEATHER_ARMOR_COLOR = "color"
        const val MAP_SCALING = "scaling"
        const val STORED_ENCHANTS = "stored-enchants"
        const val SKULL_OWNER = "skull"
        const val POTION_EFFECTS = "potion-effects"
    }

    companion object {
        fun serialize(item: ItemStack?): JsonElement {
            var item = item
            if (item == null) {
                item = ItemStack(Material.AIR)
            }
            val element = JsonObject()
            element.addProperty("id", item.typeId)
            element.addProperty(getDataKey(item), item.durability)
            element.addProperty("count", item.amount)
            if (item.hasItemMeta()) {
                val meta = item.itemMeta
                if (meta.hasDisplayName()) {
                    element.addProperty("name", meta.displayName)
                }
                if (meta.hasLore()) {
                    element.add("lore", convertStringList(meta.lore))
                }
                if (meta is LeatherArmorMeta) {
                    element.addProperty("color", meta.color.asRGB())
                } else if (meta is SkullMeta) {
                    element.addProperty("skull", meta.owner)
                } else if (meta is BookMeta) {
                    element.addProperty("title", meta.title)
                    element.addProperty("author", meta.author)
                    element.add("pages", convertStringList(meta.pages))
                } else if (meta is MapMeta) {
                    element.addProperty("scaling", meta.isScaling)
                } else if (meta is EnchantmentStorageMeta) {
                    val storedEnchantments = JsonObject()
                    for ((key, value) in meta.storedEnchants) {
                        storedEnchantments.addProperty(key.name, value)
                    }
                    element.add("stored-enchants", storedEnchantments)
                }
            }
            if (item.enchantments.size != 0) {
                val enchantments = JsonObject()
                for ((key, value) in item.enchantments) {
                    enchantments.addProperty(key.name, value)
                }
                element.add("enchants", enchantments)
            }
            return element
        }

        fun deserialize(`object`: JsonElement?): ItemStack {
            if (`object` !is JsonObject) {
                return ItemStack(Material.AIR)
            }
            val element = `object`
            val id = element["id"].asInt
            val data =
                if (element.has("damage")) element["damage"].asShort else if (element.has("data")) element["data"].asShort else 0
            val count = element["count"].asInt
            val item = ItemStack(id, count, data)
            val meta = item.itemMeta
            if (element.has("name")) {
                meta.displayName = element["name"].asString
            }
            if (element.has("lore")) {
                meta.lore = convertStringList(element["lore"])
            }
            if (element.has("color")) {
                (meta as LeatherArmorMeta).color = Color.fromRGB(element["color"].asInt)
            } else if (element.has("skull")) {
                (meta as SkullMeta).owner = element["skull"].asString
            } else if (element.has("title")) {
                (meta as BookMeta).title = element["title"].asString
                meta.author = element["author"].asString
                meta.pages = convertStringList(element["pages"])
            } else if (element.has("scaling")) {
                (meta as MapMeta).isScaling = element["scaling"].asBoolean
            } else if (element.has("stored-enchants")) {
                val enchantments = element["stored-enchants"] as JsonObject
                for (enchantment in Enchantment.values()) {
                    if (enchantments.has(enchantment.name)) {
                        (meta as EnchantmentStorageMeta).addStoredEnchant(
                            enchantment,
                            enchantments[enchantment.name].asInt,
                            true
                        )
                    }
                }
            }
            item.itemMeta = meta
            if (element.has("enchants")) {
                val enchantments = element["enchants"] as JsonObject
                for (enchantment in Enchantment.values()) {
                    if (enchantments.has(enchantment.name)) {
                        item.addUnsafeEnchantment(enchantment, enchantments[enchantment.name].asInt)
                    }
                }
            }
            return item
        }

        private fun getDataKey(item: ItemStack): String {
            if (item.type == Material.AIR) {
                return "data"
            }
            return if (Enchantment.DURABILITY.canEnchantItem(item)) {
                "damage"
            } else "data"
        }

        fun convertStringList(strings: Collection<String?>): JsonArray {
            val ret = JsonArray()
            for (string in strings) {
                ret.add(JsonPrimitive(string))
            }
            return ret
        }

        fun convertStringList(jsonElement: JsonElement): List<String> {
            val array = jsonElement.asJsonArray
            val ret: MutableList<String> = ArrayList()
            for (element in array) {
                ret.add(element.asString)
            }
            return ret
        }


    }
}