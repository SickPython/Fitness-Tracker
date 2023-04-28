package com.example.fitnesstracker;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

public class TrackWorkoutActivity extends AppCompatActivity{

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.ft_trackworkout);

        Intent mainintent = getIntent();

        TextView WorkoutTitle = findViewById(R.id.WorkoutTitleText);
        TextView SelectWorkout = findViewById(R.id.SelectWorkout);
        TextView EnterReps = findViewById(R.id.EnterRepsText);
        EditText EditReps = findViewById(R.id.EditRepsText);
        TextView EnterSets = findViewById(R.id.EnterSetsText);
        EditText EditSets = findViewById(R.id.EditSetsText);

    }
}
