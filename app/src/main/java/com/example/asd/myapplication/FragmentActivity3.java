package com.example.asd.myapplication;

import android.content.Intent;
import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

import java.util.ArrayList;


public class FragmentActivity3 extends Fragment {

    int a=0;
    public FragmentActivity3(){

    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
      /*  Bundle bundle = getArguments();
        String name = bundle.getString("name");
*/      View v = inflater.inflate(R.layout.activity_fragment3,container,false);

        Button button = (Button)v.findViewById(R.id.button3);
        ImageButton imageButtonUp = (ImageButton)v.findViewById(R.id.imageButtonUp);
        ImageButton imageButtonDown = (ImageButton)v.findViewById(R.id.imageButtonDown);
        final TextView TextName = (TextView)v.findViewById(R.id.textname);
        final TextView TextPrice = (TextView)v.findViewById(R.id.textprice);
        final TextView TextCount = (TextView)v.findViewById(R.id.textcount);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String str = TextCount.getText().toString();
            }
        });


        imageButtonUp.setOnClickListener(new View.OnClickListener() {
            @Override

            public void onClick(View v) {

             String str1=TextCount.getText().toString();
                int num=Integer.parseInt(str1);
                a = num+1;
                TextCount.setText(""+a);

                String str2=TextCount.getText().toString();

            }
        });

        imageButtonDown.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String str1=TextCount.getText().toString();
                int num=Integer.parseInt(str1);
                a= num-1;
                TextCount.setText(""+a);

                String str2=TextCount.getText().toString();

            }
        });
        return v;

    }
}
