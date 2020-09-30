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

public class BCASemester2SubjectC extends Fragment {

    private MainFragment.onFragmentBtnSelected listener53;


    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view= inflater.inflate(R.layout.fragment_bca_sem2_c_option,container,false);

        Button button67 = view.findViewById(R.id.buttonBcaSem1NotesC);
        button67.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) { listener53.onBCASem2NotesCSelected();
            }
        });

        Button button62 = view.findViewById(R.id.buttonBcaSem1PrevPapersC);

        button62.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) { listener53.onBCASem2PapersCSelected();
            }
        });


        Button button63 = view.findViewById(R.id.buttonBcaSem1QuestionBankC);

        button63.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setAction(Intent.ACTION_VIEW);
                intent.addCategory(Intent.CATEGORY_BROWSABLE);
                intent.setData(Uri.parse("https://drive.google.com/open?id=1UcxxQuF2e2WC7CmdZx3GmEBj3aJXUstX"));
                startActivity(intent);
            }
        });

        Button button993 = view.findViewById(R.id.buttonBcaSem1ModelPapersC);

        button993.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setAction(Intent.ACTION_VIEW);
                intent.addCategory(Intent.CATEGORY_BROWSABLE);
                intent.setData(Uri.parse("https://drive.google.com/open?id=1YCEoZhqbsWJnn1ixjeSyQ150YHbJAgYP"));
                startActivity(intent);
            }
        });

        Button button994 = view.findViewById(R.id.buttonBcaSem1PractC);
        button994.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setAction(Intent.ACTION_VIEW);
                intent.addCategory(Intent.CATEGORY_BROWSABLE);
                intent.setData(Uri.parse("https://drive.google.com/open?id=1wRWM1DE5EybqvnGvsk4j6kQOa-FDw_4M"));
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
