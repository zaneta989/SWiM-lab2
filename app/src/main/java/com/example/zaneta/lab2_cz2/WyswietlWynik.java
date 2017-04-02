package com.example.zaneta.lab2_cz2;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.SeekBar;
import android.widget.ToggleButton;

public class WyswietlWynik extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_wyswietl_wynik);

        Intent i = getIntent();
        Bundle dane = i.getExtras();
        String wynik = "";

        Boolean czyKobieta = dane.getBoolean("czyKobieta");
        int masaCiala = dane.getInt("masaCiala");
        int wiek = dane.getInt("wiek");
        int wzrost = dane.getInt("wzrost");
        int aktywnoscFizyczna = dane.getInt("aktywnoscFizyczna");
        String planuje = dane.getString("planuje");

        wynik = funkcja(czyKobieta, masaCiala, wiek, wzrost, aktywnoscFizyczna, planuje);

        // TODO

        Bundle res = new Bundle();
        res.putString("wynik", wynik);
        i.putExtras(res);
        setResult(Activity.RESULT_OK, i);
    }

    private String funkcja(Boolean cK, int m, int w, int wz, int af, String p)
    {
        return "1800";
    }

    public void powrotDoPoprzedniego(View view) {
        onBackPressed();
    }
}
