package com.nomankhan.designpatternjava.designpatterns.behavioral.template;

import android.util.Log;

/**
 * Created by Noman Khan on 25/06/17.
 */

 class Cricket extends Game {
    static final String TAG = Cricket.class.getSimpleName();

    @Override
    void startGame() {
        Log.d(TAG, "starting cricket game...");
    }

    @Override
    void playing() {
        Log.d(TAG, "playing cricket game...");

    }

    @Override
    void stopGame() {
        Log.d(TAG, "stop cricket game...");

    }

}
