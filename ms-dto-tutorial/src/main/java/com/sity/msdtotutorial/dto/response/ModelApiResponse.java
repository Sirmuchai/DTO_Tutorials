package com.sity.msdtotutorial.dto.response;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class ModelApiResponse {
    private Object body;
    private HeaderResponse headerResponse;
}
