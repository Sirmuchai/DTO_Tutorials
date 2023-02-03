package com.sity.msdtotutorial.controller;

import com.sity.msdtotutorial.dto.UserLocationDTO;
import com.sity.msdtotutorial.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {
    @Autowired
    private UserService userService;

    @GetMapping("api/v1/users-location")
    public List<UserLocationDTO> getAllUserLocation(){
        return userService.getAllUSerLocation();
    }
}
