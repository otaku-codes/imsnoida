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

public class BcaSem2NotesOb extends Fragment {

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_bcasem2notes_ob,container,false);

        Button button261 = view.findViewById(R.id.buttonBcaSem2ObUnit1);
        Button button262 = view.findViewById(R.id.buttonBcaSem2ObUnit2);
        Button button263 = view.findViewById(R.id.buttonBcaSem2ObUnit3);
        Button button264 = view.findViewById(R.id.buttonBcaSem2ObUnit4);
        Button button265 = view.findViewById(R.id.buttonBcaSem2ObUnit5);

        button261.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setAction(Intent.ACTION_VIEW);
                intent.addCategory(Intent.CATEGORY_BROWSABLE);
                intent.setData(Uri.parse("https://drive.google.com/open?id=17bLMJivJZZosTk93I2YiFXlKX9I2yP6o"));
                startActivity(intent);
            }
        });
        button262.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setAction(Intent.ACTION_VIEW);
                intent.addCategory(Intent.CATEGORY_BROWSABLE);
                intent.setData(Uri.parse("https://drive.google.com/open?id=19lu-RK_FeAnfdhiacvwagGgLJZGIpz8i"));
                startActivity(intent);
            }
        });
        button263.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setAction(Intent.ACTION_VIEW);
                intent.addCategory(Intent.CATEGORY_BROWSABLE);
                intent.setData(Uri.parse("https://drive.google.com/open?id=1zbBYffse3aV_RmgpLvHeNNexNGiU5UQu"));
                startActivity(intent);
            }
        });
        button264.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setAction(Intent.ACTION_VIEW);
                intent.addCategory(Intent.CATEGORY_BROWSABLE);
                intent.setData(Uri.parse("https://drive.google.com/open?id=1jhrsy1vMNkZGI2SuWXJxXv9NtcCgoB_C"));
                startActivity(intent);
            }
        });

        button265.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setAction(Intent.ACTION_VIEW);
                intent.addCategory(Intent.CATEGORY_BROWSABLE);
                intent.setData(Uri.parse("https://drive.google.com/open?id=1vEWFVr5l1Fm8NWDRha7_MYjWjtNCgH5w"));
                startActivity(intent);
            }
        });





        return view;
    }
}


