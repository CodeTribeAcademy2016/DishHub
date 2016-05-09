package com.restauarant.codetribe.disapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.restauarant.codetribe.disapp.utils.Constants;
import com.restauarant.codetribe.disapp.utils.OkHttp;

import org.json.JSONException;
import org.json.JSONObject;

/**
 * Created by CodeTribe1 on 2016-03-22.
 */
public class MainActivity extends AppCompatActivity {

    Button signUp;
    EditText username, pass;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        username = (EditText) findViewById(R.id.username);
        signUp = (Button)findViewById(R.id.btnSignin);
        signUp.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                Intent intent = new Intent(MainActivity.this,CustomerNavigation.class);
                startActivity(intent);
                Toast.makeText(getBaseContext(),"Welcome",Toast.LENGTH_LONG).show();
            }
        });
    }

    public void login()
    {

        String user_email = username.getText().toString();
        String password = pass.getText().toString();

        String json_payload = "";

        try {
            json_payload = new JSONObject()
                    .put(Constants.email, user_email)
                    .put(Constants.password,password)
                    .put(Constants.requestType,Constants.loginRequestType)
                    .toString();
        } catch (JSONException e) {
            e.printStackTrace();
        }

        Log.i("Ygritte", json_payload);

        final String json_pay = json_payload;

        final OkHttp helpOkHttp = new OkHttp();
        Log.i("Ygrite", "You know nothing Jon Snow!!");

        Thread thread = new Thread(new Runnable()
        {
            @Override
            public void run()
            {
                try
                {
                    Log.i("Muntunza", Constants.dishHubUrl);
                    Log.i("Muntunza", json_pay);

                    String res = helpOkHttp.post(Constants.dishHubUrl+"?JSON="+json_pay, json_pay);


                    Log.i("First test......", res);




                }
                catch (Exception e)
                {
                    e.printStackTrace();
                }
            }
        });

        thread.start();


    }
}