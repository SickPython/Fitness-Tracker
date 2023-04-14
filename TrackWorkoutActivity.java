package com.example.fittnesstracker;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class TrackWorkoutActivity extends AppCompatActivity{

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.ft_trackworkout);

        Intent mainintent = getIntent();

        TextView WorkoutTitleText = findViewById(R.id.WorkoutTitleText);
    }
}