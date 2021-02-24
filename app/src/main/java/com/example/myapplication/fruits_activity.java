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
    int apple_quantity_value,banana_quantity_value,guava_quantity_value,grapes_quantity_value,mango_quantity_value,orange_quantity_value,papaya_quantity_value,pineapple_quantity_value,pomegranate_quantity_value,watermelon_quantity_value;
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
                apple_quantity_value = Integer.valueOf(apple_quantity_button.getText().toString());
                apple = "apple";
                String toast = String.valueOf(apple_quantity_value)+" quantity Added";
                Toast.makeText(fruits_activity.this,toast,Toast.LENGTH_SHORT).show();
                list += apple+"-"+String.valueOf(apple_quantity_value)+",";
                Log.d("apple",String.valueOf(apple_quantity_value));


            }
        });
        banana_buy_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                banana_quantity_value = Integer.valueOf(banana_quantity_button.getText().toString());
                banana="banana";
                String toast = String.valueOf(banana_quantity_value)+" quantity Added";
                Toast.makeText(fruits_activity.this,toast,Toast.LENGTH_SHORT).show();
                list+=banana+"-"+String.valueOf(banana_quantity_value)+",";
                Log.d("banana",String.valueOf(banana_quantity_value));
            }
        });
        guava_buy_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                guava_quantity_value = Integer.valueOf(guava_quantity_button.getText().toString());
                guava="guava";
                String toast = String.valueOf(guava_quantity_value)+" quantity Added";
                Toast.makeText(fruits_activity.this,toast,Toast.LENGTH_SHORT).show();
                list+=guava+"-"+String.valueOf(guava_quantity_value)+",";
                Log.d("guava",String.valueOf(guava_quantity_value));
            }
        });
        grapes_buy_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                grapes_quantity_value = Integer.valueOf(grapes_quantity_button.getText().toString());
                grapes="grapes";
                String toast = String.valueOf(grapes_quantity_value)+" quantity Added";
                Toast.makeText(fruits_activity.this,toast,Toast.LENGTH_SHORT).show();
                list+=grapes+"-"+String.valueOf(grapes_quantity_value)+",";
                Log.d("grapes",String.valueOf(grapes_quantity_value));
            }
        });
        mango_buy_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mango_quantity_value = Integer.valueOf(mango_quantity_button.getText().toString());
                mango="mango";
                String toast = String.valueOf(mango_quantity_value)+" quantity Added";
                Toast.makeText(fruits_activity.this,toast,Toast.LENGTH_SHORT).show();
                list+=mango+"-"+String.valueOf(mango_quantity_value)+",";
                Log.d("mango",String.valueOf(mango_quantity_value));
            }
        });
        orange_buy_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                orange_quantity_value = Integer.valueOf(orange_quantity_button.getText().toString());
                orange="orange";
                String toast = String.valueOf(orange_quantity_value)+" quantity Added";
                Toast.makeText(fruits_activity.this,toast,Toast.LENGTH_SHORT).show();
                list+=orange+"-"+String.valueOf(orange_quantity_value)+",";
                Log.d("orange",String.valueOf(orange_quantity_value));
            }
        });
        papaya_buy_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                papaya_quantity_value = Integer.valueOf(papaya_quantity_button.getText().toString());
                papaya="papaya";
                String toast = String.valueOf(papaya_quantity_value)+" quantity Added";
                Toast.makeText(fruits_activity.this,toast,Toast.LENGTH_SHORT).show();
                list+=papaya+"-"+String.valueOf(papaya_quantity_value)+",";
                Log.d("papaya",String.valueOf(papaya_quantity_value));
            }
        });
        pineapple_buy_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                pineapple_quantity_value = Integer.valueOf(pineapple_quantity_button.getText().toString());
                pineapple="pineapple";
                String toast = String.valueOf(pineapple_quantity_value)+" quantity Added";
                Toast.makeText(fruits_activity.this,toast,Toast.LENGTH_SHORT).show();
                list+=pineapple+"-"+String.valueOf(pineapple_quantity_value)+",";
                Log.d("pineapple",String.valueOf(pineapple_quantity_value));
            }
        });
        pomegranate_buy_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                pomegranate_quantity_value = Integer.valueOf(pomegranate_quantity_button.getText().toString());
                pomegranate="pomegranate";
                String toast = String.valueOf(pomegranate_quantity_value)+" quantity Added";
                Toast.makeText(fruits_activity.this,toast,Toast.LENGTH_SHORT).show();
                list+=pomegranate+"-"+String.valueOf(pomegranate_quantity_value)+",";
                Log.d("pomegranate",String.valueOf(pomegranate_quantity_value));
            }
        });
        watermelon_buy_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                watermelon_quantity_value = Integer.valueOf(watermelon_quantity_button.getText().toString());
                watermelon="watermelon";
                String toast = String.valueOf(watermelon_quantity_value)+" quantity Added";
                Toast.makeText(fruits_activity.this,toast,Toast.LENGTH_SHORT).show();
                list+=watermelon+"-"+String.valueOf(watermelon_quantity_value)+",";
                Log.d("watermelon",String.valueOf(watermelon_quantity_value));
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
                editor.putString("fruitslist",list);
                editor.commit();
                finish();
            }
        });



    }

}
