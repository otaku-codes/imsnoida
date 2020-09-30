package com.himanshu.myimsguide.bca.semester5;

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

public class BcaSem5PapersJava extends Fragment {

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_bcasem5papers_java,container,false);

        Button button408 = view.findViewById(R.id.buttonBcaSem5JavaUnit1Paper);
        Button button409 = view.findViewById(R.id.buttonBcaSem5JavaUnit2Paper);
        Button button410 = view.findViewById(R.id.buttonBcaSem5JavaUnit3Paper);
        Button button411 = view.findViewById(R.id.buttonBcaSem5JavaUnit4Paper);
        Button button412 = view.findViewById(R.id.buttonBcaSem5JavaUnit5Paper);

        button408.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setAction(Intent.ACTION_VIEW);
                intent.addCategory(Intent.CATEGORY_BROWSABLE);
                intent.setData(Uri.parse("https://drive.google.com/file/d/1bCocrwAsHIQvbHtve2TKURDgjgH3btOz/view?usp=sharing"));
                startActivity(intent);
            }
        });
        button409.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setAction(Intent.ACTION_VIEW);
                intent.addCategory(Intent.CATEGORY_BROWSABLE);
                intent.setData(Uri.parse("https://drive.google.com/file/d/183ryX4L7z4rlMY5njDEDDOcTDS2nw1uv/view?usp=sharing"));
                startActivity(intent);
            }
        });
        button410.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setAction(Intent.ACTION_VIEW);
                intent.addCategory(Intent.CATEGORY_BROWSABLE);
                intent.setData(Uri.parse("https://drive.google.com/file/d/1L4xpMrG6i_5hcoHvqWIqRtIi1ZV7USVT/view?usp=sharing"));
                startActivity(intent);
            }
        });
        button411.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setAction(Intent.ACTION_VIEW);
                intent.addCategory(Intent.CATEGORY_BROWSABLE);
                intent.setData(Uri.parse("https://drive.google.com/file/d/1Z_4jPIwXfIqgakGXikTrrVaS0LCyHZmq/view?usp=sharing"));
                startActivity(intent);
            }
        });
        button412.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setAction(Intent.ACTION_VIEW);
                intent.addCategory(Intent.CATEGORY_BROWSABLE);
                intent.setData(Uri.parse("https://drive.google.com/file/d/1gKujinQyt0NGuqYEjUk1bE44mqzd-Bl0/view?usp=sharing"));
                startActivity(intent);
            }
        });

        return view;
    }
}


