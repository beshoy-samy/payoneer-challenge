package com.paynoneer.core.base.fragment;

import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.viewbinding.ViewBinding;

public interface FragmentViewBinder<T extends ViewBinding> {

    T bind(LayoutInflater inflater, ViewGroup viewGroup, Boolean attachToParent);
}