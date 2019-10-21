package com.example.h1101171004_tutik;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class komponen2 extends AppCompatActivity {
    Button contoh2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_komponen2);

        contoh2=(Button) findViewById(R.id.contoh2);

        contoh2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent cth2=new Intent(komponen2.this,Sytanx2.class);
                startActivity(cth2);
            }
        });
    }

    public void browser2(View view){
        Intent bro2=new Intent(Intent.ACTION_VIEW, Uri.parse("https://developer.android.com/guide/topics/manifest/service-element.html?hl=id"));
        startActivity(bro2);
    }
}

