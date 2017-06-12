package com.example.nomankhan.designpatternjava.designpatterns.creational;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import com.example.nomankhan.designpatternjava.R;

public class SingletonPattern extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_singleton);
    }
}
