package com.payoneer.payment.domain.usecases;

import com.payoneer.payment.domain.contracts.PaymentRepository;
import com.payoneer.payment.domain.entities.PaymentMethodDomainModel;

import org.junit.Test;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import io.reactivex.rxjava3.core.Single;

public class GetPaymentMethodsUseCaseImpTest {

    @Test
    public void getPaymentMethodsThenEmitListOfPaymentMethodDomainModel() {
        //arrange
        List<PaymentMethodDomainModel> mocked = mockPaymentMethods();
        PaymentRepository paymentRepository = () -> Single.just(mocked);
        GetPaymentMethodsUseCaseImp paymentUseCase = new GetPaymentMethodsUseCaseImp(paymentRepository);

        //act
        Single<List<PaymentMethodDomainModel>> result = paymentUseCase.getPaymentMethods();

        //assert
        result.test().assertNoErrors().assertValue(mocked);
    }

    @Test
    public void getPaymentMethodsThenThrowIOException() {
        //arrange
        PaymentRepository paymentRepository = () -> Single.error(new IOException("Network not found"));
        GetPaymentMethodsUseCaseImp paymentUseCase = new GetPaymentMethodsUseCaseImp(paymentRepository);

        //act
        Single<List<PaymentMethodDomainModel>> result = paymentUseCase.getPaymentMethods();

        //assert
        result.test().assertError(IOException.class);
    }

    private List<PaymentMethodDomainModel> mockPaymentMethods() {
        ArrayList<PaymentMethodDomainModel> paymentMethodDomainModels = new ArrayList<>();
        PaymentMethodDomainModel domainModel =
                new PaymentMethodDomainModel("Beshoy", null);
        paymentMethodDomainModels.add(domainModel);
        return paymentMethodDomainModels;
    }
}