package com.example.kwamboka.tic_tac_toe;


import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;

public class Intro2 extends AppCompatActivity {

    int c[][];
    int i, j;
    Button b[][];
    TextView textView;
    AI ai;
    int myscore = 0 ;
    int compscore = 0;


    /**
     * Called when the activity is first created.
     */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intro2);
        setBoard();
        Button reset = (Button) findViewById(R.id.reset);
        reset.setOnClickListener(new OnClickListener(){
            @Override
            public void onClick(View v) {
                setBoard();
            }
        });


    }

    public void goBack(View view){
        Intent intent = new Intent(getApplicationContext(), Mainmenu.class);

        startActivity(intent);
    }


    //     setBoard();
    //}



    // Set up the game board.
    private void setBoard() {
        ai = new AI();
        b = new Button[6][6];
        c = new int[6][6];


        textView =  findViewById(R.id.dialogue);


        b[1][5] =  findViewById(R.id.one);
        b[1][4] =  findViewById(R.id.two);
        b[1][3] =  findViewById(R.id.three);
        b[1][2] =  findViewById(R.id.four);
        b[1][1] =  findViewById(R.id.five);

        b[2][5] =  findViewById(R.id.six);
        b[2][4] =  findViewById(R.id.seven);
        b[2][3] =  findViewById(R.id.eight);
        b[2][2] =  findViewById(R.id.nine);
        b[2][1] =  findViewById(R.id.ten);

        b[3][5] =  findViewById(R.id.eleven);
        b[3][4] =  findViewById(R.id.twelve);
        b[3][3] =  findViewById(R.id.thirteen);
        b[3][2] =  findViewById(R.id.fourteen);
        b[3][1] =  findViewById(R.id.fifteen);

        b[4][5] =  findViewById(R.id.sixteen);
        b[4][4] =  findViewById(R.id.seventeen);
        b[4][3] =  findViewById(R.id.eighteen);
        b[4][2] =  findViewById(R.id.nineteen);
        b[4][1] =  findViewById(R.id.twenty);

        b[5][5] =  findViewById(R.id.tweone);
        b[5][4] =  findViewById(R.id.twetwo);
        b[5][3] =  findViewById(R.id.twethree);
        b[5][2] =  findViewById(R.id.twefour);
        b[5][1] =  findViewById(R.id.twefive);


        for (i = 1; i <= 5; i++) {
            for (j = 1; j <= 5; j++)
                c[i][j] = 2;
        }


        textView.setText("Click any button in the grid to start");


        // add the click listeners for each button
        for (i = 1; i <= 5; i++) {
            for (j = 1; j <= 5; j++) {
                b[i][j].setOnClickListener(new MyClickListener(i, j));
                if (!b[i][j].isEnabled()) {
                    b[i][j].setText(" ");
                    b[i][j].setEnabled(true);
                }
            }
        }
    }

 /*  public int scoreboardplayer() {
        return myscore;
    }
    public int scoreboardcomp(){
        return compscore;
    }*/

    class MyClickListener implements View.OnClickListener {
        int x;
        int y;


        private MyClickListener(int x, int y) {
            this.x = x;
            this.y = y;
        }


        public void onClick(View view) {
            if (b[x][y].isEnabled()) {
                b[x][y].setEnabled(false);
                b[x][y].setText("O");
                c[x][y] = 0;
                textView.setText("");
                if (!checkBoard()) {
                    ai.takeTurn();
                }
            }
        }
    }


    private class AI {
        public void takeTurn() {
            if (c[1][1] == 2 &&
                    ((c[1][2] == 0 && c[1][3] == 0) ||
                            (c[2][2] == 0 && c[3][3] == 0) ||
                            (c[2][1] == 0 && c[3][1] == 0))) {
                markSquare(1, 1);
            } else if (c[1][2] == 2 &&
                    ((c[2][2] == 0 && c[3][2] == 0) ||
                            (c[1][1] == 0 && c[1][3] == 0))) {
                markSquare(1, 2);
            } else if (c[1][3] == 2 &&
                    ((c[1][1] == 0 && c[1][2] == 0) ||
                            (c[3][1] == 0 && c[2][2] == 0) ||
                            (c[2][3] == 0 && c[3][3] == 0))) {
                markSquare(1, 3);
            }else if (c[1][4] == 2 &&
                    ((c[1][1] == 0 && c[1][3] == 0) ||
                            (c[1][1] == 0 && c[4][2] == 0) ||
                            (c[1][3] == 0 && c[3][4] == 0))) {
                markSquare(1, 4);
            }else if (c[1][5] == 2 &&
                    ((c[1][1] == 0 && c[1][4] == 0) ||
                            (c[5][1] == 0 && c[3][3] == 0) ||
                            (c[2][5] == 0 && c[5][5] == 0))) {
                markSquare(1, 5);
            } else if (c[2][1] == 2 &&
                    ((c[2][2] == 0 && c[2][3] == 0) ||
                            (c[1][1] == 0 && c[3][1] == 0))) {
                markSquare(2, 1);
            } else if (c[2][2] == 2 &&
                    ((c[1][1] == 0 && c[3][3] == 0) ||
                            (c[1][2] == 0 && c[3][2] == 0) ||
                            (c[3][1] == 0 && c[1][3] == 0) ||
                            (c[2][1] == 0 && c[2][3] == 0))) {
                markSquare(2, 2);
            } else if (c[2][3] == 2 &&
                    ((c[2][1] == 0 && c[2][2] == 0) ||
                            (c[1][3] == 0 && c[3][3] == 0))) {
                markSquare(2, 3);}
                else if (c[2][4] == 2 &&
                    ((c[2][1] == 0 && c[2][2] == 0) ||
                            (c[1][4] == 0 && c[3][4] == 0))) {
                markSquare(2, 4);
                }else if (c[2][5] == 2 &&
                    ((c[2][1] == 0 && c[2][3] == 0) ||
                            (c[1][5] == 0 && c[4][4] == 0))) {
                markSquare(2, 5);
            } else if (c[3][1] == 2 &&
                    ((c[1][1] == 0 && c[2][1] == 0) ||
                            (c[3][2] == 0 && c[3][3] == 0) ||
                            (c[2][2] == 0 && c[1][3] == 0))) {
                markSquare(3, 1);
            } else if (c[3][2] == 2 &&
                    ((c[1][2] == 0 && c[2][2] == 0) ||
                            (c[3][1] == 0 && c[3][3] == 0))) {
                markSquare(3, 2);
            } else if (c[3][3] == 2 &&
                    ((c[1][1] == 0 && c[2][2] == 0) ||
                            (c[1][3] == 0 && c[2][3] == 0) ||
                            (c[3][1] == 0 && c[3][2] == 0))) {
                markSquare(3, 3);}
                else if (c[3][4] == 2 &&
                    ((c[3][1] == 0 && c[3][2] == 0) ||
                            (c[1][4] == 0 && c[2][4] == 0) ||
                            (c[3][1] == 0 && c[3][5] == 0))) {
                markSquare(3, 4);}
                else if (c[3][5] == 2 &&
                    ((c[3][1] == 0 && c[3][2] == 0) ||
                            (c[1][5] == 0 && c[2][5] == 0) ||
                            (c[3][1] == 0 && c[5][5] == 0))) {
                markSquare(3, 3);
            } else if (c[4][1] == 2 &&
                    ((c[4][2] == 0 && c[5][1] == 0) ||
                            (c[4][5] == 0 && c[4][3] == 0) ||
                            (c[3][1] == 0 && c[4][5] == 0))) {
                markSquare(4, 1);
            }
            else if (c[4][2] == 2 &&
                    ((c[4][1] == 0 && c[3][5] == 0) ||
                            (c[1][5] == 0 && c[2][4] == 0) ||
                            (c[3][2] == 0 && c[3][3] == 0))) {
                markSquare(4, 2);
            } else if (c[4][3] == 2 &&
                    ((c[3][2] == 0 && c[3][4] == 0) ||
                            (c[1][3] == 0 && c[2][3] == 0) ||
                            (c[4][1] == 0 && c[4][5] == 0))) {
                markSquare(4, 3);
            }else if (c[4][4] == 2 &&
                    ((c[4][2] == 0 && c[1][4] == 0) ||
                            (c[4][3] == 0 && c[2][4] == 0) ||
                            (c[4][5] == 0 && c[5][4] == 0))) {
                markSquare(4, 4);
            }
            else if (c[4][5] == 2 &&
                    ((c[4][1] == 0 && c[4][2] == 0) ||
                            (c[1][5] == 0 && c[2][5] == 0) ||
                            (c[3][1] == 0 && c[5][5] == 0))) {
                markSquare(4, 5);
            }
            else if (c[5][1] == 2 &&
                    ((c[5][2] == 0 && c[4][1] == 0) ||
                            (c[1][5] == 0 && c[3][3] == 0) ||
                            (c[3][1] == 0 && c[5][4] == 0))) {
                markSquare(5, 1);
            }
            else if (c[5][2] == 2 &&
                    ((c[5][1] == 0 && c[3][2] == 0) ||
                            (c[1][2] == 0 && c[2][5] == 0) ||
                            (c[5][1] == 0 && c[5][5] == 0))) {
                markSquare(5, 2);
            } else if (c[4][3] == 2 &&
                    ((c[3][2] == 0 && c[3][4] == 0) ||
                            (c[1][2] == 0 && c[2][5] == 0) ||
                            (c[5][1] == 0 && c[5][5] == 0))) {
                markSquare(5, 3);
            }else if (c[5][4] == 2 &&
                    ((c[1][4] == 0 && c[4][5] == 0) ||
                            (c[5][3] == 0 && c[2][1] == 0) ||
                            (c[3][4] == 0 && c[5][4] == 0))) {
                markSquare(5, 4);
            }
            else if (c[5][5] == 2 &&
                    ((c[5][1] == 0 && c[5][2] == 0) ||
                            (c[1][5] == 0 && c[2][2] == 0) ||
                            (c[4][4] == 0 && c[5][4] == 0))) {
                markSquare(5, 5);
            }
            else {
                Random rand = new Random();

                int a = rand.nextInt(6);
                int b = rand.nextInt(6);
                while (a == 0 || b == 0 || c[a][b] != 2) {
                    a = rand.nextInt(6);
                    b = rand.nextInt(6);
                }
                markSquare(a, b);
            }
        }


        private void markSquare(int x, int y) {
            b[x][y].setEnabled(false);
            b[x][y].setText("X");
            c[x][y] = 1;
            checkBoard();
        }
    }

    public void disable(){
        for (i = 1; i <= 5; i++) {
            for (j = 1; j <= 5; j++) {
                if (b[i][j].isEnabled()) {
                    b[i][j].setEnabled(false);
                }
            }
        }
    }

    // check the board to see if someone has won
    public boolean checkBoard() {
        boolean gameOver = false;
        if ((c[1][1] == 0 && c[2][2] == 0 && c[3][3] == 0 && c[4][4] == 0 && c[5][5] == 0)
                || (c[1][5] == 0 && c[2][4] == 0 && c[3][3] == 0 && c[4][2] == 0 && c[5][1] == 0)
                || (c[1][1] == 0 && c[1][2] == 0 && c[1][3] == 0 && c[1][4] == 0 && c[1][5] == 0)
                || (c[2][1] == 0 && c[2][2] == 0 && c[2][3] == 0 && c[2][4] == 0 && c[2][5] == 0)
                || (c[3][1] == 0 && c[3][2] == 0 && c[3][3] == 0 && c[3][4] == 0 && c[3][5] == 0)
                || (c[4][1] == 0 && c[4][2] == 0 && c[4][3] == 0 && c[4][4] == 0 && c[4][5] == 0)
                || (c[5][1] == 0 && c[5][2] == 0 && c[5][3] == 0 && c[5][4] == 0 && c[5][5] == 0)
                || (c[1][1] == 0 && c[2][1] == 0 && c[3][1] == 0 && c[4][1] == 0 && c[5][1] == 0)
                || (c[1][5] == 0 && c[2][5] == 0 && c[3][5] == 0 && c[4][5] == 0 && c[5][5] == 0)
                 || (c[1][2] == 0 && c[2][2] == 0 && c[3][2] == 0 && c[4][2] == 0 && c[5][2] == 0)
                  || (c[1][3] == 0 && c[2][3] == 0 && c[3][3] == 0 && c[4][3] == 0 && c[5][3] == 0)
                   || (c[1][4] == 0 && c[2][4] == 0 && c[3][4] == 0 && c[4][4] == 0 && c[5][4] == 0)
                ) {
            textView.setText("Game over. You win!");
            myscore++;
            TextView meTextView =  findViewById(R.id.mescore);
            meTextView.setText( "" + myscore);
            disable();
        gameOver= true;


        } else if ((c[1][1] == 1 && c[2][2] == 1 && c[3][3] == 1 && c[4][4] == 1 && c[5][5] == 1)
                || (c[1][5] == 1 && c[2][4] == 1 && c[3][3] == 1 && c[4][2] == 1 && c[5][1] == 1)
                || (c[1][1] == 1 && c[1][2] == 1 && c[1][3] == 1 && c[1][4] == 1 && c[1][5] == 1)
                || (c[2][1] == 1 && c[2][2] == 1 && c[2][3] == 1 && c[2][4] == 1 && c[2][5] == 1)
                || (c[3][1] == 1 && c[3][2] == 1 && c[3][3] == 1 && c[3][4] == 1 && c[3][5] == 1)
                || (c[4][1] == 1 && c[4][2] == 1 && c[4][3] == 1 && c[4][4] == 1 && c[4][5] == 1)
                || (c[5][1] == 1 && c[5][2] == 1 && c[5][3] == 1 && c[5][4] == 1 && c[5][5] == 1)
                || (c[1][1] == 1 && c[2][1] == 1 && c[3][1] == 1 && c[4][1] == 1 && c[5][1] == 1)
                || (c[1][5] == 1 && c[2][5] == 1 && c[3][5] == 1 && c[4][5] == 1 && c[5][5] == 1)
                || (c[1][2] == 1 && c[2][2] == 1 && c[3][2] == 1 && c[4][2] == 1 && c[5][2] == 1)
                  || (c[1][3] == 1 && c[2][3] == 1 && c[3][3] == 1 && c[4][3] == 1 && c[5][3] == 1)
                   || (c[1][4] == 1 && c[2][4] == 1 && c[3][4] == 1 && c[4][4] == 1 && c[5][4] == 1)) {
            textView.setText("Game over. The computer wins!");
            compscore++;
            TextView compTextView =  findViewById(R.id.cscore);
            compTextView.setText( "" + compscore);
            disable();
            gameOver = true;



        } else {
            boolean empty = false;
            for (i = 1; i <= 5; i++) {
                for (j = 1; j <= 5; j++) {
                    if (c[i][j] == 2) {
                        empty = true;
                        break;
                    }
                }
            }
            if (!empty) {
                gameOver = true;
                textView.setText("Game over. It's a draw!");

            }
        }
        return gameOver ;

    }
}

