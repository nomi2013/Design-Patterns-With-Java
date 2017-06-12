package com.example.nomankhan.designpatternjava.solid.d;

import android.util.Log;

/**
 * Created by Noman Khan on 13/06/17.
 */

public class SqliteDatabase implements Database {

    public static final String TAG = SqliteDatabase.class.getSimpleName();

    @Override
    public void connect() {
        Log.d(TAG, "Sqlite Database connecting...");
    }

    @Override
    public void disconnect() {
        Log.d(TAG, "Sqlite Database disconnecting...");
    }

}
