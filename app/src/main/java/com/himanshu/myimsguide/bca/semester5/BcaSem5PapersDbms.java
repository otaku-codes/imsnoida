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

public class BcaSem5PapersDbms extends Fragment {

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_bcasem5papers_dbms,container,false);

        Button button404 = view.findViewById(R.id.buttonBcaSem5DbmsUnit1Paper);
        Button button405 = view.findViewById(R.id.buttonBcaSem5DbmsUnit2Paper);
        Button button406 = view.findViewById(R.id.buttonBcaSem5DbmsUnit3Paper);
        Button button407 = view.findViewById(R.id.buttonBcaSem5DbmsUnit4Paper);
        Button button408 = view.findViewById(R.id.buttonBcaSem5DbmsUnit5Paper);
        button404.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setAction(Intent.ACTION_VIEW);
                intent.addCategory(Intent.CATEGORY_BROWSABLE);
                intent.setData(Uri.parse("https://drive.google.com/file/d/1mv4-X2_z0JzFc-m1y4ofxf8-tG6nMKJf/view?usp=sharing"));
                startActivity(intent);
            }
        });
        button405.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setAction(Intent.ACTION_VIEW);
                intent.addCategory(Intent.CATEGORY_BROWSABLE);
                intent.setData(Uri.parse("https://drive.google.com/file/d/1VgsCTwMFWSyMYiK7XRJ3Wr0VDBFmo78Z/view?usp=sharing"));
                startActivity(intent);
            }
        });
        button406.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setAction(Intent.ACTION_VIEW);
                intent.addCategory(Intent.CATEGORY_BROWSABLE);
                intent.setData(Uri.parse("https://drive.google.com/file/d/1TePqJaS_D6LVRh4L-s5WfnxcShCwpcGK/view?usp=sharing"));
                startActivity(intent);
            }
        });
        button407.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setAction(Intent.ACTION_VIEW);
                intent.addCategory(Intent.CATEGORY_BROWSABLE);
                intent.setData(Uri.parse("https://drive.google.com/file/d/1pxskz_eNfJiif56r-mj-OF1Ks8hjp_JG/view?usp=sharing"));
                startActivity(intent);
            }
        });
        button408.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setAction(Intent.ACTION_VIEW);
                intent.addCategory(Intent.CATEGORY_BROWSABLE);
                intent.setData(Uri.parse("https://drive.google.com/file/d/1OQH0ige8pAdUmrJHJIcD4iXUseRpCdE6/view?usp=sharing"));
                startActivity(intent);
            }
        });
        return view;
    }
}


