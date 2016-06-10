package com.restauarant.codetribe.disapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

public class ManuItem extends AppCompatActivity {

    ListView list;

    String[] itemname = {"Fish & Chips",
                         "Single Burger",
                         "Double Burger",
                         "Pap & Chicken"};
    Integer[] imgid ={
            R.drawable.kfc,
            R.drawable.sp,
            R.drawable.mcd,
            R.drawable.nandos,

    };

    Integer [] price = {26,53,87,40};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_manu_item);


        ItemListAdapter adapter = new ItemListAdapter(this,itemname,imgid,price);
        list =(ListView)findViewById(R.id.myitemlist);
        list.setAdapter(adapter);

        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                if(position == 0)
                {
                    Intent i = new Intent(getApplicationContext(), OrderHistory.class);
                    startActivity(i);
                }
                if(position == 1)
                {
                    Intent i = new Intent(getApplicationContext(), OrderHistory.class);
                    startActivity(i);
                }
                if(position == 2)
                {
                    Intent i = new Intent(getApplicationContext(), OrderHistory.class);
                    startActivity(i);

                }
                if(position == 3)
                {
                    Intent i = new Intent(getApplicationContext(), OrderHistory.class);
                    startActivity(i);
                }
                if(position == 4)
                {
                    Intent i = new Intent(getApplicationContext(), OrderHistory.class);
                    startActivity(i);
                }
            }
        });
    }
}
