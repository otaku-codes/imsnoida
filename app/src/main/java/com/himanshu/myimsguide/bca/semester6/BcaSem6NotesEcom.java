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

public class BcaSem6NotesEcom extends Fragment {

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_bcasem6notes_ecom,container,false);

        Button button500 = view.findViewById(R.id.buttonBcaSem6EcomUnit1);
        Button button501 = view.findViewById(R.id.buttonBcaSem6EcomUnit2);
        Button button502 = view.findViewById(R.id.buttonBcaSem6EcomUnit3);
        Button button503 = view.findViewById(R.id.buttonBcaSem6EcomUnit4);
        Button button5003 = view.findViewById(R.id.buttonBcaSem6EcomUnit5);



        button500.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setAction(Intent.ACTION_VIEW);
                intent.addCategory(Intent.CATEGORY_BROWSABLE);
                intent.setData(Uri.parse("https://drive.google.com/open?id=1ll1KsAAAafZMTBU_EiKXkCYHbY8qkyug"));
                startActivity(intent);
            }
        });
        button501.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setAction(Intent.ACTION_VIEW);
                intent.addCategory(Intent.CATEGORY_BROWSABLE);
                intent.setData(Uri.parse("https://drive.google.com/open?id=1ogOZkyiMwlwvT4XlkNkrFcnyYrrf44eD"));
                startActivity(intent);
            }
        });
        button502.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setAction(Intent.ACTION_VIEW);
                intent.addCategory(Intent.CATEGORY_BROWSABLE);
                intent.setData(Uri.parse("https://drive.google.com/open?id=1DqQGUWR4tIzyxV5TsoBUsVlmeB9XNaeI"));
                startActivity(intent);
            }
        });
        button503.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setAction(Intent.ACTION_VIEW);
                intent.addCategory(Intent.CATEGORY_BROWSABLE);
                intent.setData(Uri.parse("https://drive.google.com/open?id=16AhhNHnV7TATGyK5wNvYADNN2TdeUT7t"));
                startActivity(intent);
            }
        });
        button5003.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setAction(Intent.ACTION_VIEW);
                intent.addCategory(Intent.CATEGORY_BROWSABLE);
                intent.setData(Uri.parse("https://drive.google.com/open?id=1Rl28GZV6gHwB8clUXjZbRMsAFJAXH-Y6"));
                startActivity(intent);
            }
        });



        return view;
    }
}

