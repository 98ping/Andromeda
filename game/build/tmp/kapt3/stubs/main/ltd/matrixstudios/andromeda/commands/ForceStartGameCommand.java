package ltd.matrixstudios.andromeda.commands;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007\u00a8\u0006\u0007"}, d2 = {"Lltd/matrixstudios/andromeda/commands/ForceStartGameCommand;", "Lco/aikar/commands/BaseCommand;", "()V", "forcestart", "", "sender", "Lorg/bukkit/command/CommandSender;", "game"})
public final class ForceStartGameCommand extends co.aikar.commands.BaseCommand {
    
    public ForceStartGameCommand() {
        super();
    }
    
    @co.aikar.commands.annotation.CommandPermission(value = "andromeda.forcestart")
    @co.aikar.commands.annotation.CommandAlias(value = "forcestart")
    public final void forcestart(@org.jetbrains.annotations.NotNull()
    org.bukkit.command.CommandSender sender) {
    }
}