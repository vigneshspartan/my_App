package com.example.myapplication;
import androidx.appcompat.app.AppCompatActivity;
import android.app.Activity;
import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothDevice;
import android.bluetooth.BluetoothSocket;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.util.Log;
import android.view.View;
import android.widget.TextView;
import android.widget.EditText;
import android.widget.Button;
import android.widget.Toast;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.HashMap;
import java.util.Set;
import java.util.UUID;

public class final_activity extends Activity
{
    TextView myLabel;
    BluetoothAdapter mBluetoothAdapter;
    BluetoothSocket mmSocket;
    BluetoothDevice mmDevice;
    OutputStream mmOutputStream;
    InputStream mmInputStream;
    Thread workerThread;
    byte[] readBuffer;
    int readBufferPosition;
    int counter;
    volatile boolean stopWorker;
    String check,keyset;
    HashMap<Integer,Integer> map = new HashMap<>();

    @Override
    public void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_final_activity);
        check=getIntent().getStringExtra("final_list");
        int temps=0;int tempq = 0;
        HashMap<Integer,Integer> map = new HashMap<>();
        int flag=0;
        for(int i = 0;i<check.length();i++){
            Character c = check.charAt(i);
            if(!c.equals(','))
            {
                if(c!='-')
                {
                    if( flag==0)
                    {
                        temps=temps*10+(Integer.valueOf(c)-48);
                       // System.out.println(temps);
                    }
                    else
                    {
                        tempq=tempq*10+(Integer.valueOf(c)-48);
                        //System.out.println(tempq);
                    }
                }
                else  if(c.equals('-'))
                {
                    flag=1;
                    continue;
                }
            }
            else{
                //System.out.println(temps+" "+tempq);
                map.put(temps,map.containsKey(temps)?map.get(temps)+tempq:tempq);
                //System.out.println(map);
                temps=0;tempq = 0;
                flag=0;
            }
        }
        //System.out.println(map);
        map.put(temps,map.containsKey(temps)?map.get(temps)+tempq:tempq);
       // System.out.println(map);
        //Log.d("keysetcheck",keyset);
        Log.d("mapcheck",map.toString());
        keyset=map.keySet().toString().replaceAll(",","-").replaceAll(" ","");
        Log.d("keysetcheck2",keyset);
        Button sendButton = (Button)findViewById(R.id.send);
        Button closeButton = (Button)findViewById(R.id.close);
        TextView checkout = (TextView)findViewById(R.id.checkout);
        try{
            findBT();
            openBT();}
        catch (IOException e){
            Toast.makeText(getApplicationContext(),"cannot find BT", Toast.LENGTH_SHORT).show();
        }

        //Send Button
        sendButton.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View v)
            {
                try
                {
                    sendData();
                    checkout.setText("Your order has been sent to the Robot");

                }
                catch (IOException ex) {
                    Log.d("revanth","errormsgioexcep");
                }
            }
        });

        //Close button
        closeButton.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View v)
            {
                finish();
            }
        });
    }

    void findBT()
    {
        mBluetoothAdapter = BluetoothAdapter.getDefaultAdapter();
        if(mBluetoothAdapter == null)
        {
            Toast.makeText(getApplicationContext(),"No bluetooth adapter available",Toast.LENGTH_SHORT).show();
        }

        if(!mBluetoothAdapter.isEnabled())
        {
            Intent enableBluetooth = new Intent(BluetoothAdapter.ACTION_REQUEST_ENABLE);
            startActivityForResult(enableBluetooth, 0);
        }

        Set<BluetoothDevice> pairedDevices = mBluetoothAdapter.getBondedDevices();
        if(pairedDevices.size() > 0)
        {
            for(BluetoothDevice device : pairedDevices)
            {
                Log.d("device id",device.getName());
                if(device.getName().equals("HC-05"))
                {
                    mmDevice = device;
                    break;
                }
            }
        }
        Toast.makeText(getApplicationContext(),"Bluetooth Device Found",Toast.LENGTH_SHORT).show();
    }

    void openBT() throws IOException
    {
        UUID uuid = UUID.fromString("00001101-0000-1000-8000-00805F9B34FB"); //Standard SerialPortService ID
        mmSocket = mmDevice.createRfcommSocketToServiceRecord(uuid);
        if(mmDevice!=null) {
            mmSocket.connect();
            mmOutputStream = mmSocket.getOutputStream();
            mmInputStream = mmSocket.getInputStream();

            beginListenForData();

            Toast.makeText(getApplicationContext(),"Bluetooth Opened",Toast.LENGTH_SHORT).show();
        }
    }

    void beginListenForData()
    {
        final Handler handler = new Handler();
        final byte delimiter = 10; //This is the ASCII code for a newline character

        stopWorker = false;
        readBufferPosition = 0;
        readBuffer = new byte[1024];
        workerThread = new Thread(new Runnable()
        {
            public void run()
            {
                while(!Thread.currentThread().isInterrupted() && !stopWorker)
                {
                    try
                    {
                        int bytesAvailable = mmInputStream.available();
                        if(bytesAvailable > 0)
                        {
                            byte[] packetBytes = new byte[bytesAvailable];
                            mmInputStream.read(packetBytes);
                            for(int i=0;i<bytesAvailable;i++)
                            {
                                byte b = packetBytes[i];
                                if(b == delimiter)
                                {
                                    byte[] encodedBytes = new byte[readBufferPosition];
                                    System.arraycopy(readBuffer, 0, encodedBytes, 0, encodedBytes.length);
                                    final String data = new String(encodedBytes, "US-ASCII");
                                    readBufferPosition = 0;

                                    handler.post(new Runnable()
                                    {
                                        public void run()
                                        {
                                            ;
                                        }
                                    });
                                }
                                else
                                {
                                    readBuffer[readBufferPosition++] = b;
                                }
                            }
                        }
                    }
                    catch (IOException ex)
                    {
                        stopWorker = true;
                    }
                }
            }
        });

        workerThread.start();
    }

    void sendData() throws IOException
    {
        int len = keyset.length();
        Log.d("checkout",keyset);
        Log.d("checkoutlength",String.valueOf(len));
        if(len!=3){
            keyset = keyset.substring(3,len-1);
        }
        keyset+='@';
        mmOutputStream.write(keyset.getBytes());
        Toast.makeText(getApplicationContext(),"data sent successfully",Toast.LENGTH_SHORT).show();
    }

}