package com.nomankhan.designpatternjava.solid.d;

/**
 * Created by Noman Khan on 13/06/17.
 */

public class DataBaseHandler {
    private Database mDatabase;

    public DataBaseHandler(Database mDatabase) {
        this.mDatabase = mDatabase;
    }

    public void connectDatabase() {
        mDatabase.connect();
    }


    public void disconnectDatabase() {
        mDatabase.disconnect();
    }
}
