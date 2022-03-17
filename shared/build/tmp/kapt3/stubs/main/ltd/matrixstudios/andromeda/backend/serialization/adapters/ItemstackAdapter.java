package ltd.matrixstudios.andromeda.backend.serialization.adapters;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \u000f2\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u00012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0003:\u0002\u000f\u0010B\u0005\u00a2\u0006\u0002\u0010\u0004J&\u0010\u0005\u001a\u00020\u00022\b\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\u0010\b\u001a\u0004\u0018\u00010\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0016J\"\u0010\f\u001a\u00020\u00072\b\u0010\r\u001a\u0004\u0018\u00010\u00022\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000eH\u0016\u00a8\u0006\u0011"}, d2 = {"Lltd/matrixstudios/andromeda/backend/serialization/adapters/ItemstackAdapter;", "Lcom/google/gson/JsonDeserializer;", "Lorg/bukkit/inventory/ItemStack;", "Lcom/google/gson/JsonSerializer;", "()V", "deserialize", "element", "Lcom/google/gson/JsonElement;", "type", "Ljava/lang/reflect/Type;", "context", "Lcom/google/gson/JsonDeserializationContext;", "serialize", "item", "Lcom/google/gson/JsonSerializationContext;", "Companion", "Key", "shared"})
public final class ItemstackAdapter implements com.google.gson.JsonDeserializer<org.bukkit.inventory.ItemStack>, com.google.gson.JsonSerializer<org.bukkit.inventory.ItemStack> {
    @org.jetbrains.annotations.NotNull()
    public static final ltd.matrixstudios.andromeda.backend.serialization.adapters.ItemstackAdapter.Companion Companion = null;
    
    public ItemstackAdapter() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.google.gson.JsonElement serialize(@org.jetbrains.annotations.Nullable()
    org.bukkit.inventory.ItemStack item, @org.jetbrains.annotations.NotNull()
    java.lang.reflect.Type type, @org.jetbrains.annotations.NotNull()
    com.google.gson.JsonSerializationContext context) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @kotlin.jvm.Throws(exceptionClasses = {com.google.gson.JsonParseException.class})
    @java.lang.Override()
    public org.bukkit.inventory.ItemStack deserialize(@org.jetbrains.annotations.Nullable()
    com.google.gson.JsonElement element, @org.jetbrains.annotations.Nullable()
    java.lang.reflect.Type type, @org.jetbrains.annotations.Nullable()
    com.google.gson.JsonDeserializationContext context) throws com.google.gson.JsonParseException {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\r\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0011"}, d2 = {"Lltd/matrixstudios/andromeda/backend/serialization/adapters/ItemstackAdapter$Key;", "", "()V", "BOOK_AUTHOR", "", "BOOK_PAGES", "BOOK_TITLE", "COUNT", "ENCHANTMENTS", "ID", "LEATHER_ARMOR_COLOR", "LORE", "MAP_SCALING", "NAME", "POTION_EFFECTS", "SKULL_OWNER", "STORED_ENCHANTS", "shared"})
    public static final class Key {
        @org.jetbrains.annotations.NotNull()
        public static final ltd.matrixstudios.andromeda.backend.serialization.adapters.ItemstackAdapter.Key INSTANCE = null;
        @org.jetbrains.annotations.NotNull()
        public static final java.lang.String ID = "id";
        @org.jetbrains.annotations.NotNull()
        public static final java.lang.String COUNT = "count";
        @org.jetbrains.annotations.NotNull()
        public static final java.lang.String NAME = "name";
        @org.jetbrains.annotations.NotNull()
        public static final java.lang.String LORE = "lore";
        @org.jetbrains.annotations.NotNull()
        public static final java.lang.String ENCHANTMENTS = "enchants";
        @org.jetbrains.annotations.NotNull()
        public static final java.lang.String BOOK_TITLE = "title";
        @org.jetbrains.annotations.NotNull()
        public static final java.lang.String BOOK_AUTHOR = "author";
        @org.jetbrains.annotations.NotNull()
        public static final java.lang.String BOOK_PAGES = "pages";
        @org.jetbrains.annotations.NotNull()
        public static final java.lang.String LEATHER_ARMOR_COLOR = "color";
        @org.jetbrains.annotations.NotNull()
        public static final java.lang.String MAP_SCALING = "scaling";
        @org.jetbrains.annotations.NotNull()
        public static final java.lang.String STORED_ENCHANTS = "stored-enchants";
        @org.jetbrains.annotations.NotNull()
        public static final java.lang.String SKULL_OWNER = "skull";
        @org.jetbrains.annotations.NotNull()
        public static final java.lang.String POTION_EFFECTS = "potion-effects";
        
        private Key() {
            super();
        }
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u001e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0006\u001a\u00020\u0007J\u0016\u0010\u0003\u001a\u00020\b2\u000e\u0010\t\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\nJ\u0010\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u0007J\u0010\u0010\u000e\u001a\u00020\u00052\u0006\u0010\u000f\u001a\u00020\fH\u0002J\u0010\u0010\u0010\u001a\u00020\u00072\b\u0010\u000f\u001a\u0004\u0018\u00010\f\u00a8\u0006\u0011"}, d2 = {"Lltd/matrixstudios/andromeda/backend/serialization/adapters/ItemstackAdapter$Companion;", "", "()V", "convertStringList", "", "", "jsonElement", "Lcom/google/gson/JsonElement;", "Lcom/google/gson/JsonArray;", "strings", "", "deserialize", "Lorg/bukkit/inventory/ItemStack;", "object", "getDataKey", "item", "serialize", "shared"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.google.gson.JsonElement serialize(@org.jetbrains.annotations.Nullable()
        org.bukkit.inventory.ItemStack item) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final org.bukkit.inventory.ItemStack deserialize(@org.jetbrains.annotations.Nullable()
        com.google.gson.JsonElement object) {
            return null;
        }
        
        private final java.lang.String getDataKey(org.bukkit.inventory.ItemStack item) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.google.gson.JsonArray convertStringList(@org.jetbrains.annotations.NotNull()
        java.util.Collection<java.lang.String> strings) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.util.List<java.lang.String> convertStringList(@org.jetbrains.annotations.NotNull()
        com.google.gson.JsonElement jsonElement) {
            return null;
        }
    }
}