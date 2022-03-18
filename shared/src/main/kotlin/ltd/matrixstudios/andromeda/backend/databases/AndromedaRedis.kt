package ltd.matrixstudios.andromeda.backend.databases

import ltd.matrixstudios.andromeda.backend.databases.packets.RedisPacketDistributor
import org.apache.commons.pool2.impl.GenericObjectPoolConfig
import redis.clients.jedis.Jedis
import redis.clients.jedis.JedisPool

class AndromedaRedis {

    lateinit var pool: JedisPool
    lateinit var resource: Jedis

    lateinit var packetPool: JedisPool

    fun loadRedis(host: String) {
        pool = JedisPool(GenericObjectPoolConfig(), host, 6379)

        resource = pool.resource


        packetPool = JedisPool(GenericObjectPoolConfig(), host, 6379)
        RedisPacketDistributor.loadPubSub()
    }

    fun executeRedisCommand(unit: (Jedis) -> Unit = {}) {
        unit.invoke(resource)
    }
}