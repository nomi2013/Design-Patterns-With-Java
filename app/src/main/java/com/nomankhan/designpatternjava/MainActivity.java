package com.nomankhan.designpatternjava;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.text.method.ScrollingMovementMethod;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;
import com.nomankhan.designpatternjava.designpatterns.behavioral.observer.ObserverPattern;
import com.nomankhan.designpatternjava.designpatterns.behavioral.strategy.StrategyPattern;
import com.nomankhan.designpatternjava.designpatterns.behavioral.template.TemplatePattern;
import com.nomankhan.designpatternjava.designpatterns.creational.builder.BuilderPattern;
import com.nomankhan.designpatternjava.designpatterns.creational.singleton.SingletonPattern;
import com.nomankhan.designpatternjava.solid.d.DependencyInversionPrinciple;
import com.nomankhan.designpatternjava.solid.l.LiskovSubstitutionPrinciple;
import com.nomankhan.designpatternjava.solid.o.OpenClosePrinciple;
import com.nomankhan.designpatternjava.solid.s.SingleResonsibiltyPrinciple;

public class MainActivity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open,
                R.string.navigation_drawer_close);
        drawer.addDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);

        TextView textView = (TextView)findViewById(R.id.tv);
        textView.setMovementMethod(new
                ScrollingMovementMethod());
    }

    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();

        // SOLID principle calls
        if (id == R.id.nav_srp) {
            startActivity(new Intent(this, SingleResonsibiltyPrinciple.class));
        } else if (id == R.id.nav_ocp) {
            startActivity(new Intent(this, OpenClosePrinciple.class));
        } else if (id == R.id.nav_lsp) {
            startActivity(new Intent(this, LiskovSubstitutionPrinciple.class));
        } else if (id == R.id.nav_dip) {
            startActivity(new Intent(this, DependencyInversionPrinciple.class));
        }

        // Behavioural design patterns calls
        else if (id == R.id.nav_sdp) {
            startActivity(new Intent(this, StrategyPattern.class));
        } else if (id == R.id.nav_tdp) {
            startActivity(new Intent(this, TemplatePattern.class));
        } else if (id == R.id.nav_odp) {
            startActivity(new Intent(this, ObserverPattern.class));
        }

        // Creational design patterns call
          else if (id == R.id.nav_singdp) {
            startActivity(new Intent(this, SingletonPattern.class));
        } else if (id == R.id.nav_builderdp) {
            startActivity(new Intent(this, BuilderPattern.class));
        }

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }
}
