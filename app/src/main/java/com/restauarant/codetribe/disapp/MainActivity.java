package com.restauarant.codetribe.disapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

/**
 * Created by CodeTribe1 on 2016-03-22.
 */
public class MainActivity extends AppCompatActivity {

    Button signUp;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        signUp = (Button)findViewById(R.id.btnSignin);
        signUp.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                Intent intent = new Intent(MainActivity.this,navigation.class);
                startActivity(intent);
            }
        });
    }
}