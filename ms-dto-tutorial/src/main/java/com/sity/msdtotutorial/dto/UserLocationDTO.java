package com.sity.msdtotutorial.dto;

import lombok.Data;

@Data
public class UserLocationDTO {
    private Long userId;
    private  String email;
    private String place;
    private double latitude;
    private double longitude;
}
