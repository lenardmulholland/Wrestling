package com.example.android.wrestling;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.example.android.wrestling.R;

public class MainActivity extends AppCompatActivity {

    int scoreHome = 0;
    int scoreVisitor = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * Displays the given score for Home.
     */
    public void displayForHome(int score) {
        TextView scoreView = (TextView) findViewById(R.id.home_score);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Displays the given score for Visitor.
     */
    public void displayForVisitor(int score) {
        TextView scoreView = (TextView) findViewById(R.id.visitor_score);
        scoreView.setText(String.valueOf(score));
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