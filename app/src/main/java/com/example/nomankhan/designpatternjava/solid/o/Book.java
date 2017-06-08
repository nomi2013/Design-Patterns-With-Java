package com.example.nomankhan.designpatternjava.solid.o;

import android.util.Log;

/**
 * Created by Noman Khan on 08/06/17.
 */

public class Book {
    private static final String TAG = Book.class.getSimpleName();

    void bookWriterName(String name) {
        Log.d(TAG, name);
    }

    void bookType(String type) {
        Log.d(TAG, type);
    }
}

