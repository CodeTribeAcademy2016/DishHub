package com.example.codetribe.disapp;

import android.content.Intent;
import android.os.Bundle;
import android.provider.ContactsContract;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.view.View;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

import com.restauarant.codetribe.disapp.Favourites;
import com.restauarant.codetribe.disapp.HomeActivity;
import com.restauarant.codetribe.disapp.OrderHistory;
import com.restauarant.codetribe.disapp.ProfileActivity;
import com.restauarant.codetribe.disapp.R;

public class CustomerNavigation extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_customer_navigation);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);


        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.setDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);
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
        getMenuInflater().inflate(R.menu.customer_navigation, menu);
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

        if (id == R.id.nav_camera) {
            Intent i = new Intent(CustomerNavigation.this, ProfileActivity.class);
            startActivity(i);
            Toast.makeText(getBaseContext(),"Edit your Profile", Toast.LENGTH_LONG).show();
        } else if (id == R.id.nav_gallery) {
            Intent i = new Intent(CustomerNavigation.this, Favourites.class);
            startActivity(i);
            Toast.makeText(getBaseContext(),"Usually visited restaurant", Toast.LENGTH_LONG).show();

        } else if (id == R.id.nav_slideshow) {
            Intent i = new Intent(CustomerNavigation.this, OrderHistory.class);
            startActivity(i);
            Toast.makeText(getBaseContext(),"View Order history", Toast.LENGTH_LONG).show();

        } else if (id == R.id.nav_manage) {
            Intent i = new Intent(CustomerNavigation.this, ChangePassword.class);
            startActivity(i);
            Toast.makeText(getBaseContext(),"Change you password", Toast.LENGTH_LONG).show();

        }
            else if (id == R.id.nav_manage_man) {
            Intent i = new Intent(CustomerNavigation.this, HomeActivity.class);
            startActivity(i);
            Toast.makeText(getBaseContext(),"Logging out", Toast.LENGTH_LONG).show();

        }else if (id == R.id.nav_share) {

        } else if (id == R.id.nav_send) {

        }

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }
}
