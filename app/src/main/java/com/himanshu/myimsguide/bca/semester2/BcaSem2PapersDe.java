package com.himanshu.myimsguide.bca.semester2;

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

public class BcaSem2PapersDe extends Fragment {

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_bcasem2papers_deco,container,false);

        Button button246 = view.findViewById(R.id.buttonBcaSem2DeUnit1Paper);
        Button button247 = view.findViewById(R.id.buttonBcaSem2DeUnit2Paper);
        Button button248 = view.findViewById(R.id.buttonBcaSem2DeUnit3Paper);
        Button button250 = view.findViewById(R.id.buttonBcaSem2DeUnit5Paper);

        button246.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setAction(Intent.ACTION_VIEW);
                intent.addCategory(Intent.CATEGORY_BROWSABLE);
                intent.setData(Uri.parse("https://drive.google.com/open?id=1iXmhsFMVr6vqPtd7XiqC28HHPZbJ6cdS"));
                startActivity(intent);
            }
        });
        button247.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setAction(Intent.ACTION_VIEW);
                intent.addCategory(Intent.CATEGORY_BROWSABLE);
                intent.setData(Uri.parse("https://drive.google.com/open?id=1CnS2ZoJa7ZAA6t7lBmG13kuKDDSEPgvR"));
                startActivity(intent);
            }
        });
        button248.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setAction(Intent.ACTION_VIEW);
                intent.addCategory(Intent.CATEGORY_BROWSABLE);
                intent.setData(Uri.parse("https://drive.google.com/open?id=1m6N0TOxK4ZroebyLi4-xrolqyKwFMeNQ"));
                startActivity(intent);
            }
        });
        button250.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setAction(Intent.ACTION_VIEW);
                intent.addCategory(Intent.CATEGORY_BROWSABLE);
                intent.setData(Uri.parse("https://drive.google.com/open?id=1uUZ-1tNBoOBSYvQ_hq5bPZy6SeOxnpE4"));
                startActivity(intent);
            }
        });

        Button button2546 = view.findViewById(R.id.buttonBcaSem2DeUnit6Paper);

        button2546.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setAction(Intent.ACTION_VIEW);
                intent.addCategory(Intent.CATEGORY_BROWSABLE);
                intent.setData(Uri.parse("https://drive.google.com/open?id=1BWddp5kG4BNwpW_F_Yoc6A3wgM1NjwQw"));
                startActivity(intent);
            }
        });


        return view;
    }
}


