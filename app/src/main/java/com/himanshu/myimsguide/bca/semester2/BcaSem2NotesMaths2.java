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

public class BcaSem2NotesMaths2 extends Fragment {

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_bcasem2notes_maths2,container,false);


        Button button221 = view.findViewById(R.id.buttonBcaSem2MathsUnit1);
        Button button222 = view.findViewById(R.id.buttonBcaSem2MathsUnit2);
        Button button223 = view.findViewById(R.id.buttonBcaSem2MathsUnit3);
        Button button224 = view.findViewById(R.id.buttonBcaSem2MathsUnit4);
        Button button225 = view.findViewById(R.id.buttonBcaSem2MathsUnit5);
        Button button226 = view.findViewById(R.id.buttonBcaSem2MathsUnit6);

        button221.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setAction(Intent.ACTION_VIEW);
                intent.addCategory(Intent.CATEGORY_BROWSABLE);
                intent.setData(Uri.parse("https://drive.google.com/open?id=1swmX6nzIcHdsQau13Q9w3ITeKUYjz0-D"));
                startActivity(intent);
            }
        });
        button222.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setAction(Intent.ACTION_VIEW);
                intent.addCategory(Intent.CATEGORY_BROWSABLE);
                intent.setData(Uri.parse("https://drive.google.com/open?id=1jJNoTAw6eoShjdLSJVgo7X1PI_TV3d_k"));
                startActivity(intent);
            }
        });
        button223.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setAction(Intent.ACTION_VIEW);
                intent.addCategory(Intent.CATEGORY_BROWSABLE);
                intent.setData(Uri.parse("https://drive.google.com/open?id=1_uqwY_O8AmoDjLvykQXE9bivrZpjV1k3"));
                startActivity(intent);
            }
        });
        button224.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setAction(Intent.ACTION_VIEW);
                intent.addCategory(Intent.CATEGORY_BROWSABLE);
                intent.setData(Uri.parse("https://drive.google.com/open?id=150HfbS1IbJzBJsdhVsD8rAPzXtmDf-Sd"));
                startActivity(intent);
            }
        });
        button225.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setAction(Intent.ACTION_VIEW);
                intent.addCategory(Intent.CATEGORY_BROWSABLE);
                intent.setData(Uri.parse("https://drive.google.com/open?id=1nnkrxbFJwWlMifG1l2S7K-spTgWqFkrz"));
                startActivity(intent);
            }
        });
        button226.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setAction(Intent.ACTION_VIEW);
                intent.addCategory(Intent.CATEGORY_BROWSABLE);
                intent.setData(Uri.parse("https://drive.google.com/open?id=1GOcqFIJ0hSv1WSRYR4R55a5f6blPXfCt"));
                startActivity(intent);
            }
        });

        return view;
    }
}


