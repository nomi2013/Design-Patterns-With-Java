package com.nomankhan.designpatternjava.solid.s;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import com.nomankhan.designpatternjava.R;

/**
 * Created by Noman Khan on 06/06/17.
 */

public class SingleResonsibiltyPrinciple extends AppCompatActivity {

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
     * S: Single Responsibility Principle
     *
     * A class must do, what it design for rather than doing to many task.
     * We can avoid through composition or interface.
     */
    //////////////////////////////////////////////////////////////////////////////////////////

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_srp);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);


        Download download = new Download();
        download.downloadFile();
        download.readFile("sdCard/funny");
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if (item.getItemId() == android.R.id.home) {
          finish();
        }
        return super.onOptionsItemSelected(item);
    }
}
