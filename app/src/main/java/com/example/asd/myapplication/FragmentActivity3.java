package com.example.asd.myapplication;

import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.TextView;


public class FragmentActivity3 extends Fragment {


    int a=0;
    public FragmentActivity3(){

    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {


        View v = inflater.inflate(R.layout.activity_fragment3,container,false);
        final ImageButton imageButton1 = (ImageButton)v.findViewById(R.id.imageButton1);
        final ImageButton imageButton2 = (ImageButton)v.findViewById(R.id.imageButton2);
        final TextView textView1 = (TextView)v.findViewById(R.id.textview44);
        final TextView textView2 = (TextView)v.findViewById(R.id.textview55);

        imageButton1.setOnClickListener(new View.OnClickListener() {
            @Override

            public void onClick(View v) {

                String str1=textView2.getText().toString();
                int num=Integer.parseInt(str1);
                a = num+1;
                textView2.setText(""+a);

                String str2=textView1.getText().toString();

            }
        });

        imageButton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String str1=textView2.getText().toString();
                int num=Integer.parseInt(str1);
                a= num-1;
                textView2.setText(""+a);

                String str2=textView1.getText().toString();
                int price=Integer.parseInt(str2);

            }
        });
        return v;

    }
}
