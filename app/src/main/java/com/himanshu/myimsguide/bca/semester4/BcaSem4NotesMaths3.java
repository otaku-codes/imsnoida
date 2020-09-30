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

public class BcaSem4NotesMaths3 extends Fragment {

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_bcasem4notes_maths3,container,false);

        Button button311 = view.findViewById(R.id.buttonBcaSem4Maths3Unit1);
        Button button312 = view.findViewById(R.id.buttonBcaSem4Maths3Unit2);
        Button button313 = view.findViewById(R.id.buttonBcaSem4Maths3Unit3);
        Button button314 = view.findViewById(R.id.buttonBcaSem4Maths3Unit4);
        Button button315 = view.findViewById(R.id.buttonBcaSem4Maths3Unit5);
        Button button316 = view.findViewById(R.id.buttonBcaSem4Maths3Unit6);

        button311.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setAction(Intent.ACTION_VIEW);
                intent.addCategory(Intent.CATEGORY_BROWSABLE);
                intent.setData(Uri.parse("https://drive.google.com/open?id=1-T_xCI6onzEsKhzKnO8G1SwRl6QTpdEy"));
                startActivity(intent);
            }
        });
        button312.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setAction(Intent.ACTION_VIEW);
                intent.addCategory(Intent.CATEGORY_BROWSABLE);
                intent.setData(Uri.parse("https://drive.google.com/open?id=18qggnK5bo3hQ3vdsNpguC_Bw8mDzBG1o"));
                startActivity(intent);
            }
        });
        button313.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setAction(Intent.ACTION_VIEW);
                intent.addCategory(Intent.CATEGORY_BROWSABLE);
                intent.setData(Uri.parse("https://drive.google.com/open?id=1O6dueNVLC3AjdzeaGyaYjWum3c7bVbKe"));
                startActivity(intent);
            }
        });
        button314.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setAction(Intent.ACTION_VIEW);
                intent.addCategory(Intent.CATEGORY_BROWSABLE);
                intent.setData(Uri.parse("https://drive.google.com/open?id=1OMPfoTKRkcsO8KdxXJ8e-9gSAP89RyM7"));
                startActivity(intent);
            }
        });
        button315.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setAction(Intent.ACTION_VIEW);
                intent.addCategory(Intent.CATEGORY_BROWSABLE);
                intent.setData(Uri.parse("https://drive.google.com/open?id=1eCujezK2Vn2vwZ2z_uSB0Q2GfOR3WVPn"));
                startActivity(intent);
            }
        });
        button316.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setAction(Intent.ACTION_VIEW);
                intent.addCategory(Intent.CATEGORY_BROWSABLE);
                intent.setData(Uri.parse("https://drive.google.com/open?id=1wfZYslTKo_Z_aiT0PuKdEQ_7nV5xiv_r"));
                startActivity(intent);
            }
        });


        return view;
    }
}
