package com.nomankhan.designpatternjava.designpatterns.structural.adapter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import com.nomankhan.designpatternjava.R;

/**
 *    It convert interface of class to other interface as client expect.
 */
public class AdapterPattern extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_adapter_pattern);

        Vehicle car = new Car();
        Vehicle bike = new Bike();
        Vehicle bicycle = new BicycleAdapter(new Bicycle());

        car.accelerate();
        bike.accelerate();
        bicycle.accelerate();

    }
}
