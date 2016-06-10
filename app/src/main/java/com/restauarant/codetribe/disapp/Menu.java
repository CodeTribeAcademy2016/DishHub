package com.restauarant.codetribe.disapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

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
}
