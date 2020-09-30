package com.himanshu.myimsguide.mca;

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

public class McaFragment extends Fragment {



    private MainFragment.onFragmentBtnSelected listener3;


    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_mca,container,false);



        Button mcabutton21 = view.findViewById(R.id.buttonMcaSem4);
        mcabutton21.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                listener3.onMCASem4Selected();
            }
        });

        Button mcabutton212 = view.findViewById(R.id.buttonMcaSem1);
        mcabutton212.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast.makeText(getContext(), "Coming Soon...", Toast.LENGTH_SHORT).show();
            }
        });

        Button mcabutton213 = view.findViewById(R.id.buttonMcaSem2);
        mcabutton213.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getContext(), "Coming Soon...", Toast.LENGTH_SHORT).show();
            }
        });

        Button mcabutton214 = view.findViewById(R.id.buttonMcaSem3);
        mcabutton214.setOnClickListener(new View.OnClickListener()  {
            @Override
            public void onClick(View v) {
                listener3.onMCASem3Selected();
                Toast.makeText(getContext(), "Coming Soon...", Toast.LENGTH_SHORT).show();
            }
        });

        Button mcabutton215 = view.findViewById(R.id.buttonMcaSem6);
        mcabutton215.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getContext(), "Coming Soon...", Toast.LENGTH_SHORT).show();
            }
        });

        Button mcabutton216 = view.findViewById(R.id.buttonMcaSem5);
        mcabutton216.setOnClickListener(new View.OnClickListener() {

                @Override
                public void onClick(View v) {
                    listener3.onMCASem5Selected();
                    Toast.makeText(getContext(), "Coming Soon...", Toast.LENGTH_SHORT).show();
                }
            });

        Button mcabutton75011 = view.findViewById(R.id.buttonMcaSyllabus);
        mcabutton75011.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setAction(Intent.ACTION_VIEW);
                intent.addCategory(Intent.CATEGORY_BROWSABLE);
                intent.setData(Uri.parse("https://drive.google.com/open?id=1U0dpqD0aP44xquiSrcuRGFipgVk7x3vx"));

                startActivity(intent);
            }
        });

        return view;
    } @Override
    public void onAttach(@NonNull Context context) {
        super.onAttach(context);
        if(context instanceof MainFragment.onFragmentBtnSelected) {
            listener3 = (MainFragment.onFragmentBtnSelected) context;
        } else  {
            throw new ClassCastException(context.toString() + "must implement listener");
        }
    }

}
