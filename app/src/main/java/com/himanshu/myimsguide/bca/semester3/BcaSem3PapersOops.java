package com.himanshu.myimsguide.bca.semester3;

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

import com.himanshu.myimsguide.R;
public class BcaSem3PapersOops extends Fragment {

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_bcasem3papers_oops,container,false);

        Button button362 = view.findViewById(R.id.buttonBcaSem3OopsUnit1Paper);
        Button button363 = view.findViewById(R.id.buttonBcaSem3OopsUnit2Paper);
        Button button364 = view.findViewById(R.id.buttonBcaSem3OopsUnit3Paper);
        Button button365 = view.findViewById(R.id.buttonBcaSem3OopsUnit4Paper);
        Button button366 = view.findViewById(R.id.buttonBcaSem3OopsUnit5Paper);

        button362.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setAction(Intent.ACTION_VIEW);
                intent.addCategory(Intent.CATEGORY_BROWSABLE);
                intent.setData(Uri.parse("https://drive.google.com/file/d/1ZZ9ZYkaP7Ei5Rgl72a-n7K6Jc_0dJV5Q/view?usp=sharing"));
                startActivity(intent);
            }
        });
        button363.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setAction(Intent.ACTION_VIEW);
                intent.addCategory(Intent.CATEGORY_BROWSABLE);
                intent.setData(Uri.parse("https://drive.google.com/file/d/1nAdK6CRtmP-vd8yG5Lz8ubLf7lw6Cpn6/view?usp=sharing"));
                startActivity(intent);
            }
        });
        button364.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setAction(Intent.ACTION_VIEW);
                intent.addCategory(Intent.CATEGORY_BROWSABLE);
                intent.setData(Uri.parse("https://drive.google.com/file/d/1gvaHxJMdjzyRiG2ZjJX8j0RZ1olb_fG_/view?usp=sharing"));
                startActivity(intent);
            }
        });
        button365.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setAction(Intent.ACTION_VIEW);
                intent.addCategory(Intent.CATEGORY_BROWSABLE);
                intent.setData(Uri.parse("https://drive.google.com/file/d/12GfuMRuPr5mL_rV57bArOuwXt3gGyOtV/view?usp=sharing"));
                startActivity(intent);
            }
        });
        button366.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setAction(Intent.ACTION_VIEW);
                intent.addCategory(Intent.CATEGORY_BROWSABLE);
                intent.setData(Uri.parse("https://drive.google.com/file/d/19KSO4T_jOfXgHINS60H2YtJ0dtdPOLIC/view?usp=sharing"));
                startActivity(intent);
            }
        });


        return view;
    }
}


