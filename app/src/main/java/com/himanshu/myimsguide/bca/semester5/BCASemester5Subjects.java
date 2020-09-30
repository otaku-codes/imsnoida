package com.himanshu.myimsguide.bca.semester5;

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
public class BCASemester5Subjects extends Fragment {


    private MainFragment.onFragmentBtnSelected listener550;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view= inflater.inflate(R.layout.fragment_bca_sem5_subjects,container,false);



        Button button651 = view.findViewById(R.id.buttonBcaSem5DbmsSelected);
        Button button652 = view.findViewById(R.id.buttonBcaSem5JavaSelected);
        Button button610 = view.findViewById(R.id.buttonBcaSem5CnSelected);
        Button button653 = view.findViewById(R.id.buttonBcaSem5NmSelected);

        button610.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) { listener550.onBCASem5CnSelected();
            }
        });
        button651.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) { listener550.onBCASem5DbmsSelected();
            }
        });
        button652.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) { listener550.onBCASem5JavaSelected();
            }
        });
        button653.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) { listener550.onBCASem5NmSelected();
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
