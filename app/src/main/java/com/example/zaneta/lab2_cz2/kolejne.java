package com.example.zaneta.lab2_cz2;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.SeekBar;
import android.widget.TextView;
import android.widget.ToggleButton;

public class kolejne extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kolejne);
    }

    @Override
    protected void onActivityResult(int reqID, int resC, Intent i)
    {
        if(resC == Activity.RESULT_OK && reqID == 123)
        {
            String wynik = "";
            wynik = i.getExtras().getString("wynik");
            TextView wyn = (TextView) findViewById(R.id.textView13);
            wyn.setText(wynik);
        }
    }

    public void powrotDoPoprzedniego(View view) {
        onBackPressed();
    }

    public Bundle pobierzDane()
    {
        ToggleButton czyKobieta = (ToggleButton) findViewById(R.id.toggleButton);
        EditText masaCiala = (EditText) findViewById(R.id.editText11);
        EditText wiek = (EditText) findViewById(R.id.editText2);
        EditText wzrost = (EditText) findViewById(R.id.editText);
        SeekBar aktywnoscFizyczna = (SeekBar) findViewById(R.id.seekBar);
        RadioGroup planuje = (RadioGroup) findViewById(R.id.radioGroup);

        Bundle dane = new Bundle();
        dane.putBoolean("czyKobieta", czyKobieta.isChecked());
        dane.putInt("masaCiala", new Integer(masaCiala.getText().toString()));
        dane.putInt("wiek", new Integer(wiek.getText().toString()));
        dane.putInt("wzrost", new Integer(wzrost.getText().toString()));
        dane.putInt("aktywnoscFizyczna", aktywnoscFizyczna.getProgress());
        dane.putString("planuje", (String) ((RadioButton) findViewById(planuje.getCheckedRadioButtonId())).getText());
        return dane;
    }

    public void wywolajDrugieOkno(View view)
    {
        Intent i = new Intent(this, WyswietlWynik.class);
        i.putExtras(this.pobierzDane());
        startActivityForResult(i, 123);
    }

}
