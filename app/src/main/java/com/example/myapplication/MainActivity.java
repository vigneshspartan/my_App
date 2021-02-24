package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.app.AppCompatDelegate;

import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.text.Html;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.Toast;

import java.io.Serializable;
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
    private Button final_check;
    public static String finallist = "";
    //request codes

    @Override
    public void onResume() {
        super.onResume();
        SharedPreferences sp = getSharedPreferences("infos", 0);
        SharedPreferences.Editor ed = sp.edit();
        //ed.commit();
        finallist+= sp.getString("veglist", "");
        //sp.edit().clear().commit();
        ed.remove("veglist").commit();
        finallist+=sp.getString("fruitslist","");
        //sp.edit().clear().commit();
        ed.remove("fruitslist").commit();
        finallist+=sp.getString("chocolatelist","");
        //sp.edit().clear().commit();
        ed.remove("chocolatelist").commit();
        finallist+= sp.getString("dairylist","");
        ed.remove("dairylist").commit();
        //sp.edit().clear().commit();
        finallist+=sp.getString("grocerylist","");
        ed.remove("grocerylist").commit();
        //sp.edit().clear().commit();
        finallist+=sp.getString("utensilslist","");
        ed.remove("utensilslist").commit();
        //sp.edit().clear().commit();
    }   
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
        AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_NO);
        fruitsbutton = (ImageButton) findViewById(R.id.fruitsButton);
        vegetablesbutton = (ImageButton) findViewById(R.id.vegetablesButton);
        chocolatebutton = (ImageButton) findViewById(R.id.chocolateButton);
        dairybutton = (ImageButton) findViewById(R.id.dairyButton);
        utensilsbutton = (ImageButton) findViewById(R.id.utensilsButton);
        grocerybutton = (ImageButton) findViewById(R.id.groceryButton);
        final_check = (Button) findViewById(R.id.final_data_button);
        final_check.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d("data_check", finallist);
                SharedPreferences sp = getSharedPreferences("infos", 0);
                finallist="";
                sp.edit().clear().commit();

            }
        });
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