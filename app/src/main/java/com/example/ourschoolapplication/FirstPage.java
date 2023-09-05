package com.example.ourschoolapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class FirstPage extends AppCompatActivity {

    private Button buttonKef5,buttonKef6, buttonKef7, buttonStat, buttonTest;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first_page);


        buttonKef5 =(Button) findViewById(R.id.button5);
        buttonKef5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                openKef5();
            }
        });

        buttonKef6 =(Button) findViewById(R.id.button6);
        buttonKef6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                openKef6();
            }
        });

        buttonKef7 =(Button) findViewById(R.id.button7);
        buttonKef7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                openKef7();
            }
        });

        buttonStat =(Button) findViewById(R.id.button3);
        buttonStat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                openStat();
            }
        });

        buttonTest =(Button) findViewById(R.id.button2);
        buttonTest.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                openFinalTest();
            }
        });
    }

    public void openKef5()
    {
        Intent intent = new Intent(this, Kef_5.class);
        startActivity(intent);

    }

    public void openKef6()
    {
        Intent intent = new Intent(this, Kef_6.class);
        startActivity(intent);

    }

    public void openKef7()
    {
        Intent intent = new Intent(this, Kef_7.class);
        startActivity(intent);

    }

    public void openStat()
    {
        Intent intent = new Intent(this, Statistics.class);
        startActivity(intent);

    }

    public void openFinalTest()
    {
        Intent intent = new Intent(this, FinalTest.class);
        startActivity(intent);

    }



}