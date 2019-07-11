package com.princekr.android.mdcshine.network;

import android.net.Uri;

public class ProductEntry {
    private static final String TAG = "ProductEntry";

    public final String title;
    public final Uri dynamicUrl;
    public final String url;
    public final String description;

    public ProductEntry(String title, Uri dynamicUrl, String url, String description) {
        this.title = title;
        this.dynamicUrl = dynamicUrl;
        this.url = url;
        this.description = description;
    }
}
