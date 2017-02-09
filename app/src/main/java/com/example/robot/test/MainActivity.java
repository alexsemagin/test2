package com.example.robot.test;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.transition.ActionBarTransition;
import android.view.View;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.content.pm.ActivityInfo;

import com.example.robot.test.fragments.ScrollingActivity;
import com.example.robot.test.fragments.item1;
import com.example.robot.test.fragments.item10;
import com.example.robot.test.fragments.item2;
import com.example.robot.test.fragments.item3;
import com.example.robot.test.fragments.item4;
import com.example.robot.test.fragments.item5;
import com.example.robot.test.fragments.item6;
import com.example.robot.test.fragments.item7;
import com.example.robot.test.fragments.item8;
import com.example.robot.test.fragments.item9;

public class MainActivity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {

    item1 it1;
    item2 it2;
    item3 it3;
    item4 it4;
    item5 it5;
    item6 it6;
    item7 it7;
    item8 it8;
    item9 it9;
    item10 it10;
    ScrollingActivity scA;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.setDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);

        it1 = new item1();
        it2 = new item2();
        it3 = new item3();
        it4 = new item4();
        it5 = new item5();
        it6 = new item6();
        it7 = new item7();
        it8 = new item8();
        it9 = new item9();
        it10 = new item10();
        scA = new ScrollingActivity();

        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
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

        FragmentTransaction ft = getSupportFragmentManager().beginTransaction();

        if (id == R.id.nav_item1) {
            ft.replace(R.id.containter, it1);
        } else if (id == R.id.nav_item2) {
            ft.replace(R.id.containter, it2);
        } else if (id == R.id.nav_item3) {
            ft.replace(R.id.containter, it3);
        } else if (id == R.id.nav_item4) {
            ft.replace(R.id.containter, it4);
        } else if (id == R.id.nav_ScrollingActivity) {
            Intent intent = new Intent(MainActivity.this, ScrollingActivity.class);
            startActivity(intent);
        } else if (id == R.id.nav_item6) {
            ft.replace(R.id.containter, it6);
        } else if (id == R.id.nav_item7) {
            ft.replace(R.id.containter, it7);
        } else if (id == R.id.nav_item8) {
            ft.replace(R.id.containter, it8);
        } else if (id == R.id.nav_item9) {
            ft.replace(R.id.containter, it9);
        } else if (id == R.id.nav_item10) {
            ft.replace(R.id.containter, it10);
        } ft.commit();

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }
}
