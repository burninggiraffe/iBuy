package com.example.owner.ibuy;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.CheckBox;
import android.widget.TextView;
/**
 * Created by David on 2015-11-20.
 * We have adapted code from a tutorial on techlovejump.com
 */
public class CustomAdapter extends ArrayAdapter<ItemModel>{
    ItemModel[] Items = null;
    Context context;
    public CustomAdapter(Context context, ItemModel[] resource) {
        super(context,R.layout.row,resource);
        // TODO Auto-generated constructor stub
        this.context=context;
        this.Items = resource;
        }
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // TODO Auto-generated method stub
        LayoutInflater inflater = ((Activity)context).getLayoutInflater();
        convertView = inflater.inflate(R.layout.row, parent, false);
        TextView name = (TextView) convertView.findViewById(R.id.textView1);
        CheckBox cb = (CheckBox) convertView.findViewById(R.id.checkBox1);
        name.setText(Items[position].getTitle());
        if(Items[position].getValue())
            cb.setChecked(true);
        else
            cb.setChecked(false);
        return convertView;
    }
}


