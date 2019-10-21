package com.example.h1101171004_tutik;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class komponen3 extends AppCompatActivity {
    Button contoh3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_komponen3);

        contoh3=(Button) findViewById(R.id.contoh3);

        contoh3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent cth3= new Intent(komponen3.this,Sytanx3.class);
                startActivity(cth3);
            }
        });
    }

    public void browser3(View view){
        Intent bro3=new Intent(Intent.ACTION_VIEW, Uri.parse("https://developer.android.com/guide/topics/manifest/receiver-element.html?hl=id"));
        startActivity(bro3);
    }
}

