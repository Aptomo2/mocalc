package com.example.mocalc;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.content.ContextCompat;

import android.content.Intent;
import android.os.Bundle;

import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    ImageView std, prog, stor, temper;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toolbar bar = (Toolbar) findViewById(R.id.bar);
        setSupportActionBar(bar);
        getSupportActionBar().setDisplayShowTitleEnabled(false);

        std = findViewById(R.id.menu1);
        std.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,Standard.class);
                startActivity(intent);
            }
        });

        prog = findViewById(R.id.menu2);
        prog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,Prog.class);
                startActivity(intent);
            }
        });

        stor = findViewById(R.id.menu3);
        stor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,Storage.class);
                startActivity(intent);
            }
        });

        temper = findViewById(R.id.menu4);
        temper.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,Suhu.class);
                startActivity(intent);
            }
        });
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu,menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        int id = item.getItemId();
        switch (id) {
            case R.id.about:
            Intent intent0 = new Intent(MainActivity.this, About.class);
            startActivity(intent0);
            break;
        }
        return super.onOptionsItemSelected(item);
    }
}