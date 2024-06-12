package icu.azusachino.kokona

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.scheduling.annotation.EnableAsync
import org.springframework.scheduling.annotation.EnableScheduling

@EnableAsync
@EnableScheduling
@SpringBootApplication
class KokonaApplication

fun main(args: Array<String>) {
    val app = SpringApplication(KokonaApplication::class.java)
    app.run(*args)
}
