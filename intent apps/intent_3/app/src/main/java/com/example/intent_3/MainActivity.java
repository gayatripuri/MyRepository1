package com.example.intent_3;

import androidx.activity.result.contract.ActivityResultContracts;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    Button b1;
    EditText e1, e2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b1 = findViewById(R.id.button);
        b1.setOnClickListener(this);
        e1 = findViewById(R.id.edit1);
        e2 = findViewById(R.id.edit2);
    }


    @Override
    protected void onActivityResult(int requestcode, int resultcode, Intent data) {
        if (requestcode == 123 && resultcode == RESULT_OK) {
            Bundle ob = data.getExtras();
            String key;
            int r = ob.getInt("result");
            Context context;
            Toast.makeText(MainActivity.this, " " + r,
                    Toast.LENGTH_SHORT).show();
        } else {
            Toast.makeText(this, "Exception Occurred", Toast.LENGTH_SHORT).show();
        }
        super.onActivityResult(requestcode, resultcode, data);
    }

    @Override
    public void onClick(View v) {
        int a = Integer.parseInt(e1.getText().toString());
        int b = Integer.parseInt(e2.getText().toString());
        Intent it = new Intent(MainActivity.this, MainActivity2.class);
        it.putExtra("num1", a);
        it.putExtra("num2", b);
        Object requestcode;
        startActivityForResult(it,123);
    }
}