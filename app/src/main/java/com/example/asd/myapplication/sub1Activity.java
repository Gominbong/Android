package com.example.asd.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Adapter;
import android.widget.ListView;

import java.util.ArrayList;

public class sub1Activity extends AppCompatActivity {
    ArrayList<MyItem> data = new ArrayList<MyItem>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sub1);

        ListView listView = (ListView)findViewById(R.id.listview11);
        ListviewAdapter adapter = new ListviewAdapter(this,R.layout.activity_itemlist,data);
        listView.setAdapter(adapter);





    }
}
