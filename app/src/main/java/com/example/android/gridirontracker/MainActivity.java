package com.example.android.gridirontracker;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.example.android.gridirontracker.R;

public class MainActivity extends AppCompatActivity {

    int teamAtally = 0;
    int teamBtally = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        displayForTeamA(0);
        displayForTeamB(0);
    }

    /**
     * Adds 6 to Team A's tally
     */
    public void teamAplus6 (View v) {
        teamAtally = teamAtally + 6;
        displayForTeamA(teamAtally);
    }

    /**
     * Adds 3 to Team A's tally
     */
    public void teamAplus3(View v) {
        teamAtally = teamAtally + 3;
        displayForTeamA(teamAtally);
    }

    /**
     * Adds 2 to Team A's tally
     */
    public void teamAplus2(View v) {
        teamAtally = teamAtally + 2;
        displayForTeamA(teamAtally);
    }

    /**
     * Adds 1 to Team A's tally
     */
    public void teamAplus1(View v) {
        teamAtally = teamAtally + 1;
        displayForTeamA(teamAtally);
    }

    /**
     * Adds 6 to Team B's tally
     */
    public void teamBplus6 (View v) {
        teamBtally = teamBtally + 6;
        displayForTeamB(teamBtally);
    }

    /**
     * Adds 3 to Team B's tally
     */
    public void teamBplus3(View v) {
        teamBtally = teamBtally + 3;
        displayForTeamB(teamBtally);
    }

    /**
     * Adds 2 to Team B's tally
     */
    public void teamBplus2(View v) {
        teamBtally = teamBtally + 2;
        displayForTeamB(teamBtally);
    }

    /**
     * Adds 1 to Team B's tally
     */
    public void teamBplus1(View v) {
        teamBtally = teamBtally + 1;
        displayForTeamB(teamBtally);
    }

    /**
     * Displays the given score for Team A.
     */
    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Displays the given score for Team B.
     */
    public void displayForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Resets score of both teams to 0.
     */
    public void resetScore(View v) {
        teamAtally = 0;
        teamBtally = 0;
        displayForTeamA(teamAtally);
        displayForTeamB(teamBtally);
    }
}
