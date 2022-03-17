package ltd.matrixstudios.andromeda.teams;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001B1\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0010\b\u001a\u00020\t\u00a2\u0006\u0002\u0010\nJ\t\u0010\u0014\u001a\u00020\u0003H\u00c6\u0003J\u000f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u00c6\u0003J\u000f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u00c6\u0003J\t\u0010\u0017\u001a\u00020\tH\u00c6\u0003J=\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\b\b\u0002\u0010\b\u001a\u00020\tH\u00c6\u0001J\u0013\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u001c\u001a\u00020\u001dH\u00d6\u0001J\u0006\u0010\u001e\u001a\u00020\u001aJ\t\u0010\u001f\u001a\u00020\u0003H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR \u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u0011\u0010\b\u001a\u00020\t\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u000e\u00a8\u0006 "}, d2 = {"Lltd/matrixstudios/andromeda/teams/GameTeam;", "", "abbreviatedId", "", "teamMembers", "", "Ljava/util/UUID;", "membersAlive", "targetGameMode", "Lltd/matrixstudios/andromeda/modes/Gamemode;", "(Ljava/lang/String;Ljava/util/List;Ljava/util/List;Lltd/matrixstudios/andromeda/modes/Gamemode;)V", "getAbbreviatedId", "()Ljava/lang/String;", "getMembersAlive", "()Ljava/util/List;", "setMembersAlive", "(Ljava/util/List;)V", "getTargetGameMode", "()Lltd/matrixstudios/andromeda/modes/Gamemode;", "getTeamMembers", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "teamIsFull", "toString", "shared"})
public final class GameTeam {
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String abbreviatedId = null;
    @org.jetbrains.annotations.NotNull()
    private final java.util.List<java.util.UUID> teamMembers = null;
    @org.jetbrains.annotations.NotNull()
    private java.util.List<java.util.UUID> membersAlive;
    @org.jetbrains.annotations.NotNull()
    private final ltd.matrixstudios.andromeda.modes.Gamemode targetGameMode = null;
    
    @org.jetbrains.annotations.NotNull()
    public final ltd.matrixstudios.andromeda.teams.GameTeam copy(@org.jetbrains.annotations.NotNull()
    java.lang.String abbreviatedId, @org.jetbrains.annotations.NotNull()
    java.util.List<java.util.UUID> teamMembers, @org.jetbrains.annotations.NotNull()
    java.util.List<java.util.UUID> membersAlive, @org.jetbrains.annotations.NotNull()
    ltd.matrixstudios.andromeda.modes.Gamemode targetGameMode) {
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
    
    public GameTeam(@org.jetbrains.annotations.NotNull()
    java.lang.String abbreviatedId, @org.jetbrains.annotations.NotNull()
    java.util.List<java.util.UUID> teamMembers, @org.jetbrains.annotations.NotNull()
    java.util.List<java.util.UUID> membersAlive, @org.jetbrains.annotations.NotNull()
    ltd.matrixstudios.andromeda.modes.Gamemode targetGameMode) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component1() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getAbbreviatedId() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<java.util.UUID> component2() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<java.util.UUID> getTeamMembers() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<java.util.UUID> component3() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<java.util.UUID> getMembersAlive() {
        return null;
    }
    
    public final void setMembersAlive(@org.jetbrains.annotations.NotNull()
    java.util.List<java.util.UUID> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final ltd.matrixstudios.andromeda.modes.Gamemode component4() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final ltd.matrixstudios.andromeda.modes.Gamemode getTargetGameMode() {
        return null;
    }
    
    public final boolean teamIsFull() {
        return false;
    }
}