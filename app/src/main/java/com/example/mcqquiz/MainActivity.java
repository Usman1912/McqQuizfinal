package com.example.mcqquiz;

import androidx.appcompat.app.AppCompatActivity;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    Button ans1,ans2,ans3,ans4;
    TextView score,question;
    private Questions mQuestions=new Questions();
    private String mAnswer;
    private int mScore=0;
    private int mQuestionsLenght=mQuestions.mQuestions.length;
    int r;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        r=0;
        ans1=(Button) findViewById(R.id.ans1);
        ans2=(Button) findViewById(R.id.ans2);
        ans3=(Button) findViewById(R.id.ans3);
        ans4=(Button) findViewById(R.id.ans4);
        score=(TextView) findViewById(R.id.score);
        question=(TextView) findViewById(R.id.question);
        score.setText("Score: "+ mScore);

        updateQuestion(r);
        ans1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                r++;

                if(ans1.getText()==mAnswer){
                    mScore++;
                    score.setText("Score: "+ mScore);

                }

                if(r<10)
                {
                    updateQuestion(r);

                }
                else
                {
                    gameover();
                }
            }
        });
        ans2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                r++;

                if(ans2.getText()==mAnswer){
                    mScore++;
                    score.setText("Score: "+ mScore);

                }
                if(r<10)
                {
                    updateQuestion(r);

                }
                else
                {
                    gameover();
                }
            }
        });
        ans3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                r++;

                if(ans3.getText()==mAnswer){
                    mScore++;
                    score.setText("Score: "+ mScore);

                }
                if(r<10)
                {
                    updateQuestion(r);

                }
                else
                {
                    gameover();
                }
            }
        });
        ans4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                r++;

                if(ans4.getText()==mAnswer){
                    mScore++;
                    score.setText("Score: "+ mScore);

                }
                if(r<10)
                {
                    updateQuestion(r);

                }
                else
                {
                    gameover();
                }
            }

        });

    }

    private void updateQuestion(int num){
        question.setText(mQuestions.getQuestion(num));
        ans1.setText(mQuestions.getChoice(num));
        ans2.setText(mQuestions.getChoice2(num));
        ans3.setText(mQuestions.getChoice3(num));
        ans4.setText(mQuestions.getChoice4(num));

        mAnswer = mQuestions.getCorrectAnswer(num);

    }
    private void gameover(){
        AlertDialog.Builder alertDialogBuilder=new AlertDialog.Builder(MainActivity.this);
        alertDialogBuilder
                            .setMessage("Quiz over! Your points : "+mScore+"\n Correct: "+mScore+"\n Incorrect: "+(10-mScore))
                            .setCancelable(false)
                            .setPositiveButton("New Quiz",
                                    new DialogInterface.OnClickListener() {
                                        @Override
                                        public void onClick(DialogInterface dialog, int which) {
                                            startActivity(new Intent(getApplicationContext(),MainActivity.class));

                                        }
                                    })
                            .setNegativeButton("Exit",
                                    new DialogInterface.OnClickListener() {
                                        @Override
                                        public void onClick(DialogInterface dialog, int which) {
                                            finish();
                                        }
                                    });
        AlertDialog alertDialog= alertDialogBuilder.create();
        alertDialog.show();

    }
}