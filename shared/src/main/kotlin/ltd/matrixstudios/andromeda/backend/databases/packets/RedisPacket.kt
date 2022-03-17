package ltd.matrixstudios.andromeda.backend.databases.packets

abstract class RedisPacket(
    val packetId: String
) {

    abstract fun action()
}