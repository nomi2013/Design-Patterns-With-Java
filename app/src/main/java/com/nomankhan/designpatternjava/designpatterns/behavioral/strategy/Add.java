package com.nomankhan.designpatternjava.designpatterns.behavioral.strategy;

import android.util.Log;

/**
 * Created by Noman Khan on 24/06/17.
 */

public class Add  implements Strategy {
    public static final String TAG = Add.class.getSimpleName();

    @Override
    public void operation(int a, int b) {
        Log.d(TAG, "Addition is: " + (a + b));
    }
}
