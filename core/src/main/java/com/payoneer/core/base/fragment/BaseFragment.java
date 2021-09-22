package com.payoneer.core.base.fragment;


import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;

import com.payoneer.core.base.BaseViewModel;

public abstract class BaseFragment<T extends ViewBinding, VM extends BaseViewModel> extends BaseEmptyFragment<T> {

    protected VM viewModel;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        viewModel = getViewModel();
    }

    public abstract VM getViewModel();
}
