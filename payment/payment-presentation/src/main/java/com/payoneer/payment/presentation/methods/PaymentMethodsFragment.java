package com.payoneer.payment.presentation.methods;

import android.os.Bundle;

import androidx.lifecycle.ViewModelProvider;

import com.payoneer.core.base.fragment.BaseFragment;
import com.payoneer.core.base.fragment.FragmentViewBinder;
import com.payoneer.core.domain.models.ResultModel;
import com.payoneer.core.utils.Extensions;
import com.payoneer.payment.domain.entities.PaymentMethodDomainModel;
import com.payoneer.payment.presentation.R;
import com.payoneer.payment.presentation.databinding.FragmentPaymentMethodsBinding;

import java.util.List;

import javax.inject.Inject;

import dagger.hilt.android.AndroidEntryPoint;

@AndroidEntryPoint
public class PaymentMethodsFragment extends BaseFragment<FragmentPaymentMethodsBinding, PaymentMethodsViewModel> {

    @Inject
    PaymentMethodsListAdapter paymentMethodsListAdapter;

    @Override
    public PaymentMethodsViewModel getViewModel() {
        return new ViewModelProvider(this).get(PaymentMethodsViewModel.class);
    }

    @Override
    public FragmentViewBinder<FragmentPaymentMethodsBinding> getViewBinder() {
        return FragmentPaymentMethodsBinding::inflate;
    }

    @Override
    public void onBindFinished(Bundle savedInstanceState) {
        listenForClicks();
        setupRecycler();
        observe();
    }

    private void listenForClicks() {
        binding.materialToolbar.setNavigationOnClickListener(v -> requireActivity().onBackPressed());
    }

    private void setupRecycler() {
        binding.recyclerView.setAdapter(paymentMethodsListAdapter);
    }

    private void observe() {
        viewModel.getPaymentMethodsResult().observe(getViewLifecycleOwner(), this::renderResult);
    }

    private void renderResult(ResultModel<List<PaymentMethodDomainModel>> result) {
        if (result instanceof ResultModel.Progress) {
            Extensions.showShortToast("loading...", requireContext());
        } else if (result instanceof ResultModel.ErrorResult) {
            String message = Extensions.networkErrorMessage(((ResultModel.ErrorResult) result).getThrowable(), requireContext());
            if (message != null) Extensions.showLongToast(message, requireContext());
            else Extensions.showLongToast(getString(R.string.unknown_error), requireContext());
        } else if (result instanceof ResultModel.SuccessResult) {
            paymentMethodsListAdapter.submitList(((ResultModel.SuccessResult<List<PaymentMethodDomainModel>>) result).getData());
        }
    }


    public static PaymentMethodsFragment instance() {
        return new PaymentMethodsFragment();
    }
}