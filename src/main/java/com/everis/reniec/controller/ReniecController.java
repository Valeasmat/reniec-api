package com.everis.reniec.controller;

import com.everis.reniec.dto.ATMDepositRequest;
import com.everis.reniec.dto.ReniecResponse;
import io.reactivex.Single;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ReniecController {

    @PostMapping(value = "/external/reniec/validate",produces = MediaType.APPLICATION_STREAM_JSON_VALUE)
    public Single<ReniecResponse> validate(@RequestBody ATMDepositRequest request){
        return Single.just(new ReniecResponse("Reniec",true));
    }
}
