package com.nomankhan.designpatternjava.designpatterns.behavioral.strategy;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import com.nomankhan.designpatternjava.R;

/**
 * 1. What varies should be encapsulate. Varying code ----- stay same code.
 * 2. Code to interface/supertype, not to implementation.
 * 3. Favour composition over inheritance.
 */
public class StrategyPattern extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_strategy_pattern);

        // Addition
        Manager manager = new Manager(new Add());
        manager.operation(10, 20);

        //Multiplication
        Manager manager1 = new Manager(new Multiply());
        manager1.operation(20, 30);

    }
}
