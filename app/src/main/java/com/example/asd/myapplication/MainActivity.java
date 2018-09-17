package com.example.asd.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button button1;
    TextView textview1,textview2;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textview2 = (TextView)findViewById(R.id.TextView2);
        textview1 = (TextView)findViewById(R.id.TextView1);

        Intent intent = getIntent();
        String text = intent.getStringExtra("TextMsg");
        textview2.setText(text);

        button1 = (Button) findViewById(R.id.Button1);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override

                public void onClick(View v) {
                    Intent intent = new Intent(getApplicationContext(), SubActivity.class);  // 두번째 파라미터에 서브 액티비티 클래스명 지정
                    intent.putExtra("TextMsg", textview1.getText().toString());   // 인텐트에 EditText 위젯에 입력된 텍스트 데이터를 추가
                    startActivity(intent);
                }

        });

    }



}
