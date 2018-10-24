package com.example.asd.myapplication;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;


public class MainActivity extends AppCompatActivity {

   /* public static final String[] name1=new String[] {"햄버거1", "햄버거2", "햄버거3", "햄버거4", "햄버거5"};
    public static final String[] price1=new String[] {"1000", "2000", "3000", "4000", "5000"};
    public static final Integer[] images={R.drawable.image01, R.drawable.image02, R.drawable.image03, R.drawable.image04, R.drawable.image05};
    ArrayList<Adapter.MyItem> mArGeneral;*/

    ArrayList<MyItem> mArGeneral;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
/*

        Adapter MyAdapter1 = new Adapter();
        MyAdapter1.initListView();
*/


        Adapter MyAdapter = new Adapter(getApplicationContext(),R.layout.activity_itemlist,mArGeneral);
        MyAdapter.initListView();


        ListView listView = (ListView)findViewById(R.id.listview);
        listView.setAdapter(MyAdapter);
        listView.setOnItemClickListener(MyAdapter.mItemClickListener);


                Button button1 = (Button)findViewById(R.id.button1);
                Button button2 = (Button)findViewById(R.id.button2);

                button1.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {


                        FragmentTransaction ft = getSupportFragmentManager().beginTransaction();
                        ft.replace(R.id.framelayout,new FragmentActivity1());
                        ft.commit();
            }
        });


        button2.setOnClickListener(
                new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                getSupportFragmentManager().beginTransaction().replace(R.id.framelayout,new FragmentActivity3()).commit();

            }
        });




    }

}
