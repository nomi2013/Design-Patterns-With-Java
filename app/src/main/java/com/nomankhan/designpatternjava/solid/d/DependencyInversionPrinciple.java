package com.nomankhan.designpatternjava.solid.d;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import com.nomankhan.designpatternjava.R;

public class DependencyInversionPrinciple extends AppCompatActivity {

    /**
     * We can introduced design pattern to make your code flexible.
     * A well structure code is easy for extension and readable.
     *
     * SOLID
     * S: Single Responsibility Principle.
     * O: Open/Closed Responsibility Principle.
     * L: Liskov Substitution Principle.
     * S: Dependency inversion Principle.
     *
     * These principle will meet in design pattern.
     */

    //////////////////////////////////////////////////////////////////////////////////////////
    /**
     * D: Dependency Inversion Principle
     *
     * When a high level system is tightly dependent on low level system and vice-versa.We should
     * always design loosely coupled software. It is easy to maintain.
     * We have to meet always Open/Close principle.
     *
     * High Level Modules <-----> Abstract Layer <-----> Low Level Modules
     */
    //////////////////////////////////////////////////////////////////////////////////////////

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dependency_inversion_principle);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        Database sqliteDataBase = new SqliteDatabase();
        Database oracleDataBase = new OracleDatabase();

        sqliteDataBase.connect();
        sqliteDataBase.disconnect();

        oracleDataBase.connect();
        oracleDataBase.disconnect();
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if (item.getItemId() == android.R.id.home) {
            finish();
        }
        return super.onOptionsItemSelected(item);
    }
}
