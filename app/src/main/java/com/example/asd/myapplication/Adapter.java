package com.example.asd.myapplication;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

import java.util.ArrayList;

class myItem{
    int image;
    String name;
    String price;
    myItem(int image, String name, String price){
        this.image=image;
        this.name=name;
        this.price=price;
    }
}
public class Adapter extends BaseAdapter{

    private Context context;
    private int resource;
    LayoutInflater inflater;
    ArrayList<myItem> arrayList;
    int layout;

    @Override
    public int getCount() {
        return 0;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        return null;
    }
}
