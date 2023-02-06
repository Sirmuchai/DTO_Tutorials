package com.sity.msdtotutorial.service.dtoServices;

import com.sity.msdtotutorial.dto.request.UserRequest;
import com.sity.msdtotutorial.dto.response.ApiResponse;
import com.sity.msdtotutorial.model.Location;
import com.sity.msdtotutorial.model.User;
import com.sity.msdtotutorial.repository.LocationRepository;
import com.sity.msdtotutorial.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class UserDTO {
    @Autowired
    private UserRepository userRepository;

    @Autowired
    private LocationRepository locationRepository;

    public ApiResponse createUser(UserRequest userRequest){
        User user = new User();
        user.setFirstName(userRequest.getFirstName());
        user.setLastName(userRequest.getLastName());
        user.setEmail(userRequest.getEmail());
        user.setPassword(userRequest.getPassword());

        Location location = new Location();
        location.setId(userRequest.getLocation_id());
        //location = locationRepository.save(location);

        user.setLocation(location);
        user = userRepository.save(user);


        return ApiResponse.responseFormatter(
                UUID.randomUUID().toString(),
                200,
                "Success",
                "User created successfully",
                user);
    }

}
