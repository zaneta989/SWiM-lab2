package com.example.zaneta.lab2_cz2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class OknoGlowne extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_okno_glowne);
    }
    public void wyswietlanieOknaSzL(View view) {
        final Intent intencja2 = new Intent(this,WyswietlanieDodanegoProduktu.class); startActivity(intencja2);
    }
    public void wyswietlanieOknaL(View view) {
        final Intent intencja2 = new Intent(this,WyswietlanieListy.class); startActivity(intencja2);
    }
    public void wyswietlanieOknaD(View view) {
        final Intent intencja2 = new Intent(this,kolejne.class); startActivity(intencja2);
    }
}
