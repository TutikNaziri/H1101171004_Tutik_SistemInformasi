package com.example.h1101171004_tutik;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button komponen1,komponen2,komponen3,komponen4,komponen5;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        komponen1=(Button) findViewById(R.id.komponen1);
        komponen2=(Button) findViewById(R.id.komponen2);
        komponen3=(Button) findViewById(R.id.komponen3);
        komponen4=(Button) findViewById(R.id.komponen4);
        komponen5=(Button) findViewById(R.id.komponen5);

        komponen1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent kom1=new Intent(MainActivity.this, com.example.h1101171004_tutik.komponen1.class);
                startActivity(kom1);
            }
        });
        komponen2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent kom2=new Intent(MainActivity.this,komponen2.class);
                startActivity(kom2);
            }
        });
        komponen3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent kom3=new Intent(MainActivity.this,komponen3.class);
                startActivity(kom3);
            }
        });
        komponen4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent kom4=new Intent(MainActivity.this,komponen4.class);
                startActivity(kom4);
            }
        });
        komponen5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent kom5=new Intent(MainActivity.this,komponen5.class);
                startActivity(kom5);
            }
        });

    }
}