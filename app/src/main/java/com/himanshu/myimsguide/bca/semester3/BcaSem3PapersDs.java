package com.himanshu.myimsguide.bca.semester3;

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

public class BcaSem3PapersDs extends Fragment {

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_bcasem3papers_ds,container,false);


        Button button352 = view.findViewById(R.id.buttonBcaSem3DsUnit1Paper);
        Button button353 = view.findViewById(R.id.buttonBcaSem3DsUnit2Paper);
        Button button354 = view.findViewById(R.id.buttonBcaSem3DsUnit3Paper);
        Button button355 = view.findViewById(R.id.buttonBcaSem3DsUnit4Paper);
        Button button356 = view.findViewById(R.id.buttonBcaSem3DsUnit5Paper);

        button352.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setAction(Intent.ACTION_VIEW);
                intent.addCategory(Intent.CATEGORY_BROWSABLE);
                intent.setData(Uri.parse("https://drive.google.com/file/d/1zlC1OM8Ce0hhblsINY-X3IhbFJQWgQYs/view?usp=sharing"));
                startActivity(intent);
            }
        });
        button353.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setAction(Intent.ACTION_VIEW);
                intent.addCategory(Intent.CATEGORY_BROWSABLE);
                intent.setData(Uri.parse("https://drive.google.com/file/d/1MI5TZZkaWZaHlOxVWSap4-6wgZbph5Uq/view?usp=sharing"));
                startActivity(intent);
            }
        });
        button354.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setAction(Intent.ACTION_VIEW);
                intent.addCategory(Intent.CATEGORY_BROWSABLE);
                intent.setData(Uri.parse("https://drive.google.com/file/d/127EzN1jG3PNjs3dCxSrIIQ5XXSeTFKGH/view?usp=sharing"));
                startActivity(intent);
            }
        });
        button355.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setAction(Intent.ACTION_VIEW);
                intent.addCategory(Intent.CATEGORY_BROWSABLE);
                intent.setData(Uri.parse("https://drive.google.com/file/d/1Ku4JA6n4M-blXLZ9U8R5GIxTfM5S5dRD/view?usp=sharing"));
                startActivity(intent);
            }
        });
        button356.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setAction(Intent.ACTION_VIEW);
                intent.addCategory(Intent.CATEGORY_BROWSABLE);
                intent.setData(Uri.parse("https://drive.google.com/file/d/1awPDvYbh4elMDTmxKW-M7iF4pi_8mxif/view?usp=sharing"));
                startActivity(intent);
            }
        });



        return view;
    }
}



