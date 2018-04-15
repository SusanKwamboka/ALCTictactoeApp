package com.example.kwamboka.tic_tac_toe;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class Twoplayer5 extends AppCompatActivity implements View.OnClickListener{


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
        Button ten;

        Button eleven;
        Button twelve;
        Button thirteen;
        Button fourteen;
        Button fifteen;

        Button sixteen;
        Button seventeen;
        Button eighteen;
        Button nineteen;
        Button twenty;

        Button tweone;
        Button twetwo;
        Button twethree;
        Button twefour;
        Button twefive;

        Button reset;
        Button back;

        TextView tvInfo;
        int xscore =0;
        int oscore =0;

        int[][] boardStatus = new int[5][5];

        @Override
        protected void onCreate(Bundle savedInstanceState) {

            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_twoplayer5);
            one =  findViewById(R.id.one);
            two=  findViewById(R.id.two);
            three =  findViewById(R.id.three);
            four =  findViewById(R.id.four);
            five =  findViewById(R.id.five);
            six =  findViewById(R.id.six);
            seven =  findViewById(R.id.seven);
            eight =  findViewById(R.id.eight);
            nine =  findViewById(R.id.nine);
            ten =  findViewById(R.id.ten);
            eleven=  findViewById(R.id.eleven);
            twelve =  findViewById(R.id.twelve);
            thirteen =  findViewById(R.id.thirteen);
            fourteen =  findViewById(R.id.fourteen);
            fifteen =  findViewById(R.id.fifteen);
            sixteen =  findViewById(R.id.sixteen);
            seventeen =  findViewById(R.id.seventeen);
            eighteen =  findViewById(R.id.eighteen);
            nineteen =  findViewById(R.id.nineteen);
            twenty=  findViewById(R.id.twenty);
            tweone =  findViewById(R.id.tweone);
            twetwo =  findViewById(R.id.twetwo);
            twethree =  findViewById(R.id.twethree);
            twefour =  findViewById(R.id.twefour);
            twefive =  findViewById(R.id.twefive);

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
            ten.setOnClickListener(this);

            eleven.setOnClickListener(this);
            twelve.setOnClickListener(this);
            thirteen.setOnClickListener(this);
            fourteen.setOnClickListener(this);
            fifteen.setOnClickListener(this);

            sixteen.setOnClickListener(this);
            seventeen.setOnClickListener(this);
            eighteen.setOnClickListener(this);
            nineteen.setOnClickListener(this);
            twenty.setOnClickListener(this);

            tweone.setOnClickListener(this);
            twetwo.setOnClickListener(this);
            twethree.setOnClickListener(this);
            twefour.setOnClickListener(this);
            twefive.setOnClickListener(this);


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
                        boardStatus[0][3]=1;
                    }
                    else{
                        four.setText("0");
                        boardStatus[0][3] = 0;
                    }
                    four.setEnabled(false);
                    break;

                case R.id.five:
                    if(PLAYER_X){
                        five.setText("X");
                        boardStatus[0][4] = 1;
                    }
                    else{
                        five.setText("0");
                        boardStatus[0][4] = 0;
                    }
                    five.setEnabled(false);
                    break;

                case R.id.six:
                    if(PLAYER_X){
                        six.setText("X");
                        boardStatus[1][0] = 1;
                    }
                    else{
                        six.setText("0");
                        boardStatus[1][0] = 0;
                    }
                    six.setEnabled(false);
                    break;

                case R.id.seven:
                    if(PLAYER_X){
                        seven.setText("X");
                        boardStatus[1][1] = 1;
                    }
                    else{
                        seven.setText("0");
                        boardStatus[1][1] = 0;
                    }
                    seven.setEnabled(false);
                    break;

                case R.id.eight:
                    if(PLAYER_X){
                        eight.setText("X");
                        boardStatus[1][2] = 1;
                    }
                    else{
                        eight.setText("0");
                        boardStatus[1][2] = 0;
                    }
                    eight.setEnabled(false);
                    break;

                case R.id.nine:
                    if(PLAYER_X){
                        nine.setText("X");
                        boardStatus[1][3] = 1;
                    }
                    else{
                        nine.setText("0");
                        boardStatus[1][3] = 0;
                    }
                    nine.setEnabled(false);
                    break;
                case R.id.ten:
                    if(PLAYER_X){
                        ten.setText("X");
                        boardStatus[1][4] = 1;
                    }
                    else{
                        ten.setText("0");
                        boardStatus[1][4] = 0;
                    }
                   ten.setEnabled(false);
                    break;
                case R.id.eleven:
                    if(PLAYER_X){
                        eleven.setText("X");
                        boardStatus[2][0] = 1;
                    }
                    else{
                        eleven.setText("0");
                        boardStatus[2][0] = 0;
                    }
                   eleven.setEnabled(false);
                    break;
                case R.id.twelve:
                    if(PLAYER_X){
                        twelve.setText("X");
                        boardStatus[2][1] = 1;
                    }
                    else{
                        twelve.setText("0");
                        boardStatus[2][1] = 0;
                    }
                   twelve.setEnabled(false);
                    break;
                case R.id.thirteen:
                    if(PLAYER_X){
                        thirteen.setText("X");
                        boardStatus[2][2] = 1;
                    }
                    else{
                        thirteen.setText("0");
                        boardStatus[2][2] = 0;
                    }
                    thirteen.setEnabled(false);
                    break;
                case R.id.fourteen:
                    if(PLAYER_X){
                        fourteen.setText("X");
                        boardStatus[2][3] = 1;
                    }
                    else{
                        fourteen.setText("0");
                        boardStatus[2][3] = 0;
                    }
                    fourteen.setEnabled(false);
                    break;
                case R.id.fifteen:
                    if(PLAYER_X){
                        fifteen.setText("X");
                        boardStatus[2][4] = 1;
                    }
                    else{
                        fifteen.setText("0");
                        boardStatus[2][4] = 0;
                    }
                    fifteen.setEnabled(false);
                    break;
                case R.id.sixteen:
                    if(PLAYER_X){
                        sixteen.setText("X");
                        boardStatus[3][0] = 1;
                    }
                    else{
                        sixteen.setText("0");
                        boardStatus[3][0] = 0;
                    }
                    sixteen.setEnabled(false);
                    break;
                case R.id.seventeen:
                    if(PLAYER_X){
                        seventeen.setText("X");
                        boardStatus[3][1] = 1;
                    }
                    else{
                        seventeen.setText("0");
                        boardStatus[3][1] = 0;
                    }
                    seventeen.setEnabled(false);
                    break;
                case R.id.eighteen:
                    if(PLAYER_X){
                        eighteen.setText("X");
                        boardStatus[3][2] = 1;
                    }
                    else{
                        eighteen.setText("0");
                        boardStatus[3][2] = 0;
                    }
                    eighteen.setEnabled(false);
                    break;
                case R.id.nineteen:
                    if(PLAYER_X){
                        nineteen.setText("X");
                        boardStatus[3][3] = 1;
                    }
                    else{
                        nineteen.setText("0");
                        boardStatus[3][3] = 0;
                    }
                    nineteen.setEnabled(false);
                    break;
                case R.id.twenty:
                    if(PLAYER_X){
                        twenty.setText("X");
                        boardStatus[3][4] = 1;
                    }
                    else{
                        twenty.setText("0");
                        boardStatus[3][4] = 0;
                    }
                    twenty.setEnabled(false);
                    break;
                case R.id.tweone:
                    if(PLAYER_X){
                        tweone.setText("X");
                        boardStatus[4][0] = 1;
                    }
                    else{
                        tweone.setText("0");
                        boardStatus[4][0] = 0;
                    }
                    tweone.setEnabled(false);
                    break;
                case R.id.twetwo:
                    if(PLAYER_X){
                        twetwo.setText("X");
                        boardStatus[4][1] = 1;
                    }
                    else{
                        twetwo.setText("0");
                        boardStatus[4][1] = 0;
                    }
                    twetwo.setEnabled(false);
                    break;
                case R.id.twethree:
                    if(PLAYER_X){
                        twethree.setText("X");
                        boardStatus[4][2] = 1;
                    }
                    else{
                        twethree.setText("0");
                        boardStatus[4][2] = 0;
                    }
                    twethree.setEnabled(false);
                    break;
                case R.id.twefour:
                    if(PLAYER_X){
                        twefour.setText("X");
                        boardStatus[4][3] = 1;
                    }
                    else{
                        twefour.setText("0");
                        boardStatus[4][3] = 0;
                    }
                    twefour.setEnabled(false);
                    break;
                case R.id.twefive:
                    if(PLAYER_X){
                        twefive.setText("X");
                        boardStatus[4][4] = 1;
                    }
                    else{
                        twefive.setText("0");
                        boardStatus[4][4] = 0;
                    }
                    twefive.setEnabled(false);
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

                if(TURN_COUNT==25){
                    result("Game Draw");
                }

                checkWinner();
            }
        }

        private void checkWinner(){

            Log.d(TAG, "Inside checkWinner");

            //Horizontal --- rows
            for(int i=0; i<=4; i++){
                if(boardStatus[i][0] == boardStatus[i][1] && boardStatus[i][0] == boardStatus[i][2] && boardStatus[i][0] == boardStatus[i][3] && boardStatus[i][0] == boardStatus[i][4]){
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
            for(int i=0; i<=4; i++){
                if(boardStatus[0][i] == boardStatus[1][i] && boardStatus[0][i] == boardStatus[2][i]&& boardStatus[0][i] == boardStatus[3][i]&& boardStatus[0][i] == boardStatus[4][i]){
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
            if(boardStatus[0][0] == boardStatus[1][1] && boardStatus[0][0] == boardStatus[2][2]&& boardStatus[0][0] == boardStatus[3][3]&& boardStatus[0][0] == boardStatus[4][4]){
                if (boardStatus[0][0]==1){
                    result("Player X wins!\nFirst Diagonal");
                    xscore++;
                    TextView compTextView =  findViewById(R.id.cscore);
                    compTextView.setText( "" + xscore);
                }
                else if (boardStatus[0][0]==0) {
                    result("Player 0 wins!r\nFirst Diagonal");
                    oscore++;
                    TextView compTextView =  findViewById(R.id.mescore);
                    compTextView.setText( "" + oscore);
                }
            }

            //Second diagonal
            if(boardStatus[0][4] == boardStatus[1][3] && boardStatus[0][4] == boardStatus[2][2]&& boardStatus[0][4] == boardStatus[3][1]&& boardStatus[0][4] == boardStatus[4][0]){
                if (boardStatus[0][4]==1){
                    result("Player X wins!\nSecond Diagonal");
                    xscore++;
                    TextView compTextView =  findViewById(R.id.cscore);
                    compTextView.setText( "" + xscore);
                }
                else if (boardStatus[0][4]==0) {
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
            ten.setEnabled(value);
            eleven.setEnabled(value);
            twelve.setEnabled(value);
            thirteen.setEnabled(value);
            fourteen.setEnabled(value);
            fifteen.setEnabled(value);
            sixteen.setEnabled(value);
            seventeen.setEnabled(value);
            eighteen.setEnabled(value);
            nineteen.setEnabled(value);
            twenty.setEnabled(value);
            tweone.setEnabled(value);
            twetwo.setEnabled(value);
            twethree.setEnabled(value);
            twefour.setEnabled(value);
            twefive.setEnabled(value);
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
            ten.setText("");
            eleven.setText("");
            twelve.setText("");
            thirteen.setText("");
            fourteen.setText("");
            fifteen.setText("");
            sixteen.setText("");
            seventeen.setText("");
            eighteen.setText("");
            nineteen.setText("");
            twenty.setText("");
            tweone.setText("");
            twetwo.setText("");
            twethree.setText("");
            twefour.setText("");
            twefive.setText("");

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
            for(int i = 0; i < 5; i++){
                for(int j = 0; j < 5; j++){
                    boardStatus[i][j] = -1;
                }
            }

        }


    }



