package com.himanshu.myimsguide;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;


public class CoursesFragment extends Fragment {

    private MainFragment.onFragmentBtnSelected listener2;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_courses,container,false);


        //buttons here
        Button button8 = view.findViewById(R.id.buttonBca);

        Button button10 = view.findViewById(R.id.buttonBba);


        //onclick listener here
        button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                listener2.onBCASelected();
            }
        });

        button10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                listener2.onBbaSelected();
            }
        });

        Button button100000 = view.findViewById(R.id.buttonMca);
        Button button100001 = view.findViewById(R.id.buttonmjmc);
        Button button100002 = view.findViewById(R.id.buttonBJMC);
        Button button100003 = view.findViewById(R.id.buttonllb);
        Button button100004 = view.findViewById(R.id.buttonLLB);
        Button button100005 = view.findViewById(R.id.buttonMba);
        button100000.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getContext(), "Coming Soon...", Toast.LENGTH_SHORT).show();
            }
        });
        button100001.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getContext(), "Coming Soon...", Toast.LENGTH_SHORT).show();
            }
        });
        button100002.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getContext(), "Coming Soon...", Toast.LENGTH_SHORT).show();
            }
        });
        button100003.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getContext(), "Coming Soon...", Toast.LENGTH_SHORT).show();
            }
        });
        button100004.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getContext(), "Coming Soon...", Toast.LENGTH_SHORT).show();
            }
        });
        button100005.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getContext(), "Coming Soon...", Toast.LENGTH_SHORT).show();
            }
        });
        
        




        return view;
    }



    //ignore this
    @Override
    public void onAttach(@NonNull Context context) {
        super.onAttach(context);
        if(context instanceof MainFragment.onFragmentBtnSelected) {
            listener2 = (MainFragment.onFragmentBtnSelected) context;
        } else  {
            throw new ClassCastException(context.toString() + "must implement listener");
        }
    }
}
