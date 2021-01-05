package com.everis.reniec.controller;

import com.everis.reniec.dao.ATMDepositRequest;
import com.everis.reniec.dao.ReniecResponse;
import io.reactivex.Single;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ReniecController {

    @PostMapping("/external/reniec/validate")
    public Single<ReniecResponse> validate(@RequestBody ATMDepositRequest request){
        return Single.just(new ReniecResponse("Reniec",true));
    }
}
