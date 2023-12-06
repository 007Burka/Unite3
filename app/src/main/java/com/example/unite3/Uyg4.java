package com.example.unite3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class Uyg4 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_uyg4);

        char karakter ='f';
        int ascii = (int) karakter;
        System.out.println();

        if (ascii>=48 && ascii<=57 ){
            System.out.println("Rakam Girildi");
        }
        else {
            System.out.println("Yazı Girildi");
        }
    }
}