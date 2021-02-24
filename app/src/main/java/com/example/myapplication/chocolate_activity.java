package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;


public class chocolate_activity extends AppCompatActivity {
    String list="";
    Button dairy_milk_buy_button,dark_chocolate_buy_button,dark_fantasy_buy_button,five_star_buy_button,kitkat_buy_button,lotte_choco_pie_buy_button,milky_bar_buy_button,munch_buy_button,perk_buy_button,snickers_buy_button,save;
    EditText dairy_milk_quantity_button,dark_chocolate_quantity_button,dark_fantasy_quantity_button,five_star_quantity_button,kitkat_quantity_button,lotte_choco_pie_quantity_button,milky_bar_quantity_button,munch_quantity_button,perk_quantity_button,snickers_quantity_button;
    int dairy_milk_quantity_value,dark_chocolate_quantity_value,dark_fantasy_quantity_value,five_star_quantity_value,kitkat_quantity_value,lotte_choco_pie_quantity_value,milky_bar_quantity_value,munch_quantity_value,perk_quantity_value,snickers_quantity_value;
    String dairy_milk,dark_chocolate,dark_fantasy,five_star,kitkat,lotte_choco_pie,milky_bar,munch,perk,snickers;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chocolate_activity);
        dairy_milk_quantity_button = (EditText) findViewById(R.id.dairy_milk_quantity);
        dairy_milk_buy_button = (Button) findViewById(R.id.dairy_milk_buy);
        dark_chocolate_quantity_button = (EditText) findViewById(R.id.dark_chocolate_quantity);
        dark_chocolate_buy_button = (Button) findViewById(R.id.dark_chocolate_buy);
        dark_fantasy_quantity_button = (EditText) findViewById(R.id.dark_fantasy_quantity);
        dark_fantasy_buy_button = (Button) findViewById(R.id.dark_fantasy_buy);
        five_star_quantity_button = (EditText) findViewById(R.id.five_star_quantity);
        five_star_buy_button = (Button) findViewById(R.id.five_star_buy);
        kitkat_quantity_button = (EditText) findViewById(R.id.kitkat_quantity);
        kitkat_buy_button = (Button) findViewById(R.id.kitkat_buy);
        lotte_choco_pie_quantity_button = (EditText) findViewById(R.id.lotte_choco_pie_quantity);
        lotte_choco_pie_buy_button = (Button) findViewById(R.id.lotte_choco_pie_buy);
        milky_bar_quantity_button = (EditText) findViewById(R.id.milky_bar_quantity);
        milky_bar_buy_button = (Button) findViewById(R.id.milky_bar_buy);
        munch_quantity_button = (EditText) findViewById(R.id.munch_quantity);
        munch_buy_button = (Button) findViewById(R.id.munch_buy);
        perk_quantity_button = (EditText) findViewById(R.id.perk_quantity);
        perk_buy_button = (Button) findViewById(R.id.perk_buy);
        snickers_quantity_button = (EditText) findViewById(R.id.snickers_quantity);
        snickers_buy_button = (Button) findViewById(R.id.snickers_buy);
        save=(Button) findViewById(R.id.returnbutton);

        dairy_milk_buy_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dairy_milk_quantity_value = Integer.valueOf(dairy_milk_quantity_button.getText().toString());
                dairy_milk = "dairy_milk";
                String toast = String.valueOf(dairy_milk_quantity_value)+" quantity Added";
                Toast.makeText(chocolate_activity.this,toast,Toast.LENGTH_SHORT).show();
                list += dairy_milk+"-"+String.valueOf(dairy_milk_quantity_value)+",";
                Log.d("dairy_milk",String.valueOf(dairy_milk_quantity_value));


            }
        });
        dark_chocolate_buy_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dark_chocolate_quantity_value = Integer.valueOf(dark_chocolate_quantity_button.getText().toString());
                dark_chocolate="dark_chocolate";
                String toast = String.valueOf(dark_chocolate_quantity_value)+" quantity Added";
                Toast.makeText(chocolate_activity.this,toast,Toast.LENGTH_SHORT).show();
                list+=dark_chocolate+"-"+String.valueOf(dark_chocolate_quantity_value)+",";
                Log.d("dark_chocolate",String.valueOf(dark_chocolate_quantity_value));
            }
        });
        dark_fantasy_buy_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dark_fantasy_quantity_value = Integer.valueOf(dark_fantasy_quantity_button.getText().toString());
                dark_fantasy="dark_fantasy";
                String toast = String.valueOf(dark_fantasy_quantity_value)+" quantity Added";
                Toast.makeText(chocolate_activity.this,toast,Toast.LENGTH_SHORT).show();
                list+=dark_fantasy+"-"+String.valueOf(dark_fantasy_quantity_value)+",";
                Log.d("dark_fantasy",String.valueOf(dark_fantasy_quantity_value));
            }
        });
        five_star_buy_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                five_star_quantity_value = Integer.valueOf(five_star_quantity_button.getText().toString());
                five_star="five_star";
                String toast = String.valueOf(five_star_quantity_value)+" quantity Added";
                Toast.makeText(chocolate_activity.this,toast,Toast.LENGTH_SHORT).show();
                list+=five_star+"-"+String.valueOf(five_star_quantity_value)+",";
                Log.d("five_star",String.valueOf(five_star_quantity_value));
            }
        });
        kitkat_buy_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                kitkat_quantity_value = Integer.valueOf(kitkat_quantity_button.getText().toString());
                kitkat="kitkat";
                String toast = String.valueOf(kitkat_quantity_value)+" quantity Added";
                Toast.makeText(chocolate_activity.this,toast,Toast.LENGTH_SHORT).show();
                list+=kitkat+"-"+String.valueOf(kitkat_quantity_value)+",";
                Log.d("kitkat",String.valueOf(kitkat_quantity_value));
            }
        });
        lotte_choco_pie_buy_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                lotte_choco_pie_quantity_value = Integer.valueOf(lotte_choco_pie_quantity_button.getText().toString());
                lotte_choco_pie="lotte_choco_pie";
                String toast = String.valueOf(lotte_choco_pie_quantity_value)+" quantity Added";
                Toast.makeText(chocolate_activity.this,toast,Toast.LENGTH_SHORT).show();
                list+=lotte_choco_pie+"-"+String.valueOf(lotte_choco_pie_quantity_value)+",";
                Log.d("lotte_choco_pie",String.valueOf(lotte_choco_pie_quantity_value));
            }
        });
        milky_bar_buy_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                milky_bar_quantity_value = Integer.valueOf(milky_bar_quantity_button.getText().toString());
                milky_bar="milky_bar";
                String toast = String.valueOf(milky_bar_quantity_value)+" quantity Added";
                Toast.makeText(chocolate_activity.this,toast,Toast.LENGTH_SHORT).show();
                list+=milky_bar+"-"+String.valueOf(milky_bar_quantity_value)+",";
                Log.d("milky_bar",String.valueOf(milky_bar_quantity_value));
            }
        });
        munch_buy_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                munch_quantity_value = Integer.valueOf(munch_quantity_button.getText().toString());
                munch="munch";
                String toast = String.valueOf(munch_quantity_value)+" quantity Added";
                Toast.makeText(chocolate_activity.this,toast,Toast.LENGTH_SHORT).show();
                list+=munch+"-"+String.valueOf(munch_quantity_value)+",";
                Log.d("munch",String.valueOf(munch_quantity_value));
            }
        });
        perk_buy_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                perk_quantity_value = Integer.valueOf(perk_quantity_button.getText().toString());
                perk="perk";
                String toast = String.valueOf(perk_quantity_value)+" quantity Added";
                Toast.makeText(chocolate_activity.this,toast,Toast.LENGTH_SHORT).show();
                list+=perk+"-"+String.valueOf(perk_quantity_value)+",";
                Log.d("perk",String.valueOf(perk_quantity_value));
            }
        });
        snickers_buy_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                snickers_quantity_value = Integer.valueOf(snickers_quantity_button.getText().toString());
                snickers="snickers";
                String toast = String.valueOf(snickers_quantity_value)+" quantity Added";
                Toast.makeText(chocolate_activity.this,toast,Toast.LENGTH_SHORT).show();
                list+=snickers+"-"+String.valueOf(snickers_quantity_value)+",";
                Log.d("snickers",String.valueOf(snickers_quantity_value));
            }
        });

        Log.d("logmsg",list);
        Log.d("listlen",String.valueOf(list.length()));
        /*
         */
        save.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int len=list.length();
                list = list.substring(0,len-1);
                SharedPreferences sp = getSharedPreferences("infos",0);
                SharedPreferences.Editor editor = sp.edit();
                editor.putString("chocolatelist",list);
                editor.commit();
                finish();
            }
        });



    }

}
