package com.example.fitnesstracker;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;
public class TrackProgressActivity extends AppCompatActivity{

    private LineGraphSeries<DataPoint> waterIntake, calorieIntake;
    
    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.ft_myprogress);

        Intent mainintent = getIntent();


        TextView ProgressTitleText = findViewById(R.id.MyProgressTitleText);
        
        double x,y,x2,y2;
        x = 0;
        x2 = 0;

        GraphView graph1 = (GraphView) findViewById(R.id.graph1);
        GraphView graph2 = (GraphView) findViewById(R.id.graph2);
        waterIntake = new LineGraphSeries<>();
        calorieIntake = new LineGraphSeries<>();

        int numDataPoints = 200;
        for (int i = 0; i < numDataPoints; i++){
            x = x + 0.1;
            y = Math.cos(x); //<-- example, it should be the number that is entered by user for water intake


            waterIntake.appendData(new DataPoint(x,y), true, 100);

        }
        waterIntake.setColor(Color.BLUE);
        graph1.addSeries(waterIntake);


        int numDataPoints2 = 200;
        for(int j = 0; j < numDataPoints2; j++){
            x2 = x2 + 0.1;
            y2 = Math.sin(x2);  // <-- example, it should be the amount of calories input by user

            calorieIntake.appendData(new DataPoint(x2,y2), true, 100);
        }
        calorieIntake.setColor(Color.RED);
        graph2.addSeries(calorieIntake);
    
    }
}
