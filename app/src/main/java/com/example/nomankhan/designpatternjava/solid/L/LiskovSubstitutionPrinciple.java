package com.example.nomankhan.designpatternjava.solid.L;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import com.example.nomankhan.designpatternjava.R;

/**
 * Created by Noman Khan on 08/06/17.
 */

public class LiskovSubstitutionPrinciple extends AppCompatActivity {

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
     * L: Liskov Substitution Principle
     *
     * If A class extend with B, then B class can be replace with A.
     */
    //////////////////////////////////////////////////////////////////////////////////////////

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lsp);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        Animal dog = new Dog();

    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if (item.getItemId() == android.R.id.home) {
            finish();
        }
        return super.onOptionsItemSelected(item);
    }

}
