package com.example.quizcards;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void createEnglishActivity(View view) {
        Intent intetn = new Intent(this, EnglishCards.class);
        startActivity(intetn);
    }

    public void createCitiesActivity(View view) {
        Intent intetn = new Intent(this, CitiesAndCountries.class);
        startActivity(intetn);
    }

}