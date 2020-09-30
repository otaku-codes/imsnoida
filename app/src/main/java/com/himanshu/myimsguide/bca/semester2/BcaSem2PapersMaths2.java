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

public class BcaSem2PapersMaths2 extends Fragment {

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_bcasem2papers_maths2,container,false);

        Button button227 = view.findViewById(R.id.buttonBcaSem2Maths2Unit1Paper);
        Button button228 = view.findViewById(R.id.buttonBcaSem2Maths2Unit2Paper);
        Button button229 = view.findViewById(R.id.buttonBcaSem2Maths2Unit3Paper);
        Button button230 = view.findViewById(R.id.buttonBcaSem2Maths2Unit4Paper);


        button227.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setAction(Intent.ACTION_VIEW);
                intent.addCategory(Intent.CATEGORY_BROWSABLE);
                intent.setData(Uri.parse("https://drive.google.com/open?id=1vQ_O51QnAIc9Fyvoeqm0mMzsKEKHnXTH"));
                startActivity(intent);
            }
        });
        button228.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setAction(Intent.ACTION_VIEW);
                intent.addCategory(Intent.CATEGORY_BROWSABLE);
                intent.setData(Uri.parse("https://drive.google.com/open?id=1qvAcAggdtNJ8EY8W6WQ_o-oIUtb9Hnt1"));
                startActivity(intent);
            }
        });
        button229.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setAction(Intent.ACTION_VIEW);
                intent.addCategory(Intent.CATEGORY_BROWSABLE);
                intent.setData(Uri.parse("https://drive.google.com/open?id=1rDYYGy-2IITwQLsylgJfUJSSu6nGr4jq"));
                startActivity(intent);
            }
        });
        button230.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setAction(Intent.ACTION_VIEW);
                intent.addCategory(Intent.CATEGORY_BROWSABLE);
                intent.setData(Uri.parse("https://drive.google.com/open?id=1t4xlBRo6nZ_x34TIiQYqubRqLDJCEZoQ"));
                startActivity(intent);
            }
        });

        return view;
    }
}


