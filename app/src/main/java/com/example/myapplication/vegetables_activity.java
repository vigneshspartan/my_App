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
    String beetroot_quantity_value,bitterguard_quantity_value,brinjal_quantity_value,cabbage_quantity_value,carrot_quantity_value,ladiesfinger_quantity_value,onion_quantity_value,potato_quantity_value,raddish_quantity_value,tomato_quantity_value;
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
                beetroot_quantity_value = String.valueOf(beetroot_quantity_button.getText().toString());
                if (beetroot_quantity_value.length()!=0) {
                    beetroot = "beetroot";
                    String toast = String.valueOf(beetroot_quantity_value) + " quantity Added";
                    Toast.makeText(vegetables_activity.this, toast, Toast.LENGTH_SHORT).show();
                    list += beetroot + "-" + String.valueOf(beetroot_quantity_value) + ",";
                    Log.d("beetroot", String.valueOf(beetroot_quantity_value));

                }
                else
                {
                    Toast.makeText(vegetables_activity.this,"Please Enter Valid Quantity",Toast.LENGTH_SHORT).show();
                }
            }
        });
        bitterguard_buy_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                bitterguard_quantity_value = String.valueOf(bitterguard_quantity_button.getText().toString());
                if (bitterguard_quantity_value.length()!=0) {
                    bitterguard = "bitterguard";
                    String toast = String.valueOf(bitterguard_quantity_value) + " quantity Added";
                    Toast.makeText(vegetables_activity.this, toast, Toast.LENGTH_SHORT).show();
                    list += bitterguard + "-" + String.valueOf(bitterguard_quantity_value) + ",";
                    Log.d("bitterguard", String.valueOf(bitterguard_quantity_value));
                }
                else
                {
                    Toast.makeText(vegetables_activity.this,"Please Enter Valid Quantity",Toast.LENGTH_SHORT).show();
                }
            }
        });
        brinjal_buy_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                brinjal_quantity_value = String.valueOf(brinjal_quantity_button.getText().toString());
                if (brinjal_quantity_value.length()!=0) {
                    brinjal = "brinjal";
                    String toast = String.valueOf(brinjal_quantity_value) + " quantity Added";
                    Toast.makeText(vegetables_activity.this, toast, Toast.LENGTH_SHORT).show();
                    list += brinjal + "-" + String.valueOf(brinjal_quantity_value) + ",";
                    Log.d("brinjal", String.valueOf(brinjal_quantity_value));
                }
                else
                {
                    Toast.makeText(vegetables_activity.this,"Please Enter Valid Quantity",Toast.LENGTH_SHORT).show();
                }
            }
        });
        cabbage_buy_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                cabbage_quantity_value = String.valueOf(cabbage_quantity_button.getText().toString());
                if (cabbage_quantity_value.length()!=0) {
                    cabbage = "cabbage";
                    String toast = String.valueOf(cabbage_quantity_value) + " quantity Added";
                    Toast.makeText(vegetables_activity.this, toast, Toast.LENGTH_SHORT).show();
                    list += cabbage + "-" + String.valueOf(cabbage_quantity_value) + ",";
                    Log.d("cabbage", String.valueOf(cabbage_quantity_value));
                }
                else
                {
                    Toast.makeText(vegetables_activity.this,"Please Enter Valid Quantity",Toast.LENGTH_SHORT).show();
                }
            }
        });
        carrot_buy_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                carrot_quantity_value = String.valueOf(carrot_quantity_button.getText().toString());
                if (carrot_quantity_value.length()!=0) {
                    carrot = "carrot";
                    String toast = String.valueOf(carrot_quantity_value) + " quantity Added";
                    Toast.makeText(vegetables_activity.this, toast, Toast.LENGTH_SHORT).show();
                    list += carrot + "-" + String.valueOf(carrot_quantity_value) + ",";
                    Log.d("carrot", String.valueOf(carrot_quantity_value));
                }
                else
                {
                    Toast.makeText(vegetables_activity.this,"Please Enter Valid Quantity",Toast.LENGTH_SHORT).show();
                }
            }
        });
        ladiesfinger_buy_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ladiesfinger_quantity_value = String.valueOf(ladiesfinger_quantity_button.getText().toString());
                if (ladiesfinger_quantity_value.length()!=0) {
                    ladiesfinger = "ladiesfinger";
                    String toast = String.valueOf(ladiesfinger_quantity_value) + " quantity Added";
                    Toast.makeText(vegetables_activity.this, toast, Toast.LENGTH_SHORT).show();
                    list += ladiesfinger + "-" + String.valueOf(ladiesfinger_quantity_value) + ",";
                    Log.d("ladiesfinger", String.valueOf(ladiesfinger_quantity_value));
                }
                else
                {
                    Toast.makeText(vegetables_activity.this,"Please Enter Valid Quantity",Toast.LENGTH_SHORT).show();
                }
            }
        });
        onion_buy_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onion_quantity_value = String.valueOf(onion_quantity_button.getText().toString());
                if (onion_quantity_value.length()!=0) {
                    onion = "onion";
                    String toast = String.valueOf(onion_quantity_value) + " quantity Added";
                    Toast.makeText(vegetables_activity.this, toast, Toast.LENGTH_SHORT).show();
                    list += onion + "-" + String.valueOf(onion_quantity_value) + ",";
                    Log.d("onion", String.valueOf(onion_quantity_value));
                }
                else
                {
                    Toast.makeText(vegetables_activity.this,"Please Enter Valid Quantity",Toast.LENGTH_SHORT).show();
                }
            }
        });
        potato_buy_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                potato_quantity_value = String.valueOf(potato_quantity_button.getText().toString());
                if (potato_quantity_value.length()!=0) {
                    potato = "potato";
                    String toast = String.valueOf(potato_quantity_value) + " quantity Added";
                    Toast.makeText(vegetables_activity.this, toast, Toast.LENGTH_SHORT).show();
                    list += potato + "-" + String.valueOf(potato_quantity_value) + ",";
                    Log.d("potato", String.valueOf(potato_quantity_value));
                }
                else
                {
                    Toast.makeText(vegetables_activity.this,"Please Enter Valid Quantity",Toast.LENGTH_SHORT).show();
                }
            }
        });
        raddish_buy_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                raddish_quantity_value = String.valueOf(raddish_quantity_button.getText().toString());
                if (raddish_quantity_value.length()!=0) {
                    raddish = "raddish";
                    String toast = String.valueOf(raddish_quantity_value) + " quantity Added";
                    Toast.makeText(vegetables_activity.this, toast, Toast.LENGTH_SHORT).show();
                    list += raddish + "-" + String.valueOf(raddish_quantity_value) + ",";
                    Log.d("raddish", String.valueOf(raddish_quantity_value));
                }
                else
                {
                    Toast.makeText(vegetables_activity.this,"Please Enter Valid Quantity",Toast.LENGTH_SHORT).show();
                }
            }
        });
        tomato_buy_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tomato_quantity_value = String.valueOf(tomato_quantity_button.getText().toString());
                if (tomato_quantity_value.length()!=0) {
                    tomato = "tomato";
                    String toast = String.valueOf(tomato_quantity_value) + " quantity Added";
                    Toast.makeText(vegetables_activity.this, toast, Toast.LENGTH_SHORT).show();
                    list += tomato + "-" + String.valueOf(tomato_quantity_value) + ",";
                    Log.d("tomato", String.valueOf(tomato_quantity_value));
                }
                else
                {
                    Toast.makeText(vegetables_activity.this,"Please Enter Valid Quantity",Toast.LENGTH_SHORT).show();
                }
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
