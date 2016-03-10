package com.example.codetribe.disapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;

public class OrderHistory extends AppCompatActivity
{

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_orderhistory);

        String[] orders = {"Pap n  beef    R10.00     20/01/2016","Pap n  Chicken    R10.00     20/01/2016","grilled Chicken    R10.00     20/01/2016","chips   R10.00     20/01/2016","cheese burger    R10.00     20/01/2016","Maccaroni n' meat balls    R10.00     20/01/2016","Pap n  Chicken    R10.00     20/01/2016","grilled Chicken    R10.00     20/01/2016","chips   R10.00     20/01/2016","cheese burger    R10.00     20/01/2016","Maccaroni n' meat balls    R10.00     20/01/2016"};
        ListAdapter orderAdapter = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,orders);
        ListView listView = (ListView)findViewById(R.id.listView);
        listView.setAdapter(orderAdapter);
    }
}
