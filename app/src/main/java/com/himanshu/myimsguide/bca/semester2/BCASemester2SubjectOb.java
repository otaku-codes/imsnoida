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

public class BCASemester2SubjectOb extends Fragment {

    private MainFragment.onFragmentBtnSelected listener53;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view= inflater.inflate(R.layout.fragment_bca_sem2_ob_option,container,false);


        Button button68 = view.findViewById(R.id.buttonBcaSem1Notesob);
        button68.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) { listener53.onBCASem2NotesObSelected();
            }
        });

        Button button63 = view.findViewById(R.id.buttonBcaSem1PrevPapersob);
        button63.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) { listener53.onBCASem2PapersObSelected();
            }
        });


        Button button4444 = view.findViewById(R.id.buttonBcaSem1QuestionBankOb);
        button4444.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setAction(Intent.ACTION_VIEW);
                intent.addCategory(Intent.CATEGORY_BROWSABLE);
                intent.setData(Uri.parse("https://drive.google.com/open?id=1UD14j2QRGQcUMVvNAbRDXe0VRResTL_P"));
                startActivity(intent);
            }
        });


        Button button4445 = view.findViewById(R.id.buttonBcaSem1ModelPapersOb );
        button4445.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setAction(Intent.ACTION_VIEW);
                intent.addCategory(Intent.CATEGORY_BROWSABLE);
                intent.setData(Uri.parse("https://drive.google.com/open?id=1SC86qbKXSFtYbHPYuC6seS0GZcSGFScY"));
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
