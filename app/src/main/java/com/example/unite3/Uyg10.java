package com.example.unite3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class Uyg10 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_uyg10);


        int x = 5;
        int y = 8;


        System.out.println("x 10'dan büyük ve y 10' dan küçük mü: " + (x > 10 && y < 10));
        System.out.println("x 10'dan küçük ve y 10' dan büyük mü: " + (x < 10 && y > 10 ));
        System.out.println("x 10'dan büyük veya y 10' dan küçük mü: " + (x > 10 || y < 10));
        System.out.println("x 10'dan küçük veya y 10' dan büyük mü: " + (x < 10 || y > 10));


    }
}