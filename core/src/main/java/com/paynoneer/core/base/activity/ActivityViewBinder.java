package com.paynoneer.core.base.activity;

import android.view.LayoutInflater;

import androidx.viewbinding.ViewBinding;

public interface ActivityViewBinder<T extends ViewBinding> {

    T bind(LayoutInflater inflater);
}