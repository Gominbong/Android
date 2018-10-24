package com.example.asd.myapplication;

import android.app.FragmentTransaction;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.ImageView;

import java.util.ArrayList;

class MyItem {
    int image;
    String mText1;
    String mText2;


    MyItem( int image1, String str1, String str2) {
        mText1 = str1;
        image = image1;
        mText2 = str2;
    }
}

public class Adapter extends BaseAdapter {

    public Adapter(){

    }
    Context context;
    LayoutInflater mInflater;
    ArrayList<MyItem> mArSrc;
    ArrayList<MyItem> mArGeneral;
    int layout;


    public Adapter(Context context, int layout, ArrayList<MyItem> aarSrc) {
        this.context = context;
        this.mInflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        this.mArSrc = aarSrc;
        this.layout = layout;

    }




    public void initListView(){
        mArSrc = new ArrayList<MyItem>();
        MyItem mi;

        mi = new MyItem(R.drawable.image01,"트랙스버거1","1000");
        mArSrc.add(mi);
        mi = new MyItem(R.drawable.image01,"트랙스버거2","2000");
        mArSrc.add(mi);
        mi = new MyItem(R.drawable.image01,"트랙스버거3","3000");
        mArSrc.add(mi);
        mi = new MyItem(R.drawable.image01,"트랙스버거4","4000");
        mArSrc.add(mi);
        mi = new MyItem(R.drawable.image01,"트랙스버거5","5000");
        mArSrc.add(mi);

    }

    AdapterView.OnItemClickListener mItemClickListener= new AdapterView.OnItemClickListener() {
        @Override
        public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

            MyItem myItem = mArSrc.get(position);
            FragmentTransaction ft =

            }
    };

    @Override
    public int getCount() {
        return mArSrc.size();
    }

    @Override
    public Object getItem(int position) {
        return mArSrc.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        final int pos = position;
        if (convertView == null) {
            convertView = mInflater.inflate(layout, parent, false);

        }
        ImageView imageview = (ImageView) convertView.findViewById(R.id.imageview);
        imageview.setImageResource(mArSrc.get(position).image);

        return convertView;
    }
}