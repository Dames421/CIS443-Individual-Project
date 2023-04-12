package com.example.cis443_appointmentschedulerapp;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import androidx.fragment.app.Fragment;

import com.example.cis443_appointmentschedulerapp.databinding.FragmentNewAppointmentBinding;

public class NewAppointmentFragment extends Fragment {

    Activity context;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        context = getActivity();

        return inflater.inflate(R.layout.fragment_new_appointment, container, false);

    }

    public void onStart(){
        super.onStart();
        Button btnSubmit = (Button) context.findViewById(R.id.btnSubmitSurvey);
        btnSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(context, CalendarActivity.class);
                startActivity(intent);
            }
        });
    }

}