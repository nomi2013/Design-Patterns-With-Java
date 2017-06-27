package com.nomankhan.designpatternjava.designpatterns.creational.builder;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import com.nomankhan.designpatternjava.R;

/**
 *   When a class have to many properties, it is very messy to have to many constructor or setters.
 *   Builder pattern helps in avoiding creation of constructor as parameters grows.
 *   Flexible to add new property.
 *
 */
public class BuilderPattern extends AppCompatActivity {

    private static final String TAG = BuilderPattern.class.getSimpleName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_builder_pattern);

        Persion persion = new Persion.Builder("Noman Khan", 31)
                .setAddress("New Delhi, India")
                .setEmail("abc@gmil.com")
                .build();

        Log.d(TAG, "Name: "
                + persion.getName()
                + "\n Age: "
                + persion.getAge()
                + "\n Address: "
                + persion.getAddress()
                + "\n Email: "
                + persion.getEmail());
    }
}
