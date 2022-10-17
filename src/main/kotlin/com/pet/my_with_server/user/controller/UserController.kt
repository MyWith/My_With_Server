package com.pet.my_with_server.user.controller

import com.pet.my_with_server.user.dto.UserDto
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/api/v1/auth")
class UserController {

    @PostMapping("/login")
    fun loginUser(@RequestBody user:UserDto): UserDto {
        val a:String = "TEST"
        return user
    }
}