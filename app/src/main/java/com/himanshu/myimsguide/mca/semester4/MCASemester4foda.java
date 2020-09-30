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

public class MCASemester4foda extends Fragment {

    private MainFragment.onFragmentBtnSelected listener3;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view= inflater.inflate(R.layout.fragment_mca_sem4_foda_option,container,false);


        Button mcabutton100 = view.findViewById(R.id.buttonMcaSem1Notesfoda);
        mcabutton100.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                listener3.onMCASem4NotesfodaSelected();
            }
        });

        Button mcabutton101 = view.findViewById(R.id.buttonMcaSem1QuestionBankfoda);
        mcabutton101.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setAction(Intent.ACTION_VIEW);
                intent.addCategory(Intent.CATEGORY_BROWSABLE);
                intent.setData(Uri.parse("https://drive.google.com/open?id=1Y0jSG09ym1I1cOvy_aUQw8iOgavE6GkI"));
                startActivity(intent);
            }
        });

        Button mcabutton102 = view.findViewById(R.id.buttonMcaSem1ModelPapersfoda);
        mcabutton102.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setAction(Intent.ACTION_VIEW);
                intent.addCategory(Intent.CATEGORY_BROWSABLE);
                intent.setData(Uri.parse("https://drive.google.com/open?id=1HY1aBr4YtqE6WY2an8N1jAgL7bUw0_4L"));
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
