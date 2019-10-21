package com.example.h1101171004_tutik;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class komponen5 extends AppCompatActivity {
    Button contoh5;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_komponen5);

        contoh5=(Button) findViewById(R.id.contoh5);

        contoh5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent cth5=new Intent(komponen5.this, Sytanx5.class);
                startActivity(cth5);
            }
        });
    }

    public void browser5(View view){
        Intent bro5=new Intent(Intent.ACTION_VIEW, Uri.parse("https://developer.android.com/guide/components/intents-filters?hl=id"));
        startActivity(bro5);
    }
}
