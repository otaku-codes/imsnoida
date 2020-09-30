package com.himanshu.myimsguide.mca.semester4;

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

public class MCASemester4Subjects extends Fragment {


    private MainFragment.onFragmentBtnSelected listener550;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view= inflater.inflate(R.layout.fragment_mca_sem4_subjects,container,false);

        Button mcabutton750 = view.findViewById(R.id.buttonMcaSem4DbmsSelected);
        Button mcabutton751 = view.findViewById(R.id.buttonMcaSem4CnSelected);
        Button mcabutton752 = view.findViewById(R.id.buttonMcaSem4AiSelected);
        Button mcabutton753 = view.findViewById(R.id.buttonMcaSem4cdSelected);
        Button mcabutton754 = view.findViewById(R.id.buttonMcaSem4McSelected);
        Button mcabutton755 = view.findViewById(R.id.buttonBcaSem4fodaSelected);

        mcabutton750.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) { listener550.onMCASem4dbmsSelected();
            }
        });
        mcabutton751.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) { listener550.onMCASem4cnSelected();
            }
        });
        mcabutton752.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) { listener550.onMCASem4aiSelected();
            }
        });
        mcabutton753.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) { listener550.onMCASem4cdSelected();
            }
        });
        mcabutton754.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) { listener550.onMCASem4mcSelected();
            }
        });
        mcabutton755.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) { listener550.onMCASem4fodaSelected();
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

