package com.nomankhan.designpatternjava.designpatterns.behavioral.observer;

import android.util.Log;

/**
 * Created by Noman Khan on 25/06/17.
 */

 class Delhi implements Observer {

    static final String TAG = Delhi.class.getSimpleName();

    public Delhi() { }

    @Override
    public void pizzaRateUpdate(float price) {
        Log.d(TAG, "New pizza rate in Delhi is: " + price);
    }

}
