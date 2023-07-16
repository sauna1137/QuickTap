package com.example.quicktaps;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class GameAction3 extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game_action);

        ((Button)findViewById(R.id.button1)).setOnClickListener(this);
        ((Button)findViewById(R.id.button2)).setOnClickListener(this);
        ((Button)findViewById(R.id.button3)).setOnClickListener(this);
        ((Button)findViewById(R.id.button4)).setOnClickListener(this);
        ((Button)findViewById(R.id.button5)).setOnClickListener(this);
        ((Button)findViewById(R.id.button6)).setOnClickListener(this);
        ((Button)findViewById(R.id.button7)).setOnClickListener(this);
        ((Button)findViewById(R.id.button8)).setOnClickListener(this);
        ((Button)findViewById(R.id.button9)).setOnClickListener(this);
        ((Button)findViewById(R.id.buttonHome)).setOnClickListener(this);
        ((Button)findViewById(R.id.buttonRetry)).setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case (R.id.button1): break;
            case (R.id.button2): break;
            case (R.id.button3): break;
            case (R.id.button4): break;
            case (R.id.button5): break;
            case (R.id.button6): break;
            case (R.id.button7): break;
            case (R.id.button8): break;
            case (R.id.button9): break;
            case (R.id.buttonHome):
                Intent intentHome = new Intent(getApplication(), MainActivity.class);
                startActivity(intentHome);
                break;
            case (R.id.buttonRetry): break;
        }
    }
}