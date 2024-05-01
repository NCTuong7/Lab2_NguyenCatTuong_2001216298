package com.example.lab2_nguyencattuong_2001216298;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button btnBai1,btnBai2,btnBai3,btnBai5,btnBai6;

    String tag = "Event";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d(tag,"In the onCreate() event");
        Toast.makeText(this, "onCreate", Toast.LENGTH_SHORT).show();
        addConTrol();
        addEvent();


    }
    void addConTrol()
    {
        btnBai1 = (Button) findViewById(R.id.btnBai1);
        btnBai2 = (Button) findViewById(R.id.btnBai2);
        btnBai3 = (Button) findViewById(R.id.btnBai3);
        btnBai5 = (Button) findViewById(R.id.btnBai5);
        btnBai6 = (Button)  findViewById(R.id.btnBai6);

    }
    void addEvent()
    {
        btnBai1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent  = new Intent(getApplicationContext(),MainActivityBai1.class);
                startActivity(intent);
                Toast.makeText(getApplicationContext(), "Mở bài 1 thành công", Toast.LENGTH_SHORT).show();
            }
        });
        btnBai2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),Bai2.class);
                startActivity(intent);
                Toast.makeText(getApplicationContext(), "Mở bài 2 thành công", Toast.LENGTH_SHORT).show();
            }
        });
        btnBai3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new  Intent(getApplicationContext(),Bai3.class);
                startActivity(intent);
                Toast.makeText(getApplicationContext(), "Mở bài 3 thành công", Toast.LENGTH_SHORT).show();
            }
        });
        btnBai5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),Bai5.class);
                startActivity(intent);
                Toast.makeText(getApplicationContext(), "Mở bài 5 thành công", Toast.LENGTH_SHORT).show();
            }
        });
        btnBai6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),Bai6a.class);
                startActivity(intent);
                Toast.makeText(getApplicationContext(), "Mở bài 6 thành công", Toast.LENGTH_SHORT).show();
            }
        });
    }


}