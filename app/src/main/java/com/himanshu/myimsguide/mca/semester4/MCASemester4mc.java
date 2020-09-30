package com.himanshu.myimsguide.mca.semester4;

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

public class MCASemester4mc extends Fragment {

    private MainFragment.onFragmentBtnSelected listener3;



    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view= inflater.inflate(R.layout.fragment_mca_sem4_mc_option,container,false);


        Button mcabutton300 = view.findViewById(R.id.buttonMcaSem1Notesrmc);
        mcabutton300.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                listener3.onMCASem4NotesmcSelected();
            }
        });

        Button mcabutton301 = view.findViewById(R.id.buttonMcaSem1QuestionBankrmc);
        mcabutton301.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setAction(Intent.ACTION_VIEW);
                intent.addCategory(Intent.CATEGORY_BROWSABLE);
                intent.setData(Uri.parse("https://drive.google.com/open?id=1pTNTx_XDrT2ABnJarTy7Z_XPGq-4FNGd"));
                startActivity(intent);
            }
        });

        Button mcabutton302 = view.findViewById(R.id.buttonMcaSem1ModelPapersrmc);
        mcabutton302.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setAction(Intent.ACTION_VIEW);
                intent.addCategory(Intent.CATEGORY_BROWSABLE);
                intent.setData(Uri.parse("https://drive.google.com/open?id=1VJgecF9baOtUWnJYib3tlZ-kWRbdV0oT"));
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
