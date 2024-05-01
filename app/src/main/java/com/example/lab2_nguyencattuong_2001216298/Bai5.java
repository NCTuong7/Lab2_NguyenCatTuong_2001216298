package com.example.lab2_nguyencattuong_2001216298;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Bai5 extends AppCompatActivity {
Button btnLogin5a;
EditText edtUName5a, edtPass5a;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bai5);
        addControl();
        addEvent();
    }
    void addControl()
    {
        btnLogin5a = (Button) findViewById(R.id.btnLogin5a);
        edtUName5a = (EditText) findViewById(R.id.edtUName5a);
        edtPass5a = (EditText) findViewById(R.id.edtPass5a);
    }

    void addEvent()
    {
        btnLogin5a.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),Bai5b.class);
                startActivity(intent);
                Toast.makeText(getApplicationContext(), "Mở bài 5b thành công", Toast.LENGTH_SHORT).show();
            }
        });
    }

}