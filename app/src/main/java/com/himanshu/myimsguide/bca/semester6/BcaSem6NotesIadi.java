package com.himanshu.myimsguide.bca.semester6;

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

public class BcaSem6NotesIadi extends Fragment {

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_bcasem6notes_is,container,false);


        Button button600 = view.findViewById(R.id.buttonBcaSem6IsUnit1);
        Button button601 = view.findViewById(R.id.buttonBcaSem6IsUnit2);
        Button button602 = view.findViewById(R.id.buttonBcaSem6IsUnit3);
        Button button603 = view.findViewById(R.id.buttonBcaSem6IsUnit4);
        Button button604 = view.findViewById(R.id.buttonBcaSem6IsUnit5);

        button600.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setAction(Intent.ACTION_VIEW);
                intent.addCategory(Intent.CATEGORY_BROWSABLE);
                intent.setData(Uri.parse("https://drive.google.com/open?id=16IhXAk8Sp_F1jNMHWVDr5LAl27LU-XXZ"));
                startActivity(intent);
            }
        });
        button601.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setAction(Intent.ACTION_VIEW);
                intent.addCategory(Intent.CATEGORY_BROWSABLE);
                intent.setData(Uri.parse("https://drive.google.com/open?id=1Y5vJoR9FR9kCIKU9s79FdmyFcsidrPH3"));
                startActivity(intent);
            }
        });
        button602.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setAction(Intent.ACTION_VIEW);
                intent.addCategory(Intent.CATEGORY_BROWSABLE);
                intent.setData(Uri.parse("https://drive.google.com/open?id=1Cc0UlbjmGn8MjWJsZp0knuz9U7LKH-cd"));
                startActivity(intent);
            }
        });
        button603.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setAction(Intent.ACTION_VIEW);
                intent.addCategory(Intent.CATEGORY_BROWSABLE);
                intent.setData(Uri.parse("https://drive.google.com/open?id=1y8_h7dSQmkIllBxL_d7hJiEVn601wD8j"));
                startActivity(intent);
            }
        });

        button604.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setAction(Intent.ACTION_VIEW);
                intent.addCategory(Intent.CATEGORY_BROWSABLE);
                intent.setData(Uri.parse("https://drive.google.com/open?id=1JIc1UjewofXm6qDTtqqex3DtI3boFfHR"));
                startActivity(intent);
            }
        });





        return view;
    }
}

