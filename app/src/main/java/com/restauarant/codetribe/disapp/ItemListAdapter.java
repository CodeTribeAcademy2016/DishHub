package com.restauarant.codetribe.disapp;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by User on 5/13/2016.
 */
public class ItemListAdapter extends ArrayAdapter<String>
{
    private final Activity context;
    private final String[] itemname;
    private final Integer[] imgid;
    private final Integer [] price;

    public ItemListAdapter( Activity context, String[] itemname, Integer[] imgid, Integer[] price) {
        super(context, R.layout.menuitemlist, itemname);

        this.context = context;
        this.itemname = itemname;
        this.imgid = imgid;
        this.price = price;
    }




    public View getView(int position, View view, ViewGroup parent)
    {
        LayoutInflater inflater = context.getLayoutInflater();
        View rowView = inflater.inflate(R.layout.menuitemlist, null, true);

        ImageView imageView = (ImageView) rowView.findViewById(R.id.imageItem);
        TextView restName = (TextView) rowView.findViewById(R.id.txtmenu1);
        TextView itemPrice = (TextView) rowView.findViewById(R.id.Price2);

        imageView.setImageResource(imgid[position]);
        restName.setText(itemname[position]);
        itemPrice.setText(price[position]);

        if(position == 0)
        {

        }
        return  rowView;

    }
}
