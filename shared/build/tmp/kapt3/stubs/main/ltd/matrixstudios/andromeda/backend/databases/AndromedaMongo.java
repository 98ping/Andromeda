package ltd.matrixstudios.andromeda.backend.databases;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0014\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00110\u00102\u0006\u0010\u0012\u001a\u00020\u0013J\u0016\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00132\u0006\u0010\u0017\u001a\u00020\u0013J6\u0010\u0018\u001a\u0012\u0012\u0004\u0012\u0002H\u001a0\u0019j\b\u0012\u0004\u0012\u0002H\u001a`\u001b\"\b\b\u0000\u0010\u001a*\u00020\u00012\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u0002H\u001a0\u001d2\u0006\u0010\u001e\u001a\u00020\u0013J)\u0010\u001f\u001a\u00020\u0015\"\u0004\b\u0000\u0010\u001a2\u0006\u0010 \u001a\u0002H\u001a2\u0006\u0010!\u001a\u00020\u00132\u0006\u0010\"\u001a\u00020\u0013\u00a2\u0006\u0002\u0010#R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\nX\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000e\u00a8\u0006$"}, d2 = {"Lltd/matrixstudios/andromeda/backend/databases/AndromedaMongo;", "", "()V", "localMongoClient", "Lcom/mongodb/MongoClient;", "getLocalMongoClient", "()Lcom/mongodb/MongoClient;", "setLocalMongoClient", "(Lcom/mongodb/MongoClient;)V", "localMongoDatabase", "Lcom/mongodb/client/MongoDatabase;", "getLocalMongoDatabase", "()Lcom/mongodb/client/MongoDatabase;", "setLocalMongoDatabase", "(Lcom/mongodb/client/MongoDatabase;)V", "coll", "Lcom/mongodb/client/MongoCollection;", "Lorg/bson/Document;", "collectionName", "", "loadMongo", "", "connectionString", "database", "pullAndDeserialize", "Ljava/util/ArrayList;", "T", "Lkotlin/collections/ArrayList;", "clazz", "Ljava/lang/Class;", "collection", "save", "t", "id", "targetCollection", "(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/String;)V", "shared"})
public final class AndromedaMongo {
    public com.mongodb.MongoClient localMongoClient;
    public com.mongodb.client.MongoDatabase localMongoDatabase;
    
    public AndromedaMongo() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.mongodb.MongoClient getLocalMongoClient() {
        return null;
    }
    
    public final void setLocalMongoClient(@org.jetbrains.annotations.NotNull()
    com.mongodb.MongoClient p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.mongodb.client.MongoDatabase getLocalMongoDatabase() {
        return null;
    }
    
    public final void setLocalMongoDatabase(@org.jetbrains.annotations.NotNull()
    com.mongodb.client.MongoDatabase p0) {
    }
    
    public final void loadMongo(@org.jetbrains.annotations.NotNull()
    java.lang.String connectionString, @org.jetbrains.annotations.NotNull()
    java.lang.String database) {
    }
    
    /**
     * Saves the selected item to mongo using serialization
     */
    public final <T extends java.lang.Object>void save(T t, @org.jetbrains.annotations.NotNull()
    java.lang.String id, @org.jetbrains.annotations.NotNull()
    java.lang.String targetCollection) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.mongodb.client.MongoCollection<org.bson.Document> coll(@org.jetbrains.annotations.NotNull()
    java.lang.String collectionName) {
        return null;
    }
    
    /**
     * Pull values from MongoCollection and use gson to turn them into <T>
     */
    @org.jetbrains.annotations.NotNull()
    public final <T extends java.lang.Object>java.util.ArrayList<T> pullAndDeserialize(@org.jetbrains.annotations.NotNull()
    java.lang.Class<T> clazz, @org.jetbrains.annotations.NotNull()
    java.lang.String collection) {
        return null;
    }
}