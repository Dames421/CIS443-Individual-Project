package com.example.cis443_appointmentschedulerapp;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CalendarView;
import android.widget.EditText;

import java.util.Calendar;

public class CalendarActivity extends AppCompatActivity {

    //public static final String EXTRA_NUMBER = "com.example.cis443_appoinmentschedulerapp.EXTRA_NUMBER";
    public static final String EXTRA_TEXT = "com.example.cis443_appoinmentschedulerapp.EXTRA_TEXT";
    private Button button;
    CalendarView calendar;
    String selectedDate;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calendar);

        button = (Button) findViewById(R.id.btnSubmitDate);
        calendar = findViewById(R.id.calendarView);


        calendar.setOnDateChangeListener(new CalendarView.OnDateChangeListener(){
            @Override
            public void onSelectedDayChange(@NonNull CalendarView view, int year, int month, int dayOfMonth){
                selectedDate = dayOfMonth + "/" + month + "/" + year;
            }
        });

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                openTimeActivity();
            }
        });
    }

    public void openTimeActivity(){
        //EditText editText = (EditText) findViewById(R.id.edittext);
        //int number = Integer.parseInt(editText.getText().toString());
        String date = selectedDate;
        Intent intent = new Intent(this, TimeActivity.class);

        //intent.putExtra(EXTRA_NUMBER, number)
        intent.putExtra(EXTRA_TEXT, date);
        startActivity(intent);
    }
}