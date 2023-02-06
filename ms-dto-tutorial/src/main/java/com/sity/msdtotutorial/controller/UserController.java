package com.sity.msdtotutorial.controller;

import com.sity.msdtotutorial.dto.UserLocationDTO;
import com.sity.msdtotutorial.dto.request.UserRequest;
import com.sity.msdtotutorial.dto.response.ApiResponse;
import com.sity.msdtotutorial.service.UserService;
import com.sity.msdtotutorial.service.dtoServices.UserDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1/")
public class UserController {
    @Autowired
    private UserService userService;
    @Autowired
    private UserDTO userDTO;

    @GetMapping("users-location")
    public List<UserLocationDTO> getAllUserLocation(){
        return userService.getAllUSerLocation();
    }
    @PostMapping("addUser")
    public ApiResponse createUser(@RequestBody UserRequest userRequest){
        return userDTO.createUser(userRequest);
    }

}
