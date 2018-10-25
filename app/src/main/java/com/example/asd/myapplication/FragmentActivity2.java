package com.example.asd.myapplication;

import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class FragmentActivity2 extends Fragment {
    ArrayList<MyItem> data1 = new ArrayList<MyItem>();

    public FragmentActivity2(){

    }
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.activity_fragment2,container,false);
        ListView listview=(ListView)v.findViewById(R.id.listview2);

        data1.add(new MyItem(R.drawable.image00,"햄버거","2525","원"));

        ListviewAdapter adapter = new ListviewAdapter(getActivity(),R.layout.activity_itemlist,data1);
        listview.setAdapter(adapter);

        return v;

    }
}