package com.nomankhan.designpatternjava.designpatterns.structural.facade;

import android.util.Log;

/**
 * Created by Noman Khan on 28/06/17.
 */

class BubbleSort implements Algorithm {

    public static final String TAG = BubbleSort.class.getSimpleName();

    @Override
    public void sort() {
        Log.d(TAG, "Bubble sorting.");
    }
}
