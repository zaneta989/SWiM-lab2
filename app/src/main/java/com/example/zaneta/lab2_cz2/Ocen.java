package com.example.zaneta.lab2_cz2;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.Toast;

public class Ocen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ocen);
    }
    public void powrotDoPoprzedniego(View view) {
        onBackPressed();
    }
    public void pokazToast(View view) {
        CheckBox sup = (CheckBox) findViewById(R.id.checkBox);
        CheckBox takaSobie = (CheckBox) findViewById(R.id.checkBox4);
        CheckBox zla= (CheckBox) findViewById(R.id.checkBox5);
        CheckBox zleObl = (CheckBox) findViewById(R.id.checkBox6);
        CheckBox nieMoznaD = (CheckBox) findViewById(R.id.checkBox7);
        CheckBox zawieszaS = (CheckBox) findViewById(R.id.checkBox8);

        String sup_string = sup.getText().toString();
        String takaSobie_string = takaSobie.getText().toString();
        String zla_string = zla.getText().toString();
        String zleObl_string = zleObl.getText().toString();
        String nieMoznaD_string = nieMoznaD.getText().toString();
        String zawieszaS_string = zawieszaS.getText().toString();

        Context k = getApplicationContext();
        CharSequence text = "Zaznaczyłeś opcje:";

        if(sup.isChecked())
            text = text+"\n"+sup_string;
        if(takaSobie.isChecked())
            text = text+"\n"+takaSobie_string;
        if(zla.isChecked()) text=text+"\n"+zla_string;
        if (zleObl.isChecked()) text=text+"\n"+zleObl_string;
        if(nieMoznaD.isChecked())text=text+"\n"+nieMoznaD_string;
        if(zawieszaS.isChecked())text=text+"\n"+zawieszaS_string;
        Toast toast = Toast.makeText(k, text, Toast.LENGTH_SHORT);
        toast.show();
    }
    public void wyslij(View view) {

        Toast.makeText(getApplicationContext(), "Dziękujemy za opinię.", Toast.LENGTH_SHORT).show();
    }
}
