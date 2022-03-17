package ltd.matrixstudios.andromeda.commands;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J \u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\bH\u0007J\u0018\u0010\n\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0007J\u0018\u0010\u000b\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u0007\u001a\u00020\bH\u0007J\u0010\u0010\u000e\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\rH\u0007J \u0010\u000f\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\bH\u0007\u00a8\u0006\u0011"}, d2 = {"Lltd/matrixstudios/andromeda/commands/GameArenaCommands;", "Lco/aikar/commands/BaseCommand;", "()V", "addPosition", "", "player", "Lorg/bukkit/entity/Player;", "name", "", "position", "addSpawn", "createArena", "sender", "Lorg/bukkit/command/CommandSender;", "doHelp", "setGamemode", "gamemode", "game"})
@co.aikar.commands.annotation.CommandAlias(value = "arena")
public final class GameArenaCommands extends co.aikar.commands.BaseCommand {
    
    public GameArenaCommands() {
        super();
    }
    
    @co.aikar.commands.annotation.CommandPermission(value = "andromeda.arena.admin")
    @co.aikar.commands.annotation.HelpCommand()
    public final void doHelp(@org.jetbrains.annotations.NotNull()
    org.bukkit.command.CommandSender sender) {
    }
    
    @co.aikar.commands.annotation.CommandPermission(value = "andromeda.arena.admin")
    @co.aikar.commands.annotation.Subcommand(value = "setgamemode")
    public final void setGamemode(@org.jetbrains.annotations.NotNull()
    org.bukkit.entity.Player player, @org.jetbrains.annotations.NotNull()
    java.lang.String name, @org.jetbrains.annotations.NotNull()
    java.lang.String gamemode) {
    }
    
    @co.aikar.commands.annotation.CommandPermission(value = "andromeda.arena.admin")
    @co.aikar.commands.annotation.Subcommand(value = "position")
    public final void addPosition(@org.jetbrains.annotations.NotNull()
    org.bukkit.entity.Player player, @org.jetbrains.annotations.NotNull()
    java.lang.String name, @org.jetbrains.annotations.NotNull()
    java.lang.String position) {
    }
    
    @co.aikar.commands.annotation.CommandPermission(value = "andromeda.arena.admin")
    @co.aikar.commands.annotation.Subcommand(value = "addspawn")
    public final void addSpawn(@org.jetbrains.annotations.NotNull()
    org.bukkit.entity.Player player, @org.jetbrains.annotations.NotNull()
    java.lang.String name) {
    }
    
    @co.aikar.commands.annotation.CommandPermission(value = "andromeda.arena.admin")
    @co.aikar.commands.annotation.Subcommand(value = "create")
    public final void createArena(@org.jetbrains.annotations.NotNull()
    org.bukkit.command.CommandSender sender, @org.jetbrains.annotations.NotNull()
    java.lang.String name) {
    }
}