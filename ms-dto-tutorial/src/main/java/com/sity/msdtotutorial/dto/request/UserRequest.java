package com.sity.msdtotutorial.dto.request;

import com.sity.msdtotutorial.model.Location;
import lombok.Data;

@Data
public class UserRequest {
    private String firstName;
    private String lastName;
    private String email;
    private String password;
    private Long location_id;
}
