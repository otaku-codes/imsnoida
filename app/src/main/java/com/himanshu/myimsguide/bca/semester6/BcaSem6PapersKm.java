package com.himanshu.myimsguide.bca.semester6;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.himanshu.myimsguide.R;

public class BcaSem6PapersKm extends Fragment {

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_bcasem6papers_km,container,false);

        Button button450 = view.findViewById(R.id.buttonBcaSem6KmUnit1Paper);
        Button button451 = view.findViewById(R.id.buttonBcaSem6KmUnit2Paper);
        Button button452 = view.findViewById(R.id.buttonBcaSem6KmUnit3Paper);
        Button button453 = view.findViewById(R.id.buttonBcaSem6KmUnit4Paper);
        Button buttons453 = view.findViewById(R.id.buttonBcaSem6KmUnit5Paper);

        button450.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setAction(Intent.ACTION_VIEW);
                intent.addCategory(Intent.CATEGORY_BROWSABLE);
                intent.setData(Uri.parse("https://drive.google.com/open?id=14U54uxCuj5eTTDUhpEYVGFRi1xzcH3J2"));
                startActivity(intent);
            }
        });
        button451.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setAction(Intent.ACTION_VIEW);
                intent.addCategory(Intent.CATEGORY_BROWSABLE);
                intent.setData(Uri.parse("https://drive.google.com/open?id=1_GDg6diJdRKi-TkVN3KnjpR1IiftLVVR"));
                startActivity(intent);
            }
        });
        button452.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setAction(Intent.ACTION_VIEW);
                intent.addCategory(Intent.CATEGORY_BROWSABLE);
                intent.setData(Uri.parse("https://drive.google.com/open?id=1A042B47ekM1fIdLL_GEfqGJpg5XuQxDq"));
                startActivity(intent);
            }
        });
        button453.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setAction(Intent.ACTION_VIEW);
                intent.addCategory(Intent.CATEGORY_BROWSABLE);
                intent.setData(Uri.parse("https://drive.google.com/open?id=1FpaaGQ_DizxoXtif6auTSl5Tr08Ww2t1"));
                startActivity(intent);
            }
        });

        buttons453.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setAction(Intent.ACTION_VIEW);
                intent.addCategory(Intent.CATEGORY_BROWSABLE);
                intent.setData(Uri.parse("https://drive.google.com/open?id=1nGtgLaBC6aEakGyAx9400YxLx367HGeX"));
                startActivity(intent);
            }
        });


        return view;
    }
}

