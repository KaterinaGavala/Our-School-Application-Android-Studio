package com.example.ourschoolapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.widget.TextView;

public class Statistics extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_statistics);

        SharedPreferences Prefs = this.getSharedPreferences("ScoredTest5", Context.MODE_PRIVATE);
        int score5 = Prefs.getInt("score5",0);
        TextView Vathmos5 = findViewById(R.id.textView47);
        Vathmos5.setText(String.valueOf(score5)+"/10");


        Prefs = this.getSharedPreferences("ScoredTest6", Context.MODE_PRIVATE);
        int score6 = Prefs.getInt("score6",0);
        TextView Vathmos6 = findViewById(R.id.textView49);
        Vathmos6.setText(String.valueOf(score6)+"/6");

        Prefs = this.getSharedPreferences("ScoredFinalTest", Context.MODE_PRIVATE);
        int scoreFinalTest = Prefs.getInt("ScoreFinalTest",0);
        TextView VathmosFinalTest = findViewById(R.id.textView51);
        VathmosFinalTest.setText(String.valueOf(scoreFinalTest)+"/7");
    }
}