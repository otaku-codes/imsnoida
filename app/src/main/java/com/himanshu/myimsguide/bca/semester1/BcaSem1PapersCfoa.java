package com.himanshu.myimsguide.bca.semester1;

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

public class BcaSem1PapersCfoa extends Fragment {

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_bca_sem1_papers_cfoa,container,false);

        Button button200 = view.findViewById(R.id.buttonBcaSem1CfoaUnit1Paper);
        Button button201 = view.findViewById(R.id.buttonBcaSem1CfoaUnit2Paper);
        Button button202 = view.findViewById(R.id.buttonBcaSem1CfoaUnit3Paper);
        Button button203 = view.findViewById(R.id.buttonBcaSem1CfoaUnit4Paper);
        Button button204 = view.findViewById(R.id.buttonBcaSem1CfoaUnit5Paper);

        button200.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setAction(Intent.ACTION_VIEW);
                intent.addCategory(Intent.CATEGORY_BROWSABLE);
                intent.setData(Uri.parse("https://drive.google.com/file/d/1Lych8BTAJPgC-6y05kE8LqGul6MoEYNK/view?usp=sharing"));
                startActivity(intent);
            }
        });
        button201.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setAction(Intent.ACTION_VIEW);
                intent.addCategory(Intent.CATEGORY_BROWSABLE);
                intent.setData(Uri.parse("https://drive.google.com/file/d/1O6j4GckP-xUEzVzNN26T27bP6hIN6sTm/view?usp=sharing"));
                startActivity(intent);
            }
        });
        button202.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setAction(Intent.ACTION_VIEW);
                intent.addCategory(Intent.CATEGORY_BROWSABLE);
                intent.setData(Uri.parse("https://drive.google.com/file/d/1anR4DyL9JCr98OZgu8FwHs7kzokvDcB9/view?usp=sharing"));
                startActivity(intent);
            }
        });
        button203.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setAction(Intent.ACTION_VIEW);
                intent.addCategory(Intent.CATEGORY_BROWSABLE);
                intent.setData(Uri.parse("https://drive.google.com/file/d/11jcVOA881ieqczYRxsLCtY7neLeDtv7_/view?usp=sharing"));
                startActivity(intent);
            }
        });
        button204.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setAction(Intent.ACTION_VIEW);
                intent.addCategory(Intent.CATEGORY_BROWSABLE);
                intent.setData(Uri.parse("https://drive.google.com/file/d/15OkDsjkcl1_Lyr6eVsub_69HOBCUfob_/view?usp=sharing"));
                startActivity(intent);
            }
        });


        return view;
    }
}


