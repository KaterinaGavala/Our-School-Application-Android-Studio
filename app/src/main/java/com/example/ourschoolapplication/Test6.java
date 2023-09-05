package com.example.ourschoolapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Test6 extends AppCompatActivity {
    private Button button1, button2, button3, button4, button5,button6, button7, button8, button9, button10, button11, button12,buttonfinish6;
    private int score=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test6);

        button1 =(Button) findViewById(R.id.button1);
        button2 =(Button) findViewById(R.id.button2);
        button3 =(Button) findViewById(R.id.button3);
        button4 =(Button) findViewById(R.id.button4);
        button5 =(Button) findViewById(R.id.button5);
        button6 =(Button) findViewById(R.id.button6);
        button7 =(Button) findViewById(R.id.button7);
        button8 =(Button) findViewById(R.id.button8);
        button9 =(Button) findViewById(R.id.button9);
        button10 =(Button) findViewById(R.id.button10);
        button11 =(Button) findViewById(R.id.button11);
        button12 =(Button) findViewById(R.id.button12);
        buttonfinish6 =(Button) findViewById(R.id.buttonfinish6);

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                TextView question1 = findViewById(R.id.textView3);
                question1.setVisibility(View.VISIBLE);
                button2.setClickable(false);
                score++;

            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                TextView question1 = findViewById(R.id.textView14);
                question1.setVisibility(View.VISIBLE);
                button1.setClickable(false);

            }
        });

        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                TextView question1 = findViewById(R.id.textView5);
                question1.setVisibility(View.VISIBLE);
                button4.setClickable(false);

            }
        });

        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                TextView question1 = findViewById(R.id.textView15);
                question1.setVisibility(View.VISIBLE);
                button3.setClickable(false);
                score++;

            }
        });

        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                TextView question1 = findViewById(R.id.textView7);
                question1.setVisibility(View.VISIBLE);
                button6.setClickable(false);
                score++;

            }
        });

        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                TextView question1 = findViewById(R.id.textView16);
                question1.setVisibility(View.VISIBLE);
                button5.setClickable(false);

            }
        });

        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                TextView question1 = findViewById(R.id.textView9);
                question1.setVisibility(View.VISIBLE);
                button8.setClickable(false);

            }
        });

        button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                TextView question1 = findViewById(R.id.textView17);
                question1.setVisibility(View.VISIBLE);
                button7.setClickable(false);
                score++;

            }
        });

        button9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                TextView question1 = findViewById(R.id.textView11);
                question1.setVisibility(View.VISIBLE);
                button10.setClickable(false);

            }
        });

        button10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                TextView question1 = findViewById(R.id.textView18);
                question1.setVisibility(View.VISIBLE);
                button9.setClickable(false);
                score++;

            }
        });

        button11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                TextView question1 = findViewById(R.id.textView13);
                question1.setVisibility(View.VISIBLE);
                button12.setClickable(false);
                score++;

            }
        });

        button12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                TextView question1 = findViewById(R.id.textView19);
                question1.setVisibility(View.VISIBLE);
                button11.setClickable(false);

            }
        });

        SharedPreferences ScoreTest6= this.getSharedPreferences("ScoredTest6", Context.MODE_PRIVATE);
        SharedPreferences.Editor Editor= ScoreTest6.edit();

        buttonfinish6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                Editor.putInt("score6",score);
                Editor.apply();
                openActivity2();

            }
        });

    }

    public void openActivity2()
    {
        Intent intent = new Intent(this, FirstPage.class);
        startActivity(intent);

    }
}