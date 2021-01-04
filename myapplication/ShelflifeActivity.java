package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class ShelflifeActivity extends AppCompatActivity {

    FloatingActionButton intent_btn;
    android.widget.CompoundButton intent_btn1;

    @Override
    protected void onCreate(Bundle savedIntanceState){
        super.onCreate(savedIntanceState);
        setContentView(R.layout.activity_shelflife);

        intent_btn = findViewById(R.id.shelflifefab);
        intent_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ShelflifeActivity.this, Photo1Activity.class);
                startActivity(intent);
            }
        });

        intent_btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ShelflifeActivity.this, Profile2Activity.class);
                startActivity(intent);
            }
        });
    }
}
