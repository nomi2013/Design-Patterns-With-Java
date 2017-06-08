package com.example.nomankhan.designpatternjava.solid.s;

import android.util.Log;

/**
 * Created by Noman Khan on 08/06/17.
 */

public class Download implements ReadFile {
    private static final String TAG = Download.class.getSimpleName();

    public void downloadFile() {
        Log.d(TAG,"Downloading file");
    }

    @Override
    public void readFile(String path) {
        Log.d(TAG,"Reading file..");
    }
}
