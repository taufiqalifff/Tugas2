package com.example.tugas2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
    }

    public void act1(View view) {
        Intent b = new Intent(MainActivity2.this,MainActivity.class);
                startActivity(b);
    }

    public void act4(View view) {
        Intent d = new Intent(MainActivity2.this,MainActivity3.class);
        startActivity(d);
    }
}