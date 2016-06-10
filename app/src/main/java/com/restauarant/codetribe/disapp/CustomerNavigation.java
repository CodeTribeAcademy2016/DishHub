package com.restauarant.codetribe.disapp;

import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class CustomerNavigation extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {

    ListView list;

    String[] itemname ={
            "KFC",
            "Spurs",
            "Macdonald",
            "Nando's",
            "Mugg $ Bean",
            "Fabio Alporto",
            "Diner",
            "Cici's Pizza",
            "Bass Burgers",
    };

    Integer[] imgid ={
            R.drawable.kfc,
            R.drawable.sp,
            R.drawable.mcd,
            R.drawable.nandos,
            R.drawable.mugg,
            R.drawable.restone,
            R.drawable.restwo,
            R.drawable.resthree,
            R.drawable.restfour,

    };



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


        CustomeListAdapter adapter = new CustomeListAdapter(this, itemname, imgid);
        list =(ListView)findViewById(R.id.list);
        list.setAdapter(adapter);

        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                if(position == 0)
                {
                    Intent int0 = new Intent(getApplicationContext(), MenuCategory.class);
                    startActivity(int0);
                    Toast.makeText(getBaseContext(),"You have selected "+itemname[position],Toast.LENGTH_LONG).show();
                }
                else if(position == 1)
                {
                    Intent int0 = new Intent(getApplicationContext(), MenuCategory.class);
                    startActivity(int0);
                    Toast.makeText(getBaseContext(),"You have selected "+itemname[position],Toast.LENGTH_LONG).show();
                }
                else if(position == 2)
                {
                    Intent int0 = new Intent(getApplicationContext(), MenuCategory.class);
                    startActivity(int0);
                    Toast.makeText(getBaseContext(),"You have selected "+itemname[position],Toast.LENGTH_LONG).show();

                }
                else if(position == 3)
                {
                    Intent int0 = new Intent(getApplicationContext(), MenuCategory.class);
                    startActivity(int0);
                    Toast.makeText(getBaseContext(),"You have selected "+itemname[position],Toast.LENGTH_LONG).show();
                }
                else if(position == 4)
                {
                    Intent int0 = new Intent(getApplicationContext(), MenuCategory.class);
                    startActivity(int0);
                    Toast.makeText(getBaseContext(),"You have selected "+itemname[position],Toast.LENGTH_LONG).show();
                }
                else if(position == 5)
                {
                    Intent int0 = new Intent(getApplicationContext(), MenuCategory.class);
                    startActivity(int0);
                    Toast.makeText(getBaseContext(),"You have selected "+itemname[position],Toast.LENGTH_LONG).show();
                }
                else if(position == 6)
                {
                    Intent int0 = new Intent(getApplicationContext(), MenuCategory.class);
                    startActivity(int0);
                    Toast.makeText(getBaseContext(),"You have selected "+itemname[position],Toast.LENGTH_LONG).show();
                }
                else if(position == 7)
                {
                    Intent int0 = new Intent(getApplicationContext(), MenuCategory.class);
                    startActivity(int0);
                    Toast.makeText(getBaseContext(),"You have selected "+itemname[position],Toast.LENGTH_LONG).show();
                }
                else if(position == 8)
                {
                    Intent int0 = new Intent(getApplicationContext(), MenuCategory.class);
                    startActivity(int0);
                    Toast.makeText(getBaseContext(),"You have selected "+itemname[position],Toast.LENGTH_LONG).show();
                }

            }
        });



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
