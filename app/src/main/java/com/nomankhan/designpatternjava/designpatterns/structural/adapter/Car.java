package com.nomankhan.designpatternjava.designpatterns.structural.adapter;

import android.util.Log;

/**
 * Created by Noman Khan on 28/06/17.
 */

class Car implements Vehicle {

    public static final String TAG = Car.class.getSimpleName();

    @Override
    public void accelerate() {
        Log.d(TAG,"Car is accelerating.");
    }
}
