package com.example.unite3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class Uyg2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_uyg2);

        byte kucukSayi = 127;
        short kisaSayi = 32767;
        int tamSayi = 2147483647;
        long uzunSayi =9223372036854775807L;
        System.out.println("byte: " + kucukSayi);
        System.out.println("short: " + kisaSayi);
        System.out.println("int: " + tamSayi);
        System.out.println("long: " + uzunSayi);
    }
}