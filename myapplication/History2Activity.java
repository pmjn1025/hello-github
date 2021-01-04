package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class History2Activity extends AppCompatActivity {
    FloatingActionButton intent_btn;
    android.widget.CompoundButton intent_btn1;
    Button intent_btn2;
    ImageButton intent_btn3;

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_history2);

        intent_btn = findViewById(R.id.history2fab);
        intent_btn1 = findViewById(R.id.history2switch);
        intent_btn2 = findViewById(R.id.history2profile);
        intent_btn3 = findViewById(R.id.history2share);

        intent_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(History2Activity.this, Photo2Activity.class);
                startActivity(intent);
            }
        });

        intent_btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(History2Activity.this, ProfileActivity.class);
                startActivity(intent);
            }
        });

        intent_btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(History2Activity.this, Profile2Activity.class );
                startActivity(intent);
            }
        });
        intent_btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_SEND);
                intent.setType("text/plain");
                intent.putExtra(Intent.EXTRA_TEXT, "전달할 메시지");
                startActivity(Intent.createChooser(intent, "공유하기"));
            }
        });


    }
}
