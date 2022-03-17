package ltd.matrixstudios.andromeda.backend.databases

import com.mongodb.MongoClient
import com.mongodb.MongoClientURI
import com.mongodb.client.MongoCollection
import com.mongodb.client.MongoDatabase
import com.mongodb.client.model.UpdateOptions
import ltd.matrixstudios.andromeda.Andromeda
import ltd.matrixstudios.andromeda.backend.serialization.SerializationManager
import org.bson.Document

class AndromedaMongo {

    lateinit var localMongoClient: MongoClient
    lateinit var localMongoDatabase: MongoDatabase

    fun loadMongo(connectionString: String, database: String) {
        localMongoClient = MongoClient(MongoClientURI(connectionString))

        localMongoDatabase = localMongoClient.getDatabase(database)
    }

    /**
     * Saves the selected item to mongo using serialization
     */
    fun <T> save(t: T, id: String, targetCollection: String) {
        val document = Document.parse(SerializationManager.GSON.toJson(t))
        document.remove("_id")

        val query = Document("_id", id)
        val finaldoc = Document("\$set", document)

        coll(targetCollection).updateOne(query, finaldoc, UpdateOptions().upsert(true))
    }

    fun coll(collectionName: String) : MongoCollection<Document>
    {
        return localMongoDatabase.getCollection(collectionName)
    }

    /**
     * Pull values from MongoCollection and use gson to turn them into <T>
     */
    fun <T : Any> pullAndDeserialize(clazz: Class<T>, collection: String) :  ArrayList<T> {
        return coll(collection).find().into(ArrayList()).map { SerializationManager.GSON.fromJson(it.toJson(), clazz) }.toCollection(ArrayList())
    }
}