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

public class BCASemester1SubjectPpa extends Fragment {

    private MainFragment.onFragmentBtnSelected listener51;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view= inflater.inflate(R.layout.fragment_bca_sem1_ppa_option,container,false);

        Button button57 = view.findViewById(R.id.buttonBcaSem1PrevPapersppa);


        button57.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) { listener51.onBCASem1PapersPpaSelected();
            }
        });


        Button button58 = view.findViewById(R.id.buttonBcaSem1NotesPpa);


        button58.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                listener51.onBCASem1NotesPpaSelected();
                Toast.makeText(getContext(), "Coming Soon...", Toast.LENGTH_SHORT).show();
            }
        });


        Button button6664 = view.findViewById(R.id.buttonBcaSem1QPapersppa2);
        button6664.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                Intent intent = new Intent();
//                intent.setAction(Intent.ACTION_VIEW);
//                intent.addCategory(Intent.CATEGORY_BROWSABLE);
//                intent.setData(Uri.parse("https://drive.google.com/open?id=1Osqe0y7q4PIh9NS7EZ38DqIAOdtUFzgW"));
//                startActivity(intent);
                Toast.makeText(getContext(), "Coming Soon...", Toast.LENGTH_SHORT).show();
            }
        });

        Button button6666 = view.findViewById(R.id.buttonBcaSem1ModelPapersppa);
        button6666.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                Intent intent = new Intent();
//                intent.setAction(Intent.ACTION_VIEW);
//                intent.addCategory(Intent.CATEGORY_BROWSABLE);
//                intent.setData(Uri.parse("https://drive.google.com/open?id=1s98CuWBOtMTEpD9kOH9PAbIhuKTu8IEI"));
//                startActivity(intent);
                Toast.makeText(getContext(), "Coming Soon...", Toast.LENGTH_SHORT).show();
            }
        });

        Button button6667 = view.findViewById(R.id.buttonBcaSem1Practppa);
        button6667.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                Intent intent = new Intent();
//                intent.setAction(Intent.ACTION_VIEW);
//                intent.addCategory(Intent.CATEGORY_BROWSABLE);
//                intent.setData(Uri.parse("https://drive.google.com/open?id=1s98CuWBOtMTEpD9kOH9PAbIhuKTu8IEI"));
//                startActivity(intent);
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
