package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;


public class fruits_activity extends AppCompatActivity {
    String list="";
    Button apple_buy_button,banana_buy_button,guava_buy_button,grapes_buy_button,mango_buy_button,orange_buy_button,papaya_buy_button,pineapple_buy_button,pomegranate_buy_button,watermelon_buy_button,save;
    EditText apple_quantity_button,banana_quantity_button,guava_quantity_button,grapes_quantity_button,mango_quantity_button,orange_quantity_button,papaya_quantity_button,pineapple_quantity_button,pomegranate_quantity_button,watermelon_quantity_button;
    String apple_quantity_value,banana_quantity_value,guava_quantity_value,grapes_quantity_value,mango_quantity_value,orange_quantity_value,papaya_quantity_value,pineapple_quantity_value,pomegranate_quantity_value,watermelon_quantity_value;
    String apple,banana,guava,grapes,mango,orange,papaya,pineapple,pomegranate,watermelon;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fruits_activity);
        apple_quantity_button = (EditText) findViewById(R.id.apple_quantity);
        apple_buy_button = (Button) findViewById(R.id.apple_buy);
        banana_quantity_button = (EditText) findViewById(R.id.banana_quantity);
        banana_buy_button = (Button) findViewById(R.id.banana_buy);
        guava_quantity_button = (EditText) findViewById(R.id.guava_quantity);
        guava_buy_button = (Button) findViewById(R.id.guava_buy);
        grapes_quantity_button = (EditText) findViewById(R.id.grapes_quantity);
        grapes_buy_button = (Button) findViewById(R.id.grapes_buy);
        mango_quantity_button = (EditText) findViewById(R.id.mango_quantity);
        mango_buy_button = (Button) findViewById(R.id.mango_buy);
        orange_quantity_button = (EditText) findViewById(R.id.orange_quantity);
        orange_buy_button = (Button) findViewById(R.id.orange_buy);
        papaya_quantity_button = (EditText) findViewById(R.id.papaya_quantity);
        papaya_buy_button = (Button) findViewById(R.id.papaya_buy);
        pineapple_quantity_button = (EditText) findViewById(R.id.pineapple_quantity);
        pineapple_buy_button = (Button) findViewById(R.id.pineapple_buy);
        pomegranate_quantity_button = (EditText) findViewById(R.id.pomegranate_quantity);
        pomegranate_buy_button = (Button) findViewById(R.id.pomegranate_buy);
        watermelon_quantity_button = (EditText) findViewById(R.id.watermelon_quantity);
        watermelon_buy_button = (Button) findViewById(R.id.watermelon_buy);
        save=(Button) findViewById(R.id.returnbutton);

        apple_buy_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                apple_quantity_value = String.valueOf(apple_quantity_button.getText().toString());
                if (apple_quantity_value.length() != 0)
                {
                    apple = "apple";
                    String toast = String.valueOf(apple_quantity_value) + " quantity Added";
                    Toast.makeText(fruits_activity.this, toast, Toast.LENGTH_SHORT).show();
                    list += apple + "-" + String.valueOf(apple_quantity_value) + ",";
                    Log.d("apple", String.valueOf(apple_quantity_value));
                }
                else
                {
                    Toast.makeText(fruits_activity.this,"Please Enter Valid Quantity",Toast.LENGTH_SHORT).show();
                }

            }
        });
        banana_buy_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                banana_quantity_value = String.valueOf(banana_quantity_button.getText().toString());
                if (banana_quantity_value.length()!=0) {
                    banana = "banana";
                    String toast = String.valueOf(banana_quantity_value) + " quantity Added";
                    Toast.makeText(fruits_activity.this, toast, Toast.LENGTH_SHORT).show();
                    list += banana + "-" + String.valueOf(banana_quantity_value) + ",";
                    Log.d("banana", String.valueOf(banana_quantity_value));
                }
                else
                {
                    Toast.makeText(fruits_activity.this,"Please Enter Valid Quantity",Toast.LENGTH_SHORT).show();
                }
            }
        });
        guava_buy_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                guava_quantity_value = String.valueOf(guava_quantity_button.getText().toString());
                if (guava_quantity_value.length()!=0) {
                    guava = "guava";
                    String toast = String.valueOf(guava_quantity_value) + " quantity Added";
                    Toast.makeText(fruits_activity.this, toast, Toast.LENGTH_SHORT).show();
                    list += guava + "-" + String.valueOf(guava_quantity_value) + ",";
                    Log.d("guava", String.valueOf(guava_quantity_value));
                }
                else
                {
                    Toast.makeText(fruits_activity.this,"Please Enter Valid Quantity",Toast.LENGTH_SHORT).show();
                }
            }
        });
        grapes_buy_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                grapes_quantity_value = String.valueOf(grapes_quantity_button.getText().toString());
                if(grapes_quantity_value.length()!=0) {
                    grapes = "grapes";
                    String toast = String.valueOf(grapes_quantity_value) + " quantity Added";
                    Toast.makeText(fruits_activity.this, toast, Toast.LENGTH_SHORT).show();
                    list += grapes + "-" + String.valueOf(grapes_quantity_value) + ",";
                    Log.d("grapes", String.valueOf(grapes_quantity_value));
                }
                else
                {
                    Toast.makeText(fruits_activity.this,"Please Enter Valid Quantity",Toast.LENGTH_SHORT).show();
                }
            }
        });
        mango_buy_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mango_quantity_value = String.valueOf(mango_quantity_button.getText().toString());
                if (mango_quantity_value.length()!=0) {
                    mango = "mango";
                    String toast = String.valueOf(mango_quantity_value) + " quantity Added";
                    Toast.makeText(fruits_activity.this, toast, Toast.LENGTH_SHORT).show();
                    list += mango + "-" + String.valueOf(mango_quantity_value) + ",";
                    Log.d("mango", String.valueOf(mango_quantity_value));
                }
                else
                {
                    Toast.makeText(fruits_activity.this,"Please Enter Valid Quantity",Toast.LENGTH_SHORT).show();
                }
            }
        });
        orange_buy_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                orange_quantity_value = String.valueOf(orange_quantity_button.getText().toString());
                if (orange_quantity_value.length()!=0) {
                    orange = "orange";
                    String toast = String.valueOf(orange_quantity_value) + " quantity Added";
                    Toast.makeText(fruits_activity.this, toast, Toast.LENGTH_SHORT).show();
                    list += orange + "-" + String.valueOf(orange_quantity_value) + ",";
                    Log.d("orange", String.valueOf(orange_quantity_value));
                }
                else
                {
                    Toast.makeText(fruits_activity.this,"Please Enter Valid Quantity",Toast.LENGTH_SHORT).show();
                }
            }
        });
        papaya_buy_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                papaya_quantity_value = String.valueOf(papaya_quantity_button.getText().toString());
                if (papaya_quantity_value.length()!=0) {
                    papaya = "papaya";
                    String toast = String.valueOf(papaya_quantity_value) + " quantity Added";
                    Toast.makeText(fruits_activity.this, toast, Toast.LENGTH_SHORT).show();
                    list += papaya + "-" + String.valueOf(papaya_quantity_value) + ",";
                    Log.d("papaya", String.valueOf(papaya_quantity_value));
                }
                else
                {
                    Toast.makeText(fruits_activity.this,"Please Enter Valid Quantity",Toast.LENGTH_SHORT).show();
                }
            }
        });
        pineapple_buy_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                pineapple_quantity_value = String.valueOf(pineapple_quantity_button.getText().toString());
                if (pineapple_quantity_value.length()!=0) {
                    pineapple = "pineapple";
                    String toast = String.valueOf(pineapple_quantity_value) + " quantity Added";
                    Toast.makeText(fruits_activity.this, toast, Toast.LENGTH_SHORT).show();
                    list += pineapple + "-" + String.valueOf(pineapple_quantity_value) + ",";
                    Log.d("pineapple", String.valueOf(pineapple_quantity_value));
                }
                else
                {
                    Toast.makeText(fruits_activity.this,"Please Enter Valid Quantity",Toast.LENGTH_SHORT).show();
                }
            }
        });
        pomegranate_buy_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                pomegranate_quantity_value = String.valueOf(pomegranate_quantity_button.getText().toString());
                if (pomegranate_quantity_value.length()!=0) {
                    pomegranate = "pomegranate";
                    String toast = String.valueOf(pomegranate_quantity_value) + " quantity Added";
                    Toast.makeText(fruits_activity.this, toast, Toast.LENGTH_SHORT).show();
                    list += pomegranate + "-" + String.valueOf(pomegranate_quantity_value) + ",";
                    Log.d("pomegranate", String.valueOf(pomegranate_quantity_value));
                }
                else
                {
                    Toast.makeText(fruits_activity.this,"Please Enter Valid Quantity",Toast.LENGTH_SHORT).show();
                }
            }
        });
        watermelon_buy_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                watermelon_quantity_value = String.valueOf(watermelon_quantity_button.getText().toString());
                if (watermelon_quantity_value.length()!=0) {
                    watermelon = "watermelon";
                    String toast = String.valueOf(watermelon_quantity_value) + " quantity Added";
                    Toast.makeText(fruits_activity.this, toast, Toast.LENGTH_SHORT).show();
                    list += watermelon + "-" + String.valueOf(watermelon_quantity_value) + ",";
                    Log.d("watermelon", String.valueOf(watermelon_quantity_value));
                }
                else
                {
                    Toast.makeText(fruits_activity.this,"Please Enter Valid Quantity",Toast.LENGTH_SHORT).show();
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
                editor.putString("fruitslist",list);
                editor.commit();
                finish();
            }
        });



    }

}
