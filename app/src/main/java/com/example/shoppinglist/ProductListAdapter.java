package com.example.shoppinglist;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class ProductListAdapter extends RecyclerView.Adapter<ProductViewHolder> {
    private Context context;
    private ArrayList<Product> products = new ArrayList<>();


    public ProductListAdapter(Context context, ArrayList<Product> products) {
        this.context = context;
        this.products = products;
    }

    @NonNull
    @Override
    public ProductViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new ProductViewHolder(LayoutInflater.from(context).inflate(R.layout.product_view, parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull ProductViewHolder holder, int position) {
        holder.productText.setText(products.get(position).getName());
        holder.productInfoText.setText(products.get(position).getInfo());
        holder.removeImage.setOnClickListener(view -> {
            int pos = holder.getAdapterPosition();
            ProductStorage.getInstance().removeProduct(products.get(pos).getId());
            notifyItemRemoved(pos);
        });

        holder.editImage.setOnClickListener(view -> {
            int pos = holder.getAdapterPosition();


        });

    }

    @Override
    public int getItemCount() {
        return products.size();
    }
}
