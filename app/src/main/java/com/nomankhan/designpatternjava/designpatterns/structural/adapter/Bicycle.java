package com.nomankhan.designpatternjava.designpatterns.structural.adapter;

import android.util.Log;

/**
 * Created by Noman Khan on 28/06/17.
 */

class Bicycle {

    public static final String TAG = Bicycle.class.getSimpleName();

    public void go() {
        Log.d(TAG,"Bicycle is moving.");
    }
}
