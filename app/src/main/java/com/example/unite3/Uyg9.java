package com.example.unite3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class Uyg9 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_uyg9);

        int x = 15;
        int y = 8;
        System.out.println("x ile y eşit mi: "+ (x == y));
        System.out.println("x ile y farklı mı: "+ (x != y));
        System.out.println("x, y'den büyük mü: "+ (x > y));
        System.out.println("x, y'den küçük mü: "+ (x < y));
        System.out.println("x, y'den büyük veya eşit mi: "+ (x >= y));
        System.out.println("x, y'den küçük veya eşit mi: "+ (x <= y));
    }
}