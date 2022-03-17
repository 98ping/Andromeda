package ltd.matrixstudios.andromeda.chest.command;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007\u00a8\u0006\b"}, d2 = {"Lltd/matrixstudios/andromeda/chest/command/SetChestInventoryCommand;", "Lco/aikar/commands/BaseCommand;", "()V", "forceReloadChests", "", "player", "Lorg/bukkit/entity/Player;", "setChestInventory", "examplegame"})
public final class SetChestInventoryCommand extends co.aikar.commands.BaseCommand {
    
    public SetChestInventoryCommand() {
        super();
    }
    
    @co.aikar.commands.annotation.CommandPermission(value = "andromeda.game.chests")
    @co.aikar.commands.annotation.CommandAlias(value = "forceresetchests")
    public final void forceReloadChests(@org.jetbrains.annotations.NotNull()
    org.bukkit.entity.Player player) {
    }
    
    @co.aikar.commands.annotation.CommandPermission(value = "andromeda.game.chests")
    @co.aikar.commands.annotation.CommandAlias(value = "setchestinventory")
    public final void setChestInventory(@org.jetbrains.annotations.NotNull()
    org.bukkit.entity.Player player) {
    }
}