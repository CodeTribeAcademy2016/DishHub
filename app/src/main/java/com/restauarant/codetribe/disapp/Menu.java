package com.restauarant.codetribe.disapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import android.os.Handler;

import com.restauarant.codetribe.disapp.utils.OkHttp;

import org.json.JSONException;
import org.json.JSONObject;

//import java.util.logging.Handler;

import utils.Constance;

public class Menu extends AppCompatActivity  {



    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        ImageView img1 = (ImageView)findViewById(R.id.head);
        ImageView img2 = (ImageView)findViewById(R.id.head1);
        ImageView img3 = (ImageView)findViewById(R.id.head2);
        ImageView img4  = (ImageView) findViewById(R.id.head23);
        final TextView txt1 = (TextView) findViewById(R.id.text1);
        TextView txt2 = (TextView) findViewById(R.id.text12);
        TextView txt3 = (TextView) findViewById(R.id.text13);
        TextView txt4 = (TextView) findViewById(R.id.text133);

        txt1.setText("Pap and Meat\n Price R20.00");
        txt1.setText("Cheese Burger\n Price R30.00");
        txt1.setText("Rice and Mince\n Price R40.00");
        txt1.setText("Chips\n Price R10.00");

        img1.setOnClickListener(new View.OnClickListener() {

            //String data = txt1.getText().toString();
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(), OrderHistory.class);
                startActivity(i);
            }
        });

        img2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(), OrderHistory.class);
                startActivity(i);
            }
        });

        img3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(), OrderHistory.class);
                startActivity(i);
            }
        });

        img4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(), OrderHistory.class);
                startActivity(i);
            }
        });
    }
    public void menu(View v) {
        String breakfast = "";
        String lunch = "";
        String dinner = "";

        String json_menu = "";


        try {

            json_menu = new JSONObject()
                    .put(Constance.menu, new JSONObject()
                                    .put(Constance.breakfast , breakfast)
                                    .put(Constance.lunch,lunch)
                                    .put(Constance.dinner,dinner)
                    )                    .put(Constance.requestType, Constance.ADD_MENU).toString();
        } catch (Exception e) {
            e.printStackTrace();
        }
        final String menu_payload = json_menu;
        final String json_pay = json_menu;
        final OkHttp objHttp = new OkHttp();


        //Handler handler = new Handler();
        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    Log.i("Ygritte", json_pay);
                    Log.i("Ygritte", Constance.dishHubUrl + "?JSON=" + menu_payload);
                    String res = objHttp.post(Constance.dishHubUrl + "?JSON=" + menu_payload, menu_payload);
                    final JSONObject objJson = new JSONObject(res.trim());
                    Log.i("Ygritte", "response : " + res);
                    final String statusCode = objJson.getString("statuscode").toString();
                    String message = objJson.getString("message");
                    Log.i("Ygritte", message);
                    if (Integer.parseInt(statusCode) == 0) {
                        Toast.makeText(getBaseContext(), "Menu not found!!" + statusCode, Toast.LENGTH_LONG).show();

                    } else if (Integer.parseInt(statusCode) == 100) {
                        final Handler handler = new Handler();
                        handler.postDelayed(new Runnable() {
                            @Override
                            public void run() {
                                Toast.makeText(getBaseContext(), "Your menu is!!" + statusCode, Toast.LENGTH_LONG).show();
                                Intent i = new Intent(Menu.this, MainActivity.class);
                                i.putExtra("objJson_", objJson.toString());
                                startActivity(i);

                            }
                        }, 1000);
                    }
                } catch (Exception e) {

                }


            }
        });




    }
}
