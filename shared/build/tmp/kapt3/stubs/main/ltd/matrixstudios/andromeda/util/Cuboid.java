package ltd.matrixstudios.andromeda.util;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0086\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0005\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b$\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0004\n\u0002\u0010\"\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010(\n\u0002\b\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u00032\u00020\u0004:\u0002mnB\u0019\b\u0017\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u00a2\u0006\u0002\u0010\bB\u000f\b\u0016\u0012\u0006\u0010\t\u001a\u00020\u0000\u00a2\u0006\u0002\u0010\nB?\b\u0016\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\u0006\u0010\r\u001a\u00020\u000e\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0010\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u000e\u0012\u0006\u0010\u0012\u001a\u00020\u000e\u0012\u0006\u0010\u0013\u001a\u00020\u000e\u00a2\u0006\u0002\u0010\u0014B?\b\u0012\u0012\u0006\u0010\u0015\u001a\u00020\u0016\u0012\u0006\u0010\r\u001a\u00020\u000e\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0010\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u000e\u0012\u0006\u0010\u0012\u001a\u00020\u000e\u0012\u0006\u0010\u0013\u001a\u00020\u000e\u00a2\u0006\u0002\u0010\u0017B\u001b\b\u0016\u0012\u0012\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u001a0\u0019\u00a2\u0006\u0002\u0010\u001bJ\b\u0010D\u001a\u00020\u0000H\u0016J\u001e\u0010E\u001a\u00020F2\u0006\u0010G\u001a\u00020\u000e2\u0006\u0010H\u001a\u00020\u000e2\u0006\u0010I\u001a\u00020\u000eJ\u0011\u0010E\u001a\u00020F2\u0006\u0010J\u001a\u00020\u0000H\u0086\u0002J\u0011\u0010E\u001a\u00020F2\u0006\u0010K\u001a\u00020\u0006H\u0086\u0002J\u0011\u0010E\u001a\u00020F2\u0006\u0010L\u001a\u00020\u0002H\u0086\u0002J\u0011\u0010E\u001a\u00020F2\u0006\u0010M\u001a\u00020NH\u0086\u0002J\u000e\u0010O\u001a\u00020F2\u0006\u0010P\u001a\u00020\u000eJ\u0006\u0010Q\u001a\u00020\u0000J\u000e\u0010Q\u001a\u00020\u00002\u0006\u0010R\u001a\u00020SJ\u0011\u0010T\u001a\b\u0012\u0004\u0012\u00020\u00020U\u00a2\u0006\u0002\u0010VJ\u0016\u0010W\u001a\u00020\u00002\u0006\u0010R\u001a\u00020S2\u0006\u0010X\u001a\u00020\u000eJ\f\u0010Y\u001a\b\u0012\u0004\u0012\u00020\u00060ZJ\u0010\u0010[\u001a\u00020\u00002\b\u0010\t\u001a\u0004\u0018\u00010\u0000J\f\u0010\\\u001a\b\u0012\u0004\u0012\u00020]0!J\u000e\u0010^\u001a\u00020\u00002\u0006\u0010R\u001a\u00020SJ\f\u0010_\u001a\b\u0012\u0004\u0012\u00020\u00020!J\u001e\u0010`\u001a\u00020\u00022\u0006\u0010G\u001a\u00020\u000e2\u0006\u0010H\u001a\u00020\u000e2\u0006\u0010I\u001a\u00020\u000eJ&\u0010`\u001a\u00020\u00022\u0006\u0010a\u001a\u00020\f2\u0006\u0010G\u001a\u00020\u000e2\u0006\u0010H\u001a\u00020\u000e2\u0006\u0010I\u001a\u00020\u000eJ\f\u0010b\u001a\b\u0012\u0004\u0012\u00020\u00020!J\u000e\u0010c\u001a\u00020\u00002\u0006\u0010d\u001a\u00020\u000eJ\u0018\u0010e\u001a\u0004\u0018\u00010\u00002\u0006\u0010R\u001a\u00020S2\u0006\u0010X\u001a\u00020\u000eJ\u000f\u0010f\u001a\b\u0012\u0004\u0012\u00020\u00020gH\u0096\u0002J\u0011\u0010h\u001a\b\u0012\u0004\u0012\u00020\u00020U\u00a2\u0006\u0002\u0010VJ\u0018\u0010i\u001a\u0004\u0018\u00010\u00002\u0006\u0010R\u001a\u00020S2\u0006\u0010X\u001a\u00020\u000eJ\u0014\u0010j\u001a\u000e\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u001a0\u0019H\u0016J\u0016\u0010k\u001a\u00020\u00002\u0006\u0010R\u001a\u00020S2\u0006\u0010X\u001a\u00020\u000eJ\b\u0010l\u001a\u00020\u0016H\u0016R\u0011\u0010\u001c\u001a\u00020\u001d8F\u00a2\u0006\u0006\u001a\u0004\b\u001e\u0010\u001fR\u0017\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00020!8F\u00a2\u0006\u0006\u001a\u0004\b\"\u0010#R\u0011\u0010$\u001a\u00020\u00068F\u00a2\u0006\u0006\u001a\u0004\b%\u0010&R\u0011\u0010\'\u001a\u00020\u00068F\u00a2\u0006\u0006\u001a\u0004\b(\u0010&R\u0011\u0010)\u001a\u00020\u000e\u00a2\u0006\b\n\u0000\u001a\u0004\b*\u0010+R\u0011\u0010,\u001a\u00020\u000e\u00a2\u0006\b\n\u0000\u001a\u0004\b-\u0010+R\u0011\u0010.\u001a\u00020\u000e\u00a2\u0006\b\n\u0000\u001a\u0004\b/\u0010+R\u0011\u00100\u001a\u00020\u000e8F\u00a2\u0006\u0006\u001a\u0004\b1\u0010+R\u0011\u00102\u001a\u00020\u000e8F\u00a2\u0006\u0006\u001a\u0004\b3\u0010+R\u0011\u00104\u001a\u00020\u000e8F\u00a2\u0006\u0006\u001a\u0004\b5\u0010+R\u0011\u00106\u001a\u00020\u00068F\u00a2\u0006\u0006\u001a\u0004\b7\u0010&R\u0011\u00108\u001a\u00020\u000e\u00a2\u0006\b\n\u0000\u001a\u0004\b9\u0010+R\u0011\u0010:\u001a\u00020\u000e\u00a2\u0006\b\n\u0000\u001a\u0004\b;\u0010+R\u0011\u0010<\u001a\u00020\u000e\u00a2\u0006\b\n\u0000\u001a\u0004\b=\u0010+R\u0011\u0010>\u001a\u00020\u000e8F\u00a2\u0006\u0006\u001a\u0004\b?\u0010+R\u0011\u0010\u000b\u001a\u00020\f8F\u00a2\u0006\u0006\u001a\u0004\b@\u0010AR\u0014\u0010\u0015\u001a\u00020\u0016X\u0084\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\bB\u0010C\u00a8\u0006o"}, d2 = {"Lltd/matrixstudios/andromeda/util/Cuboid;", "", "Lorg/bukkit/block/Block;", "", "Lorg/bukkit/configuration/serialization/ConfigurationSerializable;", "l1", "Lorg/bukkit/Location;", "l2", "(Lorg/bukkit/Location;Lorg/bukkit/Location;)V", "other", "(Lltd/matrixstudios/andromeda/util/Cuboid;)V", "world", "Lorg/bukkit/World;", "x1", "", "y1", "z1", "x2", "y2", "z2", "(Lorg/bukkit/World;IIIIII)V", "worldName", "", "(Ljava/lang/String;IIIIII)V", "map", "", "", "(Ljava/util/Map;)V", "averageLightLevel", "", "getAverageLightLevel", "()B", "blocks", "", "getBlocks", "()Ljava/util/List;", "center", "getCenter", "()Lorg/bukkit/Location;", "lowerNE", "getLowerNE", "lowerX", "getLowerX", "()I", "lowerY", "getLowerY", "lowerZ", "getLowerZ", "sizeX", "getSizeX", "sizeY", "getSizeY", "sizeZ", "getSizeZ", "upperSW", "getUpperSW", "upperX", "getUpperX", "upperY", "getUpperY", "upperZ", "getUpperZ", "volume", "getVolume", "getWorld", "()Lorg/bukkit/World;", "getWorldName", "()Ljava/lang/String;", "clone", "contains", "", "x", "y", "z", "cuboid", "location", "block", "entity", "Lorg/bukkit/entity/Entity;", "containsOnly", "blockId", "contract", "dir", "Lltd/matrixstudios/andromeda/util/Cuboid$CuboidDirection;", "corners", "", "()[Lorg/bukkit/block/Block;", "expand", "amount", "getBlockLocations", "", "getBoundingCuboid", "getChunks", "Lorg/bukkit/Chunk;", "getFace", "getFaces", "getRelativeBlock", "w", "getWalls", "grow", "i", "inset", "iterator", "", "minCorners", "outset", "serialize", "shift", "toString", "CuboidDirection", "CuboidIterator", "shared"})
public final class Cuboid implements java.lang.Iterable<org.bukkit.block.Block>, java.lang.Cloneable, org.bukkit.configuration.serialization.ConfigurationSerializable, kotlin.jvm.internal.markers.KMappedMarker {
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String worldName = null;
    private final int lowerX = 0;
    private final int lowerY = 0;
    private final int lowerZ = 0;
    private final int upperX = 0;
    private final int upperY = 0;
    private final int upperZ = 0;
    
