package com.himanshu.myimsguide.bca.semester5;

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

public class BCASemester5SubjectNm extends Fragment {

    private MainFragment.onFragmentBtnSelected listener61;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view= inflater.inflate(R.layout.fragment_bca_sem5_nm_option,container,false);


        Button button98 = view.findViewById(R.id.buttonBcaSem1PrevPapersNm);
        button98.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) { listener61.onBCASem5PaperNmSelected();
            }
        });


        Button button99 = view.findViewById(R.id.buttonBcaSem1NotesNm);
        button99.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                listener61.onBCASem5NotesNmtSelected();
                Toast.makeText(getContext(), "Coming Soon...", Toast.LENGTH_SHORT).show();
            }
        });

        Button button6665 = view.findViewById(R.id.buttonBcaSem1QuestionBanknm);
        button6665.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                Intent intent = new Intent();
//                intent.setAction(Intent.ACTION_VIEW);
//                intent.addCategory(Intent.CATEGORY_BROWSABLE);
//                intent.setData(Uri.parse("https://drive.google.com/open?id=1Osqe0y7q4PIh9NS7EZ38DqIAOdtUFzgW"));
//                startActivity(intent);
            }
        });
        Button button6666 = view.findViewById(R.id.buttonBcaSem1ModelPapersnm);
        button6666.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                Intent intent = new Intent();
//                intent.setAction(Intent.ACTION_VIEW);
//                intent.addCategory(Intent.CATEGORY_BROWSABLE);
//                intent.setData(Uri.parse("https://drive.google.com/open?id=1Osqe0y7q4PIh9NS7EZ38DqIAOdtUFzgW"));
//                startActivity(intent);
            }
        });





        return view;
    } //ignore this
    @Override
    public void onAttach(@NonNull Context context) {
        super.onAttach(context);
        if(context instanceof MainFragment.onFragmentBtnSelected) {
            listener61 = (MainFragment.onFragmentBtnSelected) context;
        } else  {
            throw new ClassCastException(context.toString() + "must implement listener");
        }
    }
}
