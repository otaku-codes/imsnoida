package com.himanshu.myimsguide.bca.semester6;

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

public class BCASemester6SubjectCns extends Fragment {

    private MainFragment.onFragmentBtnSelected listener63;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view= inflater.inflate(R.layout.fragment_bca_sem6_cns_option,container,false);


        Button button103 = view.findViewById(R.id.buttonBcaSem1NotesCns);
        button103.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                listener63.onBCASem6NotesCnsSelected();
            }
        });

        Button buttons1 = view.findViewById(R.id.buttonBcaSem1PrevPapersCns);
        buttons1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                listener63.onBCASem6PapersCnsSelected();
            }
        });

        Button buttons2 = view.findViewById(R.id.buttonBcaSem1QuestionBankCns);
        buttons2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setAction(Intent.ACTION_VIEW);
                intent.addCategory(Intent.CATEGORY_BROWSABLE);
                intent.setData(Uri.parse("https://drive.google.com/open?id=1Q1n4e1bBv-9nkMVRecVrxHQ_j47lSAvk"));
                startActivity(intent);
            }
        });



        Button buttons3 = view.findViewById(R.id.buttonBcaSem1ModelPapersCns);
        buttons3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setAction(Intent.ACTION_VIEW);
                intent.addCategory(Intent.CATEGORY_BROWSABLE);
                intent.setData(Uri.parse("https://drive.google.com/open?id=1jQAnmrSXUiTC4igP4yGoG5Y_oW7JpcbD"));
                startActivity(intent);
            }
        });






        return view;
    }


    @Override
    public void onAttach(@NonNull Context context) {
        super.onAttach(context);
        if(context instanceof MainFragment.onFragmentBtnSelected) {
            listener63 = (MainFragment.onFragmentBtnSelected) context;
        } else  {
            throw new ClassCastException(context.toString() + "must implement listener");
        }
    }
}