    @org.jetbrains.annotations.NotNull()
    protected final java.lang.String getWorldName() {
        return null;
    }
    
    public final int getLowerX() {
        return 0;
    }
    
    public final int getLowerY() {
        return 0;
    }
    
    public final int getLowerZ() {
        return 0;
    }
    
    public final int getUpperX() {
        return 0;
    }
    
    public final int getUpperY() {
        return 0;
    }
    
    public final int getUpperZ() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final org.bukkit.Location getLowerNE() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final org.bukkit.Location getUpperSW() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<org.bukkit.block.Block> getBlocks() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final org.bukkit.Location getCenter() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final org.bukkit.World getWorld() {
        return null;
    }
    
    public final int getSizeX() {
        return 0;
    }
    
    public final int getSizeY() {
        return 0;
    }
    
    public final int getSizeZ() {
        return 0;
    }
    
    public final int getVolume() {
        return 0;
    }
    
    public final byte getAverageLightLevel() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<org.bukkit.Chunk> getChunks() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<org.bukkit.block.Block> getWalls() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<org.bukkit.block.Block> getFaces() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.Set<org.bukkit.Location> getBlockLocations() {
        return null;
    }
    
    @kotlin.jvm.JvmOverloads()
    public Cuboid(@org.jetbrains.annotations.NotNull()
    org.bukkit.Location l1) {
        super();
    }
    
