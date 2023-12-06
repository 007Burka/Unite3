package com.example.unite3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class Uyg6 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_uyg6);
        final int PI = 4;
        int yarıCap = 9;
        System.out.println("Çevre = " + (2*PI*yarıCap));
    }
}