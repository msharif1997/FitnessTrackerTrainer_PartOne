package com.example.fitnesstrackertrainer;

import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

public class ArmsDay extends AppCompatActivity {


    private TextView btnextworkout;


    private BottomNavigationView.OnNavigationItemSelectedListener navListener
            = new BottomNavigationView.OnNavigationItemSelectedListener() {

        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
            switch (item.getItemId()) {
                case R.id.navigation_home:
                    Intent intent0 = new Intent(ArmsDay.this, MainActivity.class);
                    startActivity(intent0);
                    break;
                case R.id.navigation_track:
                    Intent intent1 = new Intent(ArmsDay.this, TrackFragment.class);
                    startActivity(intent1);
                    break;
                case R.id.navigation_goal:
                    Intent intent2 = new Intent(ArmsDay.this, goalFragment.class);
                    startActivity(intent2);
                    break;
            }
            return false;

        }
    };


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_arms_day);


        BottomNavigationView navigation = findViewById(R.id.navigation);
        navigation.setOnNavigationItemSelectedListener(navListener);


        btnextworkout = findViewById(R.id.btnextworkout);
        btnextworkout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent a = new Intent(ArmsDay.this,shoulderDay.class);
                a.addFlags(Intent.FLAG_ACTIVITY_NO_ANIMATION);
                startActivity(a);
            }
        });

    }
}
