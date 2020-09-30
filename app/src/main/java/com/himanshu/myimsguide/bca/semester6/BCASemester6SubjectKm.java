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


public class BCASemester6SubjectKm extends Fragment {

    private MainFragment.onFragmentBtnSelected listener63;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view= inflater.inflate(R.layout.fragment_bca_sem6_km_option,container,false);


        Button button106 = view.findViewById(R.id.buttonBcaSem1Noteskm);
        button106.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                listener63.onBCASem6NotesKmSelected();
            }
        });

        Button buttons7 = view.findViewById(R.id.buttonBcaSem1PrevPaperskm);
        buttons7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                listener63.onBCASem6PapersEcomSelected();
            }
        });
        Button buttons8 = view.findViewById(R.id.buttonBcaSem1QuestionBankkm);
        buttons8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setAction(Intent.ACTION_VIEW);
                intent.addCategory(Intent.CATEGORY_BROWSABLE);
                intent.setData(Uri.parse("https://drive.google.com/open?id=1Z4yG4sotELuNJBSm-BR5HxEP-vnK4zHo"));
                startActivity(intent);
            }
        });

        Button buttons9 = view.findViewById(R.id.buttonBcaSem1ModelPaperskm);
        buttons9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setAction(Intent.ACTION_VIEW);
                intent.addCategory(Intent.CATEGORY_BROWSABLE);
                intent.setData(Uri.parse("https://drive.google.com/open?id=1V7-5F9YAi6mASVI25eqVZq85vCZU6GYR"));
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
