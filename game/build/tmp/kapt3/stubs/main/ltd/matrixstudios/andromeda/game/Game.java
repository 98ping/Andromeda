package ltd.matrixstudios.andromeda.game;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b2\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001Bk\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0006\u0010\t\u001a\u00020\n\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\u0006\u0010\r\u001a\u00020\u000e\u0012\u0006\u0010\u000f\u001a\u00020\u0010\u0012\u0006\u0010\u0011\u001a\u00020\u0012\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\u0006\u0010\u0014\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0015J\t\u00108\u001a\u00020\u0003H\u00c6\u0003J\t\u00109\u001a\u00020\u0012H\u00c6\u0003J\t\u0010:\u001a\u00020\u0003H\u00c6\u0003J\t\u0010;\u001a\u00020\u0003H\u00c6\u0003J\u000f\u0010<\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u00c6\u0003J\u000f\u0010=\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u00c6\u0003J\t\u0010>\u001a\u00020\nH\u00c6\u0003J\u000b\u0010?\u001a\u0004\u0018\u00010\fH\u00c6\u0003J\t\u0010@\u001a\u00020\u000eH\u00c6\u0003J\t\u0010A\u001a\u00020\u0010H\u00c6\u0003J\t\u0010B\u001a\u00020\u0012H\u00c6\u0003J\u0085\u0001\u0010C\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\b\b\u0002\u0010\t\u001a\u00020\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f2\b\b\u0002\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u00102\b\b\u0002\u0010\u0011\u001a\u00020\u00122\b\b\u0002\u0010\u0013\u001a\u00020\u00122\b\b\u0002\u0010\u0014\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010D\u001a\u00020E2\b\u0010F\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010G\u001a\u00020\u0012H\u00d6\u0001J\u0006\u0010H\u001a\u00020IJ\u0006\u0010J\u001a\u00020IJ\u000e\u0010K\u001a\u00020I2\u0006\u0010L\u001a\u00020MJ\u000e\u0010N\u001a\u00020I2\u0006\u0010O\u001a\u00020PJ\t\u0010Q\u001a\u00020\u0003H\u00d6\u0001J\u000e\u0010R\u001a\u00020I2\u0006\u0010S\u001a\u00020ER\u001c\u0010\u000b\u001a\u0004\u0018\u00010\fX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R \u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR\u001a\u0010\u0013\u001a\u00020\u0012X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!R \u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010\u001b\"\u0004\b#\u0010\u001dR\u001a\u0010\u0014\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b$\u0010%\"\u0004\b&\u0010\'R\u001a\u0010\t\u001a\u00020\nX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b(\u0010)\"\u0004\b*\u0010+R\u001a\u0010\r\u001a\u00020\u000eX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b,\u0010-\"\u0004\b.\u0010/R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b0\u0010%R\u001a\u0010\u0011\u001a\u00020\u0012X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b1\u0010\u001f\"\u0004\b2\u0010!R\u001a\u0010\u000f\u001a\u00020\u0010X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b3\u00104\"\u0004\b5\u00106R\u0011\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b7\u0010%\u00a8\u0006T"}, d2 = {"Lltd/matrixstudios/andromeda/game/Game;", "", "internalId", "", "uniqueId", "allParticipants", "", "Ljava/util/UUID;", "aliveParticipants", "gameState", "Lltd/matrixstudios/andromeda/game/state/GameState;", "activeArena", "Lltd/matrixstudios/andromeda/arena/GameArena;", "gamemode", "Lltd/matrixstudios/andromeda/modes/Gamemode;", "teamSizeType", "Lltd/matrixstudios/andromeda/game/team/TeamSizeType;", "playersToStart", "", "allOnlinePlayers", "bungeeServer", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Lltd/matrixstudios/andromeda/game/state/GameState;Lltd/matrixstudios/andromeda/arena/GameArena;Lltd/matrixstudios/andromeda/modes/Gamemode;Lltd/matrixstudios/andromeda/game/team/TeamSizeType;IILjava/lang/String;)V", "getActiveArena", "()Lltd/matrixstudios/andromeda/arena/GameArena;", "setActiveArena", "(Lltd/matrixstudios/andromeda/arena/GameArena;)V", "getAliveParticipants", "()Ljava/util/List;", "setAliveParticipants", "(Ljava/util/List;)V", "getAllOnlinePlayers", "()I", "setAllOnlinePlayers", "(I)V", "getAllParticipants", "setAllParticipants", "getBungeeServer", "()Ljava/lang/String;", "setBungeeServer", "(Ljava/lang/String;)V", "getGameState", "()Lltd/matrixstudios/andromeda/game/state/GameState;", "setGameState", "(Lltd/matrixstudios/andromeda/game/state/GameState;)V", "getGamemode", "()Lltd/matrixstudios/andromeda/modes/Gamemode;", "setGamemode", "(Lltd/matrixstudios/andromeda/modes/Gamemode;)V", "getInternalId", "getPlayersToStart", "setPlayersToStart", "getTeamSizeType", "()Lltd/matrixstudios/andromeda/game/team/TeamSizeType;", "setTeamSizeType", "(Lltd/matrixstudios/andromeda/game/team/TeamSizeType;)V", "getUniqueId", "component1", "component10", "component11", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "", "other", "hashCode", "setupSoloTeams", "", "setupTeamTeams", "teleportTeamMembersToSpawn", "gameTeam", "Lltd/matrixstudios/andromeda/teams/GameTeam;", "teleportToRandomArenaSpawn", "player", "Lorg/bukkit/entity/Player;", "toString", "transportParticipantsToArena", "restrictMovement", "game"})
public final class Game {
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String internalId = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String uniqueId = null;
    @org.jetbrains.annotations.NotNull()
    private java.util.List<java.util.UUID> allParticipants;
    @org.jetbrains.annotations.NotNull()
    private java.util.List<java.util.UUID> aliveParticipants;
    @org.jetbrains.annotations.NotNull()
    private ltd.matrixstudios.andromeda.game.state.GameState gameState;
    @org.jetbrains.annotations.Nullable()
    private ltd.matrixstudios.andromeda.arena.GameArena activeArena;
    @org.jetbrains.annotations.NotNull()
    private ltd.matrixstudios.andromeda.modes.Gamemode gamemode;
    @org.jetbrains.annotations.NotNull()
    private ltd.matrixstudios.andromeda.game.team.TeamSizeType teamSizeType;
    private int playersToStart;
    private int allOnlinePlayers;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String bungeeServer;
    
