package com.example.asd.myapplication;

import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

import static com.example.asd.myapplication.FragmentActivity3.data1;
import static com.example.asd.myapplication.FragmentActivity3.temp1;

public class FragmentActivity2 extends Fragment {

    public FragmentActivity2(){

    }
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.activity_fragment2,container,false);

        ListView listview2 = (ListView)v.findViewById(R.id.listview2);
        TextView textView = (TextView)v.findViewById(R.id.textTotal);

        ListviewAdapter adapter = new ListviewAdapter(getActivity(),R.layout.activity_itemlist,data1);
        listview2.setAdapter(adapter);

        textView.setText(""+temp1);
        return v;

    }
}