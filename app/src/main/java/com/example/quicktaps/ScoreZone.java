package com.example.quicktaps;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.prefs.PreferenceChangeEvent;

public class ScoreZone extends AppCompatActivity implements View.OnClickListener {

    public SharedPreferences pref;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_score_zone);
        Intent intent = getIntent();
        String score = intent.getStringExtra("score");

        pref = PreferenceManager.getDefaultSharedPreferences(this);
        TextView timeTitle = (TextView)findViewById(R.id.timeTitle);
        TextView textNew = (TextView)findViewById(R.id.textNew);
        TextView textScore = (TextView)findViewById(R.id.textScore);
        TextView textTime = (TextView)findViewById(R.id.textTime);

        ((Button)findViewById(R.id.buttonHome)).setOnClickListener(this);
        ((Button)findViewById(R.id.buttonRetry)).setOnClickListener(this);

        timeTitle.setText(score);
        String score1 = pref.getString("score1", "");
        textTime.setText(score1);

        int m = Integer.parseInt(score.substring(0,2));
        int s = Integer.parseInt(score.substring(3,5));
        int ms = Integer.parseInt(score.substring(6,8));

        int m1 = Integer.parseInt(score1.substring(0,2));
        int s1 = Integer.parseInt(score1.substring(3,5));
        int ms1 = Integer.parseInt(score1.substring(6,8));

        if (m <= m1) {
            setPreferenceScore(score);
            if(s <= s1) {
                setPreferenceScore(score);
                if(ms <= ms1) {
                    setPreferenceScore(score);
                }
            }
        }
    }

    private void setPreferenceScore(String score) {
        SharedPreferences.Editor edit = pref.edit();
        edit.putString("score1", score);
        edit.commit();
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