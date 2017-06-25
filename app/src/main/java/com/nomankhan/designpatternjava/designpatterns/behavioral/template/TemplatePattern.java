package com.nomankhan.designpatternjava.designpatterns.behavioral.template;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import com.nomankhan.designpatternjava.R;

/**
 *  The abstract class will define sets of methods as template.
 *  The subclass will execute the methods, they way are defined in super class.
 */
public class TemplatePattern extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_template_pattern);


        // Play cricket
        Game cricket = new Cricket();
        cricket.startGame();
        cricket.playing();
        cricket.stopGame();

        // Play football
        Game footbal = new Football();
        footbal.startGame();
        footbal.playing();
        footbal.stopGame();
    }
}
