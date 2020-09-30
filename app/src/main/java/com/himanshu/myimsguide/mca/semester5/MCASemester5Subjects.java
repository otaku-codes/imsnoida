package com.himanshu.myimsguide.mca.semester5;

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
public class MCASemester5Subjects extends Fragment {

    private MainFragment.onFragmentBtnSelected listener550;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_mca_sem5_subjects, container, false);

        Button mcabutton75011 = view.findViewById(R.id.buttonMcaSem5adSelected);
        Button mcabutton75121 = view.findViewById(R.id.buttonMcaSem5bdSelected);
        Button mcabutton75231 = view.findViewById(R.id.buttonMcaSem5ccSelected);
        Button mcabutton75341 = view.findViewById(R.id.buttonMcaSem5cgSelected);
        Button mcabutton75451= view.findViewById(R.id.buttonMcaSem5seSelected);

        mcabutton75011.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) { listener550.onMCASem5adSelected();
            }
        });
        mcabutton75121.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) { listener550.onMCASem5bdSelected();
            }

        });
        mcabutton75231.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) { listener550.onMCASem5ccSelected();
            }
        });
        mcabutton75341.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) { listener550.onMCASem5cgmaSelected();
            }
        });
        mcabutton75451.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) { listener550.onMCASem5seSelected();
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

