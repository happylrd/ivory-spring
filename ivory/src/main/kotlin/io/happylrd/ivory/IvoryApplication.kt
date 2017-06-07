package io.happylrd.ivory

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication

@SpringBootApplication
class IvoryApplication

fun main(args: Array<String>) {
    SpringApplication.run(IvoryApplication::class.java, *args)
}
