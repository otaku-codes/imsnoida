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

public class BcaSem4NotesSe extends Fragment {

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_bcasem4notes_se,container,false);

        Button button332 = view.findViewById(R.id.buttonBcaSem4SeUnit1);
        Button button333 = view.findViewById(R.id.buttonBcaSem4SeUnit2);
        Button button334 = view.findViewById(R.id.buttonBcaSem4SeUnit3);
        Button button335 = view.findViewById(R.id.buttonBcaSem4SeUnit4);

        button332.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setAction(Intent.ACTION_VIEW);
                intent.addCategory(Intent.CATEGORY_BROWSABLE);
                intent.setData(Uri.parse("https://drive.google.com/open?id=1a3oq1XWUAKr6k5rObuUv0f0s9SUy6uJT"));
                startActivity(intent);
            }
        });
        button333.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setAction(Intent.ACTION_VIEW);
                intent.addCategory(Intent.CATEGORY_BROWSABLE);
                intent.setData(Uri.parse("https://drive.google.com/open?id=1Qm2XwxnKpXAwFSRx_fDpphH0cXaeEgfl"));
                startActivity(intent);
            }
        });
        button334.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setAction(Intent.ACTION_VIEW);
                intent.addCategory(Intent.CATEGORY_BROWSABLE);
                intent.setData(Uri.parse("https://drive.google.com/open?id=1mqCT9JOJVbnxHaCY0JPZ5_yh0oy1ZE2f"));
                startActivity(intent);
            }
        });
        button335.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setAction(Intent.ACTION_VIEW);
                intent.addCategory(Intent.CATEGORY_BROWSABLE);
                intent.setData(Uri.parse("https://drive.google.com/open?id=17eGOnjeXW_1hiNcNdZWeAS5tNVqJ2blC"));
                startActivity(intent);
            }
        });


        return view;
    }
}
