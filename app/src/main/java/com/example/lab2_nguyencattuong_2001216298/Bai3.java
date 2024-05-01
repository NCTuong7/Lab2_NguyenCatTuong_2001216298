package com.example.lab2_nguyencattuong_2001216298;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Bai3 extends AppCompatActivity {
Button btnLoginacc;
EditText edtUname1, edtPass1;
    @Override
    protected void onPause() {
        super.onPause();
        SharedPreferences sharedPreferences  = getPreferences(MODE_PRIVATE);
        SharedPreferences.Editor  editor = sharedPreferences.edit();
        String uname1 = edtUname1.getText().toString();
        String pass1 = edtPass1.getText().toString();

        editor.putString("uname1",uname1);
        editor.putString("pass1",pass1);
        editor.commit();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bai3);
        addConTrol();
        addEvent();

    }
    void addConTrol()
    {
        btnLoginacc = (Button) findViewById(R.id.btnLoginacc);
        edtUname1 = (EditText) findViewById(R.id.edtUname1);
        edtPass1 = (EditText) findViewById(R.id.edtPass1);

    }
    void addEvent()
    {
        btnLoginacc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), Bai3b.class);
                startActivity(intent);
                Toast.makeText(getApplicationContext(), "Đã mở trang đăng ký", Toast.LENGTH_SHORT).show();
            }
        });
    }


}