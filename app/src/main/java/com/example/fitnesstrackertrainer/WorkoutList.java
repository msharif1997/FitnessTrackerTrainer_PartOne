package com.example.fitnesstrackertrainer;

import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.LinearLayout;

public class WorkoutList extends AppCompatActivity {



    private LinearLayout workoutOne, workouttwo, workoutthree,workoutfour;





    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_workout_list);



        BottomNavigationView navigation = findViewById(R.id.navigation);
        navigation.setOnNavigationItemSelectedListener(navListener);


        /// This line below connects the workoutlist activity to Upperchestday activity
        workoutOne = findViewById(R.id.workoutOne);
        workoutOne.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent a = new Intent(WorkoutList.this, UppercheatDay.class);
                a.addFlags(Intent.FLAG_ACTIVITY_NO_ANIMATION);
                startActivity(a);
            }
        });


        /// This line below connects the workoutlist activity to absDays activity
        workouttwo = findViewById(R.id.workouttwo);
        workouttwo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent a = new Intent(WorkoutList.this, absDays.class);
                a.addFlags(Intent.FLAG_ACTIVITY_NO_ANIMATION);
                startActivity(a);
            }
        });


        /// This line below connects the workoutlist activity to ArmsDay activity
        workoutthree = findViewById(R.id.workoutthree);
        workoutthree.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent a = new Intent(WorkoutList.this, ArmsDay.class);
                a.addFlags(Intent.FLAG_ACTIVITY_NO_ANIMATION);
                startActivity(a);
            }
        });


        /// This line below connects the workoutlist activity to LegsDay activity
        workoutfour = findViewById(R.id.workoutfour);
        workoutfour.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent a = new Intent(WorkoutList.this, LegsDay.class);
                a.addFlags(Intent.FLAG_ACTIVITY_NO_ANIMATION);
                startActivity(a);
            }
        });

    }

    private BottomNavigationView.OnNavigationItemSelectedListener navListener
            = new BottomNavigationView.OnNavigationItemSelectedListener() {

        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
            switch (item.getItemId()) {
                case R.id.navigation_home:
                    Intent intent0 = new Intent(WorkoutList.this, MainActivity.class);
                    startActivity(intent0);
                    break;
                case R.id.navigation_track:
                    Intent intent1 = new Intent(WorkoutList.this, TrackFragment.class);
                    startActivity(intent1);
                    break;
                case R.id.navigation_goal:
                    Intent intent2 = new Intent(WorkoutList.this, goalFragment.class);
                    startActivity(intent2);
                    break;
            }
            return false;

        }
    };
}
