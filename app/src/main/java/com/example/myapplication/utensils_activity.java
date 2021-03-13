package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;


public class utensils_activity extends AppCompatActivity {
    String list="";
    Button cooker_buy_button,hotbox_buy_button,kettle_buy_button,knife_buy_button,mixie_buy_button,pan_buy_button,ricecooker_buy_button,slicer_buy_button,tawa_buy_button,inductionstove_buy_button,save;
    EditText cooker_quantity_button,hotbox_quantity_button,kettle_quantity_button,knife_quantity_button,mixie_quantity_button,pan_quantity_button,ricecooker_quantity_button,slicer_quantity_button,tawa_quantity_button,inductionstove_quantity_button;
    int cooker_quantity_value,hotbox_quantity_value,kettle_quantity_value,knife_quantity_value,mixie_quantity_value,pan_quantity_value,ricecooker_quantity_value,slicer_quantity_value,tawa_quantity_value,inductionstove_quantity_value;
    String cooker,hotbox,kettle,knife,mixie,pan,ricecooker,slicer,tawa,inductionstove;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_utensils_activity);
        cooker_quantity_button = (EditText) findViewById(R.id.cooker_quantity);
        cooker_buy_button = (Button) findViewById(R.id.cooker_buy);
        hotbox_quantity_button = (EditText) findViewById(R.id.hotbox_quantity);
        hotbox_buy_button = (Button) findViewById(R.id.hotbox_buy);
        kettle_quantity_button = (EditText) findViewById(R.id.kettle_quantity);
        kettle_buy_button = (Button) findViewById(R.id.kettle_buy);
        knife_quantity_button = (EditText) findViewById(R.id.knife_quantity);
        knife_buy_button = (Button) findViewById(R.id.knife_buy);
        mixie_quantity_button = (EditText) findViewById(R.id.mixie_quantity);
        mixie_buy_button = (Button) findViewById(R.id.mixie_buy);
        pan_quantity_button = (EditText) findViewById(R.id.pan_quantity);
        pan_buy_button = (Button) findViewById(R.id.pan_buy);
        ricecooker_quantity_button = (EditText) findViewById(R.id.ricecooker_quantity);
        ricecooker_buy_button = (Button) findViewById(R.id.ricecooker_buy);
        slicer_quantity_button = (EditText) findViewById(R.id.slicer_quantity);
        slicer_buy_button = (Button) findViewById(R.id.slicer_buy);
        tawa_quantity_button = (EditText) findViewById(R.id.tawa_quantity);
        tawa_buy_button = (Button) findViewById(R.id.tawa_buy);
        inductionstove_quantity_button = (EditText) findViewById(R.id.inductionstove_quantity);
        inductionstove_buy_button = (Button) findViewById(R.id.inductionstove_buy);
        save=(Button) findViewById(R.id.returnbutton);

        cooker_buy_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                cooker_quantity_value = Integer.valueOf(cooker_quantity_button.getText().toString());
                cooker = "41";
                String toast = String.valueOf(cooker_quantity_value)+" quantity Added";
                Toast.makeText(utensils_activity.this,toast,Toast.LENGTH_SHORT).show();
                list += cooker+"-"+String.valueOf(cooker_quantity_value)+",";
                Log.d("cooker",String.valueOf(cooker_quantity_value));


            }
        });
        hotbox_buy_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                hotbox_quantity_value = Integer.valueOf(hotbox_quantity_button.getText().toString());
                hotbox="42";
                String toast = String.valueOf(hotbox_quantity_value)+" quantity Added";
                Toast.makeText(utensils_activity.this,toast,Toast.LENGTH_SHORT).show();
                list+=hotbox+"-"+String.valueOf(hotbox_quantity_value)+",";
                Log.d("hotbox",String.valueOf(hotbox_quantity_value));
            }
        });
        kettle_buy_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                kettle_quantity_value = Integer.valueOf(kettle_quantity_button.getText().toString());
                kettle="43";
                String toast = String.valueOf(kettle_quantity_value)+" quantity Added";
                Toast.makeText(utensils_activity.this,toast,Toast.LENGTH_SHORT).show();
                list+=kettle+"-"+String.valueOf(kettle_quantity_value)+",";
                Log.d("kettle",String.valueOf(kettle_quantity_value));
            }
        });
        knife_buy_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                knife_quantity_value = Integer.valueOf(knife_quantity_button.getText().toString());
                knife="44";
                String toast = String.valueOf(knife_quantity_value)+" quantity Added";
                Toast.makeText(utensils_activity.this,toast,Toast.LENGTH_SHORT).show();
                list+=knife+"-"+String.valueOf(knife_quantity_value)+",";
                Log.d("knife",String.valueOf(knife_quantity_value));
            }
        });
        mixie_buy_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mixie_quantity_value = Integer.valueOf(mixie_quantity_button.getText().toString());
                mixie="45";
                String toast = String.valueOf(mixie_quantity_value)+" quantity Added";
                Toast.makeText(utensils_activity.this,toast,Toast.LENGTH_SHORT).show();
                list+=mixie+"-"+String.valueOf(mixie_quantity_value)+",";
                Log.d("mixie",String.valueOf(mixie_quantity_value));
            }
        });
        pan_buy_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                pan_quantity_value = Integer.valueOf(pan_quantity_button.getText().toString());
                pan="46";
                String toast = String.valueOf(pan_quantity_value)+" quantity Added";
                Toast.makeText(utensils_activity.this,toast,Toast.LENGTH_SHORT).show();
                list+=pan+"-"+String.valueOf(pan_quantity_value)+",";
                Log.d("pan",String.valueOf(pan_quantity_value));
            }
        });
        ricecooker_buy_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ricecooker_quantity_value = Integer.valueOf(ricecooker_quantity_button.getText().toString());
                ricecooker="47";
                String toast = String.valueOf(ricecooker_quantity_value)+" quantity Added";
                Toast.makeText(utensils_activity.this,toast,Toast.LENGTH_SHORT).show();
                list+=ricecooker+"-"+String.valueOf(ricecooker_quantity_value)+",";
                Log.d("ricecooker",String.valueOf(ricecooker_quantity_value));
            }
        });
        slicer_buy_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                slicer_quantity_value = Integer.valueOf(slicer_quantity_button.getText().toString());
                slicer="48r";
                String toast = String.valueOf(slicer_quantity_value)+" quantity Added";
                Toast.makeText(utensils_activity.this,toast,Toast.LENGTH_SHORT).show();
                list+=slicer+"-"+String.valueOf(slicer_quantity_value)+",";
                Log.d("slicer",String.valueOf(slicer_quantity_value));
            }
        });
        tawa_buy_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tawa_quantity_value = Integer.valueOf(tawa_quantity_button.getText().toString());
                tawa="49";
                String toast = String.valueOf(tawa_quantity_value)+" quantity Added";
                Toast.makeText(utensils_activity.this,toast,Toast.LENGTH_SHORT).show();
                list+=tawa+"-"+String.valueOf(tawa_quantity_value)+",";
                Log.d("tawa",String.valueOf(tawa_quantity_value));
            }
        });
        inductionstove_buy_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                inductionstove_quantity_value = Integer.valueOf(inductionstove_quantity_button.getText().toString());
                inductionstove="50";
                String toast = String.valueOf(inductionstove_quantity_value)+" quantity Added";
                Toast.makeText(utensils_activity.this,toast,Toast.LENGTH_SHORT).show();
                list+=inductionstove+"-"+String.valueOf(inductionstove_quantity_value)+",";
                Log.d("inductionstove",String.valueOf(inductionstove_quantity_value));
            }
        });

        Log.d("logmsg",list);
        Log.d("listlen",String.valueOf(list.length()));
        /*
         */
        save.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SharedPreferences sp = getSharedPreferences("infos",0);
                SharedPreferences.Editor editor = sp.edit();
                editor.putString("utensilslist",list);
                editor.commit();
                finish();
            }
        });



    }

}
