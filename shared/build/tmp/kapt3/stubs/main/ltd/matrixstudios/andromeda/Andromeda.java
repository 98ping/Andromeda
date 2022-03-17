package ltd.matrixstudios.andromeda;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J&\u0010\'\u001a\u00020(2\u0006\u0010)\u001a\u00020*2\u0006\u0010+\u001a\u00020*2\u0006\u0010,\u001a\u00020*2\u0006\u0010-\u001a\u00020.J\u0006\u0010/\u001a\u00020(R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\nX\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001a\u0010\u000f\u001a\u00020\u0010X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0015\u001a\u00020\u0016X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\u001a\u0010\u001b\u001a\u00020\u001cX\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R\u001a\u0010!\u001a\u00020\"X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&j\u0002\b0\u00a8\u00061"}, d2 = {"Lltd/matrixstudios/andromeda/Andromeda;", "", "(Ljava/lang/String;I)V", "andromedaMongo", "Lltd/matrixstudios/andromeda/backend/databases/AndromedaMongo;", "getAndromedaMongo", "()Lltd/matrixstudios/andromeda/backend/databases/AndromedaMongo;", "setAndromedaMongo", "(Lltd/matrixstudios/andromeda/backend/databases/AndromedaMongo;)V", "andromedaRedis", "Lltd/matrixstudios/andromeda/backend/databases/AndromedaRedis;", "getAndromedaRedis", "()Lltd/matrixstudios/andromeda/backend/databases/AndromedaRedis;", "setAndromedaRedis", "(Lltd/matrixstudios/andromeda/backend/databases/AndromedaRedis;)V", "gameArenaService", "Lltd/matrixstudios/andromeda/arena/GameArenaService;", "getGameArenaService", "()Lltd/matrixstudios/andromeda/arena/GameArenaService;", "setGameArenaService", "(Lltd/matrixstudios/andromeda/arena/GameArenaService;)V", "gameTeamService", "Lltd/matrixstudios/andromeda/teams/GameTeamService;", "getGameTeamService", "()Lltd/matrixstudios/andromeda/teams/GameTeamService;", "setGameTeamService", "(Lltd/matrixstudios/andromeda/teams/GameTeamService;)V", "gamemodeService", "Lltd/matrixstudios/andromeda/modes/GamemodeService;", "getGamemodeService", "()Lltd/matrixstudios/andromeda/modes/GamemodeService;", "setGamemodeService", "(Lltd/matrixstudios/andromeda/modes/GamemodeService;)V", "statisticService", "Lltd/matrixstudios/andromeda/statistics/SaveableStatisticService;", "getStatisticService", "()Lltd/matrixstudios/andromeda/statistics/SaveableStatisticService;", "setStatisticService", "(Lltd/matrixstudios/andromeda/statistics/SaveableStatisticService;)V", "load", "", "mongoConnectionURI", "", "mongoDatabase", "redisConnectionHost", "plugin", "Lorg/bukkit/plugin/Plugin;", "loadRedisItems", "INSTANCE", "shared"})
public enum Andromeda {
    /*public static final*/ INSTANCE /* = new INSTANCE() */;
    public ltd.matrixstudios.andromeda.backend.databases.AndromedaMongo andromedaMongo;
    public ltd.matrixstudios.andromeda.backend.databases.AndromedaRedis andromedaRedis;
    public ltd.matrixstudios.andromeda.statistics.SaveableStatisticService statisticService;
    public ltd.matrixstudios.andromeda.modes.GamemodeService gamemodeService;
    public ltd.matrixstudios.andromeda.teams.GameTeamService gameTeamService;
    public ltd.matrixstudios.andromeda.arena.GameArenaService gameArenaService;
    
    Andromeda() {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final ltd.matrixstudios.andromeda.backend.databases.AndromedaMongo getAndromedaMongo() {
        return null;
    }
    
    public final void setAndromedaMongo(@org.jetbrains.annotations.NotNull()
    ltd.matrixstudios.andromeda.backend.databases.AndromedaMongo p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final ltd.matrixstudios.andromeda.backend.databases.AndromedaRedis getAndromedaRedis() {
        return null;
    }
    
    public final void setAndromedaRedis(@org.jetbrains.annotations.NotNull()
    ltd.matrixstudios.andromeda.backend.databases.AndromedaRedis p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final ltd.matrixstudios.andromeda.statistics.SaveableStatisticService getStatisticService() {
        return null;
    }
    
    public final void setStatisticService(@org.jetbrains.annotations.NotNull()
    ltd.matrixstudios.andromeda.statistics.SaveableStatisticService p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final ltd.matrixstudios.andromeda.modes.GamemodeService getGamemodeService() {
        return null;
    }
    
    public final void setGamemodeService(@org.jetbrains.annotations.NotNull()
    ltd.matrixstudios.andromeda.modes.GamemodeService p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final ltd.matrixstudios.andromeda.teams.GameTeamService getGameTeamService() {
        return null;
    }
    
    public final void setGameTeamService(@org.jetbrains.annotations.NotNull()
    ltd.matrixstudios.andromeda.teams.GameTeamService p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final ltd.matrixstudios.andromeda.arena.GameArenaService getGameArenaService() {
        return null;
    }
    
    public final void setGameArenaService(@org.jetbrains.annotations.NotNull()
    ltd.matrixstudios.andromeda.arena.GameArenaService p0) {
    }
    
    public final void load(@org.jetbrains.annotations.NotNull()
    java.lang.String mongoConnectionURI, @org.jetbrains.annotations.NotNull()
    java.lang.String mongoDatabase, @org.jetbrains.annotations.NotNull()
    java.lang.String redisConnectionHost, @org.jetbrains.annotations.NotNull()
    org.bukkit.plugin.Plugin plugin) {
    }
    
    public final void loadRedisItems() {
    }
}