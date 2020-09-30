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

public class BCASemester6SubjectIadi extends Fragment {

    private MainFragment.onFragmentBtnSelected listener63;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view= inflater.inflate(R.layout.fragment_bca_sem6_is_option,container,false);

        Button button104 = view.findViewById(R.id.buttonBcaSem1NotesIs);
        button104.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                listener63.onBCASem6NotesIadiSelected();
            }
        });


        Button buttons10 = view.findViewById(R.id.buttonBcaSem1PrevPapersIs);
        buttons10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                listener63.onBCASem6PapersIadiSelected();
            }
        });
        Button buttons11 = view.findViewById(R.id.buttonBcaSem1QuestionBankIs);
        buttons11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setAction(Intent.ACTION_VIEW);
                intent.addCategory(Intent.CATEGORY_BROWSABLE);
                intent.setData(Uri.parse("https://drive.google.com/open?id=1FcOeY1QbaB6h_esiNuKSZZFOxPYO_9pA"));
                startActivity(intent);
            }
        });

        Button buttons12 = view.findViewById(R.id.buttonBcaSem1ModelPapersIs);
        buttons12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setAction(Intent.ACTION_VIEW);
                intent.addCategory(Intent.CATEGORY_BROWSABLE);
                intent.setData(Uri.parse("https://drive.google.com/open?id=1EXJ7Krn7CFWMwhZcl4J1hFJuGMMjxxb5"));
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
