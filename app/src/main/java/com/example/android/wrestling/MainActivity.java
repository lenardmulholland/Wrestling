package com.example.android.wrestling;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

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

    /**
     * Saves scores when orientation changes
     */
    @Override
    public void onSaveInstanceState(Bundle savedInstanceState) {
        savedInstanceState.putInt("scoreHome", scoreHome);
        savedInstanceState.putInt("scoreVisitor", scoreVisitor);
        super.onSaveInstanceState(savedInstanceState);
    }

    /**
     * Restores scores when orientation changes
     */
    public void onRestoreInstanceState(Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
        setContentView(R.layout.activity_main);
        scoreHome = savedInstanceState.getInt("scoreHome");
        scoreViewHome = findViewById(R.id.home_score);
        scoreViewHome.setText(String.valueOf(scoreHome));
        scoreVisitor = savedInstanceState.getInt("scoreVisitor");
        scoreViewVisitor = findViewById(R.id.visitor_score);
        scoreViewVisitor.setText(String.valueOf(scoreVisitor));
    }

    /**
     * Displays the given score for Home.
     */
    public void displayForHome(int score) {
        scoreViewHome.setText(String.valueOf(score));
    }

    /**
     * Displays the given score for Visitor.
     */
    public void displayForVisitor(int score) {
        scoreViewVisitor.setText(String.valueOf(score));
    }

    /**
     * This method is called when the pin button is pressed for Home.
     */
    public void addPinPointsHome(View view) {
        scoreHome = scoreHome + 6;
        displayForHome(scoreHome);
    }

    /**
     * This method is called when the Technical button is pressed for Home.
     */
    public void addTechnicalPointsHome(View view) {
        scoreHome = scoreHome + 5;
        displayForHome(scoreHome);
    }

    /**
     * This method is called when the Major Decision button is pressed for Home.
     */
    public void addMajorPointsHome(View view) {
        scoreHome = scoreHome + 4;
        displayForHome(scoreHome);
    }

    /**
     * This method is called when the Regular Decision button is pressed for Home.
     */
    public void addRegularPointsHome(View view) {
        scoreHome = scoreHome + 3;
        displayForHome(scoreHome);
    }

    /**
     * This method is called when the Forfeit, Injury, DQ button is pressed for Home.
     */
    public void addForfeitPointsHome(View view) {
        scoreHome = scoreHome + 6;
        displayForHome(scoreHome);
    }

    /**
     * This method is called when the Pin button is pressed for Visitor.
     */
    public void addPinPointsVisitor(View view) {
        scoreVisitor = scoreVisitor + 6;
        displayForVisitor(scoreVisitor);
    }

    /**
     * This method is called when the Technical button is pressed for Visitor.
     */
    public void addTechnicalPointsVisitor(View view) {
        scoreVisitor = scoreVisitor + 5;
        displayForVisitor(scoreVisitor);
    }

    /**
     * This method is called when the Major Decision button is pressed for Visitor.
     */
    public void addMajorPointsVisitor(View view) {
        scoreVisitor = scoreVisitor + 4;
        displayForVisitor(scoreVisitor);
    }

    /**
     * This method is called when the Regular Decision button is pressed for Visitor.
     */
    public void addRegularPointsVisitor(View view) {
        scoreVisitor = scoreVisitor + 3;
        displayForVisitor(scoreVisitor);
    }

    /**
     * This method is called when the Forfeit, Injury, DQ button is pressed for Visitor.
     */
    public void addForfeitPointsVisitor(View view) {
        scoreVisitor = scoreVisitor + 6;
        displayForVisitor(scoreVisitor);
    }


    /**
     * This method is called when the reset button is pressed.
     */
    public void resetScore(View view) {
        scoreHome = 0;
        scoreVisitor = 0;
        displayForHome(scoreHome);
        displayForVisitor(scoreVisitor);
    }

}