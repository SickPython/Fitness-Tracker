package com.example.fitnesstracker;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

import com.google.android.material.textfield.TextInputEditText;

public class TrackWaterCalActivity extends AppCompatActivity{

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.ft_trackwatercal);

        Intent mainintent = getIntent();

        TextView waterCalTitleText = findViewById(R.id.WaterCalTitleText);
        TextView EnterCaloriesText = findViewById(R.id.EnterCaloriesText);
        EditText EditCaloriesText = findViewById(R.id.CaloriesEditText);
        TextView EnterWaterText = findViewById(R.id.EnterWaterOzText);
        EditText EditWaterText = findViewById(R.id.WaterOzEditText);

    }
}
