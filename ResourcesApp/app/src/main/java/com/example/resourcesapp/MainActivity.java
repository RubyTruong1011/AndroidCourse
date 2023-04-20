package com.example.resourcesapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.res.Resources;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);}

////        Kotlin: colors
//        val color : Int = resources.getColor(R.color.purple_700);
//
////        Java: colors
//        Resources res = getResources();
//        int color_purple = res.getColor(R.color.purple_700);

//            Java
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.my_menu, menu);
        return true;
    }

//    Kotlin
//    override fun onCreateOptionsMenu(menu:Menu): Boolean{
//        menuInflater.inflate(R.menu.my_menu, menu)
//                return true;
//    }

}