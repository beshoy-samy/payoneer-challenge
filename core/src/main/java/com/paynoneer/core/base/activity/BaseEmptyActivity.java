package com.paynoneer.core.base.activity;

import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.viewbinding.ViewBinding;

public abstract class BaseEmptyActivity<T extends ViewBinding> extends AppCompatActivity {

    protected T binding;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = getViewBinder().bind(getLayoutInflater());
        setContentView(binding.getRoot());
        onBindFinished(savedInstanceState);
    }

    public abstract ActivityViewBinder<T> getViewBinder();

    public abstract void onBindFinished(Bundle savedInstanceState);

}
