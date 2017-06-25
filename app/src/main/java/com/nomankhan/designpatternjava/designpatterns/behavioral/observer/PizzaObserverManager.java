package com.nomankhan.designpatternjava.designpatterns.behavioral.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Noman Khan on 25/06/17.
 */

class PizzaObserverManager implements State {

    private List<Observer> observerList;
    private float pizzaChangePrice = 0;

    public PizzaObserverManager() {
        this.observerList = new ArrayList<>();
    }


    @Override
    public void addObserver(Observer o) {
        observerList.add(o);
    }

    @Override
    public void removeObserver(Observer observer) {
        observerList.remove(observer);
    }


    @Override
    public void notifyObserver() {
        for (Observer observer :
                observerList) {
            observer.pizzaRateUpdate(pizzaChangePrice);
        }
    }

    public void setPizzaChangePrice(float pizzaChangePrice) {
        this.pizzaChangePrice = pizzaChangePrice;
        notifyObserver();
    }
}
