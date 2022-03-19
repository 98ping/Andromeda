package ltd.matrixstudios.andromeda.listener;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\bH\u0007J\u0010\u0010\t\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\nH\u0007J\u0010\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\fH\u0007J\u0010\u0010\r\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u000eH\u0007\u00a8\u0006\u000f"}, d2 = {"Lltd/matrixstudios/andromeda/listener/GameEventsListener;", "Lorg/bukkit/event/Listener;", "()V", "break1", "", "event", "Lorg/bukkit/event/block/BlockBreakEvent;", "damage", "Lorg/bukkit/event/entity/EntityDamageByEntityEvent;", "kill", "Lorg/bukkit/event/entity/PlayerDeathEvent;", "place", "Lorg/bukkit/event/block/BlockPlaceEvent;", "tryAndMove", "Lorg/bukkit/event/player/PlayerMoveEvent;", "examplegame"})
public final class GameEventsListener implements org.bukkit.event.Listener {
    
    public GameEventsListener() {
        super();
    }
    
    @org.bukkit.event.EventHandler()
    public final void break1(@org.jetbrains.annotations.NotNull()
    org.bukkit.event.block.BlockBreakEvent event) {
    }
    
    @org.bukkit.event.EventHandler()
    public final void place(@org.jetbrains.annotations.NotNull()
    org.bukkit.event.block.BlockPlaceEvent event) {
    }
    
    @org.bukkit.event.EventHandler()
    public final void tryAndMove(@org.jetbrains.annotations.NotNull()
    org.bukkit.event.player.PlayerMoveEvent event) {
    }
    
    @org.bukkit.event.EventHandler()
    public final void damage(@org.jetbrains.annotations.NotNull()
    org.bukkit.event.entity.EntityDamageByEntityEvent event) {
    }
    
    @org.bukkit.event.EventHandler()
    public final void kill(@org.jetbrains.annotations.NotNull()
    org.bukkit.event.entity.PlayerDeathEvent event) {
    }
}