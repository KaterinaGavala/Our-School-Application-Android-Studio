package com.example.ourschoolapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.TextView;

public class Test5 extends AppCompatActivity {
    private Button button8, button9, button11, button12, button10, button13, button14, button15,
            button16, button17, button18, button19, buttonfinish;
    private int score=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test5);

        button8 =(Button) findViewById(R.id.button8);
        button9 =(Button) findViewById(R.id.button9);
        button11 =(Button) findViewById(R.id.button11);
        button12 =(Button) findViewById(R.id.button12);
        button10 =(Button) findViewById(R.id.button10);
        button13 =(Button) findViewById(R.id.button13);
        button14 =(Button) findViewById(R.id.button14);
        button15 =(Button) findViewById(R.id.button15);
        button16 =(Button) findViewById(R.id.button16);
        button17 =(Button) findViewById(R.id.button17);
        button18 =(Button) findViewById(R.id.button18);
        button19 =(Button) findViewById(R.id.button19);
        buttonfinish =(Button) findViewById(R.id.buttonfinish);


        button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                TextView question1 = findViewById(R.id.textView25);
                question1.setVisibility(View.VISIBLE);
                button9.setClickable(false);

                score++;

            }
        });

        button9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                TextView question1 = findViewById(R.id.textView26);
                question1.setVisibility(View.VISIBLE);
                button8.setClickable(false);


            }
        });


        button11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                TextView question1 = findViewById(R.id.textView24);
                question1.setVisibility(View.VISIBLE);
                button12.setClickable(false);
                score++;

            }
        });

        button12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                TextView question1 = findViewById(R.id.textView32);
                question1.setVisibility(View.VISIBLE);
                button11.setClickable(false);


            }
        });

        button10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                TextView question1 = findViewById(R.id.textView28);
                question1.setVisibility(View.VISIBLE);
                button13.setClickable(false);


            }
        });

        button13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                TextView question1 = findViewById(R.id.textView29);
                question1.setVisibility(View.VISIBLE);
                button10.setClickable(false);

                score++;


            }
        });

        button14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                TextView question1 = findViewById(R.id.textView33);
                question1.setVisibility(View.VISIBLE);
                button15.setClickable(false);

                score++;

            }
        });

        button15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                TextView question1 = findViewById(R.id.textView34);
                question1.setVisibility(View.VISIBLE);
                button14.setClickable(false);


            }
        });

        button16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                TextView question1 = findViewById(R.id.textView36);
                question1.setVisibility(View.VISIBLE);
                button17.setClickable(false);

                score++;

            }
        });

        button17.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                TextView question1 = findViewById(R.id.textView37);
                question1.setVisibility(View.VISIBLE);
                button16.setClickable(false);


            }
        });

        button18.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                TextView question1 = findViewById(R.id.textView40);
                question1.setVisibility(View.VISIBLE);
                button19.setClickable(false);

            }
        });

        button19.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                TextView question1 = findViewById(R.id.textView39);
                question1.setVisibility(View.VISIBLE);
                button18.setClickable(false);

                score++;
            }
        });

        SharedPreferences ScoreTest5= this.getSharedPreferences("ScoredTest5", Context.MODE_PRIVATE);
        SharedPreferences.Editor Editor= ScoreTest5.edit();

        buttonfinish.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                Editor.putInt("score5",score);
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

    public void pollaplis1(View view)
    {
        boolean check=((RadioButton)view).isChecked();
        Button disabled=null;
        switch (view.getId())
        {
            case R.id.radioButton3:
                if(check){
                    disabled=findViewById(R.id.radioButton2);
                    disabled.setClickable(false);
                    disabled=findViewById(R.id.radioButton);
                    disabled.setClickable(false);
                    disabled=findViewById(R.id.radioButton3);
                    disabled.setTextColor(Color.GREEN);
                    disabled.setClickable(false);
                    score++;
                    break;
                }
            case R.id.radioButton2:
                if(check){
                    disabled=findViewById(R.id.radioButton3);
                    disabled.setTextColor(Color.GREEN);
                    disabled.setClickable(false);
                    disabled=findViewById(R.id.radioButton);
                    disabled.setClickable(false);
                    disabled=findViewById(R.id.radioButton2);
                    disabled.setTextColor(Color.RED);
                    disabled.setClickable(false);
                    break;
                }
            case R.id.radioButton:
                if(check){
                    disabled=findViewById(R.id.radioButton2);
                    disabled.setClickable(false);
                    disabled=findViewById(R.id.radioButton3);
                    disabled.setTextColor(Color.GREEN);
                    disabled.setClickable(false);
                    disabled=findViewById(R.id.radioButton);
                    disabled.setTextColor(Color.RED);
                    disabled.setClickable(false);
                    break;
                }
        }
    }

    public void pollaplis2(View view)
    {
        boolean check=((RadioButton)view).isChecked();
        Button disabled=null;
        switch (view.getId())
        {
            case R.id.radioButton5:
                if(check){
                    disabled=findViewById(R.id.radioButton4);
                    disabled.setClickable(false);
                    disabled=findViewById(R.id.radioButton6);
                    disabled.setClickable(false);
                    disabled=findViewById(R.id.radioButton5);
                    disabled.setTextColor(Color.GREEN);
                    disabled.setClickable(false);
                    score++;
                    break;
                }
            case R.id.radioButton4:
                if(check){
                    disabled=findViewById(R.id.radioButton5);
                    disabled.setTextColor(Color.GREEN);
                    disabled.setClickable(false);
                    disabled=findViewById(R.id.radioButton6);
                    disabled.setClickable(false);
                    disabled=findViewById(R.id.radioButton4);
                    disabled.setTextColor(Color.RED);
                    disabled.setClickable(false);
                    break;
                }
            case R.id.radioButton6:
                if(check){
                    disabled=findViewById(R.id.radioButton5);
                    disabled.setClickable(false);
                    disabled=findViewById(R.id.radioButton4);
                    disabled.setTextColor(Color.GREEN);
                    disabled.setClickable(false);
                    disabled=findViewById(R.id.radioButton6);
                    disabled.setTextColor(Color.RED);
                    disabled.setClickable(false);
                    break;
                }
        }
    }

    public void pollaplis3(View view)
    {
        boolean check=((RadioButton)view).isChecked();
        Button disabled=null;
        switch (view.getId())
        {
            case R.id.radioButton9:
                if(check){
                    disabled=findViewById(R.id.radioButton7);
                    disabled.setClickable(false);
                    disabled=findViewById(R.id.radioButton8);
                    disabled.setClickable(false);
                    disabled=findViewById(R.id.radioButton9);
                    disabled.setTextColor(Color.GREEN);
                    disabled.setClickable(false);
                    score++;
                    break;
                }
            case R.id.radioButton7:
                if(check){
                    disabled=findViewById(R.id.radioButton9);
                    disabled.setTextColor(Color.GREEN);
                    disabled.setClickable(false);
                    disabled=findViewById(R.id.radioButton8);
                    disabled.setClickable(false);
                    disabled=findViewById(R.id.radioButton7);
                    disabled.setTextColor(Color.RED);
                    disabled.setClickable(false);
                    break;
                }
            case R.id.radioButton8:
                if(check){
                    disabled=findViewById(R.id.radioButton7);
                    disabled.setClickable(false);
                    disabled=findViewById(R.id.radioButton9);
                    disabled.setTextColor(Color.GREEN);
                    disabled.setClickable(false);
                    disabled=findViewById(R.id.radioButton8);
                    disabled.setTextColor(Color.RED);
                    disabled.setClickable(false);
                    break;
                }
        }
    }
}