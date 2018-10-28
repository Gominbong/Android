package com.example.asd.myapplication;

import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import static com.example.asd.myapplication.FragmentActivity3.number;

public class MainActivity extends AppCompatActivity {
    TextView textView;
    private static final String TAG = "MainActivity";
     private int mIndex = 0;

    protected void onCreate(Bundle savedInstanceState) {

        mIndex += 1;
        Log.d(TAG, "index : " + mIndex);
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);

                Button button1 = (Button)findViewById(R.id.button1);
                Button button2 = (Button)findViewById(R.id.button2);
                button1.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        number=1;
                        FragmentTransaction ft = getSupportFragmentManager().beginTransaction();
                        ft.replace(R.id.framelayout,new FragmentActivity1());
                        ft.commit();
                     }
        });
        button2.setOnClickListener(
                new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                number=1;
                FragmentTransaction ft = getSupportFragmentManager().beginTransaction();
                ft.replace(R.id.framelayout,new FragmentActivity2());
                ft.commit();
            }
        });

    }
}
