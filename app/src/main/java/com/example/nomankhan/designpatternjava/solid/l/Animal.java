package com.example.nomankhan.designpatternjava.solid.l;

import android.util.Log;

/**
 * Created by Noman Khan on 08/06/17.
 */

public class Animal {
    private static final String TAG = Animal.class.getSimpleName();

    public void sleep() {
        Log.d(TAG, "Animal is Sleeping..");
    }

    public void eat() {
        Log.d(TAG, "Animal is eating..");
    }

}
