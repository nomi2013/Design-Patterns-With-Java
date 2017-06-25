package com.nomankhan.designpatternjava.designpatterns.behavioral.strategy;

import android.util.Log;

/**
 * Created by Noman Khan on 24/06/17.
 */

public class Multiply implements Strategy {

    public static final String TAG = Multiply.class.getSimpleName();

    @Override
    public void operation(int a, int b) {
        Log.d(TAG, "Multiplication is: " + a*b);
    }
}
