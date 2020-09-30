package com.himanshu.myimsguide.bca.semester1;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.himanshu.myimsguide.MainFragment;
import com.himanshu.myimsguide.R;
public class BCASemester1Subjects extends Fragment {

    private MainFragment.onFragmentBtnSelected listener550;



    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view= inflater.inflate(R.layout.fragment_bca_sem1_subjects,container,false);


        Button button51 = view.findViewById(R.id.buttonBcaSem1Maths1Selected);
        Button button551 = view.findViewById(R.id.buttonBcaSem1PPASelected);
        Button button552 = view.findViewById(R.id.buttonBcaSem1CFOASelected);
        Button button553 = view.findViewById(R.id.buttonBcaSem1POMSelected);
        Button button554 = view.findViewById(R.id.buttonBcaSem1BCSelected);

        button51.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) { listener550.onBCASem1Maths1Selected();
            }
        });
        button551.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) { listener550.onBCASem1PpaSelected();
            }
        });
        button552.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) { listener550.onBCASem1CfoaSelected();
            }
        });
        button553.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) { listener550.onBCASem1PomSelected();
            }
        });
        button554.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) { listener550.onBCASem1BcSelected();
            }
        });




        return view;


    }
    @Override
    public void onAttach(@NonNull Context context) {
        super.onAttach(context);
        if(context instanceof MainFragment.onFragmentBtnSelected) {
            listener550 = (MainFragment.onFragmentBtnSelected) context;
        } else  {
            throw new ClassCastException(context.toString() + "must implement listener");
        }
    }
}
