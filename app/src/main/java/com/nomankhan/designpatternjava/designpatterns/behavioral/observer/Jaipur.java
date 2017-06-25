package com.nomankhan.designpatternjava.designpatterns.behavioral.observer;

import android.util.Log;

/**
 * Created by Noman Khan on 25/06/17.
 */

 class Jaipur implements Observer {

    static final String TAG = Jaipur.class.getSimpleName();
    private PizzaObserverManager manager;

    public Jaipur() {

    }

    @Override
    public void pizzaRateUpdate(float price) {
        Log.d(TAG, "New pizza rate in Jaipur is: " + price);
    }

}
