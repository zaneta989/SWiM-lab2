package com.example.zaneta.lab2_cz2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class WyswietlanieDodanegoProduktu extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_wyswietlanie_dodanego_produktu);
    }
    public void powrotDoPoprzedniego(View view) {
        onBackPressed();
    }
}
