package com.nomankhan.designpatternjava.designpatterns.structural.adapter;

/**
 * Created by Noman Khan on 28/06/17.
 */

class BicycleAdapter implements Vehicle {

    private Bicycle mBicycle;

    public BicycleAdapter(
            Bicycle mBicycle) {
        this.mBicycle = mBicycle;
    }

    @Override
    public void accelerate() {
        mBicycle.go();
    }
}
