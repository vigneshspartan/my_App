package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.text.Html;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.Toast;

import java.time.Duration;
import java.util.ArrayList;
import java.util.HashMap;

public class MainActivity extends AppCompatActivity {
    private ImageButton fruitsbutton;
    private ImageButton vegetablesbutton;
    private ImageButton chocolatebutton;
    private ImageButton dairybutton;
    private ImageButton utensilsbutton;
    private ImageButton grocerybutton;

    //request codes
    private static final int second_activity_request_code = 0;

    HashMap <Integer,String> hashmap = new HashMap<Integer,String>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
        fruitsbutton = (ImageButton) findViewById(R.id.fruitsButton);
        vegetablesbutton = (ImageButton) findViewById(R.id.vegetablesButton);
        chocolatebutton = (ImageButton) findViewById(R.id.chocolateButton);
        dairybutton = (ImageButton) findViewById(R.id.dairyButton);
        utensilsbutton = (ImageButton) findViewById(R.id.utensilsButton);
        grocerybutton = (ImageButton) findViewById(R.id.groceryButton);


        fruitsbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myintent = new Intent(MainActivity.this,fruits_activity.class);
                startActivity(myintent);
            }
        });
        vegetablesbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myintent = new Intent(MainActivity.this,vegetables_activity.class);
                startActivity(myintent);


            }
        });


        chocolatebutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myintent = new Intent(MainActivity.this,chocolate_activity.class);
                startActivity(myintent);
            }
        });
        dairybutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myintent = new Intent(MainActivity.this,dairy_activity.class);
                startActivity(myintent);
            }
        });
        grocerybutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myintent = new Intent(MainActivity.this,grocery_activity.class);
                startActivity(myintent);
            }
        });
        utensilsbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myintent = new Intent(MainActivity.this,utensils_activity.class);
                startActivity(myintent);
            }
        });

    }
}