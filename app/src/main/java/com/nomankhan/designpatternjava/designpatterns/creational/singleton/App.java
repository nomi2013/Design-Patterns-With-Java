package com.nomankhan.designpatternjava.designpatterns.creational.singleton;

import android.util.Log;

/**
 * Created by Noman Khan on 27/06/17.
 */

class App {

    private static final String TAG = App.class.getSimpleName();
    static App mApp;

    private int mViews = 0;

    private App() { }

    // Thread safe
    public synchronized static App getmApp() {
        if (mApp == null) {
            mApp = new App();
        }
        return mApp;
    }

    public void increaseScreenViews() {
        ++mViews;
    }

    public void printScreenViewsCount() {
        Log.d(TAG, "Screen views count is: " + mViews);
    }
}
