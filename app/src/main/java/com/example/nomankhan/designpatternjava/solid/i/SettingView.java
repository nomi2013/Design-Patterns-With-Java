package com.example.nomankhan.designpatternjava.solid.i;

/**
 * Created by Noman Khan on 10/06/17.
 */

/**
 *  User Setting View have no use of errorMessage  and loadSuccessfully method. So we have to
 *  segregate into Load Data Interface and Error Interface.
 */
public class SettingView implements DialogInterface {

    @Override
    public void createDialog() {

    }

    @Override
    public void showDialog() {

    }

    @Override
    public void hideDialog() {

    }

    @Override
    public void errorMessage() {

    }

    @Override
    public void loadSuccessfully() {

    }
}
