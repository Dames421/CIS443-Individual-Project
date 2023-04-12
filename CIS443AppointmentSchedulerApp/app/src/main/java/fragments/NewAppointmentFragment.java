package fragments;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Switch;

import androidx.appcompat.widget.SwitchCompat;
import androidx.fragment.app.Fragment;

import com.example.cis443_appointmentschedulerapp.CalendarActivity;
import com.example.cis443_appointmentschedulerapp.ERActivity;
import com.example.cis443_appointmentschedulerapp.R;
import com.example.cis443_appointmentschedulerapp.URActivity;
import com.example.cis443_appointmentschedulerapp.databinding.FragmentNewAppointmentBinding;

public class NewAppointmentFragment extends Fragment {

    Activity context;
    int switchCount = 12;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        context = getActivity();

        return inflater.inflate(R.layout.fragment_new_appointment, container, false);

    }

    public void onStart(){
        super.onStart();
        Button btnSubmit = (Button) context.findViewById(R.id.btnSubmitSurvey);
        SwitchCompat switch01 = (SwitchCompat) context.findViewById(R.id.switch01);
        SwitchCompat switch02 = (SwitchCompat) context.findViewById(R.id.switch02);
        SwitchCompat switch03 = (SwitchCompat) context.findViewById(R.id.switch03);
        SwitchCompat switch04 = (SwitchCompat) context.findViewById(R.id.switch04);
        SwitchCompat switch05 = (SwitchCompat) context.findViewById(R.id.switch05);
        SwitchCompat switch06 = (SwitchCompat) context.findViewById(R.id.switch06);
        SwitchCompat switch07 = (SwitchCompat) context.findViewById(R.id.switch07);
        SwitchCompat switch08 = (SwitchCompat) context.findViewById(R.id.switch08);
        SwitchCompat switch09 = (SwitchCompat) context.findViewById(R.id.switch09);
        SwitchCompat switch10 = (SwitchCompat) context.findViewById(R.id.switch10);
        SwitchCompat switch11 = (SwitchCompat) context.findViewById(R.id.switch11);
        SwitchCompat switch12 = (SwitchCompat) context.findViewById(R.id.switch12);



        btnSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                int switchesFlipped = checkSwitches();

                if(switchesFlipped > 2){
                    Intent intent = new Intent(context, ERActivity.class);
                    startActivity(intent);
                }
                else if(switchesFlipped > 0 & switchesFlipped < 3){
                    Intent intent = new Intent(context, URActivity.class);
                    startActivity(intent);
                }
                else if(switchesFlipped == 0){
                    Intent intent = new Intent(context, CalendarActivity.class);
                    startActivity(intent);
                }
            }

            public int checkSwitches(){
                int switchesFlipped = 0;

                if(switch01.isChecked())
                    switchesFlipped++;
                if(switch02.isChecked())
                    switchesFlipped++;
                if(switch03.isChecked())
                    switchesFlipped++;
                if(switch04.isChecked())
                    switchesFlipped++;
                if(switch05.isChecked())
                    switchesFlipped++;
                if(switch06.isChecked())
                    switchesFlipped++;
                if(switch07.isChecked())
                    switchesFlipped++;
                if(switch08.isChecked())
                    switchesFlipped++;
                if(switch09.isChecked())
                    switchesFlipped++;
                if(switch10.isChecked())
                    switchesFlipped++;
                if(switch11.isChecked())
                    switchesFlipped++;
                if(switch12.isChecked())
                    switchesFlipped++;

                return switchesFlipped;
            }
        });
    }
}