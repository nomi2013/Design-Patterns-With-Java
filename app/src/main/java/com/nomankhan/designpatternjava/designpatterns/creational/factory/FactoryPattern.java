package com.nomankhan.designpatternjava.designpatterns.creational.factory;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import com.nomankhan.designpatternjava.R;

/**
 *
 *
 *   This pattern is useful when bulk of object creation.
 *   Follow rule code to interface.
 *   This pattern also meet Open/close principle
 *
 *
 */

public class FactoryPattern extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_factory_pattern);

        Animal cow = AnimalFactory.getAnimal(AnimalFactory.COW);
        Animal buffalow = AnimalFactory.getAnimal(AnimalFactory.BUFFALOW);
        Animal dog = AnimalFactory.getAnimal(AnimalFactory.DOG);
    }
}
