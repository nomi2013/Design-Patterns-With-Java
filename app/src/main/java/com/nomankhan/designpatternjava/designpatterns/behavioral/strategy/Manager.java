package com.nomankhan.designpatternjava.designpatterns.behavioral.strategy;

/**
 * Created by Noman Khan on 24/06/17.
 */

public class Manager implements Strategy {

    private Strategy mStrategy;

    public Manager(
            Strategy mStrategy) {
        this.mStrategy = mStrategy;
    }

    @Override
    public void operation(int a, int b) {
        mStrategy.operation(a, b);
    }
}
