package com.sity.msdtotutorial.service;

import com.sity.msdtotutorial.dto.UserLocationDTO;
import com.sity.msdtotutorial.model.User;
import com.sity.msdtotutorial.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class UserService implements UserServiceInt{
    @Autowired
    private UserRepository userRepository;

    private UserLocationDTO convertEntitytoDTO(User user){
        UserLocationDTO userLocationDTO = new UserLocationDTO();
        userLocationDTO.setUserId(user.getId());
        userLocationDTO.setEmail(user.getEmail());
        userLocationDTO.setPlace(user.getLocation().getName());
        userLocationDTO.setLatitude(user.getLocation().getLatitude());
        userLocationDTO.setLongitude(user.getLocation().getLatitude());

        return userLocationDTO;
    }

    public List<UserLocationDTO> getAllUSerLocation(){
        return userRepository.findAll()
                .stream()
                .map(this::convertEntitytoDTO)
                .collect(Collectors.toList());
    }
}
