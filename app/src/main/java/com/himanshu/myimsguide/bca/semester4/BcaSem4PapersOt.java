package com.himanshu.myimsguide.bca.semester4;

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

public class BcaSem4PapersOt extends Fragment {

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_bcasem4papers_ot,container,false);

        Button button332 = view.findViewById(R.id.buttonBcaSem4OtUnit1Paper);
        Button button333 = view.findViewById(R.id.buttonBcaSem4OtUnit2Paper);
        Button button334 = view.findViewById(R.id.buttonBcaSem4OtUnit3Paper);
        Button button335 = view.findViewById(R.id.buttonBcaSem4OtUnit4Paper);
        Button button336 = view.findViewById(R.id.buttonBcaSem4OtUnit5Paper);

        button332.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setAction(Intent.ACTION_VIEW);
                intent.addCategory(Intent.CATEGORY_BROWSABLE);
                intent.setData(Uri.parse("https://drive.google.com/open?id=1gcOSavwZt5IqQ0Nu-jlHWy98C6zhveuD"));
                startActivity(intent);
            }
        });
        button333.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setAction(Intent.ACTION_VIEW);
                intent.addCategory(Intent.CATEGORY_BROWSABLE);
                intent.setData(Uri.parse("https://drive.google.com/open?id=1GgI33YX6tTcca9ZtljuzcN6XIICQ_x9n"));
                startActivity(intent);
            }
        });
        button334.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setAction(Intent.ACTION_VIEW);
                intent.addCategory(Intent.CATEGORY_BROWSABLE);
                intent.setData(Uri.parse("https://drive.google.com/open?id=1L9qb60Lexy8gZvLE62B6Qf2FI9gyGR6-"));
                startActivity(intent);
            }
        });
        button335.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setAction(Intent.ACTION_VIEW);
                intent.addCategory(Intent.CATEGORY_BROWSABLE);
                intent.setData(Uri.parse("https://drive.google.com/open?id=12991_WdKsNycYQQgsvEU_DXcdZPrW5nu"));
                startActivity(intent);
            }
        });
        button336.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setAction(Intent.ACTION_VIEW);
                intent.addCategory(Intent.CATEGORY_BROWSABLE);
                intent.setData(Uri.parse("https://drive.google.com/open?id=159UrFNuzwA2NXGC2xhov9tNotl48bHdo"));
                startActivity(intent);
            }
        });




        return view;
    }
}


