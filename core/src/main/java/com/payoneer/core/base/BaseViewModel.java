package com.payoneer.core.base;

import androidx.lifecycle.ViewModel;

import io.reactivex.rxjava3.disposables.CompositeDisposable;
import io.reactivex.rxjava3.disposables.Disposable;

public abstract class BaseViewModel extends ViewModel {

    private final CompositeDisposable compositeDisposable = new CompositeDisposable();

    protected void addToDisposableBag(Disposable disposable) {
        compositeDisposable.add(disposable);
    }

    @Override
    protected void onCleared() {
        super.onCleared();
        compositeDisposable.clear();
    }
}