package ltd.matrixstudios.andromeda.backend.serialization.adapters;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \u00102\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00020\u0003:\u0001\u0010B\u0005\u00a2\u0006\u0002\u0010\u0004J\"\u0010\u0005\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0016J \u0010\f\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000fH\u0016\u00a8\u0006\u0011"}, d2 = {"Lltd/matrixstudios/andromeda/backend/serialization/adapters/LocationAdapter;", "Lcom/google/gson/JsonDeserializer;", "Lorg/bukkit/Location;", "Lcom/google/gson/JsonSerializer;", "()V", "deserialize", "json", "Lcom/google/gson/JsonElement;", "typeOfT", "Ljava/lang/reflect/Type;", "context", "Lcom/google/gson/JsonDeserializationContext;", "serialize", "src", "typeOfSrc", "Lcom/google/gson/JsonSerializationContext;", "Companion", "shared"})
public final class LocationAdapter implements com.google.gson.JsonDeserializer<org.bukkit.Location>, com.google.gson.JsonSerializer<org.bukkit.Location> {
    @org.jetbrains.annotations.NotNull()
    public static final ltd.matrixstudios.andromeda.backend.serialization.adapters.LocationAdapter.Companion Companion = null;
    
    public LocationAdapter() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.google.gson.JsonElement serialize(@org.jetbrains.annotations.NotNull()
    org.bukkit.Location src, @org.jetbrains.annotations.NotNull()
    java.lang.reflect.Type typeOfSrc, @org.jetbrains.annotations.NotNull()
    com.google.gson.JsonSerializationContext context) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @kotlin.jvm.Throws(exceptionClasses = {com.google.gson.JsonParseException.class})
    @java.lang.Override()
    public org.bukkit.Location deserialize(@org.jetbrains.annotations.NotNull()
    com.google.gson.JsonElement json, @org.jetbrains.annotations.NotNull()
    java.lang.reflect.Type typeOfT, @org.jetbrains.annotations.NotNull()
    com.google.gson.JsonDeserializationContext context) throws com.google.gson.JsonParseException {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0012\u0010\u0003\u001a\u0004\u0018\u00010\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\b2\b\u0010\t\u001a\u0004\u0018\u00010\u0004\u00a8\u0006\n"}, d2 = {"Lltd/matrixstudios/andromeda/backend/serialization/adapters/LocationAdapter$Companion;", "", "()V", "fromJson", "Lorg/bukkit/Location;", "jsonElement", "Lcom/google/gson/JsonElement;", "toJson", "Lcom/google/gson/JsonObject;", "location", "shared"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.Nullable()
        public final com.google.gson.JsonObject toJson(@org.jetbrains.annotations.Nullable()
        org.bukkit.Location location) {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final org.bukkit.Location fromJson(@org.jetbrains.annotations.Nullable()
        com.google.gson.JsonElement jsonElement) {
            return null;
        }
    }
}