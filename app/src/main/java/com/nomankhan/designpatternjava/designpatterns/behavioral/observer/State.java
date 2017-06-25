package com.nomankhan.designpatternjava.designpatterns.behavioral.observer;

/**
 * Created by Noman Khan on 25/06/17.
 */

 interface State {
    void addObserver(Observer o);
    void removeObserver(Observer o);
    void notifyObserver();
}
