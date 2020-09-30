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

public class BCASemester4SubjectOs extends Fragment {

    private MainFragment.onFragmentBtnSelected listener58;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view= inflater.inflate(R.layout.fragment_bca_sem4_os_option,container,false);


        Button button90 = view.findViewById(R.id.buttonBcaSem1PrevPapersOs);
        button90.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) { listener58.onBCASem4PapersOsSelected();
            }
        });


        Button button85 = view.findViewById(R.id.buttonBcaSem1NotesOs);
        button85.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) { listener58.onBCASem4NotesOsSelected();
            }
        });

        Button button85006 = view.findViewById(R.id.buttonBcaSem1QuestionBankOs);
        button85006.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setAction(Intent.ACTION_VIEW);
                intent.addCategory(Intent.CATEGORY_BROWSABLE);
                intent.setData(Uri.parse("https://drive.google.com/open?id=1FirnmoJLi_bxOpeTTM2qWp9IxHpwiIyO"));
                startActivity(intent);
            }
        });

        Button button85007 = view.findViewById(R.id.buttonBcaSem1ModelPapersOs);
        button85007.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setAction(Intent.ACTION_VIEW);
                intent.addCategory(Intent.CATEGORY_BROWSABLE);
                intent.setData(Uri.parse("https://drive.google.com/open?id=13sDMKlz6whEhH896T_neCpFgqufAhbPD"));
                startActivity(intent);
            }
        });




        return view;
    } @Override
    public void onAttach(@NonNull Context context) {
        super.onAttach(context);
        if(context instanceof MainFragment.onFragmentBtnSelected) {
            listener58 = (MainFragment.onFragmentBtnSelected) context;
        } else  {
            throw new ClassCastException(context.toString() + "must implement listener");
        }
    }
}
