package com.example.asd.myapplication;

import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

import static com.example.asd.myapplication.FragmentActivity1.hamburgerName;
import static com.example.asd.myapplication.FragmentActivity1.hamburgerPrice;
import static com.example.asd.myapplication.FragmentActivity1.hamburgerImage;
public class FragmentActivity3 extends Fragment{
    static int temp,temp1;

    static int number=1;
    int burgerPrice;
    static ArrayList<MyItem> data1 = new ArrayList<MyItem>();
    public FragmentActivity3(){

    }
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {

        View v = inflater.inflate(R.layout.activity_fragment3,container,false);
        ImageView imageView = (ImageView)v.findViewById(R.id.imageview);
        Button button = (Button)v.findViewById(R.id.button3);
        ImageButton imageButtonUp = (ImageButton)v.findViewById(R.id.imageButtonUp);
        ImageButton imageButtonDown = (ImageButton)v.findViewById(R.id.imageButtonDown);
        TextView TextName = (TextView)v.findViewById(R.id.textname);
        final TextView TextPrice = (TextView)v.findViewById(R.id.textprice);
        final TextView TextCount = (TextView)v.findViewById(R.id.textcount);

        TextName.setText(""+hamburgerName);
        TextPrice.setText(""+hamburgerPrice);
        imageView.setImageResource(hamburgerImage);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                data1.add(new MyItem(hamburgerImage, hamburgerName,hamburgerPrice,"원"+"  x"+number));

                temp=hamburgerPrice*number;
                temp1=temp1+temp;

                number=1;

                FragmentTransaction ft = getFragmentManager().beginTransaction();
                ft.replace(R.id.framelayout,new FragmentActivity2());
                ft.commit();
            }
        });


        imageButtonUp.setOnClickListener(new View.OnClickListener() {
            @Override

            public void onClick(View v) {

                int num = Integer.parseInt(TextCount.getText().toString());
                number = num+1;
                TextCount.setText(""+number);
                TextPrice.setText(""+hamburgerPrice*number);

            }
        });

        imageButtonDown.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(number>1) {
                    int num = Integer.parseInt(TextCount.getText().toString());
                    number = num - 1;
                    TextCount.setText("" + number);
                    TextPrice.setText("" + hamburgerPrice * number);
                }
            }
        });
        return v;

    }
}
