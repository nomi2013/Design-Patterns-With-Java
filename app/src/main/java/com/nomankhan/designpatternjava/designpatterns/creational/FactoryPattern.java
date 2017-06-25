package com.nomankhan.designpatternjava.designpatterns.creational;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import com.nomankhan.designpatternjava.R;

public class FactoryPattern extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_factory_pattern);
    }
}
