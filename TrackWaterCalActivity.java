package com.example.fittnesstracker;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.os.TestLooperManager;
import android.widget.TextView;

import org.w3c.dom.Text;

public class TrackWaterCalActivity extends AppCompatActivity{

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.ft_trackwatercal);

        Intent mainintent = getIntent();


        TextView WaterCalTitleText = findViewById(R.id.WaterCalTitleText);
    }
}
