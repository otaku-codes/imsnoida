package com.himanshu.myimsguide.bca;

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


public class BcaFragment extends Fragment {


    private MainFragment.onFragmentBtnSelected listener3;


    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_bca,container,false);





        //all semesters button view
        Button button24 = view.findViewById(R.id.buttonBcaSyllabus);
        Button button18 = view.findViewById(R.id.buttonBcaSem1);
        Button button19 = view.findViewById(R.id.buttonBcaSem2);
        Button button20 = view.findViewById(R.id.buttonBcaSem3);
        Button button21 = view.findViewById(R.id.buttonBcaSem4);
        Button button22 = view.findViewById(R.id.buttonBcaSem5);
        Button button23 = view.findViewById(R.id.buttonBcaSem6);

        //all semesters onclick listener here
        button18.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                listener3.onBCASem1Selected();

            }
        });
        button19.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                listener3.onBCASem2Selected();
            }
        });
        button20.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                listener3.onBCASem3Selected();
            }
        });
        button21.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                listener3.onBCASem4Selected();
            }
        });
        button22.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                listener3.onBCASem5Selected();
            }
        });
        button23.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                listener3.onBCASem6Selected();
            }
        });
        button24.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setAction(Intent.ACTION_VIEW);
                intent.addCategory(Intent.CATEGORY_BROWSABLE);
                intent.setData(Uri.parse("https://drive.google.com/open?id=1SxQ_HduGujOi6hJJAgjWz4E8LO0zS2Ea"));

                startActivity(intent);
            }
        });

        return view;
    }


    //ignore this not fully
    @Override
    public void onAttach(@NonNull Context context) {
        super.onAttach(context);
        if(context instanceof MainFragment.onFragmentBtnSelected) {
            listener3 = (MainFragment.onFragmentBtnSelected) context;
        } else  {
            throw new ClassCastException(context.toString() + "must implement listener");
        }
    }

}
