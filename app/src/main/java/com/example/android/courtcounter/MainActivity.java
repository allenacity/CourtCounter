package com.example.android.courtcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int scoreGrizzlies;
    int scoreOtherTeam;
    String testSetup;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        displayForGrizzlies(0);
        displayForOtherTeam(0);
    }


    /**
     * Displays the given score for the Grizzlies.
     */
    public void displayForGrizzlies(int score) {
        TextView scoreView = (TextView) findViewById(R.id.grizzlies_score);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Adds 3 points to the score for the Grizzlies
     */
    public void threePointsForGrizzlies(View v) {
        scoreGrizzlies += 3;
        displayForGrizzlies(scoreGrizzlies);
    }

    /**
     * Adds 2 points to the score for the Grizzlies
     */
    public void twoPointsForGrizzlies(View v) {
        scoreGrizzlies += 2;
        displayForGrizzlies(scoreGrizzlies);
    }

    /**
     * Adds 1 point to the score for the Grizzlies
     */
    public void freeThrowForGrizzlies(View v) {
        scoreGrizzlies += 1;
        displayForGrizzlies(scoreGrizzlies);
    }

    /**
     * Displays the given score for the other team.
     */
    public void displayForOtherTeam(int score) {
        TextView scoreView = (TextView) findViewById(R.id.other_team_score);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Adds 3 points to the score for the other team.
     */
    public void threePointsForOtherTeam(View v) {
        scoreOtherTeam += 3;
        displayForOtherTeam(scoreOtherTeam);
    }

    /**
     * Adds 2 points to the score for the other team.
     */
    public void twoPointsForOtherTeam(View v) {
        scoreOtherTeam += 2;
        displayForOtherTeam(scoreOtherTeam);
    }

    /**
     * Adds 1 point to the score for the other team.
     */
    public void freeThrowForOtherTeam(View v) {
        scoreOtherTeam += 1;
        displayForOtherTeam(scoreOtherTeam);
    }

    /**
     * Resets the both scores to 0.
     */
    public void resetScore(View v){
        scoreGrizzlies = 0;
        scoreOtherTeam = 0;
        displayForOtherTeam(scoreOtherTeam);
        displayForGrizzlies(scoreGrizzlies);

    }
}
