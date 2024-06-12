package icu.azusachino.kokona.utils

import com.fasterxml.jackson.databind.ObjectMapper
import org.slf4j.LoggerFactory
import org.springframework.data.redis.core.ReactiveStringRedisTemplate
import org.springframework.stereotype.Component

/**
 * CommonUtils
 *
 * @author haru
 * @since 2024/06/12
 */
class CommonUtils {

    companion object {
        private val OM = ObjectMapper()

        fun toJson(obj: Any): String = OM.writeValueAsString(obj)
    }
}

@Component
class RedisUtils(private val redisTemplate: ReactiveStringRedisTemplate) {

    private val logger = LoggerFactory.getLogger(CommonUtils::class.java)

}