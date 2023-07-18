package com.example.quicktaps;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class GameLevel extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game_level);

        ((Button)findViewById(R.id.gameLevelButton3)).setOnClickListener(this);
        ((Button)findViewById(R.id.gameLevelButton4)).setOnClickListener(this);
        ((Button)findViewById(R.id.gameLevelButton5)).setOnClickListener(this);
        ((Button)findViewById(R.id.gameLevelButtonHome)).setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case (R.id.gameLevelButton3):
                Intent intentGame3 = new Intent(getApplication(), GameAction3.class);
                startActivity(intentGame3);
                break;
            case (R.id.gameLevelButton4):
                break;
            case (R.id.gameLevelButton5): break;
            case (R.id.gameLevelButtonHome):
                Intent intentHome = new Intent(getApplication(), MainActivity.class);
                startActivity(intentHome);
                break;
        }
    }
}