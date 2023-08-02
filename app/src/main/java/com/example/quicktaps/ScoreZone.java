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
        TextView textTime = (TextView)findViewById(R.id.textTime);
        TextView textNew = (TextView)findViewById(R.id.textNew);
        TextView textScore = (TextView)findViewById(R.id.textScore);
        TextView textHighScoreTime1 = (TextView)findViewById(R.id.textHighScoreTime1);
        TextView textHighScoreTime2 = (TextView)findViewById(R.id.textHighScoreTime2);
        TextView textHighScoreTime3 = (TextView)findViewById(R.id.textHighScoreTime3);
        TextView textHighScoreTime4 = (TextView)findViewById(R.id.textHighScoreTime4);
        TextView textHighScoreTime5 = (TextView)findViewById(R.id.textHighScoreTime5);


        ((Button)findViewById(R.id.buttonHome)).setOnClickListener(this);
        ((Button)findViewById(R.id.buttonRetry)).setOnClickListener(this);

        String score1 = pref.getString("score1", "59:59:59");
        String score2 = pref.getString("score2", "59:59:59");
        String score3 = pref.getString("score3", "59:59:59");
        String score4 = pref.getString("score4", "59:59:59");
        String score5 = pref.getString("score5", "59:59:59");

        textHighScoreTime1.setText(score1);
        textHighScoreTime2.setText(score2);
        textHighScoreTime2.setText(score3);
        textHighScoreTime2.setText(score4);
        textHighScoreTime2.setText(score5);

        int m = Integer.parseInt(score.substring(0,2));
        int s = Integer.parseInt(score.substring(3,5));
        int ms = Integer.parseInt(score.substring(6,8));

        int m1 = Integer.parseInt(score1.substring(0,2));
        int s1 = Integer.parseInt(score1.substring(3,5));
        int ms1 = Integer.parseInt(score1.substring(6,8));

        int m2 = Integer.parseInt(score2.substring(0,2));
        int s2 = Integer.parseInt(score2.substring(3,5));
        int ms2 = Integer.parseInt(score2.substring(6,8));

        int m3 = Integer.parseInt(score3.substring(0,2));
        int s3 = Integer.parseInt(score3.substring(3,5));
        int ms3 = Integer.parseInt(score3.substring(6,8));

        int m4 = Integer.parseInt(score4.substring(0,2));
        int s4 = Integer.parseInt(score4.substring(3,5));
        int ms4 = Integer.parseInt(score4.substring(6,8));

        int m5 = Integer.parseInt(score5.substring(0,2));
        int s5 = Integer.parseInt(score5.substring(3,5));
        int ms5 = Integer.parseInt(score5.substring(6,8));

        if (m <= m1) {
            setPreferenceScore(score, score1, score2, score3, score4, score5);
            if(s <= s1) {
                setPreferenceScore(score, score1, score2, score3, score4, score5);
                if(ms <= ms1) {
                    setPreferenceScore(score, score1, score2, score3, score4, score5);
                }
            }
        }
    }

    private void setPreferenceScore(String score, String score1, String score2, String score3, String score4, String score5) {
        SharedPreferences.Editor edit = pref.edit();
        edit.putString("score1", score);
        edit.putString("score2", score1);
        edit.putString("score3", score2);
        edit.putString("score4", score3);
        edit.putString("score5", score4);
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