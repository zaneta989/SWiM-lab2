package com.example.zaneta.lab2_cz2;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.SeekBar;
import android.widget.TextView;
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

        TextView wyn = (TextView) findViewById(R.id.textView7);
        wyn.setText(wynik);

        Bundle res = new Bundle();
        res.putString("wynik", wynik);
        i.putExtras(res);
        setResult(Activity.RESULT_OK, i);
    }

    private String funkcja(Boolean cK, int waga, int wiek, int wzrost, int af, String p)
    {
        int BMR=1800;
        if(!cK)
        {
            BMR= (int) (66 + 13.7 * waga + 5 * wzrost - 6.8 * wiek);
        }
        else{
            BMR = (int) (655 + 9.6 *waga+ 1.8 - 4.7 * wiek);
        }
        if(af==1)
        {
            BMR*=1.2;
        }
        if (af==2)
        {
            BMR*=1.375;

        }
        if(af==3)
        {
            BMR*=1.5;
        }
        if(af==4){
            BMR*=1.7;
        }
        if(p.equals("Schudnąc")) {BMR-=300;}
        if(p.equals("Przytyc")) {
            BMR += 500;
        }
        return Integer.valueOf(BMR).toString();
    }

    public void powrotDoPoprzedniego(View view) {
        finish();
        onBackPressed();
    }
}