    @kotlin.jvm.JvmOverloads()
    public Cuboid(@org.jetbrains.annotations.NotNull()
    org.bukkit.Location l1, @org.jetbrains.annotations.NotNull()
    org.bukkit.Location l2) {
        super();
    }
    
    public Cuboid(@org.jetbrains.annotations.NotNull()
    ltd.matrixstudios.andromeda.util.Cuboid other) {
        super();
    }
    
    public Cuboid(@org.jetbrains.annotations.NotNull()
    org.bukkit.World world, int x1, int y1, int z1, int x2, int y2, int z2) {
        super();
    }
    
    private Cuboid(java.lang.String worldName, int x1, int y1, int z1, int x2, int y2, int z2) {
        super();
    }
    
    public Cuboid(@org.jetbrains.annotations.NotNull()
    java.util.Map<java.lang.String, ? extends java.lang.Object> map) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.util.Map<java.lang.String, java.lang.Object> serialize() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final org.bukkit.block.Block[] corners() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final org.bukkit.block.Block[] minCorners() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final ltd.matrixstudios.andromeda.util.Cuboid expand(@org.jetbrains.annotations.NotNull()
    ltd.matrixstudios.andromeda.util.Cuboid.CuboidDirection dir, int amount) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final ltd.matrixstudios.andromeda.util.Cuboid shift(@org.jetbrains.annotations.NotNull()
    ltd.matrixstudios.andromeda.util.Cuboid.CuboidDirection dir, int amount) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final ltd.matrixstudios.andromeda.util.Cuboid outset(@org.jetbrains.annotations.NotNull()
    ltd.matrixstudios.andromeda.util.Cuboid.CuboidDirection dir, int amount) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final ltd.matrixstudios.andromeda.util.Cuboid inset(@org.jetbrains.annotations.NotNull()
    ltd.matrixstudios.andromeda.util.Cuboid.CuboidDirection dir, int amount) {
        return null;
    }
    
    public final boolean contains(int x, int y, int z) {
        return false;
    }
    
    public final boolean contains(@org.jetbrains.annotations.NotNull()
    org.bukkit.block.Block block) {
        return false;
    }
    
    public final boolean contains(@org.jetbrains.annotations.NotNull()
    org.bukkit.Location location) {
        return false;
    }
    
    public final boolean contains(@org.jetbrains.annotations.NotNull()
    org.bukkit.entity.Entity entity) {
        return false;
    }
    
