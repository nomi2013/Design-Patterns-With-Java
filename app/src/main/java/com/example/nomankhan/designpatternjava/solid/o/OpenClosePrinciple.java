package com.example.nomankhan.designpatternjava.solid.o;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import com.example.nomankhan.designpatternjava.R;

public class OpenClosePrinciple extends AppCompatActivity {

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
     * O: Open/Close Principle
     *
     * A class must open for extension and close for modification, We can achieve through
     * inheritance, delegation and composition.
     */
    //////////////////////////////////////////////////////////////////////////////////////////

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_open_close_principle);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        Book book = new Book();
        book.bookWriterName("Jhon Murphey");
        book.bookType("Fiction");

        BookHandler bookHandler = new BookHandler(new BookPrinting());
        bookHandler.printBook();
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if (item.getItemId() == android.R.id.home) {
            finish();
        }
        return super.onOptionsItemSelected(item);
    }
}
