package com.everis.reniec;


import com.everis.reniec.controller.ReniecController;
import com.everis.reniec.dto.ATMDepositRequest;
import com.everis.reniec.dto.ReniecResponse;
import io.reactivex.observers.TestObserver;
import org.junit.jupiter.api.Test;

public class ControllerTest {

    private ReniecController reniecController=new ReniecController();

    @Test
    public void controllerTest(){
        ATMDepositRequest request=new ATMDepositRequest();
        request.setDocumentNumber("10000000");

        TestObserver<ReniecResponse> testObserver=reniecController.validate(request).test();

        ReniecResponse responseCheck=new ReniecResponse();
        responseCheck.setEntityName("Reniec");
        responseCheck.setSuccess(true);

        testObserver
                .assertSubscribed()
                .assertNever(response->!response.getEntityName().equals(responseCheck.getEntityName()))
                .assertNever(response->response.getSuccess().booleanValue()!=responseCheck.getSuccess())
                .assertValueCount(1)
                .assertNoErrors();


    }
}
