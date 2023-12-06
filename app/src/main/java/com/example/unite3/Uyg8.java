package com.example.unite3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class Uyg8 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_uyg8);

        int x = 15;
        System.out.println("x = " + x);
        x += 3 ;
        System.out.println("x += 3 : " + x);
        x -= 2;
        System.out.println("x -= 2 : " + x);
        x *= 2;
        System.out.println("x *= 2 : " + x);
        x /= 4;
        System.out.println("x /= 4 : " + x);
        x %= 2;
        System.out.println("x %= 2 : " + x);
    }
}