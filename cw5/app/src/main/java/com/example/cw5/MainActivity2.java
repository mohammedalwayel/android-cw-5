package com.example.cw5;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        TextView b1 = findViewById(R.id.crty);
        TextView b2 = findViewById(R.id.intc);

        Bundle cc = getIntent().getExtras();


        String as = cc.getString("a1");
        String b22 = cc.getString("a2");
        b1.setText(as);
        b2.setText(b22);

    }
}