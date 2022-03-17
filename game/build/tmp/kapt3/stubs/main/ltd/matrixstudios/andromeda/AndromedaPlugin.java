package ltd.matrixstudios.andromeda;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0005\u0018\u0000 &2\u00020\u0001:\u0001&B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0006\u0010!\u001a\u00020\"J\u0006\u0010#\u001a\u00020\"J\b\u0010$\u001a\u00020\"H\u0016J\b\u0010%\u001a\u00020\"H\u0016R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\nX\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001a\u0010\u000f\u001a\u00020\u0010X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0015\u001a\u00020\u0016X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\u001a\u0010\u001b\u001a\u00020\u001cX\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 \u00a8\u0006\'"}, d2 = {"Lltd/matrixstudios/andromeda/AndromedaPlugin;", "Lorg/bukkit/plugin/java/JavaPlugin;", "()V", "commandHandler", "Lco/aikar/commands/BukkitCommandManager;", "getCommandHandler", "()Lco/aikar/commands/BukkitCommandManager;", "setCommandHandler", "(Lco/aikar/commands/BukkitCommandManager;)V", "gameCountdown", "Lltd/matrixstudios/andromeda/game/GameCountdown;", "getGameCountdown", "()Lltd/matrixstudios/andromeda/game/GameCountdown;", "setGameCountdown", "(Lltd/matrixstudios/andromeda/game/GameCountdown;)V", "gameHeartbeatTask", "Lltd/matrixstudios/andromeda/game/task/GameHeartbeatTask;", "getGameHeartbeatTask", "()Lltd/matrixstudios/andromeda/game/task/GameHeartbeatTask;", "setGameHeartbeatTask", "(Lltd/matrixstudios/andromeda/game/task/GameHeartbeatTask;)V", "gameInstance", "Lltd/matrixstudios/andromeda/game/Game;", "getGameInstance", "()Lltd/matrixstudios/andromeda/game/Game;", "setGameInstance", "(Lltd/matrixstudios/andromeda/game/Game;)V", "gameService", "Lltd/matrixstudios/andromeda/game/GameService;", "getGameService", "()Lltd/matrixstudios/andromeda/game/GameService;", "setGameService", "(Lltd/matrixstudios/andromeda/game/GameService;)V", "createGamemode", "", "loadGame", "onDisable", "onEnable", "Companion", "game"})
public final class AndromedaPlugin extends org.bukkit.plugin.java.JavaPlugin {
    @org.jetbrains.annotations.NotNull()
    public static final ltd.matrixstudios.andromeda.AndromedaPlugin.Companion Companion = null;
    public static ltd.matrixstudios.andromeda.AndromedaPlugin instance;
    public ltd.matrixstudios.andromeda.game.Game gameInstance;
    public ltd.matrixstudios.andromeda.game.GameService gameService;
    public co.aikar.commands.BukkitCommandManager commandHandler;
    public ltd.matrixstudios.andromeda.game.task.GameHeartbeatTask gameHeartbeatTask;
    public ltd.matrixstudios.andromeda.game.GameCountdown gameCountdown;
    
    public AndromedaPlugin() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final ltd.matrixstudios.andromeda.game.Game getGameInstance() {
        return null;
    }
    
    public final void setGameInstance(@org.jetbrains.annotations.NotNull()
    ltd.matrixstudios.andromeda.game.Game p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final ltd.matrixstudios.andromeda.game.GameService getGameService() {
        return null;
    }
    
    public final void setGameService(@org.jetbrains.annotations.NotNull()
    ltd.matrixstudios.andromeda.game.GameService p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final co.aikar.commands.BukkitCommandManager getCommandHandler() {
        return null;
    }
    
    public final void setCommandHandler(@org.jetbrains.annotations.NotNull()
    co.aikar.commands.BukkitCommandManager p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final ltd.matrixstudios.andromeda.game.task.GameHeartbeatTask getGameHeartbeatTask() {
        return null;
    }
    
    public final void setGameHeartbeatTask(@org.jetbrains.annotations.NotNull()
    ltd.matrixstudios.andromeda.game.task.GameHeartbeatTask p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final ltd.matrixstudios.andromeda.game.GameCountdown getGameCountdown() {
        return null;
    }
    
    public final void setGameCountdown(@org.jetbrains.annotations.NotNull()
    ltd.matrixstudios.andromeda.game.GameCountdown p0) {
    }
    
    @java.lang.Override()
    public void onEnable() {
    }
    
    @java.lang.Override()
    public void onDisable() {
    }
    
    public final void createGamemode() {
    }
    
    public final void loadGame() {
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b\u00a8\u0006\t"}, d2 = {"Lltd/matrixstudios/andromeda/AndromedaPlugin$Companion;", "", "()V", "instance", "Lltd/matrixstudios/andromeda/AndromedaPlugin;", "getInstance", "()Lltd/matrixstudios/andromeda/AndromedaPlugin;", "setInstance", "(Lltd/matrixstudios/andromeda/AndromedaPlugin;)V", "game"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final ltd.matrixstudios.andromeda.AndromedaPlugin getInstance() {
            return null;
        }
        
        public final void setInstance(@org.jetbrains.annotations.NotNull()
        ltd.matrixstudios.andromeda.AndromedaPlugin p0) {
        }
    }
}