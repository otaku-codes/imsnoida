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

public class MCASemester4fodaNotes extends Fragment {


    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_mcasem4notes_foda, container, false);

        Button mcabutton340 = view.findViewById(R.id.buttonMcaSem4fodaUnit1);
        Button mcabutton341 = view.findViewById(R.id.buttonMcaSem4fodaUnit2);
        Button mcabutton342 = view.findViewById(R.id.buttonMcaSem4fodaUnit3);
        Button mcabutton343 = view.findViewById(R.id.buttonMcaSem4fodaUnit4);

        mcabutton340.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setAction(Intent.ACTION_VIEW);
                intent.addCategory(Intent.CATEGORY_BROWSABLE);
                intent.setData(Uri.parse("https://drive.google.com/open?id=1UTYqDJL9UtaK3KbCKfU_HcuVyOlBVcp-"));
                startActivity(intent);
            }
        });
        mcabutton341.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setAction(Intent.ACTION_VIEW);
                intent.addCategory(Intent.CATEGORY_BROWSABLE);
                intent.setData(Uri.parse("https://drive.google.com/open?id=1i3NejVqY7vv5f0xODSM1jzUWj9T3rTEm"));
                startActivity(intent);
            }
        });
        mcabutton342.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setAction(Intent.ACTION_VIEW);
                intent.addCategory(Intent.CATEGORY_BROWSABLE);
                intent.setData(Uri.parse("https://drive.google.com/open?id=1nGIoOpeiHouQNK7FsS8zbskysImh0Ad4"));
                startActivity(intent);
            }
        });
        mcabutton343.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setAction(Intent.ACTION_VIEW);
                intent.addCategory(Intent.CATEGORY_BROWSABLE);
                intent.setData(Uri.parse("https://drive.google.com/open?id=1-h2KL4cQxbZpIL6mYH3Mukioywqamq8g"));
                startActivity(intent);
            }
        });



        return view;
    }

}