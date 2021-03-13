package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;


public class vegetables_activity extends AppCompatActivity {
    String list="";
    Button beetroot_buy_button,bitterguard_buy_button,brinjal_buy_button,cabbage_buy_button,carrot_buy_button,ladiesfinger_buy_button,onion_buy_button,potato_buy_button,raddish_buy_button,tomato_buy_button,save;
    EditText beetroot_quantity_button,bitterguard_quantity_button,brinjal_quantity_button,cabbage_quantity_button,carrot_quantity_button,ladiesfinger_quantity_button,onion_quantity_button,potato_quantity_button,raddish_quantity_button,tomato_quantity_button;
    int beetroot_quantity_value,bitterguard_quantity_value,brinjal_quantity_value,cabbage_quantity_value,carrot_quantity_value,ladiesfinger_quantity_value,onion_quantity_value,potato_quantity_value,raddish_quantity_value,tomato_quantity_value;
    String beetroot,bitterguard,brinjal,cabbage,carrot,ladiesfinger,onion,potato,raddish,tomato;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vegetables_activity);
        beetroot_quantity_button = (EditText) findViewById(R.id.beetroot_quantity);
        beetroot_buy_button = (Button) findViewById(R.id.beetroot_buy);
        bitterguard_quantity_button = (EditText) findViewById(R.id.bitterguard_quantity);
        bitterguard_buy_button = (Button) findViewById(R.id.bitterguard_buy);
        brinjal_quantity_button = (EditText) findViewById(R.id.brinjal_quantity);
        brinjal_buy_button = (Button) findViewById(R.id.brinjal_buy);
        cabbage_quantity_button = (EditText) findViewById(R.id.cabbage_quantity);
        cabbage_buy_button = (Button) findViewById(R.id.cabbage_buy);
        carrot_quantity_button = (EditText) findViewById(R.id.carrot_quantity);
        carrot_buy_button = (Button) findViewById(R.id.carrot_buy);
        ladiesfinger_quantity_button = (EditText) findViewById(R.id.ladiesfinger_quantity);
        ladiesfinger_buy_button = (Button) findViewById(R.id.ladiesfinger_buy);
        onion_quantity_button = (EditText) findViewById(R.id.onion_quantity);
        onion_buy_button = (Button) findViewById(R.id.onion_buy);
        potato_quantity_button = (EditText) findViewById(R.id.potato_quantity);
        potato_buy_button = (Button) findViewById(R.id.potato_buy);
        raddish_quantity_button = (EditText) findViewById(R.id.raddish_quantity);
        raddish_buy_button = (Button) findViewById(R.id.raddish_buy);
        tomato_quantity_button = (EditText) findViewById(R.id.tomato_quantity);
        tomato_buy_button = (Button) findViewById(R.id.tomato_buy);
        save=(Button) findViewById(R.id.returnbutton);

        beetroot_buy_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                beetroot_quantity_value = Integer.valueOf(beetroot_quantity_button.getText().toString());
                beetroot = "11";
                String toast = String.valueOf(beetroot_quantity_value)+" quantity Added";
                Toast.makeText(vegetables_activity.this,toast,Toast.LENGTH_SHORT).show();
                list += beetroot+"-"+String.valueOf(beetroot_quantity_value)+",";
                Log.d("beetroot",String.valueOf(beetroot_quantity_value));


            }
        });
        bitterguard_buy_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                bitterguard_quantity_value = Integer.valueOf(bitterguard_quantity_button.getText().toString());
                bitterguard="12";
                String toast = String.valueOf(bitterguard_quantity_value)+" quantity Added";
                Toast.makeText(vegetables_activity.this,toast,Toast.LENGTH_SHORT).show();
                list+=bitterguard+"-"+String.valueOf(bitterguard_quantity_value)+",";
                Log.d("bitterguard",String.valueOf(bitterguard_quantity_value));
            }
        });
        brinjal_buy_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                brinjal_quantity_value = Integer.valueOf(brinjal_quantity_button.getText().toString());
                brinjal="13";
                String toast = String.valueOf(brinjal_quantity_value)+" quantity Added";
                Toast.makeText(vegetables_activity.this,toast,Toast.LENGTH_SHORT).show();
                list+=brinjal+"-"+String.valueOf(brinjal_quantity_value)+",";
                Log.d("brinjal",String.valueOf(brinjal_quantity_value));
            }
        });
        cabbage_buy_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                cabbage_quantity_value = Integer.valueOf(cabbage_quantity_button.getText().toString());
                cabbage="14";
                String toast = String.valueOf(cabbage_quantity_value)+" quantity Added";
                Toast.makeText(vegetables_activity.this,toast,Toast.LENGTH_SHORT).show();
                list+=cabbage+"-"+String.valueOf(cabbage_quantity_value)+",";
                Log.d("cabbage",String.valueOf(cabbage_quantity_value));
            }
        });
        carrot_buy_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                carrot_quantity_value = Integer.valueOf(carrot_quantity_button.getText().toString());
                carrot="15";
                String toast = String.valueOf(carrot_quantity_value)+" quantity Added";
                Toast.makeText(vegetables_activity.this,toast,Toast.LENGTH_SHORT).show();
                list+=carrot+"-"+String.valueOf(carrot_quantity_value)+",";
                Log.d("carrot",String.valueOf(carrot_quantity_value));
            }
        });
        ladiesfinger_buy_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ladiesfinger_quantity_value = Integer.valueOf(ladiesfinger_quantity_button.getText().toString());
                ladiesfinger="16";
                String toast = String.valueOf(ladiesfinger_quantity_value)+" quantity Added";
                Toast.makeText(vegetables_activity.this,toast,Toast.LENGTH_SHORT).show();
                list+=ladiesfinger+"-"+String.valueOf(ladiesfinger_quantity_value)+",";
                Log.d("ladiesfinger",String.valueOf(ladiesfinger_quantity_value));
            }
        });
        onion_buy_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onion_quantity_value = Integer.valueOf(onion_quantity_button.getText().toString());
                onion="17";
                String toast = String.valueOf(onion_quantity_value)+" quantity Added";
                Toast.makeText(vegetables_activity.this,toast,Toast.LENGTH_SHORT).show();
                list+=onion+"-"+String.valueOf(onion_quantity_value)+",";
                Log.d("onion",String.valueOf(onion_quantity_value));
            }
        });
        potato_buy_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                potato_quantity_value = Integer.valueOf(potato_quantity_button.getText().toString());
                potato="18";
                String toast = String.valueOf(potato_quantity_value)+" quantity Added";
                Toast.makeText(vegetables_activity.this,toast,Toast.LENGTH_SHORT).show();
                list+=potato+"-"+String.valueOf(potato_quantity_value)+",";
                Log.d("potato",String.valueOf(potato_quantity_value));
            }
        });
        raddish_buy_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                raddish_quantity_value = Integer.valueOf(raddish_quantity_button.getText().toString());
                raddish="19";
                String toast = String.valueOf(raddish_quantity_value)+" quantity Added";
                Toast.makeText(vegetables_activity.this,toast,Toast.LENGTH_SHORT).show();
                list+=raddish+"-"+String.valueOf(raddish_quantity_value)+",";
                Log.d("raddish",String.valueOf(raddish_quantity_value));
            }
        });
        tomato_buy_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tomato_quantity_value = Integer.valueOf(tomato_quantity_button.getText().toString());
                tomato="20";
                String toast = String.valueOf(tomato_quantity_value)+" quantity Added";
                Toast.makeText(vegetables_activity.this,toast,Toast.LENGTH_SHORT).show();
                list+=tomato+"-"+String.valueOf(tomato_quantity_value)+",";
                Log.d("tomato",String.valueOf(tomato_quantity_value));
            }
        });

        /*
        */
        save.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Log.d("logmsg1",list);
                SharedPreferences sp = getSharedPreferences("infos",0);
                SharedPreferences.Editor editor = sp.edit();
                editor.putString("veglist",list);
                editor.commit();
                finish();

                }
        });




    }

}
