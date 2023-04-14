package com.example.fittnesstracker;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;
public class TrackProgressActivity extends AppCompatActivity{

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.ft_myprogress);

        Intent mainintent = getIntent();


        TextView ProgressTitleText = findViewById(R.id.MyProgressTitleText);
    }
}
