package ltd.matrixstudios.andromeda.modes;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0019\b\u0086\b\u0018\u00002\u00020\u0001BI\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\u0006\u0010\n\u001a\u00020\u0007\u0012\u0006\u0010\u000b\u001a\u00020\u0007\u0012\u0006\u0010\f\u001a\u00020\r\u00a2\u0006\u0002\u0010\u000eJ\t\u0010\u001a\u001a\u00020\u0003H\u00c6\u0003J\u0015\u0010\u001b\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005H\u00c6\u0003J\t\u0010\u001c\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u001d\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u001e\u001a\u00020\u0007H\u00c6\u0003J\t\u0010\u001f\u001a\u00020\u0007H\u00c6\u0003J\t\u0010 \u001a\u00020\rH\u00c6\u0003J[\u0010!\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u0014\b\u0002\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u00052\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\u00072\b\b\u0002\u0010\u000b\u001a\u00020\u00072\b\b\u0002\u0010\f\u001a\u00020\rH\u00c6\u0001J\u0013\u0010\"\u001a\u00020\r2\b\u0010#\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010$\u001a\u00020\u0007H\u00d6\u0001J\t\u0010%\u001a\u00020\u0003H\u00d6\u0001R\u0011\u0010\t\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\b\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0010R\u0011\u0010\f\u001a\u00020\r\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0010R\u001d\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\n\u001a\u00020\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0011\u0010\u000b\u001a\u00020\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0018\u00a8\u0006&"}, d2 = {"Lltd/matrixstudios/andromeda/modes/Gamemode;", "", "id", "", "material", "Lkotlin/Pair;", "Lorg/bukkit/Material;", "", "displayableName", "abbreviatedName", "maxTeams", "teamSize", "factorTeams", "", "(Ljava/lang/String;Lkotlin/Pair;Ljava/lang/String;Ljava/lang/String;IIZ)V", "getAbbreviatedName", "()Ljava/lang/String;", "getDisplayableName", "getFactorTeams", "()Z", "getId", "getMaterial", "()Lkotlin/Pair;", "getMaxTeams", "()I", "getTeamSize", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "other", "hashCode", "toString", "shared"})
public final class Gamemode {
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String id = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.Pair<org.bukkit.Material, java.lang.Integer> material = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String displayableName = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String abbreviatedName = null;
    private final int maxTeams = 0;
    private final int teamSize = 0;
    private final boolean factorTeams = false;
    
    @org.jetbrains.annotations.NotNull()
    public final ltd.matrixstudios.andromeda.modes.Gamemode copy(@org.jetbrains.annotations.NotNull()
    java.lang.String id, @org.jetbrains.annotations.NotNull()
    kotlin.Pair<? extends org.bukkit.Material, java.lang.Integer> material, @org.jetbrains.annotations.NotNull()
    java.lang.String displayableName, @org.jetbrains.annotations.NotNull()
    java.lang.String abbreviatedName, int maxTeams, int teamSize, boolean factorTeams) {
        return null;
    }
    
    @java.lang.Override()
    public boolean equals(@org.jetbrains.annotations.Nullable()
    java.lang.Object other) {
        return false;
    }
    
    @java.lang.Override()
    public int hashCode() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String toString() {
        return null;
    }
    
    public Gamemode(@org.jetbrains.annotations.NotNull()
    java.lang.String id, @org.jetbrains.annotations.NotNull()
    kotlin.Pair<? extends org.bukkit.Material, java.lang.Integer> material, @org.jetbrains.annotations.NotNull()
    java.lang.String displayableName, @org.jetbrains.annotations.NotNull()
    java.lang.String abbreviatedName, int maxTeams, int teamSize, boolean factorTeams) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component1() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getId() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlin.Pair<org.bukkit.Material, java.lang.Integer> component2() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlin.Pair<org.bukkit.Material, java.lang.Integer> getMaterial() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component3() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getDisplayableName() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component4() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getAbbreviatedName() {
        return null;
    }
    
    public final int component5() {
        return 0;
    }
    
    public final int getMaxTeams() {
        return 0;
    }
    
    public final int component6() {
        return 0;
    }
    
    public final int getTeamSize() {
        return 0;
    }
    
    public final boolean component7() {
        return false;
    }
    
    public final boolean getFactorTeams() {
        return false;
    }
}