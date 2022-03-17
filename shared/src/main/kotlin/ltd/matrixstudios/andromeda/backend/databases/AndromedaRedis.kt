package ltd.matrixstudios.andromeda.backend.databases

import org.apache.commons.pool2.impl.GenericObjectPoolConfig
import redis.clients.jedis.Jedis
import redis.clients.jedis.JedisPool

class AndromedaRedis {

    lateinit var pool: JedisPool
    lateinit var resource: Jedis

    fun loadRedis(host: String) {
        pool = JedisPool(GenericObjectPoolConfig(), host, 6379)

        resource = pool.resource
    }

    fun executeRedisCommand(unit: (Jedis) -> Unit = {}) {
        unit.invoke(resource)
    }
}