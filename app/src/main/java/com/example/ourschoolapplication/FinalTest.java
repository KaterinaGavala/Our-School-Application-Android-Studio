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

public class FinalTest extends AppCompatActivity {
    private Button button1, button2, button3, button4, button5,button6, button7, button8, button9, button10, buttonfinishfinal,
    buttonback;
    private int score=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_final_test);

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
        buttonfinishfinal =(Button) findViewById(R.id.buttonfinishfinal);
        buttonback =(Button) findViewById(R.id.buttonback);

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

              //  TextView question1 = findViewById(R.id.textView14);
              //  question1.setVisibility(View.VISIBLE);
                button1.setBackgroundColor(Color.GRAY);
                button2.setClickable(false);

            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

               // TextView question1 = findViewById(R.id.textView3);
               // question1.setVisibility(View.VISIBLE);
                button2.setBackgroundColor(Color.GRAY);
                button1.setClickable(false);
                score++;

            }
        });

        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

              //  TextView question1 = findViewById(R.id.textView5);
               // question1.setVisibility(View.VISIBLE);
                button3.setBackgroundColor(Color.GRAY);
                button4.setClickable(false);
                score++;

            }
        });

        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

              //  TextView question1 = findViewById(R.id.textView15);
              //  question1.setVisibility(View.VISIBLE);
                button4.setBackgroundColor(Color.GRAY);
                button3.setClickable(false);

            }
        });

        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

               // TextView question1 = findViewById(R.id.textView16);
               // question1.setVisibility(View.VISIBLE);
                button5.setBackgroundColor(Color.GRAY);
                button6.setClickable(false);

            }
        });

        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

              //  TextView question1 = findViewById(R.id.textView7);
              //  question1.setVisibility(View.VISIBLE);
                button6.setBackgroundColor(Color.GRAY);
                button5.setClickable(false);
                score++;

            }
        });

        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

              //  TextView question1 = findViewById(R.id.textView9);
               // question1.setVisibility(View.VISIBLE);
                button7.setBackgroundColor(Color.GRAY);
                button8.setClickable(false);
                score++;

            }
        });

        button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

               // TextView question1 = findViewById(R.id.textView17);
              //  question1.setVisibility(View.VISIBLE);
                button8.setBackgroundColor(Color.GRAY);
                button7.setClickable(false);

            }
        });

        button9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

             //   TextView question1 = findViewById(R.id.textView11);
              //  question1.setVisibility(View.VISIBLE);
                button9.setBackgroundColor(Color.GRAY);
                button10.setClickable(false);
                score++;

            }
        });

        button10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

             //   TextView question1 = findViewById(R.id.textView18);
              //  question1.setVisibility(View.VISIBLE);
                button10.setBackgroundColor(Color.GRAY);
                button9.setClickable(false);

            }
        });



        SharedPreferences ScoreFinalTest= this.getSharedPreferences("ScoredFinalTest", Context.MODE_PRIVATE);
        SharedPreferences.Editor Editor= ScoreFinalTest.edit();

        buttonfinishfinal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                Editor.putInt("ScoreFinalTest",score);
                Editor.apply();

                TextView show1;
                show1=findViewById(R.id.textView3);
                show1.setVisibility(View.VISIBLE);
                show1=findViewById(R.id.textView5);
                show1.setVisibility(View.VISIBLE);
                show1=findViewById(R.id.textView7);
                show1.setVisibility(View.VISIBLE);
                show1=findViewById(R.id.textView9);
                show1.setVisibility(View.VISIBLE);
                show1=findViewById(R.id.textView11);
                show1.setVisibility(View.VISIBLE);

                Button buttonShow;
                buttonShow=findViewById(R.id.radioButton3);
                buttonShow.setTextColor(Color.GREEN);
                buttonShow=findViewById(R.id.radioButton5);
                buttonShow.setTextColor(Color.GREEN);

                buttonfinishfinal.setClickable(false);

                TextView textScore = findViewById(R.id.textView44);
                //textScore.setText("Ο βαθμός που πήρες στο τελικό διαγώνισμα είναι: "+score+"/7. Δες πάνω τις σωστές απαντήσεις.");
                if (score<5){
                    textScore.setText("Βαθμός "+score+"/7. Χρείαζεσαι περισσότερο διάβασμα. Δες πάνω τις σωστές απαντήσεις.");
                }
                else{
                    textScore.setText("Βαθμός "+score+"/7. Τα πηγες πολύ καλά. Δες πάνω τις σωστές απαντήσεις.");
                }


            }
        });

        buttonback.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

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
                    //disabled.setTextColor(Color.GREEN);
                    disabled.setClickable(false);
                    score++;
                    break;
                }
            case R.id.radioButton2:
                if(check){
                    disabled=findViewById(R.id.radioButton3);
                    //disabled.setTextColor(Color.GREEN);
                    disabled.setClickable(false);
                    disabled=findViewById(R.id.radioButton);
                    disabled.setClickable(false);
                    disabled=findViewById(R.id.radioButton2);
                    //disabled.setTextColor(Color.RED);
                    disabled.setClickable(false);
                    break;
                }
            case R.id.radioButton:
                if(check){
                    disabled=findViewById(R.id.radioButton2);
                    disabled.setClickable(false);
                    disabled=findViewById(R.id.radioButton3);
                    //disabled.setTextColor(Color.GREEN);
                    disabled.setClickable(false);
                    disabled=findViewById(R.id.radioButton);
                    //disabled.setTextColor(Color.RED);
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
                    //disabled.setTextColor(Color.GREEN);
                    disabled.setClickable(false);
                    score++;
                    break;
                }
            case R.id.radioButton4:
                if(check){
                    disabled=findViewById(R.id.radioButton5);
                    //disabled.setTextColor(Color.GREEN);
                    disabled.setClickable(false);
                    disabled=findViewById(R.id.radioButton6);
                    disabled.setClickable(false);
                    disabled=findViewById(R.id.radioButton4);
                    //disabled.setTextColor(Color.RED);
                    disabled.setClickable(false);
                    break;
                }
            case R.id.radioButton6:
                if(check){
                    disabled=findViewById(R.id.radioButton4);
                    disabled.setClickable(false);
                    disabled=findViewById(R.id.radioButton5);
                    //disabled.setTextColor(Color.GREEN);
                    disabled.setClickable(false);
                    disabled=findViewById(R.id.radioButton6);
                    //disabled.setTextColor(Color.RED);
                    disabled.setClickable(false);
                    break;
                }
        }
    }
}