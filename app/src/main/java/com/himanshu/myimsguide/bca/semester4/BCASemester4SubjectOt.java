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

public class BCASemester4SubjectOt extends Fragment {


    private MainFragment.onFragmentBtnSelected listener59;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view= inflater.inflate(R.layout.fragment_bca_sem4_ot_option,container,false);




        Button button83 = view.findViewById(R.id.buttonBcaSem1NotesOt);
        button83.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) { listener59.onBCASem4NotesOtSelected();
            }
        });


        Button button88 = view.findViewById(R.id.buttonBcaSem1PrevPapersOt);
        button88.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) { listener59.onBCASem4PapersOtSelected();
            }
        });


        Button button3006 = view.findViewById(R.id.buttonBcaSem1QuestionBankOt);
        button3006.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setAction(Intent.ACTION_VIEW);
                intent.addCategory(Intent.CATEGORY_BROWSABLE);
                intent.setData(Uri.parse("https://drive.google.com/open?id=1kvV9w9q8yMcZlY_YndEusx8cCBgJ24nK"));
                startActivity(intent);
            }
        });

        Button button3007 = view.findViewById(R.id.buttonBcaSem1ModelPapersOt);
        button3007.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setAction(Intent.ACTION_VIEW);
                intent.addCategory(Intent.CATEGORY_BROWSABLE);
                intent.setData(Uri.parse("https://drive.google.com/open?id=1GeYjhDk9zI8DHmYxggWMxwntCPxhsg3f"));
                startActivity(intent);
            }
        });




        return view;
    }  @Override
    public void onAttach(@NonNull Context context) {
        super.onAttach(context);
        if(context instanceof MainFragment.onFragmentBtnSelected) {
            listener59 = (MainFragment.onFragmentBtnSelected) context;
        } else  {
            throw new ClassCastException(context.toString() + "must implement listener");
        }
    }
}
