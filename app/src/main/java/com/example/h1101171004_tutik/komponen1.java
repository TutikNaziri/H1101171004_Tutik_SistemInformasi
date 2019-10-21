package com.example.h1101171004_tutik;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class komponen1 extends AppCompatActivity {
    Button contoh2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_komponen1);

        Button contoh1 = (Button) findViewById(R.id.contoh1);

        contoh1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent cth1=new Intent(komponen1.this,Sytanx1 .class);
                startActivity(cth1);
            }
        });
    }

    public void browser1(View view){
        Intent bro1=new Intent(Intent.ACTION_VIEW, Uri.parse("https://developer.android.com/guide/topics/manifest/service-element.html?hl=id"));
        startActivity(bro1);
    }
}