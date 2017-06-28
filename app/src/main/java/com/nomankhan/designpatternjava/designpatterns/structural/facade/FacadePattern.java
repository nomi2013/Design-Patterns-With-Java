package com.nomankhan.designpatternjava.designpatterns.structural.facade;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import com.nomankhan.designpatternjava.R;

/**
 *     It defines high level interfaces for low level system.
 */
public class FacadePattern extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_facade_pattern);

        Algorithm mergeSort = new MergeSort();
        Algorithm bubbleSort = new BubbleSort();

        mergeSort.sort();
        bubbleSort.sort();
    }
}
