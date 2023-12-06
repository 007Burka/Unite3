package com.example.unite3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void uygulama1goster(View view) {
        Intent i = new Intent(MainActivity.this, Uyg1.class);
        startActivity(i);
    }

    public void uygulama2goster(View view) {
        Intent i = new Intent(MainActivity.this, Uyg2.class);
        startActivity(i);
    }

    public void uygulama3goster(View view) {
        Intent i = new Intent(MainActivity.this, Uyg3.class);
        startActivity(i);
    }

    public void uygulama4goster(View view) {
        Intent i = new Intent(MainActivity.this, Uyg4.class);
        startActivity(i);
    }

    public void uygulama5goster(View view) {
        Intent i = new Intent(MainActivity.this, Uyg5.class);
        startActivity(i);
    }

    public void uygulama6goster(View view) {
        Intent i = new Intent(MainActivity.this, Uyg6.class);
        startActivity(i);
    }

    public void uygulama7goster(View view) {
        Intent i = new Intent(MainActivity.this, Uyg7.class);
        startActivity(i);
    }

    public void uygulama8goster(View view) {
        Intent i = new Intent(MainActivity.this, Uyg8.class);
        startActivity(i);
    }

    public void uygulama9goster(View view) {
        Intent i = new Intent(MainActivity.this, Uyg9.class);
        startActivity(i);
    }

    public void uygulama10goster(View view) {
        Intent i = new Intent(MainActivity.this, Uyg10.class);
        startActivity(i);
    }

    public void uygulama11goster(View view) {
        Intent i = new Intent(MainActivity.this, Uyg11.class);
        startActivity(i);
    }

    public void uygulama12goster(View view) {
        Intent i = new Intent(MainActivity.this, Uyg12.class);
        startActivity(i);
    }
}