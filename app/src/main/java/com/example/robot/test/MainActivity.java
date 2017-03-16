package com.example.robot.test;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;

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
import com.example.robot.test.fragments.setts;

public class MainActivity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {

    private FragmentTransaction ft;
    private FragmentManager fm;
    private Boolean removed1;
    private Boolean removed2;
    setts st = new setts();
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

        removed1 = removed2 = false;

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
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();

        ft = getSupportFragmentManager().beginTransaction();
        switch (id){
            case R.id.Delete_fragment1: ft.remove(fm.findFragmentByTag(item8.TAG)); removed1=true; break;
            case R.id.Delete_fragment2: ft.remove(fm.findFragmentByTag(item1.TAG)); removed2=true; break;
            case R.id.Add_fragment1: if(removed1) {ft.add(R.id.containter, fm.findFragmentByTag(item8.TAG)); removed1=false;} break;
            case R.id.Add_fragment2: if(removed2) {ft.add(R.id.containter, fm.findFragmentByTag(item1.TAG)); removed2=false;} break;
            case R.id.settings: ft.replace(R.id.containter, st); break;
        }
        ft.addToBackStack(null);
        ft.commit();
        return super.onOptionsItemSelected(item);
    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        int id = item.getItemId();

        fm = getSupportFragmentManager();
        ft = getSupportFragmentManager().beginTransaction();

        switch(id){
            case R.id.nav_item1:
                Fragment it1 = fm.findFragmentByTag(item1.TAG);
                if(it1 == null){
                    it1 = new item1();
                    ft.replace(R.id.containter, it1, item1.TAG);
                }
                else ft.replace(R.id.containter, it1); break;
            case R.id.nav_item2:
                Fragment it2 = fm.findFragmentByTag(item2.TAG);
                if(it2 == null){
                    it2 = new item2();
                    ft.replace(R.id.containter, it2, item2.TAG);
                }
                else ft.replace(R.id.containter, it2); break;
            case R.id.nav_item3:
                item3 it3 = (item3) fm.findFragmentByTag(item3.TAG);
                if(it3 == null){
                    it3 = new item3();
                    ft.replace(R.id.containter, it3, it3.TAG);
                }
                else ft.replace(R.id.containter, it3); break;
            case R.id.nav_item4:
                item4 it4 = (item4) fm.findFragmentByTag(item4.TAG);
                if(it4 == null){
                    it4 = new item4();
                    ft.replace(R.id.containter, it4, it4.TAG);
                }
                else ft.replace(R.id.containter, it4); break;
            case R.id.nav_item5:
                item5 it5 = (item5) fm.findFragmentByTag(item5.TAG);
                if(it5 == null){
                    it5 = new item5();
                    ft.replace(R.id.containter, it5, it5.TAG);
                }
                else ft.replace(R.id.containter, it5); break;
            case R.id.nav_item6:
                item6 it6 = (item6) fm.findFragmentByTag(item6.TAG);
                if(it6 == null){
                    it6 = new item6();
                    ft.replace(R.id.containter, it6, it6.TAG);
                }
                else ft.replace(R.id.containter, it6); break;
            case R.id.nav_item7:
                item7 it7 = (item7) fm.findFragmentByTag(item7.TAG);
                if(it7 == null){
                    it7 = new item7();
                    ft.replace(R.id.containter, it7, it7.TAG);
                }
                else ft.replace(R.id.containter, it7); break;
            case R.id.nav_item8:
                item8 it8 = (item8) fm.findFragmentByTag(item8.TAG);
                if(it8 == null){
                    it8 = new item8();
                    ft.replace(R.id.containter, new item8(), it8.TAG);
                }
                else ft.replace(R.id.containter, it8);
                ft.add(R.id.containter, new item1(), item1.TAG);
                break;
            case R.id.nav_item9:
                item9 it9 = (item9) fm.findFragmentByTag(item9.TAG);
                if(it9 == null){
                    it9 = new item9();
                    ft.replace(R.id.containter, it9, it9.TAG);
                }
                else ft.replace(R.id.containter, it9); break;
            case R.id.nav_item10:
                item10 it10 = (item10) fm.findFragmentByTag(item10.TAG);
                if(it10 == null){
                    it10 = new item10();
                    ft.replace(R.id.containter, it10, it10.TAG);
                }
                else ft.replace(R.id.containter, it10); break;
        }
        ft.addToBackStack(null);
        ft.commit();

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);

        return true;
    }
}
