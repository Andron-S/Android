package com.example.quizcards;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class CitiesAndCountries extends Activity {
    Card Cards = new Card();
    Handler handler = new Handler();
    Bundle bundle = new Bundle();
    int rememberCard = 0;
    boolean isFlip = true;
    boolean isFlipped = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.cities_and_coutries);
        TextView Amount = (TextView) findViewById(R.id.Amount);
        Amount.setText("/"+Cards.amount);
    }

    public void flipCard (View view){
        Button Card = (Button) findViewById(R.id.CitiesCard);
        if(isFlip) {
            isFlip = false;
            Card.setText(Cards.countriesCard.get(Cards.flipIndex));
            Cards.flipIndex++;
            isFlipped = true;
        }
    }

    public void rememberCard(View view) {
        Button Card = (Button) findViewById(R.id.CitiesCard);
        TextView Count = (TextView) findViewById(R.id.Count);
        rememberCard++;
        isFlip = true;

        if(Cards.count <= 6) Cards.count++;
        Count.setText(Cards.count+"");

        if(Cards.flippedIndex < Cards.sitiesCard.size()) {
            Card.setText(Cards.sitiesCard.get(Cards.flippedIndex));
            Cards.flippedIndex++;
        }
        if(Cards.countCard == Cards.sitiesCard.size()){
            resultActivity();
        }
        if(Cards.flipIndex < Cards.flippedIndex){
            Cards.flipIndex++;
        }
        Cards.countCard++;
    }

    public void notRememberCard(View view){
        Button Card = (Button) findViewById(R.id.CitiesCard);
        TextView Count = (TextView) findViewById(R.id.Count);
        isFlip = true;

        if(Cards.count <= 6) Cards.count++;
        Count.setText(Cards.count+"");

        if(Cards.flippedIndex < Cards.sitiesCard.size()) {
            Card.setText(Cards.sitiesCard.get(Cards.flippedIndex));
            Cards.flippedIndex++;
        }
        if(Cards.countCard == Cards.sitiesCard.size()){
            resultActivity();

        }
        if(Cards.flipIndex < Cards.flippedIndex){
            Cards.flipIndex++;
        }
        Cards.countCard++;
    }

    private void resultActivity(){
        Intent intent = new Intent(this, Results.class);
        bundle.putInt("rememberCard", rememberCard);
        intent.putExtras(bundle);
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                startActivity(intent);
            }
        }, 1000);
    }

}
