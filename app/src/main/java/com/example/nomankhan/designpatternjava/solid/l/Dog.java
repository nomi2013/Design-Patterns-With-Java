package com.example.nomankhan.designpatternjava.solid.l;

import android.util.Log;

/**
 * Created by Noman Khan on 08/06/17.
 */

public class Dog extends Animal {

    private static final String TAG = Dog.class.getSimpleName();

    public void bark() {
        Log.d(TAG, "Dog is barking..");
    }

}
