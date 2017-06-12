package com.example.nomankhan.designpatternjava.solid.d;

import android.util.Log;

/**
 * Created by Noman Khan on 13/06/17.
 */

public class OracleDatabase implements Database {

    public static final String TAG = OracleDatabase.class.getSimpleName();

    @Override
    public void connect() {
        Log.d(TAG, "Oracle database connecting...");
    }

    @Override
    public void disconnect() {
        Log.d(TAG, "Oracle database disconnecting...");
    }
}
