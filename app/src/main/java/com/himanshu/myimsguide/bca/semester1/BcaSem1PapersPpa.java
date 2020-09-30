package com.himanshu.myimsguide.bca.semester1;

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

public class BcaSem1PapersPpa extends Fragment {

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_bca_sem1_papers_ppa,container,false);

        Button button176 = view.findViewById(R.id.buttonBcaSem1PpaUnit1Paper);
        Button button177 = view.findViewById(R.id.buttonBcaSem1PpaUnit2Paper);
        Button button178 = view.findViewById(R.id.buttonBcaSem1PpaUnit3Paper);
        Button button179 = view.findViewById(R.id.buttonBcaSem1PpaUnit4Paper);
        Button button180 = view.findViewById(R.id.buttonBcaSem1PpaUnit5Paper);

        button176.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setAction(Intent.ACTION_VIEW);
                intent.addCategory(Intent.CATEGORY_BROWSABLE);
                intent.setData(Uri.parse("https://drive.google.com/file/d/1jtn7d5xrpG6PMmNQCRDMgolAqglDhQ4s/view?usp=sharing"));
                startActivity(intent);
            }
        });
        button177.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setAction(Intent.ACTION_VIEW);
                intent.addCategory(Intent.CATEGORY_BROWSABLE);
                intent.setData(Uri.parse("https://drive.google.com/file/d/1URxI1scum50PjAZue2oNI0A0QuQsKvvU/view?usp=sharing"));
                startActivity(intent);
            }
        });
        button178.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setAction(Intent.ACTION_VIEW);
                intent.addCategory(Intent.CATEGORY_BROWSABLE);
                intent.setData(Uri.parse("https://drive.google.com/file/d/1SKZKnHesV95jetCTW8NojDnCGBuy4QsP/view?usp=sharing"));
                startActivity(intent);
            }
        });
        button179.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setAction(Intent.ACTION_VIEW);
                intent.addCategory(Intent.CATEGORY_BROWSABLE);
                intent.setData(Uri.parse("https://drive.google.com/file/d/1xStcQvTCAh2yRQxGNayTq6XGlWYaM03i/view?usp=sharing"));
                startActivity(intent);
            }
        });
        button180.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setAction(Intent.ACTION_VIEW);
                intent.addCategory(Intent.CATEGORY_BROWSABLE);
                intent.setData(Uri.parse("https://drive.google.com/file/d/1BrbvW8n_cSpDoNLM3AcP3HKh_Qy4Q5p0/view?usp=sharing"));
                startActivity(intent);
            }
        });


        return view;
    }
}


