package com.everis.reniec.controller;

import com.everis.reniec.dto.ATMDepositRequest;
import com.everis.reniec.dto.ReniecResponse;
import io.reactivex.Single;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ReniecController {
    @ApiOperation(value = "Post request to retrieve reniec validation",
            response = ReniecResponse.class,
            produces = "application/stream+json")
    @ApiResponse(code = 200,message = "Successful operation",response = ReniecResponse.class)
    @PostMapping(value = "/external/reniec/validate",produces = MediaType.APPLICATION_JSON_VALUE)
    public Single<ReniecResponse> validate(@RequestBody ATMDepositRequest request){
        return Single.just(new ReniecResponse("Reniec",true));
    }
}
