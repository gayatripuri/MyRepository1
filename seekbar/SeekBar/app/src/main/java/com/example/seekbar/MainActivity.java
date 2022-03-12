package com.example.seekbar;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.SeekBar;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements SeekBar.OnSeekBarChangeListener {
SeekBar sb;
TextView tv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        sb=findViewById(R.id.seekBar);
        tv=findViewById(R.id.textView);
        sb.setMin(0);
        sb.setMax(255);
        sb.setOnSeekBarChangeListener(this);
    }

   int start, end;
    @Override
    public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
        tv.setText(""+progress);
    }

    @Override
    public void onStartTrackingTouch(SeekBar seekBar) {
    start=sb.getProgress();
    }

    @Override
    public void onStopTrackingTouch(SeekBar seekBar) {
    end=sb.getProgress();
    int d=end-start;
    tv.setText(end+"-"+start+"="+d);

    }
}