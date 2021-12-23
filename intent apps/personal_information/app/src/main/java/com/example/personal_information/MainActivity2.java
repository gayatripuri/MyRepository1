package com.example.personal_information;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity implements View.OnClickListener {
TextView tv1,tv2,tv3;
EditText ed1,ed2;
Button b1;
String tenthm, twelvem;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        tv1=findViewById(R.id.marks);
        tv2=findViewById(R.id.tenthm);
        tv3=findViewById(R.id.twelvem);
        ed1=findViewById(R.id.m1);
        ed2=findViewById(R.id.m2);
        b1=findViewById(R.id.submit);
        b1.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        tenthm=ed1.getText().toString();
        twelvem=ed2.getText().toString();

        /*SharedPreferences sp;
        sp=getSharedPreferences("mysp", MODE_PRIVATE);*/

        String sname = getIntent().getExtras().getString("myname");
        String saddress = getIntent().getExtras().getString("myaddress");
        String scountary = getIntent().getExtras().getString("mycountary");
        String scontact = getIntent().getExtras().getString("mycontact");

        Intent it = new Intent(MainActivity2.this, MainActivity3.class);
        //it.putExtra("myname", sname);
       // it.putExtra("myaddress", saddress);
        //it.putExtra("mycountary", scountary);
       // it.putExtra("mycontact", scontact);
        it.putExtra("mytenthm", tenthm);
        it.putExtra("mytwelve", twelvem);
        startActivity(it);
        finish();
    }
}