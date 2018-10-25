package com.example.asd.myapplication;

import android.content.res.Configuration;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;


public class MainActivity extends AppCompatActivity {
    private static final String TAG = "MainActivity";
 

    private int mIndex = 0;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mIndex += 1;
        Log.d(TAG, "index : " + mIndex);

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

                getSupportFragmentManager().beginTransaction().replace(R.id.framelayout,new FragmentActivity2()).commit();

            }
        });




    }
    public void onConfigurationChanged(Configuration newConfig) {
        super.onConfigurationChanged(newConfig);
    }
}
