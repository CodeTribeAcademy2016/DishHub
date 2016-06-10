package com.restauarant.codetribe.disapp;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.widget.Toast;

/**
 * Created by User on 4/19/2016.
 */
public class Splash extends Activity
{
    public static int SPLASH_TIME_OUT = 3000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

       new Handler().postDelayed(new Runnable() {
           @Override
           public void run() {
               Intent i = new Intent(Splash.this, HomeActivity.class);
               startActivity(i);
               Toast.makeText(getBaseContext(),"Welcome to Dish Hub",Toast.LENGTH_LONG).show();
           }
       },SPLASH_TIME_OUT);

    }
}
