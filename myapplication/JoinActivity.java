package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class JoinActivity extends AppCompatActivity {
    Button intent_btn;
    Button intent_btn1;
    Button intent_btn2;

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_join);

        intent_btn = findViewById(R.id.joinok_button);
        intent_btn1 = findViewById(R.id.join_delete);
        intent_btn2 = findViewById(R.id.check_button1);

        intent_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(JoinActivity.this, LoginActivity.class);
                Toast toast = Toast.makeText(getApplicationContext(), "회원가입이 완료 되었습니다.", Toast.LENGTH_SHORT); toast.show();

                startActivity(intent);
            }
        });

        intent_btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(JoinActivity.this, LoginActivity.class);
                Toast toast = Toast.makeText(getApplicationContext(),"회원가입을 취소 하셨습니다.", Toast.LENGTH_SHORT); toast.show();

                startActivity(intent);
            }
        });

        intent_btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast toast = Toast.makeText(getApplicationContext(),"중복되는 아이디가 없습니다. 계속 진행 해주세요.",Toast.LENGTH_SHORT);toast.show();

            }
        });

    }
}
