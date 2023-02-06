package com.sity.msdtotutorial.service;

import com.sity.msdtotutorial.dto.UserLocationDTO;
import com.sity.msdtotutorial.dto.request.UserRequest;
import com.sity.msdtotutorial.dto.response.ModelApiResponse;

import java.util.List;

public interface UserServiceInt {

    public List<UserLocationDTO> getAllUSerLocation();
    public ModelApiResponse createUser(UserRequest userRequest);
}
