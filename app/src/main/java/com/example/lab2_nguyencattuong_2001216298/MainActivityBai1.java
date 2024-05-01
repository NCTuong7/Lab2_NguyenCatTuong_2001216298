package com.example.lab2_nguyencattuong_2001216298;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

public class MainActivityBai1 extends AppCompatActivity {

    String tag = "Event";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_bai1);
        Log.d(tag,"In the onCreate() event");
        Toast.makeText(getApplicationContext(), "onCreate", Toast.LENGTH_SHORT).show();



    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d(tag, "In on Start() event");
        Toast.makeText(getApplicationContext(), "onStart", Toast.LENGTH_SHORT).show();

    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d(tag, "In the onPause() event");
        Toast.makeText(getApplicationContext(), "onPause", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d(tag,"In the onResume()event");
        Toast.makeText(getApplicationContext(), "onResume", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d(tag,"In ReStart() event");
        Toast.makeText(getApplicationContext(), "onReStart", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d(tag,"In the onStop() event");
        Toast.makeText(getApplicationContext(), "onStop", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d(tag, "In the onDestroy() event");
        Toast.makeText(getApplicationContext(), "onDestroy", Toast.LENGTH_SHORT).show();
    }
}