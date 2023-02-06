package com.sity.msdtotutorial.dto.response;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class HeaderResponse {
    private String requestRefId;
    private String responseMessage;
    private String timestamp;
    private String customerMessage;
    private Integer responseCode;
}
