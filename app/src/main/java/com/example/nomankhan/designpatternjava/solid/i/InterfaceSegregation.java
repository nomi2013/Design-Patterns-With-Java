package com.example.nomankhan.designpatternjava.solid.i;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import com.example.nomankhan.designpatternjava.R;

public class InterfaceSegregation extends AppCompatActivity {

    /**
     * We can introduced design pattern to make your code flexible.
     * A well structure code is easy for extension and readable.
     *
     * SOLID
     * S: Single Responsibility Principle.
     * O: Open/Closed Responsibility Principle.
     * L: Liskovi Substitution Principle.
     * S: Dependency inversion Principle.
     *
     * These principle will meet in design pattern.
     */

    //////////////////////////////////////////////////////////////////////////////////////////
    /**
     * I: Interface segregation Principle
     *
     * A fatty interface force to implement all methods which is of no use. so we have to
     * break into different interface class.
     */
    //////////////////////////////////////////////////////////////////////////////////////////

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_interface_segregation);
    }
}
