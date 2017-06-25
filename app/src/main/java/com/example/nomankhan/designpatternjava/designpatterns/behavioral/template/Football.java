package com.example.nomankhan.designpatternjava.designpatterns.behavioral.template;

import android.util.Log;

/**
 * Created by Noman Khan on 25/06/17.
 */

class Football extends Game {

    static final String TAG = Football.class.getSimpleName();

    @Override
    void startGame() {
        Log.d(TAG, "starting footbal game...");
    }

    @Override
    void playing() {
        Log.d(TAG, "playing footbal game...");

    }

    @Override
    void stopGame() {
        Log.d(TAG, "stop footbal game...");

    }
}
