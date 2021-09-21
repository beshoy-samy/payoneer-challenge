package com.paynoneer.core.di;


import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

import javax.inject.Qualifier;

import dagger.Module;
import dagger.Provides;
import dagger.hilt.InstallIn;
import dagger.hilt.android.components.ViewModelComponent;
import io.reactivex.rxjava3.android.schedulers.AndroidSchedulers;
import io.reactivex.rxjava3.core.Scheduler;
import io.reactivex.rxjava3.schedulers.Schedulers;

@Module
@InstallIn(ViewModelComponent.class)
public class BaseViewModelModule {

    @Provides
    @AndroidScheduler
    Scheduler provideAndroidScheduler() {
        return AndroidSchedulers.mainThread();
    }

    @Provides
    @IOScheduler
    Scheduler provideIOScheduler() {
        return Schedulers.io();
    }

    @Provides
    @TrampolineScheduler
    Scheduler provideTrampolineScheduler() {
        return Schedulers.trampoline();
    }

}

@Qualifier
@Retention(RetentionPolicy.RUNTIME)
@interface AndroidScheduler {
}

@Qualifier
@Retention(RetentionPolicy.RUNTIME)
@interface IOScheduler {
}

@Qualifier
@Retention(RetentionPolicy.RUNTIME)
@interface TrampolineScheduler {
}