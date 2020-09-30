package com.himanshu.myimsguide.mca.semester4;

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

public class MCASemester4dbms extends Fragment {

    private MainFragment.onFragmentBtnSelected listener3;


    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view= inflater.inflate(R.layout.fragment_mca_sem4_dbms_option,container,false);



        Button mcabutton100 = view.findViewById(R.id.buttonMcaSem1Notesdbms);
        mcabutton100.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                listener3.onMCASem4NotesdbmsSelected();
            }
        });

        Button mcabutton101 = view.findViewById(R.id.buttonMcaSem1QuestionBankdbms);
        mcabutton101.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setAction(Intent.ACTION_VIEW);
                intent.addCategory(Intent.CATEGORY_BROWSABLE);
                intent.setData(Uri.parse("https://drive.google.com/open?id=1XB4bCVsge_uDmUjXsNDyFbcp-uVhubm_"));
                startActivity(intent);
            }
        });

        Button mcabutton102 = view.findViewById(R.id.buttonMcaSem1ModelPapersdbms);
        mcabutton102.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setAction(Intent.ACTION_VIEW);
                intent.addCategory(Intent.CATEGORY_BROWSABLE);
                intent.setData(Uri.parse("https://drive.google.com/open?id=1qnkFpjJpTvPsxZqWJhCm-2D1MOYFvDno"));
                startActivity(intent);
            }
        });


        Button mcabutton103 = view.findViewById(R.id.buttonMcaSem1PrevPapersdbms);
        mcabutton103.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setAction(Intent.ACTION_VIEW);
                intent.addCategory(Intent.CATEGORY_BROWSABLE);
                intent.setData(Uri.parse("https://drive.google.com/open?id=12eQZh7dFHSNyQm3Vpq9i-fUASHehLIe5"));
                startActivity(intent);
            }
        });



        return view;
    } @Override
    public void onAttach(@NonNull Context context) {
        super.onAttach(context);
        if(context instanceof MainFragment.onFragmentBtnSelected) {
            listener3 = (MainFragment.onFragmentBtnSelected) context;
        } else  {
            throw new ClassCastException(context.toString() + "must implement listener");
        }
    }

}
