package com.example.cis443_appointmentschedulerapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class CalendarActivity extends AppCompatActivity {

    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calendar);

        button = (Button) findViewById(R.id.btnSubmitDate);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openTimeActivity();
            }
        });
    }

    public void openTimeActivity(){
        Intent intent = new Intent(this, TimeActivity.class);
        startActivity(intent);
    }
}