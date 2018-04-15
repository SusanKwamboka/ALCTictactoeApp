package com.example.kwamboka.tic_tac_toe;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override

    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        }

    public void goSingle(View view){
        Intent intent = new Intent(getApplicationContext(), Mainmenu.class);
        startActivity(intent);
    }
    public void goTwin(View view){
        Intent intent = new Intent(getApplicationContext(), Twoplayermenu.class);
        startActivity(intent);
    }}






