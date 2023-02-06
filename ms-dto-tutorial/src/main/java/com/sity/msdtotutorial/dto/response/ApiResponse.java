package com.sity.msdtotutorial.dto.response;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@NoArgsConstructor
@AllArgsConstructor
@JsonInclude
public class ApiResponse extends ModelApiResponse implements Serializable {

     public static ApiResponse responseFormatter(String referenceId, int responseCode, String responseMessage,
                                                    String customerMessage, Object responseBody) {
         ApiResponse apiResponse = new ApiResponse();
         HeaderResponse headerResponse = new HeaderResponse();

         headerResponse.setResponseCode(responseCode);
         headerResponse.setRequestRefId(referenceId);
         headerResponse.setResponseMessage(responseMessage);
         headerResponse.setCustomerMessage(customerMessage);

         apiResponse.setHeaderResponse(headerResponse);
         apiResponse.setBody(responseBody);
         return apiResponse;
     }

}
