package com.restauarant.codetribe.disapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

public class MenuCategory extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_category);

        ImageView imghead = (ImageView) findViewById(R.id.head);
        ImageView imglunch = (ImageView) findViewById(R.id.image1);

        imghead.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(), Menu.class);
                startActivity(i);
                Toast.makeText(getBaseContext(),"The break fast has been selected",Toast.LENGTH_LONG).show();
            }
        });

        imglunch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(), Menu.class);
                startActivity(i);
                Toast.makeText(getBaseContext(),"The Lunch has been selected",Toast.LENGTH_LONG).show();
            }
        });
    }
}
