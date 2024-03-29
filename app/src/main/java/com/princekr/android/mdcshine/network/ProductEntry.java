package com.princekr.android.mdcshine.network;

import android.content.res.Resources;
import android.net.Uri;
import android.util.Log;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.princekr.android.mdcshine.R;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.io.StringWriter;
import java.io.Writer;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

public class ProductEntry {
    private static final String TAG = "ProductEntry";

    public final String title;
    public final Uri dynamicUrl;
    public final String url;
    public final String price;
    public final String description;

    public ProductEntry(String title, Uri dynamicUrl, String url, String price, String description) {
        this.title = title;
        this.dynamicUrl = dynamicUrl;
        this.url = url;
        this.price = price;
        this.description = description;
    }

    public static List<ProductEntry> initProductEntryList(Resources resources) {
        InputStream inputStream = resources.openRawResource(R.raw.products);
        Writer writer = new StringWriter();
        char[] buffer = new char[1024];
        try {
            Reader reader = new BufferedReader(new InputStreamReader(inputStream, "UTF-8"));
            int pointer;
            while ((pointer = reader.read(buffer)) != -1) {
                writer.write(buffer, 0, pointer);
            }
        } catch (IOException exception) {
            Log.e(TAG, "Error reading and writing from the JSON file", exception);
        } finally {
            try {
                inputStream.close();
            } catch (IOException e) {
                Log.e(TAG, "initProductEntryList: Error closing the inputstream", e);
            }
        }
        String jsonProductString = writer.toString();
        Gson gson = new Gson();
        Type productListType = new TypeToken<ArrayList<ProductEntry>>() {
        }.getType();
        return gson.fromJson(jsonProductString, productListType);
    }
}
