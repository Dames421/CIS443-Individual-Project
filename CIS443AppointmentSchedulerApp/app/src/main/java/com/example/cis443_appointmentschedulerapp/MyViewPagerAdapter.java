package com.example.cis443_appointmentschedulerapp;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.viewpager2.adapter.FragmentStateAdapter;
import com.example.cis443_appointmentschedulerapp.MyAppointmentFragment;
import com.example.cis443_appointmentschedulerapp.NewAppointmentFragment;

public class MyViewPagerAdapter extends FragmentStateAdapter {
    public MyViewPagerAdapter(@NonNull FragmentActivity fragmentActivity) {
        super(fragmentActivity);
    }

    @NonNull
    @Override
    public Fragment createFragment(int position) {
        switch (position){
            case 0:
                return new MyAppointmentFragment();
            case 1:
                return new NewAppointmentFragment();
            default:
                return new MyAppointmentFragment();
        }
    }

    @Override
    public int getItemCount(){
        return 2;
    }
}
