package com.example.quicktaps;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

public class GameAction3 extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game_action);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case (R.id.button3): break;
            case (R.id.button4): break;
            case (R.id.button5): break;
            case (R.id.buttonHome): break;
        }
    }
}