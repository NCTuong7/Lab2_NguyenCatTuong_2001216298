package com.example.lab2_nguyencattuong_2001216298;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Bai2 extends AppCompatActivity {
Button btnLogin;
EditText edtUName, edtPass;

    @Override
    protected void onPause() {
        super.onPause();
        SharedPreferences sharedPreferences = getPreferences(MODE_PRIVATE);
        SharedPreferences.Editor  editor = sharedPreferences.edit();
        String UName  = edtUName.getText().toString();
        String Pass = edtPass.getText().toString();
        editor.putString("UName", UName);
        editor.putString("Pass",Pass);
        editor.commit();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bai2);
        Intent intent = getIntent();
        addConTrol();
        addEvent();

        // Lấy dữ liệu từ ShareReference
        SharedPreferences sharedPreferences = getPreferences(MODE_PRIVATE);
        edtUName.setText(sharedPreferences.getString("UName",null));
        edtPass.setText(sharedPreferences.getString("Pass",null));

    }
    void addConTrol()
    {
        btnLogin = (Button) findViewById(R.id.btnLogin);
        edtUName  = (EditText) findViewById(R.id.edtUName);
        edtPass = (EditText) findViewById(R.id.edtPass);
    }
    void addEvent()
    {
        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "Login thành công", Toast.LENGTH_LONG).show();
            }
        });
    }


}