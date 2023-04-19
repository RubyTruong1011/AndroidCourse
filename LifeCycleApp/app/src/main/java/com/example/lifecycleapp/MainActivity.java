package com.example.lifecycleapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

      @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//        Static Work: Creating the views, binding data ...
        Toast.makeText(this, "OnCreate() is called", Toast.LENGTH_LONG).show();
    }

    @Override
    protected void onStart() {
        super.onStart();
        Toast.makeText(this, "OnStart() is called", Toast.LENGTH_LONG).show();
    }

    @Override
    protected void onResume() {
        super.onResume();
        Toast.makeText(this, "OnResume() is called", Toast.LENGTH_LONG).show();
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Toast.makeText(this, "onRestart() is called", Toast.LENGTH_LONG).show();
      }

    @Override
    protected void onPause() {
        super.onPause();
        Toast.makeText(this, "onPause() is called", Toast.LENGTH_LONG).show();
      }

    @Override
    protected void onStop() {
        super.onStop();
        Toast.makeText(this, "onStop() is called", Toast.LENGTH_LONG).show();
      }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Toast.makeText(this, "onStop() is called", Toast.LENGTH_LONG).show();
      }
}
