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

public class BCASemester4SubjectCgma extends Fragment {

    private MainFragment.onFragmentBtnSelected listener59;


    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view= inflater.inflate(R.layout.fragment_bca_sem4_cgma_option,container,false);

        Button button82 = view.findViewById(R.id.buttonBcaSem1NotesCgma);
        button82.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) { listener59.onBCASem4NotesCgmaSelected();
            }
        });

        Button button87 = view.findViewById(R.id.buttonBcaSem1PrevPapersCgma);
        button87.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) { listener59.onBCASem4PapersCgmaSelected();
            }
        });

        Button button3001 = view.findViewById(R.id.buttonBcaSem1QuestionBankCgma);
        button3001.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setAction(Intent.ACTION_VIEW);
                intent.addCategory(Intent.CATEGORY_BROWSABLE);
                intent.setData(Uri.parse("https://drive.google.com/open?id=1pQObjE2iylEVHzud7aK3ix8utHUjKiJf"));
                startActivity(intent);
            }
        });


        Button button3002 = view.findViewById(R.id.buttonBcaSem1ModelPapersCgma);
        button3002.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setAction(Intent.ACTION_VIEW);
                intent.addCategory(Intent.CATEGORY_BROWSABLE);
                intent.setData(Uri.parse("https://drive.google.com/open?id=1mZryN1U_AENZv_Kuu3n-G12HDqqWxtmu"));
                startActivity(intent);
            }
        });

        Button button3003 = view.findViewById(R.id.buttonBcaSem1PrevPapersLCgma);
        button3003.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setAction(Intent.ACTION_VIEW);
                intent.addCategory(Intent.CATEGORY_BROWSABLE);
                intent.setData(Uri.parse("https://drive.google.com/open?id=1Pl2IzsXmUqy0IZShcdHFXXjqcyRDiKv0"));
                startActivity(intent);
            }
        });












        return view;
    }

    //ignore this
    @Override
    public void onAttach(@NonNull Context context) {
        super.onAttach(context);
        if(context instanceof MainFragment.onFragmentBtnSelected) {
            listener59 = (MainFragment.onFragmentBtnSelected) context;
        } else  {
            throw new ClassCastException(context.toString() + "must implement listener");
        }
    }
}
