package com.himanshu.myimsguide.bba;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.himanshu.myimsguide.MainFragment;
import com.himanshu.myimsguide.R;

public class BbaFragment extends Fragment {


    private MainFragment.onFragmentBtnSelected listener3;


    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_bba,container,false);





        Button bbabutton1 = view.findViewById(R.id.buttonBbaSem2);
        bbabutton1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                listener3.onBBASem2Selected();
            }
        });

        Button bbabutton2 = view.findViewById(R.id.buttonBbaSem4);
        bbabutton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                listener3.onBBASem4Selected();
            }
        });

        Button bbabutton3 = view.findViewById(R.id.buttonBbaSem6);
        bbabutton3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                listener3.onBBASem6Selected();
            }
        });


        Button bbabutton75011 = view.findViewById(R.id.buttonBbaSyllabus);
        bbabutton75011.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setAction(Intent.ACTION_VIEW);
                intent.addCategory(Intent.CATEGORY_BROWSABLE);
                intent.setData(Uri.parse("https://drive.google.com/open?id=1U0dpqD0aP44xquiSrcuRGFipgVk7x3vx"));
                startActivity(intent);
            }
        });


        Button bbabutton33 = view.findViewById(R.id.buttonBbaSem1);
        bbabutton33.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getContext(), "Coming Soon...", Toast.LENGTH_SHORT).show();
            }
        });



        Button bbabutton100 = view.findViewById(R.id.buttonBbaSem3);
        bbabutton100.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getContext(), "Coming Soon...", Toast.LENGTH_SHORT).show();
            }
        });


        Button bbabutton101 = view.findViewById(R.id.buttonBbaSem5);
        bbabutton101.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getContext(), "Coming Soon...", Toast.LENGTH_SHORT).show();
            }
        });
















        return view;
    } @Override
    public void onAttach(@NonNull Context context) {
        super.onAttach(context);
        if(context instanceof MainFragment.onFragmentBtnSelected) {
            listener3 = (MainFragment.onFragmentBtnSelected) context;
        } else  {
            throw new ClassCastException(context.toString() + "must implement listener");
        }
    }

}
