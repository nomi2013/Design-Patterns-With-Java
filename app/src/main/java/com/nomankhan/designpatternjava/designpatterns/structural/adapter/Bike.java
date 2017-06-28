package com.nomankhan.designpatternjava.designpatterns.structural.adapter;

import android.util.Log;

/**
 * Created by Noman Khan on 28/06/17.
 */

class Bike implements Vehicle {

    public static final String TAG = Bike.class.getSimpleName();

    @Override
    public void accelerate() {
        Log.d(TAG,"Bike is accelerating.");
    }
}
