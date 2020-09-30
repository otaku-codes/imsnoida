package com.himanshu.myimsguide.bca.semester6;

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


public class BCASemester6Subjects extends Fragment {

    private MainFragment.onFragmentBtnSelected listener550;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view= inflater.inflate(R.layout.fragment_bca_sem6_subjects,container,false);


       Button button851 = view.findViewById(R.id.buttonBcaSem6Cns);
        Button button852 = view.findViewById(R.id.buttonBcaSem6Isa);
        Button button853 = view.findViewById(R.id.buttonBcaSem6Ecom);
        Button button854 = view.findViewById(R.id.buttonBcaSem6Km);

        button851.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) { listener550.onBCASem6CnsSelected();
            }
        });
        button852.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) { listener550.onBCASem6IadiSelected();
            }
        });
        button853.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) { listener550.onBCASem6EcomSelected();
            }
        });
        button854.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) { listener550.onBCASem6KmSelected();
            }
        });

        return view;
    } @Override
    public void onAttach(@NonNull Context context) {
        super.onAttach(context);
        if(context instanceof MainFragment.onFragmentBtnSelected) {
            listener550 = (MainFragment.onFragmentBtnSelected) context;
        } else  {
            throw new ClassCastException(context.toString() + "must implement listener");
        }
    }
}
