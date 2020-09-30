package com.himanshu.myimsguide.mca.semester3;

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

public class MCASemester3Subjects extends Fragment {

    private MainFragment.onFragmentBtnSelected listener550;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view= inflater.inflate(R.layout.fragment_mca_sem3_subjects,container,false);
        Button mcabutton7501 = view.findViewById(R.id.buttonMcaSem3cbotSelected);
        Button mcabutton7512 = view.findViewById(R.id.buttonMcaSem3csSelected);
        Button mcabutton7523 = view.findViewById(R.id.buttonMcaSem3daaSelected);
        Button mcabutton7534 = view.findViewById(R.id.buttonBcaSem3ipcoSelected);
        Button mcabutton7545 = view.findViewById(R.id.buttonMcaSem3osSelected);
        Button mcabutton7556 = view.findViewById(R.id.buttonMcaSem3wtSelected);

        mcabutton7501.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) { listener550.onMCASem3cbotSelected();
            }
        });
        mcabutton7512.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) { listener550.onMCASem3csSelected();
            }
        });
        mcabutton7523.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) { listener550.onMCASem3daaSelected();
            }
        });
        mcabutton7534.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) { listener550.onMCASem3iporgSelected();
            }
        });
        mcabutton7545.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) { listener550.onMCASem3osSelected();
            }
        });
        mcabutton7556.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) { listener550.onMCASem3wtSelected();
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

