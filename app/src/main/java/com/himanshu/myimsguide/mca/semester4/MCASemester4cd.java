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

public class MCASemester4cd extends Fragment {

    private MainFragment.onFragmentBtnSelected listener3;


    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view= inflater.inflate(R.layout.fragment_mca_sem4_cd_option,container,false);



        Button mcabutton204 = view.findViewById(R.id.buttonMcaSem1NotesCd);
        mcabutton204.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                listener3.onMCASem4NotescdSelected();
            }
        });

        Button mcabutton205 = view.findViewById(R.id.buttonMcaSem1QuestionBankCd);
        mcabutton205.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setAction(Intent.ACTION_VIEW);
                intent.addCategory(Intent.CATEGORY_BROWSABLE);
                intent.setData(Uri.parse("https://drive.google.com/open?id=14mDz1yI7mFIiDJVlgrlXst8v_hUxHHFT"));
                startActivity(intent);
            }
        });

        Button mcabutton206 = view.findViewById(R.id.buttonMcaSem1ModelPaperscd);
        mcabutton206.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setAction(Intent.ACTION_VIEW);
                intent.addCategory(Intent.CATEGORY_BROWSABLE);
                intent.setData(Uri.parse("https://drive.google.com/open?id=1nY55PI5zFU-BU5gKY1VFkwikmzq2otFL"));
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
