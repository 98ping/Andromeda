package ltd.matrixstudios.andromeda.listener;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\bH\u0007\u00a8\u0006\t"}, d2 = {"Lltd/matrixstudios/andromeda/listener/GameEventsListener;", "Lorg/bukkit/event/Listener;", "()V", "kill", "", "event", "Lorg/bukkit/event/entity/PlayerDeathEvent;", "tryAndMove", "Lorg/bukkit/event/player/PlayerMoveEvent;", "examplegame"})
public final class GameEventsListener implements org.bukkit.event.Listener {
    
    public GameEventsListener() {
        super();
    }
    
    @org.bukkit.event.EventHandler()
    public final void tryAndMove(@org.jetbrains.annotations.NotNull()
    org.bukkit.event.player.PlayerMoveEvent event) {
    }
    
    @org.bukkit.event.EventHandler()
    public final void kill(@org.jetbrains.annotations.NotNull()
    org.bukkit.event.entity.PlayerDeathEvent event) {
    }
}