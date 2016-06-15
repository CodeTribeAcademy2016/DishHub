package com.restauarant.codetribe.disapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;

/**
 * Created by CodeTribe1 on 3/22/2016.
 */
public class OrderHistory extends AppCompatActivity
{

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_orderhistory);
        final String[] orders = {"Pap n  beef \nR38.99  \n12/01/2016","Pap n Chicken\nR34.99\n15/01/2016","grilled Chicken\nR45.00\n22/01/2016","Fish n chips\nR24.99\n25/01/2016","cheese burger\nR48.00\n28/01/2016","Maccaroni n' meat balls\nR57.99\n10/02/2016","Pap n Chicken\nR34.99\n16/02/2016","grilled Chicken\nR45.00\n24/02/2016","chips\nR16.00\n03/03/2016","cheese burger\nR48.00\n08/02/2016","Maccaroni n' meat balls\nR57.99\n13/03/2016"};
        ListAdapter orderAdapter = new ArrayAdapter<String> (this,android.R.layout.simple_list_item_1,orders);
        final ListView listView = (ListView)findViewById(R.id.listView);
        listView.setAdapter(orderAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                if(position ==0)
                {
                    Intent i = new Intent(OrderHistory.this, OrderItems.class);
                    i.putExtra("Order selected", listView.getItemIdAtPosition(position  ));
                    startActivity(i);
                }
                if(position ==1)
                {
                    Intent i = new Intent(OrderHistory.this, OrderItems.class);
                    i.putExtra("Order selected",orders[position]);
                    startActivity(i);
                }
                if(position ==2)
                {
                    Intent i = new Intent(OrderHistory.this, OrderItems.class);
                    i.putExtra("Order selected",orders);
                    startActivity(i);
                }
                if(position ==3)
                {
                    Intent i = new Intent(OrderHistory.this, OrderItems.class);
                    i.putExtra("Order selected",orders);
                    startActivity(i);
                }
                if(position ==4)
                {
                    Intent i = new Intent(OrderHistory.this, OrderItems.class);
                    i.putExtra("Order selected",orders);
                    startActivity(i);
                }
                if(position ==5)
                {
                    Intent i = new Intent(OrderHistory.this, OrderItems.class);
                    i.putExtra("Order selected",orders);
                    startActivity(i);
                }
            }
        });
    }
}