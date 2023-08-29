package com.dylanvann.fastimage;

import android.util.Log;

import com.bumptech.glide.load.model.GlideUrl;
import com.bumptech.glide.load.model.Headers;

public class GlideUrlSkipTokenParam extends GlideUrl {
    public GlideUrlSkipTokenParam(String url, Headers headers) {
        super(url, headers);
    }

    @Override
    public String getCacheKey() {
        String cacheKey = super.getCacheKey();
        // Log.d("SkipToken", "cacheKey:" + cacheKey);
        String newKey = cacheKey.replaceAll("(?<=[?&;])token=.*?($|[&;])","");
        // Log.d("SkipToken", "cacheKey-no-token:" + newKey);
        return newKey;
    }
}
