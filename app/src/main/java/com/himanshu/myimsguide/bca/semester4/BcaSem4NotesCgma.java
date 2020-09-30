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

public class BcaSem4NotesCgma extends Fragment {

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_bcasem4notes_cgma,container,false);

        Button button300 = view.findViewById(R.id.buttonBcaSem4CgmaUnit1);
        Button button301 = view.findViewById(R.id.buttonBcaSem4CgmaUnit2);
        Button button302 = view.findViewById(R.id.buttonBcaSem4CgmaUnit3);
        Button button303 = view.findViewById(R.id.buttonBcaSem4CgmaUnit4);
        Button button304 = view.findViewById(R.id.buttonBcaSem4CgmaUnit5);
        Button button305 = view.findViewById(R.id.buttonBcaSem4CgmaUnit6);

        button300.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setAction(Intent.ACTION_VIEW);
                intent.addCategory(Intent.CATEGORY_BROWSABLE);
                intent.setData(Uri.parse("https://drive.google.com/open?id=1YJveHmu9QYRQikEsWkpvcr6jn6sPFNgD"));
                startActivity(intent);
            }
        });
        button301.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setAction(Intent.ACTION_VIEW);
                intent.addCategory(Intent.CATEGORY_BROWSABLE);
                intent.setData(Uri.parse("https://drive.google.com/open?id=1asVVx-iwxePKU0zAsipsOy7wDkNwCQZn"));
                startActivity(intent);
            }
        });
        button302.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setAction(Intent.ACTION_VIEW);
                intent.addCategory(Intent.CATEGORY_BROWSABLE);
                intent.setData(Uri.parse("https://drive.google.com/open?id=16ADmXxeyqfkv_0Dz8zbwWa1gJ0uM2X4t"));
                startActivity(intent);
            }
        });
        button303.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setAction(Intent.ACTION_VIEW);
                intent.addCategory(Intent.CATEGORY_BROWSABLE);
                intent.setData(Uri.parse("https://drive.google.com/open?id=1Ou9bVt00dzb8cDpAGVA51v3jhH3WxMaj"));
                startActivity(intent);
            }
        });
        button304.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setAction(Intent.ACTION_VIEW);
                intent.addCategory(Intent.CATEGORY_BROWSABLE);
                intent.setData(Uri.parse("https://drive.google.com/open?id=1gki32c1398YwM-WKYxClfQB8t0ZBaSYV"));
                startActivity(intent);
            }
        });
        button305.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setAction(Intent.ACTION_VIEW);
                intent.addCategory(Intent.CATEGORY_BROWSABLE);
                intent.setData(Uri.parse("https://drive.google.com/open?id=10DgDn6t64vrTnhRiAwQbYV3Av9nLBkcJ"));
                startActivity(intent);
            }
        });

        return view;
    }
}


