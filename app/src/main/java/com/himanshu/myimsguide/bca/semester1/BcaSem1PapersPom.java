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

public class BcaSem1PapersPom extends Fragment {

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_bca_sem1_papers_pom,container,false);

        Button button171 = view.findViewById(R.id.buttonBcaSem1PomUnit1Paper);
        Button button172 = view.findViewById(R.id.buttonBcaSem1PomUnit2Paper);
        Button button173 = view.findViewById(R.id.buttonBcaSem1PomUnit3Paper);
        Button button174 = view.findViewById(R.id.buttonBcaSem1PomUnit4Paper);
        Button button175 = view.findViewById(R.id.buttonBcaSem1PomUnit5Paper);

        button171.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setAction(Intent.ACTION_VIEW);
                intent.addCategory(Intent.CATEGORY_BROWSABLE);
                intent.setData(Uri.parse("https://drive.google.com/file/d/1TlKQU8OHY1Y8AtH9WSs6v4iue7Ru124u/view?usp=sharing"));
                startActivity(intent);
            }
        });
        button172.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setAction(Intent.ACTION_VIEW);
                intent.addCategory(Intent.CATEGORY_BROWSABLE);
                intent.setData(Uri.parse("https://drive.google.com/file/d/18u9B5wq8D6GYmVbsmlmkRC_C5_NktGpa/view?usp=sharing"));
                startActivity(intent);
            }
        });
        button173.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setAction(Intent.ACTION_VIEW);
                intent.addCategory(Intent.CATEGORY_BROWSABLE);
                intent.setData(Uri.parse("https://drive.google.com/file/d/1uZagcDT0iScieiTEOLeeL8Ml2Y4TV32Z/view?usp=sharing"));
                startActivity(intent);
            }
        });
        button174.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setAction(Intent.ACTION_VIEW);
                intent.addCategory(Intent.CATEGORY_BROWSABLE);
                intent.setData(Uri.parse("https://drive.google.com/file/d/1ZuWgDGM3Sgb15Fx9S9ebd5UY5EUcPw6C/view?usp=sharing"));
                startActivity(intent);
            }
        });
        button175.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setAction(Intent.ACTION_VIEW);
                intent.addCategory(Intent.CATEGORY_BROWSABLE);
                intent.setData(Uri.parse("https://drive.google.com/file/d/1zxAbklwsmG2k3zPUvY3QUa-WEvJWLTHQ/view?usp=sharing"));
                startActivity(intent);
            }
        });

        return view;
    }
}


