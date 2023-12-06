package com.example.unite3;

import androidx.appcompat.app.AppCompatActivity;

import android.nfc.Tag;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;

public class Uyg11 extends AppCompatActivity {


    private final String TAG ="Etiket";
    private int sayi = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_uyg11);
        Log.d(TAG,"debug(Hata Ayıklama)");

    }
    public void islemYap(View view) {
        Log.i(TAG,"Düğmeye Tıklandı.");
        EditText txt = (EditText) findViewById(R.id.editTextTextPersonName2);
        Log.i(TAG,"Edit Text Tanımlandı.");
        String yazi =txt.getText().toString();
        Log.i(TAG,"Edit Text içinde ki yazı alındı.");
        sayi = Integer.parseInt(yazi);
        Log.i(TAG,"Yazı sayıya çevirildi.");
        sayi += 2;
        Log.i(TAG,"Sayıya 2 eklendi.");
        sayi *= 4;
        Log.i(TAG,"Sayı 2 ile çarpıldı.");


        Log.i(TAG,"Sonuç:" + sayi);

    }
}