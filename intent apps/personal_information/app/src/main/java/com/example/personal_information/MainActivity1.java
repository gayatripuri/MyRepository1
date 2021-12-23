package com.example.personal_information;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity1 extends AppCompatActivity implements View.OnClickListener {
    Button b1;
    TextView tv1, tv2, tv3, tv4, tv5, tv6;
    EditText ed1, ed2, ed3, ed4;
    RadioGroup rg1, rg2;
    RadioButton rb1, rb2;
    //CheckBox cb1, cb2, cb3;
    String name, address, countary, contact;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main1);
        b1 = findViewById(R.id.Next);
        tv1 = findViewById(R.id.name);
        tv2 = findViewById(R.id.tv2);
        tv3 = findViewById(R.id.tv3);
        tv4 = findViewById(R.id.tv4);
        tv5 = findViewById(R.id.tv5);
        tv6 = findViewById(R.id.tv6);
        ed1 = findViewById(R.id.Name);
        ed2 = findViewById(R.id.Address);
        ed3 = findViewById(R.id.Contact);
        ed4 = findViewById(R.id.Countary);
        rg1 = findViewById(R.id.rg1);
        rg2 = findViewById(R.id.rg2);
        //rb1=findViewById(R.id.Male);
        //rb2=findViewById(R.id.Female);
        //cb1 = findViewById(R.id.Java);
        //cb2 = findViewById(R.id.CPP);
        //cb3 = findViewById(R.id.Python);

        //cb1.setOnCheckedChangeListener(this);
        //cb2.setOnCheckedChangeListener(this);
        //cb3.setOnCheckedChangeListener(this);
        b1.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        name = ed1.getText().toString();
        contact = ed3.getText().toString();
        address = ed2.getText().toString();
        countary = ed4.getText().toString();

        /*SharedPreferences sp;
        sp=getSharedPreferences("mysp", MODE_PRIVATE);
        SharedPreferences.Editor ed;
        ed=sp.edit();
        ed.putString("sname", name);
        ed.putString("saddress", address);
        ed.putString("scountary", countary);
        ed.putString("scontact", contact);
        ed.commit();*/

        Intent it = new Intent(MainActivity1.this, MainActivity2.class);
        it.putExtra("myname", name);
        it.putExtra("myaddress", address);
        it.putExtra("mycountary", countary);
        it.putExtra("mycontact", contact);
        startActivity(it);

    }
}




