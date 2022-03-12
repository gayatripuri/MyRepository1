package com.example.seekbarassignment;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.graphics.Color;
import android.os.Bundle;
import android.widget.SeekBar;

public class MainActivity extends AppCompatActivity implements SeekBar.OnSeekBarChangeListener {
SeekBar red,green,blue;
ConstraintLayout l1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        l1=findViewById(R.id.layout1);

        red=findViewById(R.id.seekBar);
        green=findViewById(R.id.seekBar2);
        blue=findViewById(R.id.seekBar3);
        red.setOnSeekBarChangeListener(this);
        green.setOnSeekBarChangeListener(this);
        blue.setOnSeekBarChangeListener(this);


    }

    @Override
    public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
        l1.setBackgroundColor(Color.rgb(red.getProgress(),green.getProgress(),blue.getProgress()));
    }

    @Override
    public void onStartTrackingTouch(SeekBar seekBar) {

    }

    @Override
    public void onStopTrackingTouch(SeekBar seekBar) {

    }
}