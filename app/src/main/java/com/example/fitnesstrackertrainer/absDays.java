package com.example.fitnesstrackertrainer;

import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;

public class absDays extends AppCompatActivity {


    private BottomNavigationView.OnNavigationItemSelectedListener navListener
            = new BottomNavigationView.OnNavigationItemSelectedListener() {

        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
            switch (item.getItemId()) {
                case R.id.navigation_home:
                    Intent intent0 = new Intent(absDays.this, MainActivity.class);
                    startActivity(intent0);
                    break;
                case R.id.navigation_track:
                    Intent intent1 = new Intent(absDays.this, TrackFragment.class);
                    startActivity(intent1);
                    break;
                case R.id.navigation_goal:
                    Intent intent2 = new Intent(absDays.this, goalFragment.class);
                    startActivity(intent2);
                    break;
            }
            return false;

        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_abs_days);

        BottomNavigationView navigation = findViewById(R.id.navigation);
        navigation.setOnNavigationItemSelectedListener(navListener);
    }
}
