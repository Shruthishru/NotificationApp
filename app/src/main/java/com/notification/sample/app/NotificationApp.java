package com.notification.sample.app;

import android.app.Application;

import com.google.firebase.FirebaseApp;

/**
 * Created by shruthi on 2/4/18.
 */

public class NotificationApp extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        FirebaseApp.initializeApp(this);
    }
}
