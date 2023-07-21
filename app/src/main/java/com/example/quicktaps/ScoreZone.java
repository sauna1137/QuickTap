package com.example.quicktaps;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import org.w3c.dom.Text;

public class ScoreZone extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_score_zone);

        TextView textNew = (TextView)findViewById(R.id.textNew);
        TextView textScore = (TextView)findViewById(R.id.textScore);
        TextView textTime = (TextView)findViewById(R.id.textTime);

    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case (R.id.buttonHome):
                Intent intentHome = new Intent(getApplication(), MainActivity.class);
                startActivity(intentHome);
                break;
            case (R.id.buttonRetry):
                Intent retry = new Intent(getApplication(), GameAction3.class);
                startActivity(retry);
                break;
        }
    }
}