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

public class BCASemester4SubjectMaths3 extends Fragment {

    private MainFragment.onFragmentBtnSelected listener58;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view= inflater.inflate(R.layout.fragment_bca_sem4_maths3_option,container,false);


        Button button86 = view.findViewById(R.id.buttonBcaSem1PrevPapersMaths3);
        button86.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) { listener58.onBCASem4PapersMaths3Selected();
            }
        });

        Button button81 = view.findViewById(R.id.buttonBcaSem1NotesMaths3);
        button81.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) { listener58.onBCASem4NotesMaths3Selected();
            }
        });


        Button button3004 = view.findViewById(R.id.buttonBcaSem1QuestionBankMaths3);
        button3004.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setAction(Intent.ACTION_VIEW);
                intent.addCategory(Intent.CATEGORY_BROWSABLE);
                intent.setData(Uri.parse("https://drive.google.com/open?id=1qGZwkOxl4emMre_Fqsn_kvdMuyQBCg61"));
                startActivity(intent);
            }
        });

        Button button3005 = view.findViewById(R.id.buttonBcaSem1ModelPapersMaths3);
        button3005.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setAction(Intent.ACTION_VIEW);
                intent.addCategory(Intent.CATEGORY_BROWSABLE);
                intent.setData(Uri.parse("https://drive.google.com/open?id=10n-GNOyP37kSdj7JEqNy11F6gECMXyQt"));
                startActivity(intent);
            }
        });




        return view;
    }//ignore this
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
