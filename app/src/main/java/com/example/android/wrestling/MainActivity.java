package com.example.android.wrestling;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.lang.reflect.Method;

public class MainActivity extends AppCompatActivity {

    int scoreHome;
    int scoreVisitor;
    TextView scoreViewHome;
    TextView scoreViewVisitor;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main);
            scoreHome = 0;
            scoreVisitor = 0;
            scoreViewHome = findViewById(R.id.home_score);
            scoreViewVisitor = findViewById(R.id.visitor_score);
    }

    //Saves scores when orientation changes
    @Override
    public void onSaveInstanceState(Bundle savedInstanceState) {
        savedInstanceState.putInt("savedScoreHome", scoreHome);
        savedInstanceState.putInt("savedScoreVisitor", scoreVisitor);
        super.onSaveInstanceState(savedInstanceState);
    }

    //Restores scores when orientation changes
    public void onRestoreInstanceState(Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
        setContentView(R.layout.activity_main);
        scoreHome = savedInstanceState.getInt("savedScoreHome");
        scoreViewHome = findViewById(R.id.home_score);
        scoreViewHome.setText(String.valueOf(scoreHome));
        scoreVisitor = savedInstanceState.getInt("savedScoreVisitor");
        scoreViewVisitor = findViewById(R.id.visitor_score);
        scoreViewVisitor.setText(String.valueOf(scoreVisitor));
    }

    //Displays the given score for Home
    public void displayForHome(int score) {
        scoreViewHome.setText(String.valueOf(score));
    }

    //Displays the given score for Visitor
    public void displayForVisitor(int score) {
        scoreViewVisitor.setText(String.valueOf(score));
    }

    //Method called when Pin button for Home is pressed
     public void addPinPointsHome(View view) {
        scoreHome = scoreHome + 6;
        displayForHome(scoreHome);
    }

    //Method called when Technical button for Home is pressed
     public void addTechnicalPointsHome(View view) {
        scoreHome = scoreHome + 5;
        displayForHome(scoreHome);
    }

    //Method called when Major Decision button for Home is pressed
     public void addMajorPointsHome(View view) {
        scoreHome = scoreHome + 4;
        displayForHome(scoreHome);
    }

    //Method called when Regular Decision button for Home is pressed
     public void addRegularPointsHome(View view) {
        scoreHome = scoreHome + 3;
        displayForHome(scoreHome);
    }

    //Method called when Forfeit, Injury, DQ button for Home is pressed
     public void addForfeitPointsHome(View view) {
        scoreHome = scoreHome + 6;
        displayForHome(scoreHome);
    }

    //Method called when Pin button for Visitor is pressed
     public void addPinPointsVisitor(View view) {
        scoreVisitor = scoreVisitor + 6;
        displayForVisitor(scoreVisitor);
    }

    //Method called when Technical button for Visitor is pressed
     public void addTechnicalPointsVisitor(View view) {
        scoreVisitor = scoreVisitor + 5;
        displayForVisitor(scoreVisitor);
    }

    //Method called when Major Decision button for Visitor is pressed
     public void addMajorPointsVisitor(View view) {
        scoreVisitor = scoreVisitor + 4;
        displayForVisitor(scoreVisitor);
    }

    //Method called when Regular Decision button for Visitor is pressed
     public void addRegularPointsVisitor(View view) {
        scoreVisitor = scoreVisitor + 3;
        displayForVisitor(scoreVisitor);
    }

    //Method called when Forfeit, Injury, DQ button for Visitor is pressed
     public void addForfeitPointsVisitor(View view) {
        scoreVisitor = scoreVisitor + 6;
        displayForVisitor(scoreVisitor);
    }

    //Method called when reset button is pressed.
     public void resetScore(View view) {
        scoreHome = 0;
        scoreVisitor = 0;
        displayForHome(scoreHome);
        displayForVisitor(scoreVisitor);
    }
}