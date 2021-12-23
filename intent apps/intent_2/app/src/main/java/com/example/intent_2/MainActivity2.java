package com.example.intent_2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {
TextView tv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Intent it2=getIntent();
        Bundle ob=it2.getExtras();

        String a=ob.getString("firstname");
        int b=ob.getInt("myage");
        tv=findViewById(R.id.textView);
        tv.setText(a+","+b);
    }
}