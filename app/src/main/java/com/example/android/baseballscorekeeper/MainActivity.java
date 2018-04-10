package com.example.android.baseballscorekeeper;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    /**
     * Global variables for holding Team scores is declared and initialized to zero here.
     */
    int runCountTeamA = 0;
    int outCountTeamA = 0;
    int runCountTeamB = 0;
    int outCountTeamB = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        displayRunsForTeamA(runCountTeamA);
        displayOutsForTeamA(outCountTeamA);
        displayRunsForTeamB(runCountTeamB);
        displayOutsForTeamB(outCountTeamB);
    }

    /**
     * Reset scores for Team A and Team B
     * Set runCountTeamA to zero.
     * Set outCountTeamA to zero.
     * Set runCountTeamB to zero.
     * Set outCountTeamB to zero.
     * Display runCountTeamA.
     * Display outCountTeamA.
     * Display runCountTeamB.
     * Display outCountTeamB.
     */
    public void resetScore(View v) {
        runCountTeamA = 0;
        outCountTeamA = 0;
        runCountTeamB = 0;
        outCountTeamB = 0;
        displayRunsForTeamA(runCountTeamA);
        displayOutsForTeamA(outCountTeamA);
        displayRunsForTeamB(runCountTeamB);
        displayOutsForTeamB(outCountTeamB);
    }

    /**
     * Displays the given runs for Team A.
     */
    public void displayRunsForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_runs);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Displays the given outs for Team A.
     */
    public void displayOutsForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_outs);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Displays the given runs for Team B.
     */
    public void displayRunsForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_runs);
        scoreView.setText(String.valueOf(score));
    }
    /**
     * Displays the given outs for Team B.
     */
    public void displayOutsForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_outs);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Increase total runs for Team A by 1 point.
     */
    public void addRunForTeamA (View v) {
        runCountTeamA = runCountTeamA +1;
        displayRunsForTeamA(runCountTeamA);
    }

    /**
     * Increase the total outs for Team A by 1 point.
     */
    public void addOutForTeamA (View v) {
        outCountTeamA = outCountTeamA +1;
        displayOutsForTeamA(outCountTeamA);
    }

    /**
     * Increase the total runs for Team B by 1 point.
     */
    public void addRunForTeamB (View v) {
        runCountTeamB = runCountTeamB +1;
        displayRunsForTeamB(runCountTeamB);
    }

    /**
     * Increase the total outs for Team B by 1 point.
     */
    public void addOutForTeamB (View v) {
        outCountTeamB = outCountTeamB +1;
        displayOutsForTeamB(outCountTeamB);
    }
}
