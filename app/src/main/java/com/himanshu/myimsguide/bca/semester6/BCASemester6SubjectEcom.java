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

public class BCASemester6SubjectEcom extends Fragment {

    private MainFragment.onFragmentBtnSelected listener63;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view= inflater.inflate(R.layout.fragment_bca_sem6_ecom_option,container,false);



        Button button105 = view.findViewById(R.id.buttonBcaSem1NotesEcom);
        button105.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                listener63.onBCASem6NotesEcomSelected();
            }
        });


        Button buttons4 = view.findViewById(R.id.buttonBcaSem1PrevPapersEcom);
        buttons4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                listener63.onBCASem6PapersEcomSelected();
            }
        });



        Button buttons5 = view.findViewById(R.id.buttonBcaSem1QuestionBankEcom);
        buttons5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setAction(Intent.ACTION_VIEW);
                intent.addCategory(Intent.CATEGORY_BROWSABLE);
                intent.setData(Uri.parse("https://drive.google.com/open?id=1LE3QX5sUZ5Lv-MZiEBJMu5He8f8cGWl6"));
                startActivity(intent);
            }
        });



        Button buttons6 = view.findViewById(R.id.buttonBcaSem1ModelPapersEcom);
        buttons6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setAction(Intent.ACTION_VIEW);
                intent.addCategory(Intent.CATEGORY_BROWSABLE);
                intent.setData(Uri.parse("https://drive.google.com/open?id=1swZ8sgwnndi0c-Ips40Vl0Cr3DNrBLQX"));
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
