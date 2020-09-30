package com.himanshu.myimsguide.bca.semester2;

import android.content.Context;
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

import com.himanshu.myimsguide.MainFragment;
import com.himanshu.myimsguide.R;

public class BCASemester2SubjectFam extends Fragment {

    private MainFragment.onFragmentBtnSelected listener53;


    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view= inflater.inflate(R.layout.fragment_bca_sem2_fam_option,container,false);


        Button button70 = view.findViewById(R.id.buttonBcaSem1Notesfam);
        button70.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) { listener53.onBCASem2NotesFam2Selected();
            }
        });

        Button button65 = view.findViewById(R.id.buttonBcaSem1PrevPapersfam);
        button65.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) { listener53.onBCASem2PapersFam2Selected();
            }
        });


        Button button1094 = view.findViewById(R.id.buttonBcaSem1QuestionBankFam);
        button1094.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setAction(Intent.ACTION_VIEW);
                intent.addCategory(Intent.CATEGORY_BROWSABLE);
                intent.setData(Uri.parse("https://drive.google.com/open?id=1Yb2WRnf3P964B-ejihVIlrKkj48C--_t"));
                startActivity(intent);
            }
        });

        Button button1095 = view.findViewById(R.id.buttonBcaSem1ModelPapersC);
        button1095.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setAction(Intent.ACTION_VIEW);
                intent.addCategory(Intent.CATEGORY_BROWSABLE);
                intent.setData(Uri.parse("https://drive.google.com/open?id=1lfHeGryQHk_EmnsB1YbeccZC-nDHLpqq"));
                startActivity(intent);
            }
        });








        return view;
    }
    @Override
    public void onAttach(@NonNull Context context) {
        super.onAttach(context);
        if(context instanceof MainFragment.onFragmentBtnSelected) {
            listener53 = (MainFragment.onFragmentBtnSelected) context;
        } else  {
            throw new ClassCastException(context.toString() + "must implement listener");
        }
    }
}
