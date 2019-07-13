package com.princekr.android.mdcshine.staggeredgridlayout;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.android.volley.toolbox.NetworkImageView;
import com.princekr.android.mdcshine.R;

public class StaggeredProductCardViewHolder extends RecyclerView.ViewHolder {

    public NetworkImageView productImage;
    public TextView productTitle;
    public TextView productPrice;


    public StaggeredProductCardViewHolder(@NonNull View itemView) {
        super(itemView);
        this.productImage = itemView.findViewById(R.id.product_image);
        this.productTitle = itemView.findViewById(R.id.product_title);
        this.productPrice = itemView.findViewById(R.id.product_price);
    }
}
