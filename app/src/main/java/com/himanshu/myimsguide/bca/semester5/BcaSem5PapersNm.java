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

public class BcaSem5PapersNm extends Fragment {

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_bcasem5papers_nm,container,false);

        Button button420 = view.findViewById(R.id.buttonBcaSem5NmUnit1Paper);
        Button button421 = view.findViewById(R.id.buttonBcaSem5NmUnit2Paper);
        Button button422 = view.findViewById(R.id.buttonBcaSem5NmUnit3Paper);
        Button button423 = view.findViewById(R.id.buttonBcaSem5NmUnit4Paper);
        Button button424 = view.findViewById(R.id.buttonBcaSem5NmUnit5Paper);

        button420.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setAction(Intent.ACTION_VIEW);
                intent.addCategory(Intent.CATEGORY_BROWSABLE);
                intent.setData(Uri.parse("https://drive.google.com/file/d/1vkIC9YWygu33TI4lTBkLICMXRNvpER_C/view?usp=sharing"));
                startActivity(intent);
            }
        });
        button421.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setAction(Intent.ACTION_VIEW);
                intent.addCategory(Intent.CATEGORY_BROWSABLE);
                intent.setData(Uri.parse("https://drive.google.com/file/d/1Ix4Wgtuj_wVI5R8DYeeVnbJiTGxUs8x_/view?usp=sharing"));
                startActivity(intent);
            }
        });
        button422.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setAction(Intent.ACTION_VIEW);
                intent.addCategory(Intent.CATEGORY_BROWSABLE);
                intent.setData(Uri.parse("https://drive.google.com/file/d/1ziCYSIXNc59v6zTw6LKeyWH-aKC-uPm4/view?usp=sharing"));
                startActivity(intent);
            }
        });
        button423.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setAction(Intent.ACTION_VIEW);
                intent.addCategory(Intent.CATEGORY_BROWSABLE);
                intent.setData(Uri.parse("https://drive.google.com/file/d/1hby9_WQzMST6b6FGfDOlt8J1P_X67Bcb/view?usp=sharing"));
                startActivity(intent);
            }
        });
        button424.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setAction(Intent.ACTION_VIEW);
                intent.addCategory(Intent.CATEGORY_BROWSABLE);
                intent.setData(Uri.parse("https://drive.google.com/file/d/1fTeQpbt31XFMGAL10hpKJfOmcCvM9QuC/view?usp=sharing"));
                startActivity(intent);
            }
        });
        return view;
    }
}


