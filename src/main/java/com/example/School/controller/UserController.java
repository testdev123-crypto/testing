package com.example.School.controller;

import com.example.School.dto.UserDTO;
import com.example.School.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController

public class UserController {
    @Autowired
    UserService userService;

    @PostMapping(value = "/addUser")
    public void addUser(@RequestBody UserDTO userDTO){
        userService.addUser(userDTO);
    }

    @RequestMapping(method = RequestMethod.GET, value = "/getAllUser")
    public List<UserDTO> getAllUser(){
        return userService.getAllUser();
    }
    @RequestMapping(method = RequestMethod.GET, value = "/getUserById")
    public UserDTO getUserById(@RequestParam String id){
        return userService.getUserById(id);
    }
}
