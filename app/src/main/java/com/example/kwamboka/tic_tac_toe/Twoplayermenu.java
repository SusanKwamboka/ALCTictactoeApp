package com.example.kwamboka.tic_tac_toe;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Twoplayermenu extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_twoplayermenu);
    }

    public void goBack(View view){
        Intent intent = new Intent(getApplicationContext(), MainActivity.class);
        startActivity(intent);
    }
    public void goFive(View view){
        Intent intent = new Intent(getApplicationContext(), Twoplayer5.class);
        startActivity(intent);
    }
    public void goThree(View view){
        Intent intent = new Intent(getApplicationContext(), Twoplayer3.class);
        startActivity(intent);
    }}