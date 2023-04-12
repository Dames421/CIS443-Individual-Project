package com.example.cis443_appointmentschedulerapp;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;

import com.example.cis443_appointmentschedulerapp.databinding.FragmentMyAppointmentsBinding;

public class MyAppointmentFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_my_appointments, container, false);
    }

}