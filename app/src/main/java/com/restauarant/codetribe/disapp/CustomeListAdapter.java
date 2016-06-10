package com.restauarant.codetribe.disapp;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by User on 5/10/2016.
 */
public class CustomeListAdapter extends ArrayAdapter<String>
{

    private final Activity context;
    private final String[] itemname;
    private final Integer[] imgid;

    public CustomeListAdapter(Activity context, String[] itemname, Integer[] imgid)
    {
        super(context, R.layout.mylist, itemname);

        this.context = context;
        this.itemname = itemname;
        this.imgid = imgid;
    }

    public View getView(int position, View view, ViewGroup parent)
    {
        LayoutInflater inflater = context.getLayoutInflater();
        View rowView = inflater.inflate(R.layout.mylist, null, true);

        ImageView imageView = (ImageView) rowView.findViewById(R.id.myfood);
        TextView  restName = (TextView) rowView.findViewById(R.id.restname);

        imageView.setImageResource(imgid[position]);
        restName.setText(itemname[position]);

        if(position == 0)
        {


        }
        return  rowView;

    }
}
