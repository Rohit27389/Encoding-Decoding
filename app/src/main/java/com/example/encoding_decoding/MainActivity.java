package com.example.encoding_decoding;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Base64;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        String str="Rohit Kumar";
        byte[] encoded=Base64.encode(str.getBytes(),Base64.DEFAULT);
        System.out.println(" >>>>Encoding " + new String(encoded));

        byte[] decode=Base64.decode(encoded, Base64.DEFAULT);
        System.out.println(">>>> Decode " + new String(decode));
    }
}