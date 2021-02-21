package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;


public class vegetables_activity extends AppCompatActivity {
    String list="";
    Button button1,button2,save;
    EditText buyqty1,buyqty2;
    int qty1,qty2;
    String item1,item2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vegetables_activity);
        buyqty1 = (EditText) findViewById(R.id.vegqty1);
        button1 = (Button) findViewById(R.id.vegbuy1);
        buyqty2 = (EditText) findViewById(R.id.vegqty2);
        button2 = (Button) findViewById(R.id.vegbuy2);
        save=(Button) findViewById(R.id.returnbutton);

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                qty1 = Integer.valueOf(buyqty1.getText().toString());
                item1 = "banana";
                String toast = String.valueOf(qty1)+" quantity Added";
                Toast.makeText(vegetables_activity.this,toast,Toast.LENGTH_SHORT).show();
                list += item1+"-"+String.valueOf(qty1)+",";



            }
        });
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                qty2 = Integer.valueOf(buyqty2.getText().toString());
                item2="bigbanana";
                String toast = String.valueOf(qty1)+" quantity Added";
                Toast.makeText(vegetables_activity.this,toast,Toast.LENGTH_SHORT).show();
                list+=item2+"-"+String.valueOf(qty2)+",";
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
                Log.d("logmsg1",list);
                Log.d("listlen",String.valueOf(list.length()));
                    Toast.makeText(vegetables_activity.this,list,Toast.LENGTH_LONG);

                    finish();
                }
        });



    }

}