    public final boolean contains(@org.jetbrains.annotations.NotNull()
    ltd.matrixstudios.andromeda.util.Cuboid cuboid) {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final ltd.matrixstudios.andromeda.util.Cuboid grow(int i) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final ltd.matrixstudios.andromeda.util.Cuboid contract() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final ltd.matrixstudios.andromeda.util.Cuboid contract(@org.jetbrains.annotations.NotNull()
    ltd.matrixstudios.andromeda.util.Cuboid.CuboidDirection dir) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final ltd.matrixstudios.andromeda.util.Cuboid getFace(@org.jetbrains.annotations.NotNull()
    ltd.matrixstudios.andromeda.util.Cuboid.CuboidDirection dir) {
        return null;
    }
    
    public final boolean containsOnly(int blockId) {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final ltd.matrixstudios.andromeda.util.Cuboid getBoundingCuboid(@org.jetbrains.annotations.Nullable()
    ltd.matrixstudios.andromeda.util.Cuboid other) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final org.bukkit.block.Block getRelativeBlock(int x, int y, int z) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final org.bukkit.block.Block getRelativeBlock(@org.jetbrains.annotations.NotNull()
    org.bukkit.World w, int x, int y, int z) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.util.Iterator<org.bukkit.block.Block> iterator() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public ltd.matrixstudios.andromeda.util.Cuboid clone() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String toString() {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\r\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0006\u0010\u0003\u001a\u00020\u0000j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\r\u00a8\u0006\u000e"}, d2 = {"Lltd/matrixstudios/andromeda/util/Cuboid$CuboidDirection;", "", "(Ljava/lang/String;I)V", "opposite", "NORTH", "EAST", "SOUTH", "WEST", "UP", "DOWN", "HORIZONTAL", "VERTICAL", "BOTH", "UNKNOWN", "shared"})
    public static enum CuboidDirection {
        /*public static final*/ NORTH /* = new NORTH() */,
        /*public static final*/ EAST /* = new EAST() */,
        /*public static final*/ SOUTH /* = new SOUTH() */,
        /*public static final*/ WEST /* = new WEST() */,
        /*public static final*/ UP /* = new UP() */,
        /*public static final*/ DOWN /* = new DOWN() */,
        /*public static final*/ HORIZONTAL /* = new HORIZONTAL() */,
        /*public static final*/ VERTICAL /* = new VERTICAL() */,
        /*public static final*/ BOTH /* = new BOTH() */,
        /*public static final*/ UNKNOWN /* = new UNKNOWN() */;
        
        CuboidDirection() {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final ltd.matrixstudios.andromeda.util.Cuboid.CuboidDirection opposite() {
            return null;
        }
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010(\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u0086\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B=\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\u0006\u0012\u0006\u0010\n\u001a\u00020\u0006\u0012\u0006\u0010\u000b\u001a\u00020\u0006\u00a2\u0006\u0002\u0010\fJ\t\u0010\u0016\u001a\u00020\u0017H\u0096\u0002J\t\u0010\u0018\u001a\u00020\u0002H\u0096\u0002R\u000e\u0010\r\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0019"}, d2 = {"Lltd/matrixstudios/andromeda/util/Cuboid$CuboidIterator;", "", "Lorg/bukkit/block/Block;", "w", "Lorg/bukkit/World;", "x1", "", "y1", "z1", "x2", "y2", "z2", "(Lltd/matrixstudios/andromeda/util/Cuboid;Lorg/bukkit/World;IIIIII)V", "baseX", "baseY", "baseZ", "sizeX", "sizeY", "sizeZ", "x", "y", "z", "hasNext", "", "next", "shared"})
    public final class CuboidIterator implements java.util.Iterator<org.bukkit.block.Block>, kotlin.jvm.internal.markers.KMappedMarker {
        private final org.bukkit.World w = null;
        private final int baseX = 0;
        private final int baseY = 0;
        private final int baseZ = 0;
        private int x = 0;
        private int y = 0;
        private int z = 0;
        private final int sizeX = 0;
        private final int sizeY = 0;
        private final int sizeZ = 0;
        
        public CuboidIterator(@org.jetbrains.annotations.NotNull()
        org.bukkit.World w, int x1, int y1, int z1, int x2, int y2, int z2) {
            super();
        }
        
        @java.lang.Override()
        public boolean hasNext() {
            return false;
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public org.bukkit.block.Block next() {
            return null;
        }
    }
}