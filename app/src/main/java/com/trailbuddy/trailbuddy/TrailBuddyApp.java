package com.trailbuddy.trailbuddy;

import android.app.Application;

import com.trailbuddy.trailbuddy.network.AppNetworkRequestQueue;

public class TrailBuddyApp extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        AppNetworkRequestQueue.getInstance(this);
    }
}
