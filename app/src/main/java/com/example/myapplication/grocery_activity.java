package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;


public class grocery_activity extends AppCompatActivity {
    String list="";
    Button chilli_powder_buy_button,orid_dhal_buy_button,peanut_buy_button,pepper_buy_button,rice_buy_button,salt_buy_button,sunflower_oil_buy_button,toor_dhal_buy_button,turmeric_buy_button,wheat_buy_button,save;
    EditText chilli_powder_quantity_button,orid_dhal_quantity_button,peanut_quantity_button,pepper_quantity_button,rice_quantity_button,salt_quantity_button,sunflower_oil_quantity_button,toor_dhal_quantity_button,turmeric_quantity_button,wheat_quantity_button;
    String chilli_powder_quantity_value,orid_dhal_quantity_value,peanut_quantity_value,pepper_quantity_value,rice_quantity_value,salt_quantity_value,sunflower_oil_quantity_value,toor_dhal_quantity_value,turmeric_quantity_value,wheat_quantity_value;
    String chilli_powder,orid_dhal,peanut,pepper,rice,salt,sunflower_oil,toor_dhal,turmeric,wheat;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_grocery_activity);
        chilli_powder_quantity_button = (EditText) findViewById(R.id.chilli_powder_quantity);
        chilli_powder_buy_button = (Button) findViewById(R.id.chilli_powder_buy);
        orid_dhal_quantity_button = (EditText) findViewById(R.id.orid_dhal_quantity);
        orid_dhal_buy_button = (Button) findViewById(R.id.orid_dhal_buy);
        peanut_quantity_button = (EditText) findViewById(R.id.peanut_quantity);
        peanut_buy_button = (Button) findViewById(R.id.peanut_buy);
        pepper_quantity_button = (EditText) findViewById(R.id.pepper_quantity);
        pepper_buy_button = (Button) findViewById(R.id.pepper_buy);
        rice_quantity_button = (EditText) findViewById(R.id.rice_quantity);
        rice_buy_button = (Button) findViewById(R.id.rice_buy);
        salt_quantity_button = (EditText) findViewById(R.id.salt_quantity);
        salt_buy_button = (Button) findViewById(R.id.salt_buy);
        sunflower_oil_quantity_button = (EditText) findViewById(R.id.sunflower_oil_quantity);
        sunflower_oil_buy_button = (Button) findViewById(R.id.sunflower_oil_buy);
        toor_dhal_quantity_button = (EditText) findViewById(R.id.toor_dhal_quantity);
        toor_dhal_buy_button = (Button) findViewById(R.id.toor_dhal_buy);
        turmeric_quantity_button = (EditText) findViewById(R.id.turmeric_quantity);
        turmeric_buy_button = (Button) findViewById(R.id.turmeric_buy);
        wheat_quantity_button = (EditText) findViewById(R.id.wheat_quantity);
        wheat_buy_button = (Button) findViewById(R.id.wheat_buy);
        save=(Button) findViewById(R.id.returnbutton);

        chilli_powder_buy_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                chilli_powder_quantity_value = String.valueOf(chilli_powder_quantity_button.getText().toString());
                if (chilli_powder_quantity_value.length()!=0) {
                    chilli_powder = "chilli_powder";
                    String toast = String.valueOf(chilli_powder_quantity_value) + " quantity Added";
                    Toast.makeText(grocery_activity.this, toast, Toast.LENGTH_SHORT).show();
                    list += chilli_powder + "-" + String.valueOf(chilli_powder_quantity_value) + ",";
                    Log.d("chilli_powder", String.valueOf(chilli_powder_quantity_value));
                }
                else
                {
                    Toast.makeText(grocery_activity.this,"Please Enter Valid Quantity",Toast.LENGTH_SHORT).show();
                }

            }
        });
        orid_dhal_buy_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                orid_dhal_quantity_value = String.valueOf(orid_dhal_quantity_button.getText().toString());
                if (orid_dhal_quantity_value.length()!=0) {
                    orid_dhal = "orid_dhal";
                    String toast = String.valueOf(orid_dhal_quantity_value) + " quantity Added";
                    Toast.makeText(grocery_activity.this, toast, Toast.LENGTH_SHORT).show();
                    list += orid_dhal + "-" + String.valueOf(orid_dhal_quantity_value) + ",";
                    Log.d("orid_dhal", String.valueOf(orid_dhal_quantity_value));
                }
                else
                {
                    Toast.makeText(grocery_activity.this,"Please Enter Valid Quantity",Toast.LENGTH_SHORT).show();
                }
            }
        });
        peanut_buy_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                peanut_quantity_value = String.valueOf(peanut_quantity_button.getText().toString());
                if (peanut_quantity_value.length()!=0) {
                    peanut = "peanut";
                    String toast = String.valueOf(peanut_quantity_value) + " quantity Added";
                    Toast.makeText(grocery_activity.this, toast, Toast.LENGTH_SHORT).show();
                    list += peanut + "-" + String.valueOf(peanut_quantity_value) + ",";
                    Log.d("peanut", String.valueOf(peanut_quantity_value));
                }
                else
                {
                    Toast.makeText(grocery_activity.this,"Please Enter Valid Quantity",Toast.LENGTH_SHORT).show();
                }
            }
        });
        pepper_buy_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                pepper_quantity_value = String.valueOf(pepper_quantity_button.getText().toString());
                if (pepper_quantity_value.length()!=0) {
                    pepper = "pepper";
                    String toast = String.valueOf(pepper_quantity_value) + " quantity Added";
                    Toast.makeText(grocery_activity.this, toast, Toast.LENGTH_SHORT).show();
                    list += pepper + "-" + String.valueOf(pepper_quantity_value) + ",";
                    Log.d("pepper", String.valueOf(pepper_quantity_value));
                }
                else
                {
                    Toast.makeText(grocery_activity.this,"Please Enter Valid Quantity",Toast.LENGTH_SHORT).show();
                }
            }
        });
        rice_buy_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                rice_quantity_value = String.valueOf(rice_quantity_button.getText().toString());
                if (rice_quantity_value.length()!=0) {
                    rice = "rice";
                    String toast = String.valueOf(rice_quantity_value) + " quantity Added";
                    Toast.makeText(grocery_activity.this, toast, Toast.LENGTH_SHORT).show();
                    list += rice + "-" + String.valueOf(rice_quantity_value) + ",";
                    Log.d("rice", String.valueOf(rice_quantity_value));
                }
                else
                {
                    Toast.makeText(grocery_activity.this,"Please Enter Valid Quantity",Toast.LENGTH_SHORT).show();
                }
            }
        });
        salt_buy_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                salt_quantity_value = String.valueOf(salt_quantity_button.getText().toString());
                if (salt_quantity_value.length()!=0) {
                    salt = "salt";
                    String toast = String.valueOf(salt_quantity_value) + " quantity Added";
                    Toast.makeText(grocery_activity.this, toast, Toast.LENGTH_SHORT).show();
                    list += salt + "-" + String.valueOf(salt_quantity_value) + ",";
                    Log.d("salt", String.valueOf(salt_quantity_value));
                }
                else
                {
                    Toast.makeText(grocery_activity.this,"Please Enter Valid Quantity",Toast.LENGTH_SHORT).show();
                }
            }
        });
        sunflower_oil_buy_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sunflower_oil_quantity_value = String.valueOf(sunflower_oil_quantity_button.getText().toString());
                if (sunflower_oil_quantity_value.length()!=0) {
                    sunflower_oil = "sunflower_oil";
                    String toast = String.valueOf(sunflower_oil_quantity_value) + " quantity Added";
                    Toast.makeText(grocery_activity.this, toast, Toast.LENGTH_SHORT).show();
                    list += sunflower_oil + "-" + String.valueOf(sunflower_oil_quantity_value) + ",";
                    Log.d("sunflower_oil", String.valueOf(sunflower_oil_quantity_value));
                }
                else
                {
                    Toast.makeText(grocery_activity.this,"Please Enter Valid Quantity",Toast.LENGTH_SHORT).show();
                }
            }
        });
        toor_dhal_buy_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                toor_dhal_quantity_value = String.valueOf(toor_dhal_quantity_button.getText().toString());
                if (toor_dhal_quantity_value.length()!=0) {
                    toor_dhal = "toor_dhal";
                    String toast = String.valueOf(toor_dhal_quantity_value) + " quantity Added";
                    Toast.makeText(grocery_activity.this, toast, Toast.LENGTH_SHORT).show();
                    list += toor_dhal + "-" + String.valueOf(toor_dhal_quantity_value) + ",";
                    Log.d("toor_dhal", String.valueOf(toor_dhal_quantity_value));
                }
                else
                {
                    Toast.makeText(grocery_activity.this,"Please Enter Valid Quantity",Toast.LENGTH_SHORT).show();
                }
            }
        });
        turmeric_buy_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                turmeric_quantity_value = String.valueOf(turmeric_quantity_button.getText().toString());
                if (turmeric_quantity_value.length()!=0) {
                    turmeric = "turmeric";
                    String toast = String.valueOf(turmeric_quantity_value) + " quantity Added";
                    Toast.makeText(grocery_activity.this, toast, Toast.LENGTH_SHORT).show();
                    list += turmeric + "-" + String.valueOf(turmeric_quantity_value) + ",";
                    Log.d("turmeric", String.valueOf(turmeric_quantity_value));

                }
                else
                {
                    Toast.makeText(grocery_activity.this,"Please Enter Valid Quantity",Toast.LENGTH_SHORT).show();
                }
            }
        });
        wheat_buy_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                wheat_quantity_value = String.valueOf(wheat_quantity_button.getText().toString());
                if  (wheat_quantity_value.length()!=0) {
                    wheat = "wheat";
                    String toast = String.valueOf(wheat_quantity_value) + " quantity Added";
                    Toast.makeText(grocery_activity.this, toast, Toast.LENGTH_SHORT).show();
                    list += wheat + "-" + String.valueOf(wheat_quantity_value) + ",";
                    Log.d("wheat", String.valueOf(wheat_quantity_value));
                }
                else
                {
                    Toast.makeText(grocery_activity.this,"Please Enter Valid Quantity",Toast.LENGTH_SHORT).show();
                }
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
                editor.putString("grocerylist",list);
                editor.commit();
                finish();
            }
        });



    }

}
