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

public class BcaSem4NotesOs extends Fragment {

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_bcasem4notes_os,container,false);

        Button button322 = view.findViewById(R.id.buttonBcaSem4OsUnit1);
        Button button323 = view.findViewById(R.id.buttonBcaSem4OsUnit2);
        Button button324 = view.findViewById(R.id.buttonBcaSem4OsUnit3);
        Button button325 = view.findViewById(R.id.buttonBcaSem4OsUnit4);
        Button button326 = view.findViewById(R.id.buttonBcaSem4OsUnit5);


        button322.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setAction(Intent.ACTION_VIEW);
                intent.addCategory(Intent.CATEGORY_BROWSABLE);
                intent.setData(Uri.parse("https://drive.google.com/open?id=1MMJvg4FMLHL_QVCDfVSaH-Hl404iJF4K"));
                startActivity(intent);
            }
        });
        button323.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setAction(Intent.ACTION_VIEW);
                intent.addCategory(Intent.CATEGORY_BROWSABLE);
                intent.setData(Uri.parse("https://drive.google.com/open?id=18HyqhIGgqHA7HlGBGM0vwDBIV6c-Wzof"));
                startActivity(intent);
            }
        });
        button324.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setAction(Intent.ACTION_VIEW);
                intent.addCategory(Intent.CATEGORY_BROWSABLE);
                intent.setData(Uri.parse("https://drive.google.com/open?id=1tFM3ibl1awXFQ7-h5Mas5B5t43LV-Oql"));
                startActivity(intent);
            }
        });
        button325.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setAction(Intent.ACTION_VIEW);
                intent.addCategory(Intent.CATEGORY_BROWSABLE);
                intent.setData(Uri.parse("https://drive.google.com/open?id=1j9tc3-OXTalKqrZ8r2Aq9fnf2Eq01ETb"));
                startActivity(intent);
            }
        });
        button326.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setAction(Intent.ACTION_VIEW);
                intent.addCategory(Intent.CATEGORY_BROWSABLE);
                intent.setData(Uri.parse("https://drive.google.com/open?id=1gNjXo2iRqwcsQlj-ZL_0TqXzgSr4uh1G"));
                startActivity(intent);
            }
        });

        return view;
    }
}

