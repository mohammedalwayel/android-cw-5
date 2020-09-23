package com.example.cw5;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final EditText a1 = findViewById(R.id.name);
        final EditText a2 = findViewById(R.id.age);
        Button a3 = findViewById(R.id.Buttom);
        a3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,MainActivity2.class);
                intent.putExtra("a1",a1.getText().toString());
                intent.putExtra("a2",a2.getText().toString());
                 startActivity(intent);
            }
        });






    }
}