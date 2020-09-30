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

public class BcaSem6PapersIadi extends Fragment {

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_bcasem6papers_is,container,false);


        Button button434 = view.findViewById(R.id.buttonBcaSem6IsUnit1Paper);
        Button button435 = view.findViewById(R.id.buttonBcaSem6IsUnit2Paper);
        Button button436 = view.findViewById(R.id.buttonBcaSem6IsUnit3Paper);
        Button button437 = view.findViewById(R.id.buttonBcaSem6IsUnit4Paper);
        Button buttons437 = view.findViewById(R.id.buttonBcaSem6IsUnit5Paper);

        button434.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setAction(Intent.ACTION_VIEW);
                intent.addCategory(Intent.CATEGORY_BROWSABLE);
                intent.setData(Uri.parse("https://drive.google.com/open?id=13RR5aSpXb8mMEXS7IK2gli6lLs5Apgjv"));
                startActivity(intent);
            }
        });
        button435.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setAction(Intent.ACTION_VIEW);
                intent.addCategory(Intent.CATEGORY_BROWSABLE);
                intent.setData(Uri.parse("https://drive.google.com/open?id=1FEBwnS2oDHW9XWckMXfOwgfOh0cqmgF1"));
                startActivity(intent);
            }
        });
        button436.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setAction(Intent.ACTION_VIEW);
                intent.addCategory(Intent.CATEGORY_BROWSABLE);
                intent.setData(Uri.parse("https://drive.google.com/open?id=1_Kijuo6VwJPRFbC3wbHTG0u2tlqqML-Z"));
                startActivity(intent);
            }
        });
        button437.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setAction(Intent.ACTION_VIEW);
                intent.addCategory(Intent.CATEGORY_BROWSABLE);
                intent.setData(Uri.parse("https://drive.google.com/open?id=13pavqSHtnYZm2T6UWorWk8O12NLHubmQ"));
                startActivity(intent);
            }
        });

        buttons437.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setAction(Intent.ACTION_VIEW);
                intent.addCategory(Intent.CATEGORY_BROWSABLE);
                intent.setData(Uri.parse("https://drive.google.com/open?id=1CjDCijtGxTje_nC7h1_AQcAQ26bOkmPv"));
                startActivity(intent);
            }
        });




        return view;
    }
}

