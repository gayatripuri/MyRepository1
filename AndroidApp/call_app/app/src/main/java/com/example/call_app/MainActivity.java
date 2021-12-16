package com.example.call_app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
EditText e1;
Button b1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        e1=findViewById(R.id.edit1);
        b1=findViewById(R.id.button);
        b1.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        //String n1=e1.getText().toString();
       // String msg=e2.getText().toString();
       // String number;
       // Integer it=new Intent(Intent.ACTION_CALL, Uri.parse("tel:"+Number));
        //startActivity(it);
       // String number=e1.getText().toString();
        Intent it = new Intent(Intent.ACTION_CALL);
        String number = null;
        it.setData(Uri.parse("tel:"+number));
        startActivity(it);
    }
}