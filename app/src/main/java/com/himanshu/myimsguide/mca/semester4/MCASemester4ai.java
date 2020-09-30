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

public class MCASemester4ai extends Fragment {

    private MainFragment.onFragmentBtnSelected listener3;


    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view= inflater.inflate(R.layout.fragment_mca_sem4_ai_option,container,false);

        Button mcabutton300 = view.findViewById(R.id.buttonMcaSem4NotesAi);
        mcabutton300.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                listener3.onMCASem4NotesaiSelected();
            }
        });

        Button mcabutton301 = view.findViewById(R.id.buttonMcaSem4QuestionBankAi);
        mcabutton301.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setAction(Intent.ACTION_VIEW);
                intent.addCategory(Intent.CATEGORY_BROWSABLE);
                intent.setData(Uri.parse("https://drive.google.com/open?id=10sB7SuUYVmaN6aH_wXHmG8ptkhVd_L1F"));
                startActivity(intent);
            }
        });

        Button mcabutton302 = view.findViewById(R.id.buttonMcaSem4ModelPapersAi);
        mcabutton302.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setAction(Intent.ACTION_VIEW);
                intent.addCategory(Intent.CATEGORY_BROWSABLE);
                intent.setData(Uri.parse("https://drive.google.com/open?id=1P3FJ4700eZGBg7w7XkZcgp9dGzBTEAOC"));
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
