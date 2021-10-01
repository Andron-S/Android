package com.example.quizcards;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


public class Results extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.results);
        Intent intent = getIntent();
        Bundle bundle = intent.getExtras();
        int remCard = bundle.getInt("rememberCard");
        TextView Count = (TextView) findViewById(R.id.remCard);
        Count.setText(remCard+"");
    }
    public void goHome(View view){
        Intent home = new Intent(this, MainActivity.class);
        Button btn =(Button) findViewById(R.id.Home);
        startActivity(home);
    }
}
