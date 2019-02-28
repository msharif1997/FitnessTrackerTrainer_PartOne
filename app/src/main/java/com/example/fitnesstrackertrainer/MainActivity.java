package com.example.fitnesstrackertrainer;

import android.content.Intent;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.design.widget.BottomNavigationView;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
//import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView mTextMessage;

    private BottomNavigationView.OnNavigationItemSelectedListener navListener
            = new BottomNavigationView.OnNavigationItemSelectedListener() {

        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
            switch (item.getItemId()) {
                case R.id.navigation_home:
                    Intent intent = new Intent(MainActivity.this, MainActivity.class);
                    startActivity(intent);
                    break;
                case R.id.navigation_track:
                    Intent intent1 = new Intent(MainActivity.this, TrackFragment.class);
                    startActivity(intent1);
                    break;
                case R.id.navigation_goal:
                    Intent intent2 = new Intent(MainActivity.this, goalFragment.class);
                    startActivity(intent2);
                    break;
            }
            return false;

        }


    };


//   TextView btnexercise; //titlepage, subtitlepage;
//    ImageView imgpage;


    private TextView btnexercise;

    //IMPORT ANIMATION
//    Animation animimgpage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        BottomNavigationView bottomNav = findViewById(R.id.navigation);


        //import fonts
//        Typeface MLight = Typeface.createFromAsset(getAssets(), path: "fonts/MLight.ttf");
//        Typeface MMediaum = Typeface.createFromAsset(getAssets(), path: "fonts/MMediaum.ttf");
//        Typeface Vidaloke = Typeface.createFromAsset(getAssets(), path: "fonts/Vidaloke.ttf");

        // export animation
//        imgpage.startAnimation(animimgpage);


        mTextMessage = (TextView) findViewById(R.id.message);
        BottomNavigationView navigation = findViewById(R.id.navigation);
        navigation.setOnNavigationItemSelectedListener(navListener);

        btnexercise = findViewById(R.id.btnexercise);
        btnexercise.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent a = new Intent(MainActivity.this,WorkoutList.class);
                a.addFlags(Intent.FLAG_ACTIVITY_NO_ANIMATION);
                startActivity(a);
            }
        });




    }

    @Nullable
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState){
        return inflater.inflate(R.layout.activity_main, container, false);
    }

}
