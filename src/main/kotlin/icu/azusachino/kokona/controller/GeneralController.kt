package icu.azusachino.kokona.controller

import icu.azusachino.kokona.services.UserService
import icu.azusachino.kokona.utils.CommonUtils
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import reactor.core.publisher.Mono
import java.time.LocalDateTime

/**
 * General Controllers
 *
 * @author haru
 * @since 2024/06/12
 */

@RestController
@RequestMapping("/api/v1/public")
class PublicController(private val userService: UserService) {

    @GetMapping("/time")
    fun time(timeZone: Mono<String>): Mono<ResponseEntity<Map<String, String>>> {
        return timeZone.map {
            ResponseEntity.ok(mapOf("time" to LocalDateTime.now().toString()))
        }
    }

    @GetMapping("/users")
    fun users(): Mono<ResponseEntity<Map<String, String>>> {
        return Mono.empty<ResponseEntity<Map<String, String>>?>()
            .map {
                val list = this.userService.list()
                ResponseEntity.ok(mapOf("users" to CommonUtils.toJson(list)))
            }
    }
}
