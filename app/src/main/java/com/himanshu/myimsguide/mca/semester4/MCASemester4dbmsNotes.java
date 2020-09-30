package com.himanshu.myimsguide.mca.semester4;

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

public class MCASemester4dbmsNotes extends Fragment {

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view= inflater.inflate(R.layout.fragment_mcasem4notes_dbms,container,false);

        Button mcabutton240 = view.findViewById(R.id.buttonMcaSem4dbmsUnit1);
        Button mcabutton241 = view.findViewById(R.id.buttonMcaSem4dbmsUnit2);
        Button mcabutton242 = view.findViewById(R.id.buttonMcaSem4dbmsUnit3);
        Button mcabutton243 = view.findViewById(R.id.buttonMcaSem4dbmsUnit4);
        Button mcabutton244 = view.findViewById(R.id.buttonMcaSem4dbmsUnit5);

        mcabutton240.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setAction(Intent.ACTION_VIEW);
                intent.addCategory(Intent.CATEGORY_BROWSABLE);
                intent.setData(Uri.parse("https://drive.google.com/open?id=1odbmnsYOETLQRNVJsN46Y9eyfn1U12D5"));
                startActivity(intent);
            }
        });
        mcabutton241.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setAction(Intent.ACTION_VIEW);
                intent.addCategory(Intent.CATEGORY_BROWSABLE);
                intent.setData(Uri.parse("https://drive.google.com/open?id=1OhlfUzMJ7cIB0qsjH8NRYYWb5qBmW6vB"));
                startActivity(intent);
            }
        });
        mcabutton242.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setAction(Intent.ACTION_VIEW);
                intent.addCategory(Intent.CATEGORY_BROWSABLE);
                intent.setData(Uri.parse("https://drive.google.com/open?id=1e4R5xtsgkVu3ekffb0tDewbKIxdG3zSV"));
                startActivity(intent);
            }
        });
        mcabutton243.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setAction(Intent.ACTION_VIEW);
                intent.addCategory(Intent.CATEGORY_BROWSABLE);
                intent.setData(Uri.parse("https://drive.google.com/open?id=1Uu5R_hYT3gNPG_OOjC_6c3InoTv6poSS"));
                startActivity(intent);
            }
        });
        mcabutton244.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setAction(Intent.ACTION_VIEW);
                intent.addCategory(Intent.CATEGORY_BROWSABLE);
                intent.setData(Uri.parse("https://drive.google.com/open?id=1q99o51PCfBmwafjtspN1SHPixWHhDhHq"));
                startActivity(intent);
            }
        });









        return view;
    }

}