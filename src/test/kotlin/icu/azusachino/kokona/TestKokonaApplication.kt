package icu.azusachino.kokona

import org.springframework.boot.fromApplication
import org.springframework.boot.with

fun main(args: Array<String>) {
	fromApplication<KokonaApplication>().with(TestcontainersConfiguration::class).run(*args)
}
