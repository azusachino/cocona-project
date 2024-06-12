package icu.azusachino.kokona.controller

import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import java.time.LocalDateTime

/**
 * General Controllers
 *
 * @author haru
 * @since 2024/06/12
 */

@RestController
@RequestMapping("/api/v1/public")
class PublicController {

    @GetMapping("/time")
    fun time(): ResponseEntity<Map<String, String>> {
        return ResponseEntity.ok(mapOf("time" to LocalDateTime.now().toString()))
    }
}
