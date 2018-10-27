package com.example.asd.myapplication;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class ListviewAdapter extends BaseAdapter {

    private LayoutInflater inflater;
    private ArrayList<MyItem> data;

    public ListviewAdapter(Context context, int layout, ArrayList<MyItem> data){
        this.inflater=(LayoutInflater)context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        this.data=data;
    }

    @Override
    public int getCount(){return data.size();}

    @Override
    public String getItem(int position){return data.get(position).getName();}

    @Override
    public long getItemId(int position){return position;}

    @Override
    public View getView(int position, View convertView, ViewGroup parent){
        if(convertView==null){

            convertView=inflater.inflate(R.layout.activity_itemlist,parent,false);
        }


        ImageView imageView=(ImageView)convertView.findViewById(R.id.imageview);
        TextView textName=(TextView)convertView.findViewById(R.id.textview1);
        TextView textPrice=(TextView)convertView.findViewById(R.id.textview2);
        TextView textText=(TextView)convertView.findViewById(R.id.textview3);

        imageView.setImageResource(data.get(position).getImage());
        textName.setText(data.get(position).getName());
        textPrice.setText(""+data.get(position).getPrice());
        textText.setText(data.get(position).getText());

        return convertView;
    }
}