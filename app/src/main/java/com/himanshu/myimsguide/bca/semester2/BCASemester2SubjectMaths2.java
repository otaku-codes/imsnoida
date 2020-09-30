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

public class BCASemester2SubjectMaths2 extends Fragment {

    private MainFragment.onFragmentBtnSelected listener51;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view= inflater.inflate(R.layout.fragment_bca_sem2_maths2_option,container,false);

        Button button66 = view.findViewById(R.id.buttonBcaSem1NotesMaths2);
        button66.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) { listener51.onBCASem2NotesMaths2Selected();
            }
        });

        Button button61 = view.findViewById(R.id.buttonBcaSem1PrevPapersMaths2);
        button61.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) { listener51.onBCASem2PapersMaths2Selected();
            }
        });



        Button button9994 = view.findViewById(R.id.buttonBcaSem2QBMaths);
        button9994.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setAction(Intent.ACTION_VIEW);
                intent.addCategory(Intent.CATEGORY_BROWSABLE);
                intent.setData(Uri.parse("https://drive.google.com/open?id=1d5o0b8YCHxmqvjqeg8HLoBduFmSwj7zO"));
                startActivity(intent);
            }
        });

        Button button999 = view.findViewById(R.id.buttonBcaSem1MPMaths2);
        button999.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setAction(Intent.ACTION_VIEW);
                intent.addCategory(Intent.CATEGORY_BROWSABLE);
                intent.setData(Uri.parse("https://drive.google.com/open?id=1_mUej03Cv9hFmIOJwfJqids-i9ezg3rN"));
                startActivity(intent);
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
