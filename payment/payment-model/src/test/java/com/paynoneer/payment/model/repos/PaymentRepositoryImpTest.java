package com.paynoneer.payment.model.repos;

import com.paynoneer.payment.model.dtos.PaymentMethodsResponseModel;
import com.paynoneer.payment.model.services.PaymentService;

import org.junit.Test;

import java.io.IOException;

import io.reactivex.rxjava3.core.Single;

public class PaymentRepositoryImpTest {

    @Test
    public void getPaymentMethodsThenEmitPaymentMethodsResponseModel() {
        //arrange
        PaymentMethodsResponseModel mockedResponse = new PaymentMethodsResponseModel();
        mockedResponse.setTimestamp("9-20-2021");

        PaymentService paymentService = () -> Single.just(mockedResponse);

        PaymentRepositoryImp paymentRepository = new PaymentRepositoryImp(paymentService);

        //act
        Single<PaymentMethodsResponseModel> result = paymentRepository.getPaymentMethods();

        //assert
        result.test().assertNoErrors().assertValue(mockedResponse);
    }

    @Test
    public void getPaymentMethodsThenThrowIOException() {
        //arrange

        PaymentService paymentService = () -> Single.error(new IOException("Network not found"));

        PaymentRepositoryImp paymentRepository = new PaymentRepositoryImp(paymentService);

        //act
        Single<PaymentMethodsResponseModel> result = paymentRepository.getPaymentMethods();

        //assert
        result.test().assertError(IOException.class);
    }

}