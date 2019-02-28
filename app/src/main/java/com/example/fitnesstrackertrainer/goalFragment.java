package com.example.fitnesstrackertrainer;

import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;

public class goalFragment extends AppCompatActivity {



    private BottomNavigationView.OnNavigationItemSelectedListener navListener
            = new BottomNavigationView.OnNavigationItemSelectedListener() {

        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
            switch (item.getItemId()) {
                case R.id.navigation_home:
                    Intent intent1 = new Intent(goalFragment.this, MainActivity.class);
                    startActivity(intent1);
                    break;
                case R.id.navigation_track:
                    Intent intent2 = new Intent(goalFragment.this, TrackFragment.class);
                    startActivity(intent2);
                    break;
                case R.id.navigation_goal:
                    Intent intent3 = new Intent(goalFragment.this, goalFragment.class);
                    startActivity(intent3);
                    break;
            }
            return false;

        }


    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_goal_fragment);


        BottomNavigationView navigation = findViewById(R.id.navigation);
        navigation.setOnNavigationItemSelectedListener(navListener);
    }

    @Nullable
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState){
        return inflater.inflate(R.layout.activity_goal_fragment, container, false);
    }
}
