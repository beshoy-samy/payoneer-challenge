package com.payoneer.payment.presentation.methods;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;

import com.payoneer.core.base.BaseViewModel;
import com.payoneer.core.di.AndroidScheduler;
import com.payoneer.core.di.IOScheduler;
import com.payoneer.core.domain.models.ResultModel;
import com.payoneer.payment.domain.entities.PaymentMethodDomainModel;
import com.payoneer.payment.domain.usecases.GetPaymentMethodsUseCase;

import java.util.List;

import javax.inject.Inject;

import dagger.hilt.android.lifecycle.HiltViewModel;
import io.reactivex.rxjava3.core.Scheduler;
import io.reactivex.rxjava3.disposables.Disposable;

@HiltViewModel
public class PaymentMethodsViewModel extends BaseViewModel {

    private final GetPaymentMethodsUseCase getPaymentMethodsUseCase;
    private final Scheduler androidScheduler;
    private final Scheduler ioScheduler;

    private MutableLiveData<ResultModel<List<PaymentMethodDomainModel>>> paymentMethodsResult = new MutableLiveData<>();

    @Inject
    public PaymentMethodsViewModel(GetPaymentMethodsUseCase getPaymentMethodsUseCase,
                                   @AndroidScheduler Scheduler androidScheduler,
                                   @IOScheduler Scheduler ioScheduler) {

        this.getPaymentMethodsUseCase = getPaymentMethodsUseCase;
        this.androidScheduler = androidScheduler;
        this.ioScheduler = ioScheduler;
        getPaymentMethods();
    }

    private void getPaymentMethods() {
        Disposable disposable =
                getPaymentMethodsUseCase.getPaymentMethods()
                        .subscribeOn(ioScheduler)
                        .observeOn(androidScheduler)
                        .doOnSubscribe(d -> paymentMethodsResult.postValue(ResultModel.Progress.INSTANCE))
                        .subscribe(
                                paymentMethods -> paymentMethodsResult.postValue(new ResultModel.SuccessResult<>(paymentMethods)),
                                throwable -> paymentMethodsResult.postValue(new ResultModel.ErrorResult(throwable, null))
                        );
        addToDisposableBag(disposable);
    }

    public LiveData<ResultModel<List<PaymentMethodDomainModel>>> getPaymentMethodsResult() {
        return paymentMethodsResult;
    }
}
