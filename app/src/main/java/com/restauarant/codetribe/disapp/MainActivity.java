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

import org.json.JSONArray;
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
                login();
                Toast.makeText(getBaseContext(),"Welcome",Toast.LENGTH_LONG).show();
            }
        });
    }

    public void login()
    {

        //String user_email = username.getText().toString();
        //String password = pass.getText().toString();

        String json_payload = "";

        try {
            json_payload = new JSONObject().put("menuID","3").put("requestType","211").toString();
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
            //
            public void run()
            {
                try
                {
                    Log.i("Ygritte", Constants.dishHubUrl);
                    Log.i("Ygritte", json_pay);

                    String res = helpOkHttp.post(Constants.dishHubUrl+"ds?JSON="+json_pay, json_pay);
                    Log.i("Ygritte", res);
                    //json parse
                    JSONObject jsonObject = new JSONObject(res);

                    JSONArray menu_array = jsonObject.getJSONArray("menuitemList");

                    for ( int i = 0; i < menu_array.length(); i++ ) {

                       JSONObject menu = (JSONObject) menu_array.get(i);

                        String menu_item_name = menu.getString("itemName");

                        Log.i("Ygritte",""+menu_item_name);

                    }

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