package ltd.matrixstudios.andromeda.menu;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\b&\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\t0\bJ\u001c\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u000b\u001a\u00020\f2\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0006\u0010\r\u001a\u00020\u000eR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000f"}, d2 = {"Lltd/matrixstudios/andromeda/menu/Menu;", "", "size", "", "player", "Lorg/bukkit/entity/Player;", "(ILorg/bukkit/entity/Player;)V", "getAllButtons", "", "Lltd/matrixstudios/andromeda/menu/Button;", "getButtons", "getTitle", "", "openMenu", "", "shared"})
public abstract class Menu {
    private final int size = 0;
    private final org.bukkit.entity.Player player = null;
    
    public Menu(int size, @org.jetbrains.annotations.NotNull()
    org.bukkit.entity.Player player) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public abstract java.util.Map<java.lang.Integer, ltd.matrixstudios.andromeda.menu.Button> getButtons(@org.jetbrains.annotations.NotNull()
    org.bukkit.entity.Player player);
    
    @org.jetbrains.annotations.NotNull()
    public abstract java.lang.String getTitle(@org.jetbrains.annotations.NotNull()
    org.bukkit.entity.Player player);
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.Map<java.lang.Integer, ltd.matrixstudios.andromeda.menu.Button> getAllButtons() {
        return null;
    }
    
    public final void openMenu() {
    }
}