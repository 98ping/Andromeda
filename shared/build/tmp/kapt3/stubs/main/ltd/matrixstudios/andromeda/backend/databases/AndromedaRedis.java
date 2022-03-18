package ltd.matrixstudios.andromeda.backend.databases;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u001c\u0010\u0012\u001a\u00020\u00132\u0014\b\u0002\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00130\u0015J\u000e\u0010\u0016\u001a\u00020\u00132\u0006\u0010\u0017\u001a\u00020\u0018R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\nX\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001a\u0010\u000f\u001a\u00020\u0004X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0006\"\u0004\b\u0011\u0010\b\u00a8\u0006\u0019"}, d2 = {"Lltd/matrixstudios/andromeda/backend/databases/AndromedaRedis;", "", "()V", "pool", "Lredis/clients/jedis/JedisPool;", "getPool", "()Lredis/clients/jedis/JedisPool;", "setPool", "(Lredis/clients/jedis/JedisPool;)V", "resource", "Lredis/clients/jedis/Jedis;", "getResource", "()Lredis/clients/jedis/Jedis;", "setResource", "(Lredis/clients/jedis/Jedis;)V", "secondaryPacketPool", "getSecondaryPacketPool", "setSecondaryPacketPool", "executeRedisCommand", "", "unit", "Lkotlin/Function1;", "loadRedis", "host", "", "shared"})
public final class AndromedaRedis {
    public redis.clients.jedis.JedisPool pool;
    public redis.clients.jedis.Jedis resource;
    public redis.clients.jedis.JedisPool secondaryPacketPool;
    
    public AndromedaRedis() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final redis.clients.jedis.JedisPool getPool() {
        return null;
    }
    
    public final void setPool(@org.jetbrains.annotations.NotNull()
    redis.clients.jedis.JedisPool p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final redis.clients.jedis.Jedis getResource() {
        return null;
    }
    
    public final void setResource(@org.jetbrains.annotations.NotNull()
    redis.clients.jedis.Jedis p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final redis.clients.jedis.JedisPool getSecondaryPacketPool() {
        return null;
    }
    
    public final void setSecondaryPacketPool(@org.jetbrains.annotations.NotNull()
    redis.clients.jedis.JedisPool p0) {
    }
    
    public final void loadRedis(@org.jetbrains.annotations.NotNull()
    java.lang.String host) {
    }
    
    public final void executeRedisCommand(@org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super redis.clients.jedis.Jedis, kotlin.Unit> unit) {
    }
}