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

public class BcaSem4PapersOs extends Fragment {

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_bcasem4papers_os,container,false); Button button317 = view.findViewById(R.id.buttonBcaSem4Maths3Unit1Paper);
        Button button327 = view.findViewById(R.id.buttonBcaSem4OsUnit1Paper);
        Button button328 = view.findViewById(R.id.buttonBcaSem4OsUnit2Paper);
        Button button329 = view.findViewById(R.id.buttonBcaSem4OsUnit3Paper);
        Button button330 = view.findViewById(R.id.buttonBcaSem4OsUnit4Paper);
        Button button331 = view.findViewById(R.id.buttonBcaSem4OsUnit5Paper);

        button327.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setAction(Intent.ACTION_VIEW);
                intent.addCategory(Intent.CATEGORY_BROWSABLE);
                intent.setData(Uri.parse("https://drive.google.com/open?id=1fuyAHEiV7xmd2IW5i76mZoGQcLH4jJiw"));
                startActivity(intent);
            }
        });
        button328.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setAction(Intent.ACTION_VIEW);
                intent.addCategory(Intent.CATEGORY_BROWSABLE);
                intent.setData(Uri.parse("https://drive.google.com/open?id=11OBNTrV7pJ4WtpwMkcUWKpXny4VhqZzA"));
                startActivity(intent);
            }
        });
        button329.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setAction(Intent.ACTION_VIEW);
                intent.addCategory(Intent.CATEGORY_BROWSABLE);
                intent.setData(Uri.parse("https://drive.google.com/open?id=1IsB_MS3M7lK8iimVpgNSYjEXYUvZTu0G"));
                startActivity(intent);
            }
        });
        button330.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setAction(Intent.ACTION_VIEW);
                intent.addCategory(Intent.CATEGORY_BROWSABLE);
                intent.setData(Uri.parse("https://drive.google.com/open?id=1RVEQciaT5Hrnmml-NXgQABbXg2FGelme"));
                startActivity(intent);
            }
        });
        button331.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setAction(Intent.ACTION_VIEW);
                intent.addCategory(Intent.CATEGORY_BROWSABLE);
                intent.setData(Uri.parse("https://drive.google.com/open?id=1HB9gnySO4a5NZlaY4ceZ2kDMrF7Zl-Gz"));
                startActivity(intent);
            }
        });




        return view;
    }
}


