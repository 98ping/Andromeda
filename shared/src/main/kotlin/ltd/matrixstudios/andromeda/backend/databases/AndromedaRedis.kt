package ltd.matrixstudios.andromeda.backend.databases

import ltd.matrixstudios.andromeda.backend.databases.packets.RedisPacketDistributor
import org.apache.commons.pool2.impl.GenericObjectPoolConfig
import redis.clients.jedis.Jedis
import redis.clients.jedis.JedisPool

class AndromedaRedis {

    lateinit var pool: JedisPool
    lateinit var resource: Jedis

    lateinit var secondaryPacketPool: JedisPool //TODO: Make a main packet pool

    fun loadRedis(host: String) {
        pool = JedisPool(host, 6379)

        resource = pool.resource


        secondaryPacketPool = JedisPool(host, 6379)
        RedisPacketDistributor.loadPubSub()
    }

    fun executeRedisCommand(unit: (Jedis) -> Unit = {}) {
        unit.invoke(resource)
    }
}