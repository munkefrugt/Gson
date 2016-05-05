package com.example.gson;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);


        Log.i("TAG", "onCreate: ");



        Intent intent = getIntent();

        // get the data:
        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            String startAdress = extras.getString("startAdress");
            String endDestination = extras.getString("endDestination");
            String arrival_time = extras.getString("arrival_time");
            Log.i("TAG",startAdress);


            TextView start = (TextView) findViewById(R.id.origin);
            TextView arrivalTime = (TextView) findViewById(R.id.arrivalTime);
            TextView destination = (TextView) findViewById(R.id.endLocation);
            start.setText(startAdress);
            arrivalTime.setText(arrival_time);
            destination.setText(endDestination);
        }

    }

}
