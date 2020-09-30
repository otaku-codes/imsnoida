package com.himanshu.myimsguide.bca.semester1;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.himanshu.myimsguide.MainFragment;
import com.himanshu.myimsguide.R;

public class BCASemester1SubjectCfoa extends Fragment {

    private MainFragment.onFragmentBtnSelected listener51;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view= inflater.inflate(R.layout.fragment_bca_sem1_cfoa_option,container,false);

        Button button58 = view.findViewById(R.id.buttonBcaSem1PrevPaperscfoa);

        button58.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                listener51.onBCASem1PapersCfoaSelected();
            }
        });

        Button button59 = view.findViewById(R.id.buttonBcaSem1Notescfoa);

        button59.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //listener51.onBCASem1NotesCfoaSelected();
                Toast.makeText(getContext(), "Coming Soon...", Toast.LENGTH_SHORT).show();
            }
        });

        Button button6664 = view.findViewById(R.id.buttonBcaSem1QuestionBankCfoa);
        button6664.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
             /*   Intent intent = new Intent();
                intent.setAction(Intent.ACTION_VIEW);
                intent.addCategory(Intent.CATEGORY_BROWSABLE);
                intent.setData(Uri.parse("https://drive.google.com/open?id=1Osqe0y7q4PIh9NS7EZ38DqIAOdtUFzgW"));
                startActivity(intent);*/
                Toast.makeText(getContext(), "Coming Soon...", Toast.LENGTH_SHORT).show();
            }
        });

        Button button6665 = view.findViewById(R.id.buttonBcaSem1ModelPaperscfoa);
        button6665.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
           /*     Intent intent = new Intent();
                intent.setAction(Intent.ACTION_VIEW);
                intent.addCategory(Intent.CATEGORY_BROWSABLE);
                intent.setData(Uri.parse("https://drive.google.com/open?id=1s98CuWBOtMTEpD9kOH9PAbIhuKTu8IEI"));
                startActivity(intent);*/
                Toast.makeText(getContext(), "Coming Soon...", Toast.LENGTH_SHORT).show();
            }
        });

        Button button6666 = view.findViewById(R.id.buttonBcaSem1PrevPapersLcfoa);
        button6666.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
             /*   Intent intent = new Intent();
                intent.setAction(Intent.ACTION_VIEW);
                intent.addCategory(Intent.CATEGORY_BROWSABLE);
                intent.setData(Uri.parse("https://drive.google.com/open?id=1s98CuWBOtMTEpD9kOH9PAbIhuKTu8IEI"));
                startActivity(intent);*/
                Toast.makeText(getContext(), "Coming Soon...", Toast.LENGTH_SHORT).show();
            }
        });


        return view;
    }

    @Override
    public void onAttach(@NonNull Context context) {
        super.onAttach(context);
        if(context instanceof MainFragment.onFragmentBtnSelected) {
            listener51 = (MainFragment.onFragmentBtnSelected) context;
        } else  {
            throw new ClassCastException(context.toString() + "must implement listener");
        }
    }
}
