package com.payoneer.payment.presentation.methods;

import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.DiffUtil;
import androidx.recyclerview.widget.ListAdapter;
import androidx.recyclerview.widget.RecyclerView;

import com.payoneer.core.utils.Extensions;
import com.payoneer.payment.domain.entities.PaymentMethodDomainModel;
import com.payoneer.payment.presentation.R;
import com.payoneer.payment.presentation.databinding.ItemPaymentMethodsListBinding;

import javax.inject.Inject;

public class PaymentMethodsListAdapter extends ListAdapter<PaymentMethodDomainModel, PaymentMethodsListAdapter.ViewHolder> {

    @Inject
    PaymentMethodsListAdapter() {
        super(new PaymentMethodsListDiffUtilsCallback());
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return ViewHolder.instance(parent);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.bind(getItem(position));
    }

    static class ViewHolder extends RecyclerView.ViewHolder {

        private final ItemPaymentMethodsListBinding binding;

        public ViewHolder(ItemPaymentMethodsListBinding binding) {
            super(binding.getRoot());
            this.binding = binding;
        }

        void bind(PaymentMethodDomainModel paymentMethod) {
            Extensions.loadImage(binding.logoIv, paymentMethod.getLogoUrl(), R.drawable.ic_payment);
            binding.labelTv.setText(paymentMethod.getName());
            binding.getRoot().setOnClickListener(v -> {

            });
        }

        static ViewHolder instance(ViewGroup viewGroup) {
            LayoutInflater layoutInflater = LayoutInflater.from(viewGroup.getContext());
            ItemPaymentMethodsListBinding binding = ItemPaymentMethodsListBinding.inflate(layoutInflater, viewGroup, false);
            return new ViewHolder(binding);
        }
    }

}

class PaymentMethodsListDiffUtilsCallback extends DiffUtil.ItemCallback<PaymentMethodDomainModel> {

    @Override
    public boolean areItemsTheSame(@NonNull PaymentMethodDomainModel oldItem, @NonNull PaymentMethodDomainModel newItem) {
        return oldItem.getName().equals(newItem.getName());
    }

    @Override
    public boolean areContentsTheSame(@NonNull PaymentMethodDomainModel oldItem, @NonNull PaymentMethodDomainModel newItem) {
        return oldItem.equals(newItem);
    }
}