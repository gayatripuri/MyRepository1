package com.example.intent_2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
Button b1;
EditText e1, e2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b1=findViewById(R.id.button);
        b1.setOnClickListener(this);
        e1=findViewById(R.id.edittext1);
        e2=findViewById(R.id.edittext2);
    }

    @Override
    public void onClick(View v) {
        String fname=e1.getText().toString();
        int age=Integer.parseInt(e2.getText().toString());
        //create Intent class object...

        Intent it=new Intent(this, MainActivity2.class);

        it.putExtra("firstname",fname);
        it.putExtra("myage",age);
        startActivity(it);

    }
}