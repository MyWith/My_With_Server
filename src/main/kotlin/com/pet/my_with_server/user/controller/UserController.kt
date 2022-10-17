package com.pet.my_with_server.user.controller

import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/api/v1/auth")
class UserController {

    @PostMapping("/login")
    fun loginUser(): String {
        return "login"
    }
}