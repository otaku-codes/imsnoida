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

public class BCASemester2SubjectDe extends Fragment {
    private MainFragment.onFragmentBtnSelected listener53;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view= inflater.inflate(R.layout.fragment_bca_sem2_deco_option,container,false);

        Button button69 = view.findViewById(R.id.buttonBcaSem1Notesdeco);
        button69.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) { listener53.onBCASem2NotesDeSelected();
            }
        });

        Button button64 = view.findViewById(R.id.buttonBcaSem2Prev);
        button64.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) { listener53.onBCASem2PapersDeSelected();
            }
        });


        Button button6664 = view.findViewById(R.id.buttonBcaSem1QuestionBankDeco);
        button6664.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setAction(Intent.ACTION_VIEW);
                intent.addCategory(Intent.CATEGORY_BROWSABLE);
                intent.setData(Uri.parse("https://drive.google.com/open?id=1Osqe0y7q4PIh9NS7EZ38DqIAOdtUFzgW"));
                startActivity(intent);
            }
        });

        Button button6665 = view.findViewById(R.id.buttonBcaSem1ModelPapersdeco);
        button6665.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setAction(Intent.ACTION_VIEW);
                intent.addCategory(Intent.CATEGORY_BROWSABLE);
                intent.setData(Uri.parse("https://drive.google.com/open?id=1s98CuWBOtMTEpD9kOH9PAbIhuKTu8IEI"));
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
