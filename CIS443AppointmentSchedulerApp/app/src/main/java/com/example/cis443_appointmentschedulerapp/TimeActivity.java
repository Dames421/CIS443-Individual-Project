package com.example.cis443_appointmentschedulerapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class TimeActivity extends AppCompatActivity {

    private Button button;
    TextView lblDate;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_time);

        Intent intent = getIntent();
        String date = intent.getStringExtra(CalendarActivity.EXTRA_TEXT);
        button = (Button) findViewById(R.id.btnSubmitTime);
        lblDate = findViewById(R.id.lblDate);

        lblDate.setText("Date selected: " + date);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openConfirmationActivity();
            }
        });
    }

    public void openConfirmationActivity(){
        Intent intent = new Intent(this, ConfirmationActivity.class);
        startActivity(intent);
    }
}