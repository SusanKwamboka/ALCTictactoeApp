package com.example.kwamboka.tic_tac_toe;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class Twoplayer3 extends AppCompatActivity implements View.OnClickListener{


    public void goBack(View view){
        Intent intent = new Intent(getApplicationContext(), Twoplayermenu.class);
        startActivity(intent);
    }




        private final static String TAG = MainActivity.class.getSimpleName();
        boolean PLAYER_X = true;

        int TURN_COUNT = 0;

        Button one;
        Button two;
        Button three;

        Button four;
        Button five;
        Button six;

        Button seven;
        Button eight;
        Button nine;

        Button reset;
        Button back;

        TextView tvInfo;
        int xscore =0;
        int oscore =0;

        int[][] boardStatus = new int[3][3];

        @Override
        protected void onCreate(Bundle savedInstanceState) {

            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_twoplayer3);
            one =  findViewById(R.id.one);
            two=  findViewById(R.id.two);
            three =  findViewById(R.id.three);

            four =  findViewById(R.id.four);
            five =  findViewById(R.id.five);
            six =  findViewById(R.id.six);

            seven =  findViewById(R.id.seven);
            eight =  findViewById(R.id.eight);
            nine =  findViewById(R.id.nine);

            reset =  findViewById(R.id.reset);
            tvInfo =  findViewById(R.id.dialogue);

            reset.setOnClickListener(this);

            one.setOnClickListener(this);
            two.setOnClickListener(this);
            three.setOnClickListener(this);

            four.setOnClickListener(this);
            five.setOnClickListener(this);
            six.setOnClickListener(this);

            seven.setOnClickListener(this);
            eight.setOnClickListener(this);
            nine.setOnClickListener(this);

            initializeBoardStatus();

        }

        @Override
        public void onClick(View view) {
            Log.d(TAG, "Inside onClick");

            boolean resetButtonPressed = false;

            switch (view.getId()){
                case R.id.one:
                    if(PLAYER_X){
                        one.setText("X");
                        boardStatus[0][0] = 1;
                    }
                    else{
                        one.setText("0");
                        boardStatus[0][0] = 0;
                    }
                    one.setEnabled(false);
                    break;

                case R.id.two:
                    if(PLAYER_X){
                        two.setText("X");
                        boardStatus[0][1] = 1;
                    }
                    else{
                        two.setText("0");
                        boardStatus[0][1] = 0;
                    }
                    two.setEnabled(false);
                    break;

                case R.id.three:
                    if(PLAYER_X){
                        three.setText("X");
                        boardStatus[0][2] = 1;
                    }
                    else{
                        three.setText("0");
                        boardStatus[0][2] = 0;
                    }
                    three.setEnabled(false);
                    break;

                case R.id.four:
                    if(PLAYER_X){
                        four.setText("X");
                        boardStatus[1][0] = 1;
                    }
                    else{
                        four.setText("0");
                        boardStatus[1][0] = 0;
                    }
                    four.setEnabled(false);
                    break;

                case R.id.five:
                    if(PLAYER_X){
                        five.setText("X");
                        boardStatus[1][1] = 1;
                    }
                    else{
                        five.setText("0");
                        boardStatus[1][1] = 0;
                    }
                    five.setEnabled(false);
                    break;

                case R.id.six:
                    if(PLAYER_X){
                        six.setText("X");
                        boardStatus[1][2] = 1;
                    }
                    else{
                       six.setText("0");
                        boardStatus[1][2] = 0;
                    }
                    six.setEnabled(false);
                    break;

                case R.id.seven:
                    if(PLAYER_X){
                        seven.setText("X");
                        boardStatus[2][0] = 1;
                    }
                    else{
                        seven.setText("0");
                        boardStatus[2][0] = 0;
                    }
                    seven.setEnabled(false);
                    break;

                case R.id.eight:
                    if(PLAYER_X){
                        eight.setText("X");
                        boardStatus[2][1] = 1;
                    }
                    else{
                        eight.setText("0");
                        boardStatus[2][1] = 0;
                    }
                    eight.setEnabled(false);
                    break;

                case R.id.nine:
                    if(PLAYER_X){
                        nine.setText("X");
                        boardStatus[2][2] = 1;
                    }
                    else{
                        nine.setText("0");
                        boardStatus[2][2] = 0;
                    }
                    nine.setEnabled(false);
                    break;

                case R.id.reset:
                    resetButtonPressed = true;
                    break;

                default:
                    break;

            }

            if(resetButtonPressed){
                resetBoard();
            }
            else{
                TURN_COUNT ++;
                PLAYER_X = !PLAYER_X;

                if(PLAYER_X){
                    setInfo("Player X turn");
                }
                else {
                    setInfo("Player 0 turn");
                }

                if(TURN_COUNT==9){
                    result("Game Draw");
                }

                checkWinner();
            }
        }

        private void checkWinner(){

            Log.d(TAG, "Inside checkWinner");

            //Horizontal --- rows
            for(int i=0; i<3; i++){
                if(boardStatus[i][0] == boardStatus[i][1] && boardStatus[i][0] == boardStatus[i][2]){
                    if (boardStatus[i][0]==1){
                        result("player X wins!\n" +" row " + (i+1));
                        xscore++;
                        TextView compTextView =  findViewById(R.id.cscore);
                        compTextView.setText( "" + xscore);
                        break;
                    }
                    else if (boardStatus[i][0]==0) {
                        result("player 0 wins!\n" +" row "  + (i+1));
                        oscore++;
                        TextView compTextView =  findViewById(R.id.mescore);
                        compTextView.setText( "" + oscore);
                        break;
                    }
                }
            }

            //Vertical --- columns
            for(int i=0; i<3; i++){
                if(boardStatus[0][i] == boardStatus[1][i] && boardStatus[0][i] == boardStatus[2][i]){
                    if (boardStatus[0][i]==1){
                        result("Player X wins!\n" + " column " + (i+1));
                        xscore++;
                        TextView compTextView =  findViewById(R.id.cscore);
                        compTextView.setText( "" + xscore);
                        break;
                    }
                    else if (boardStatus[0][i]==0) {
                        result("Player 0 wins!\n" + " column " + (i+1));
                        oscore++;
                        TextView compTextView =  findViewById(R.id.mescore);
                        compTextView.setText( "" + oscore);
                        break;
                    }
                }
            }

            //First diagonal
            if(boardStatus[0][0] == boardStatus[1][1] && boardStatus[0][0] == boardStatus[2][2]){
                if (boardStatus[0][0]==1){
                    result("Player X wins!\nFirst Diagonal");
                    xscore++;
                    TextView compTextView =  findViewById(R.id.cscore);
                    compTextView.setText( "" + xscore);
                }
                else if (boardStatus[0][0]==0) {
                    result("Player 0 wins!\nFirst Diagonal");
                    oscore++;
                    TextView compTextView =  findViewById(R.id.mescore);
                    compTextView.setText( "" + oscore);
                }
            }

            //Second diagonal
            if(boardStatus[0][2] == boardStatus[1][1] && boardStatus[0][2] == boardStatus[2][0]){
                if (boardStatus[0][2]==1){
                    result("Player X wins!\nSecond Diagonal");
                    xscore++;
                    TextView compTextView =  findViewById(R.id.cscore);
                    compTextView.setText( "" + xscore);
                }
                else if (boardStatus[0][2]==0) {
                    result("Player 0 wins!\nSecond Diagonal");
                    oscore++;
                    TextView compTextView =  findViewById(R.id.mescore);
                    compTextView.setText( "" + oscore);
                }
            }
        }

        private void enableAllBoxes(boolean value){
            Log.d(TAG, "Inside enableAllBoxes");
            one.setEnabled(value);
            two.setEnabled(value);
            three.setEnabled(value);

            four.setEnabled(value);
            five.setEnabled(value);
            six.setEnabled(value);

            seven.setEnabled(value);
            eight.setEnabled(value);
            nine.setEnabled(value);
        }

        private void result(String winner){
            Log.d(TAG, "Inside result");

            setInfo(winner);
            enableAllBoxes(false);
        }

        private void resetBoard(){
            Log.d(TAG, "Inside resetBoard");
            one.setText("");
            two.setText("");
            three.setText("");

            four.setText("");
            five.setText("");
            six.setText("");

            seven.setText("");
            eight.setText("");
            nine.setText("");

            enableAllBoxes(true);

            PLAYER_X = true;
            TURN_COUNT = 0;

            initializeBoardStatus();

            setInfo("Player X Start!");

            Toast.makeText(this,"Board Reset Successfully",Toast.LENGTH_SHORT).show();
        }

        private void setInfo(String text){
            tvInfo.setText(text);
        }

        private void initializeBoardStatus(){
            for(int i = 0; i < 3; i++){
                for(int j = 0; j < 3; j++){
                    boardStatus[i][j] = -1;
                }
            }

        }


    }

