package com.hhovhann.springbootdocker.controller;

import org.ff4j.FF4j;
import org.springframework.web.bind.annotation.*;
import com.hhovhann.springbootdocker.service.UsersService;

@RestController
public class UsersController {
    private final FF4j ff4j;
    private final UsersService usersService;

    private UsersController(FF4j ff4j, UsersService usersService) {
        this.ff4j = ff4j;
        this.usersService = usersService;
    }

    @GetMapping(value = "/user/{name}")
    public String getPerson(@PathVariable String name) {
        if (ff4j.check("getUserFeature")) { // will check against user as well.
            return "User Came from Mongo Repository: " + usersService.getUserByName(name).name;
        } else {
            return "Mongo Repository Disabled";
        }
    }

    @PostMapping(value = "/user/{name}/{lastName}/{email}")
    public String addUser(@PathVariable String name, @PathVariable String lastName, @PathVariable String email) {
        if (ff4j.check("addUserFeature")) {
            return "User added into Mongo DB Repository: " + usersService.addUser(name, lastName, email);
        } else {
            return "Mongo Repository Disabled";
        }
    }

    @DeleteMapping(value = "/user/{name}")
    public String deleteUser(@PathVariable String name) {
        if (ff4j.check("deleteUserFeature")) {
            usersService.deleteUser(name);
            return "User deleted from the Mongo Repository";
        } else {
            return "Mongo Repository Disabled";
        }
    }
}