    @org.jetbrains.annotations.NotNull()
    public final ltd.matrixstudios.andromeda.game.Game copy(@org.jetbrains.annotations.NotNull()
    java.lang.String internalId, @org.jetbrains.annotations.NotNull()
    java.lang.String uniqueId, @org.jetbrains.annotations.NotNull()
    java.util.List<java.util.UUID> allParticipants, @org.jetbrains.annotations.NotNull()
    java.util.List<java.util.UUID> aliveParticipants, @org.jetbrains.annotations.NotNull()
    ltd.matrixstudios.andromeda.game.state.GameState gameState, @org.jetbrains.annotations.Nullable()
    ltd.matrixstudios.andromeda.arena.GameArena activeArena, @org.jetbrains.annotations.NotNull()
    ltd.matrixstudios.andromeda.modes.Gamemode gamemode, @org.jetbrains.annotations.NotNull()
    ltd.matrixstudios.andromeda.game.team.TeamSizeType teamSizeType, int playersToStart, int allOnlinePlayers, @org.jetbrains.annotations.NotNull()
    java.lang.String bungeeServer) {
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
    
    public Game(@org.jetbrains.annotations.NotNull()
    java.lang.String internalId, @org.jetbrains.annotations.NotNull()
    java.lang.String uniqueId, @org.jetbrains.annotations.NotNull()
    java.util.List<java.util.UUID> allParticipants, @org.jetbrains.annotations.NotNull()
    java.util.List<java.util.UUID> aliveParticipants, @org.jetbrains.annotations.NotNull()
    ltd.matrixstudios.andromeda.game.state.GameState gameState, @org.jetbrains.annotations.Nullable()
    ltd.matrixstudios.andromeda.arena.GameArena activeArena, @org.jetbrains.annotations.NotNull()
    ltd.matrixstudios.andromeda.modes.Gamemode gamemode, @org.jetbrains.annotations.NotNull()
    ltd.matrixstudios.andromeda.game.team.TeamSizeType teamSizeType, int playersToStart, int allOnlinePlayers, @org.jetbrains.annotations.NotNull()
    java.lang.String bungeeServer) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component1() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getInternalId() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component2() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getUniqueId() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<java.util.UUID> component3() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<java.util.UUID> getAllParticipants() {
        return null;
    }
    
    public final void setAllParticipants(@org.jetbrains.annotations.NotNull()
    java.util.List<java.util.UUID> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<java.util.UUID> component4() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<java.util.UUID> getAliveParticipants() {
        return null;
    }
    
    public final void setAliveParticipants(@org.jetbrains.annotations.NotNull()
    java.util.List<java.util.UUID> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final ltd.matrixstudios.andromeda.game.state.GameState component5() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final ltd.matrixstudios.andromeda.game.state.GameState getGameState() {
        return null;
    }
    
    public final void setGameState(@org.jetbrains.annotations.NotNull()
    ltd.matrixstudios.andromeda.game.state.GameState p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final ltd.matrixstudios.andromeda.arena.GameArena component6() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final ltd.matrixstudios.andromeda.arena.GameArena getActiveArena() {
        return null;
    }
    
    public final void setActiveArena(@org.jetbrains.annotations.Nullable()
    ltd.matrixstudios.andromeda.arena.GameArena p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final ltd.matrixstudios.andromeda.modes.Gamemode component7() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final ltd.matrixstudios.andromeda.modes.Gamemode getGamemode() {
        return null;
    }
    
    public final void setGamemode(@org.jetbrains.annotations.NotNull()
    ltd.matrixstudios.andromeda.modes.Gamemode p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final ltd.matrixstudios.andromeda.game.team.TeamSizeType component8() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final ltd.matrixstudios.andromeda.game.team.TeamSizeType getTeamSizeType() {
        return null;
    }
    
    public final void setTeamSizeType(@org.jetbrains.annotations.NotNull()
    ltd.matrixstudios.andromeda.game.team.TeamSizeType p0) {
    }
    
    public final int component9() {
        return 0;
    }
    
    public final int getPlayersToStart() {
        return 0;
    }
    
    public final void setPlayersToStart(int p0) {
    }
    
    public final int component10() {
        return 0;
    }
    
    public final int getAllOnlinePlayers() {
        return 0;
    }
    
    public final void setAllOnlinePlayers(int p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component11() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getBungeeServer() {
        return null;
    }
    
    public final void setBungeeServer(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    public final void setupSoloTeams() {
    }
    
    public final void setupTeamTeams() {
    }
    
    public final void teleportToRandomArenaSpawn(@org.jetbrains.annotations.NotNull()
    org.bukkit.entity.Player player) {
    }
    
    public final void teleportTeamMembersToSpawn(@org.jetbrains.annotations.NotNull()
    ltd.matrixstudios.andromeda.teams.GameTeam gameTeam) {
    }
    
    public final void transportParticipantsToArena(boolean restrictMovement) {
    }
}