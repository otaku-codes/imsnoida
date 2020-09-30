package com.himanshu.myimsguide.bca.semester4;

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

public class BCASemester4Subjects extends Fragment {

    private MainFragment.onFragmentBtnSelected listener550;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view= inflater.inflate(R.layout.fragment_bca_sem4_subjects,container,false);

        Button button750 = view.findViewById(R.id.buttonBcaSem4CgmaSelected);
        Button button751 = view.findViewById(R.id.buttonBcaSem4OsSelected);
        Button button752 = view.findViewById(R.id.buttonBcaSem4SeSelected);
        Button button753 = view.findViewById(R.id.buttonBcaSem4OtSelected);
        Button button754 = view.findViewById(R.id.buttonBcaSem4Math3Selected);

        button750.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) { listener550.onBCASem4CgmaSelected();
            }
        });
        button751.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) { listener550.onBCASem4OsSelected();
            }
        });
        button752.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) { listener550.onBCASem4SeSelected();
            }
        });


        button753.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) { listener550.onBCASem4OtSelected();
            }
        });

        button754.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) { listener550.onBCASem4Maths3Selected();
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

