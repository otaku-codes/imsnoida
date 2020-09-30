package com.himanshu.myimsguide.bca.semester4;

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

public class BCASemester4SubjectSe extends Fragment {

    private MainFragment.onFragmentBtnSelected listener58;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view= inflater.inflate(R.layout.fragment_bca_sem4_se_option,container,false);



        Button button84 = view.findViewById(R.id.buttonBcaSem1NotesSe);
        button84.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) { listener58.onBCASem4NotesSeSelected();
            }
        });


        Button button89 = view.findViewById(R.id.buttonBcaSem1PrevPapersSe);
        button89.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) { listener58.onBCASem4PapersSeSelected();
            }
        });


        Button button3008 = view.findViewById(R.id.buttonBcaSem1QuestionBankSe);
        button3008.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setAction(Intent.ACTION_VIEW);
                intent.addCategory(Intent.CATEGORY_BROWSABLE);
                intent.setData(Uri.parse("https://drive.google.com/open?id=1AGc0GrKljJaSYSF4u1YCMHVm4qY30icx"));
                startActivity(intent);
            }
        });

        Button button3009 = view.findViewById(R.id.buttonBcaSem1ModelPapersSe);
        button3009.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setAction(Intent.ACTION_VIEW);
                intent.addCategory(Intent.CATEGORY_BROWSABLE);
                intent.setData(Uri.parse("https://drive.google.com/open?id=1sL_gL6--nPUX2wKWGR9-H5RDQxSEdddq"));
                startActivity(intent);
            }
        });





        return view;
    } //ignore this
    @Override
    public void onAttach(@NonNull Context context) {
        super.onAttach(context);
        if(context instanceof MainFragment.onFragmentBtnSelected) {
            listener58 = (MainFragment.onFragmentBtnSelected) context;
        } else  {
            throw new ClassCastException(context.toString() + "must implement listener");
        }
    }
}
