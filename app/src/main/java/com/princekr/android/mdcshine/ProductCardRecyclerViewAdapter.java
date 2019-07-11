package com.princekr.android.mdcshine;

import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.princekr.android.mdcshine.network.ImageRequester;
import com.princekr.android.mdcshine.network.ProductEntry;

import java.util.List;

public class ProductCardRecyclerViewAdapter extends RecyclerView.Adapter<ProductCardViewHolder> {

    private List<ProductEntry> productList;
    private ImageRequester imageRequester;

    public ProductCardRecyclerViewAdapter(List<ProductEntry> productList, ImageRequester imageRequester) {
        this.productList = productList;
        this.imageRequester = imageRequester;
    }

    @NonNull
    @Override
    public ProductCardViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return null;
    }

    @Override
    public void onBindViewHolder(@NonNull ProductCardViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }

    // private List<ProductEntry> pro
}
