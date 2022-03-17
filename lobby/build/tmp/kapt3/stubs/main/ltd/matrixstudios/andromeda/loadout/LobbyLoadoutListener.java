package ltd.matrixstudios.andromeda.loadout;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0007J\u0010\u0010\u0010\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u0011H\u0007J\u0010\u0010\u0012\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u0013H\u0007J\u0010\u0010\u0014\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u0015H\u0007J\u0006\u0010\u0016\u001a\u00020\rR\u001a\u0010\u0003\u001a\u00020\u0004X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\u0004X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0006\"\u0004\b\u000b\u0010\b\u00a8\u0006\u0017"}, d2 = {"Lltd/matrixstudios/andromeda/loadout/LobbyLoadoutListener;", "Lorg/bukkit/event/Listener;", "()V", "serverselector", "Lorg/bukkit/inventory/ItemStack;", "getServerselector", "()Lorg/bukkit/inventory/ItemStack;", "setServerselector", "(Lorg/bukkit/inventory/ItemStack;)V", "stats", "getStats", "setStats", "damage", "", "event", "Lorg/bukkit/event/entity/EntityDamageEvent;", "damagePlayer", "Lorg/bukkit/event/entity/EntityDamageByEntityEvent;", "interact", "Lorg/bukkit/event/player/PlayerInteractEvent;", "join", "Lorg/bukkit/event/player/PlayerJoinEvent;", "loadItems", "lobby"})
public final class LobbyLoadoutListener implements org.bukkit.event.Listener {
    @org.jetbrains.annotations.NotNull()
    public static final ltd.matrixstudios.andromeda.loadout.LobbyLoadoutListener INSTANCE = null;
    public static org.bukkit.inventory.ItemStack serverselector;
    public static org.bukkit.inventory.ItemStack stats;
    
    private LobbyLoadoutListener() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final org.bukkit.inventory.ItemStack getServerselector() {
        return null;
    }
    
    public final void setServerselector(@org.jetbrains.annotations.NotNull()
    org.bukkit.inventory.ItemStack p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final org.bukkit.inventory.ItemStack getStats() {
        return null;
    }
    
    public final void setStats(@org.jetbrains.annotations.NotNull()
    org.bukkit.inventory.ItemStack p0) {
    }
    
    public final void loadItems() {
    }
    
    @org.bukkit.event.EventHandler()
    public final void join(@org.jetbrains.annotations.NotNull()
    org.bukkit.event.player.PlayerJoinEvent event) {
    }
    
    @org.bukkit.event.EventHandler()
    public final void damagePlayer(@org.jetbrains.annotations.NotNull()
    org.bukkit.event.entity.EntityDamageByEntityEvent event) {
    }
    
    @org.bukkit.event.EventHandler()
    public final void damage(@org.jetbrains.annotations.NotNull()
    org.bukkit.event.entity.EntityDamageEvent event) {
    }
    
    @org.bukkit.event.EventHandler()
    public final void interact(@org.jetbrains.annotations.NotNull()
    org.bukkit.event.player.PlayerInteractEvent event) {
    }
}