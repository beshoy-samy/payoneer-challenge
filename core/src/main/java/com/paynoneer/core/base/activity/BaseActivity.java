package com.paynoneer.core.base.activity;

import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;

import com.paynoneer.core.base.BaseViewModel;

public abstract class BaseActivity<T extends ViewBinding, VM extends BaseViewModel> extends BaseEmptyActivity<T> {

    protected VM viewModel;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        viewModel = getViewModel();
    }

    public abstract VM getViewModel();
}