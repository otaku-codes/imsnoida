package com.himanshu.myimsguide.bca.semester2;

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

public class BCASemester2Subjects extends Fragment {


    private MainFragment.onFragmentBtnSelected listener550;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view= inflater.inflate(R.layout.fragment_bca_sem2_subjects,container,false);
        Button button51 = view.findViewById(R.id.buttonBcaSem2Maths2);
        Button button551 = view.findViewById(R.id.buttonBcaSem2C);
        Button button552 = view.findViewById(R.id.buttonBcaSem2Ob);
        Button button553 = view.findViewById(R.id.buttonBcaSem2De);
        Button button554 = view.findViewById(R.id.buttonBcaSem2Fa);

        button51.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) { listener550.onBCASem2Maths2Selected();
            }
        });
        button551.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) { listener550.onBCASem2CSelected();
            }
        });
        button552.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) { listener550.onBCASem2ObSelected();
            }
        });
        button553.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) { listener550.onBCASem2DeSelected();
            }
        });
        button554.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) { listener550.onBCASem2FamSelected();
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
