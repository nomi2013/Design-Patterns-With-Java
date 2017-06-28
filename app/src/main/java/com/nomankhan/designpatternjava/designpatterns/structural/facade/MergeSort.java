package com.nomankhan.designpatternjava.designpatterns.structural.facade;

import android.util.Log;

/**
 * Created by Noman Khan on 28/06/17.
 */

class MergeSort implements Algorithm {

    public static final String TAG = MergeSort.class.getSimpleName();

    @Override
    public void sort() {
        Log.d(TAG, "Merge sorting.");
    }
}
