package com.example.personal_information;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity3 extends AppCompatActivity {
    TextView tv1, tv2, tv3, tv4, tv5, tv6;
    //String Name="name";
    //String Address="address";
    //String Country="country";
    //String Contact="contact";
    String sname, saddress, scountary, scontact;
    String stenthm, stwelvem;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        tv1 = findViewById(R.id.name);
        tv2 = findViewById(R.id.address);
        tv3 = findViewById(R.id.contact);
        tv4 = findViewById(R.id.countary);
        tv5 = findViewById(R.id.tenthmtv);
        tv6 = findViewById(R.id.twelvemtv);

        /*SharedPreferences sp = getSharedPreferences("mysp", MODE_PRIVATE);
        String a = sp.getString("sname", null);
        String b = sp.getString("saddress", null);
        String c = sp.getString("scountary", null);
        String d = sp.getString("scontact", null);*/

        //getting intent value
        //main page ka line no.71 refer
        sname = getIntent().getExtras().getString("myname");
        saddress = getIntent().getExtras().getString("myaddress");
        scountary = getIntent().getExtras().getString("mycountary");
        scontact = getIntent().getExtras().getString("mycontact");

        stenthm = getIntent().getExtras().getString("mytenthm");
        stwelvem = getIntent().getExtras().getString("mytwelve");

        tv1.setText(sname);
        tv2.setText(saddress);
        tv4.setText(scountary);
        tv3.setText(scontact);
        tv5.setText(stenthm);
        tv6.setText(stwelvem);
    }
}