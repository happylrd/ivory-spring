package io.happylrd.ivory.controller

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class UserController {

    // TODO: just for test, will be removed later
    @GetMapping("/")
    fun hello() = "Hello, world"
}