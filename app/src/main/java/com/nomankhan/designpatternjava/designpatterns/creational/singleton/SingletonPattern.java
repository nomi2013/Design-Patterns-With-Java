package com.nomankhan.designpatternjava.designpatterns.creational.singleton;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import com.nomankhan.designpatternjava.R;

/**
 * This design pattern is useful to have only one object of a class.
 * It strict class to have only one object, saves memory.
 */
public class SingletonPattern extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_singleton);

        App.getmApp().increaseScreenViews();
        App.getmApp().printScreenViewsCount();
    }
}
