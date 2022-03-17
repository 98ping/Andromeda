package ltd.matrixstudios.andromeda.modes

import com.mongodb.client.model.UpdateOptions
import ltd.matrixstudios.andromeda.Andromeda
import ltd.matrixstudios.andromeda.backend.databases.AndromedaMongo
import ltd.matrixstudios.andromeda.backend.serialization.SerializationManager
import org.bson.Document

class GamemodeService {


    fun createGamemode(gamemode: Gamemode) {
        Andromeda.INSTANCE.andromedaMongo.save(gamemode, gamemode.id, "gamemodes")
    }

    fun getGamemodes() : ArrayList<Gamemode> {
        return Andromeda.INSTANCE.andromedaMongo.pullAndDeserialize(Gamemode::class.java, "gamemodes")
    }
}