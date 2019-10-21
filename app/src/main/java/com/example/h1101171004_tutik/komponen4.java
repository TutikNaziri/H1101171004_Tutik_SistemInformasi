package com.example.h1101171004_tutik;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class komponen4 extends AppCompatActivity {
    Button contoh4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_komponen4);

        contoh4=(Button) findViewById(R.id.contoh4);

        contoh4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent cth4=new Intent(komponen4.this, Sytanx4.class);
                startActivity(cth4);
            }
        });
    }

    public void browser4(View view){
        Intent bro4=new Intent(Intent.ACTION_VIEW, Uri.parse("https://developer.android.com/guide/topics/manifest/provider-element.html?hl=id"));
        startActivity(bro4);
    }
}

