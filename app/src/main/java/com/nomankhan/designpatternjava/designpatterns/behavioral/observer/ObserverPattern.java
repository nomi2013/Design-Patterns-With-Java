package com.nomankhan.designpatternjava.designpatterns.behavioral.observer;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import com.nomankhan.designpatternjava.R;

/**
 * It follow one-to many concept.
 * When a state of object is changed, notified to all its dependents.
 * Its loosely coupled software design patterns between objects.
 */
public class ObserverPattern extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_observer_pattern);

        PizzaObserverManager pizzaObserverManager = new PizzaObserverManager();

        // Add Delhi
        Observer delhi = new Delhi();
        pizzaObserverManager.addObserver(delhi);

        // Add Jaipur
        Observer jaipur = new Jaipur();
        pizzaObserverManager.addObserver(jaipur);

        // Pizza price change
        pizzaObserverManager.setPizzaChangePrice(150);

        // Remove Delhi subscriber
        pizzaObserverManager.removeObserver(delhi);

        // Pizza price change
        pizzaObserverManager.setPizzaChangePrice(175);


    }
}
