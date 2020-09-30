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

public class BcaSem2NotesFam extends Fragment {

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_bcasem2notes_fam,container,false);

        Button button255 = view.findViewById(R.id.buttonBcaSem2FamUnit1);
        Button button256 = view.findViewById(R.id.buttonBcaSem2FamUnit2);
        Button button257 = view.findViewById(R.id.buttonBcaSem2FamUnit3);
        Button button258 = view.findViewById(R.id.buttonBcaSem2FamUnit4);
        Button button259 = view.findViewById(R.id.buttonBcaSem2FamUnit5);
        Button button260 = view.findViewById(R.id.buttonBcaSem2FamUnit6);

        button255.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setAction(Intent.ACTION_VIEW);
                intent.addCategory(Intent.CATEGORY_BROWSABLE);
                intent.setData(Uri.parse("https://drive.google.com/open?id=1riYJm3c-HNf3srXi4V7WaLHBxtAWZCM0"));
                startActivity(intent);
            }
        });
        button256.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setAction(Intent.ACTION_VIEW);
                intent.addCategory(Intent.CATEGORY_BROWSABLE);
                intent.setData(Uri.parse("https://drive.google.com/open?id=1voxBkGdrNk0vyfu3nAfXhtGBPN4XhMDQ"));
                startActivity(intent);
            }
        });
        button257.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setAction(Intent.ACTION_VIEW);
                intent.addCategory(Intent.CATEGORY_BROWSABLE);
                intent.setData(Uri.parse("https://drive.google.com/open?id=1jBnUP2NkMix4F_iUaTrUNbWMnrcWDZSc"));
                startActivity(intent);
            }
        });
        button258.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setAction(Intent.ACTION_VIEW);
                intent.addCategory(Intent.CATEGORY_BROWSABLE);
                intent.setData(Uri.parse("https://drive.google.com/open?id=1Ve9d6sOB0E5y6xf50PgsSyY87_xyE5Pb"));
                startActivity(intent);
            }
        });

        button259.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setAction(Intent.ACTION_VIEW);
                intent.addCategory(Intent.CATEGORY_BROWSABLE);
                intent.setData(Uri.parse("https://drive.google.com/open?id=1-dpG82Sz1W4zGJ0FGE0YfM8yX8yebYvY"));
                startActivity(intent);
            }
        });

        button260.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setAction(Intent.ACTION_VIEW);
                intent.addCategory(Intent.CATEGORY_BROWSABLE);
                intent.setData(Uri.parse("https://drive.google.com/open?id=1uTaEJo9QyaJ1hyLklHOfWXVtuyjhYQSB"));
                startActivity(intent);
            }
        });

        return view;
    }
}



