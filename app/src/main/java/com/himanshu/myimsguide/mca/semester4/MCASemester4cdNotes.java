package com.himanshu.myimsguide.mca.semester4;

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

public class MCASemester4cdNotes extends Fragment {

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view= inflater.inflate(R.layout.fragment_mcasem4notes_cd,container,false);

        Button mcabutton615 = view.findViewById(R.id.buttonMcaSem4CdUnit1);
        Button mcabutton616 = view.findViewById(R.id.buttonMcaSem4CdUnit2);
        Button mcabutton617 = view.findViewById(R.id.buttonMcaSem4CdUnit3);
        Button mcabutton618 = view.findViewById(R.id.buttonMcaSem4CdUnit4);
        Button mcabutton619 = view.findViewById(R.id.buttonMcaSem4CdUnit5);

        mcabutton615.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setAction(Intent.ACTION_VIEW);
                intent.addCategory(Intent.CATEGORY_BROWSABLE);
                intent.setData(Uri.parse("https://drive.google.com/open?id=1HVQ6Iqq8HAxmueDEXQDyfR1PRHCj_9nr"));
                startActivity(intent);
            }
        });
        mcabutton616.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setAction(Intent.ACTION_VIEW);
                intent.addCategory(Intent.CATEGORY_BROWSABLE);
                intent.setData(Uri.parse("https://drive.google.com/open?id=1vyBqDfg__LHp605f_L_VSyqNBqohfuAL"));
                startActivity(intent);
            }
        });
        mcabutton617.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setAction(Intent.ACTION_VIEW);
                intent.addCategory(Intent.CATEGORY_BROWSABLE);
                intent.setData(Uri.parse("https://drive.google.com/open?id=15Op94PQPXRyAgYC9G1yPtYuXsHVEDSph"));
                startActivity(intent);
            }
        });
        mcabutton618.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setAction(Intent.ACTION_VIEW);
                intent.addCategory(Intent.CATEGORY_BROWSABLE);
                intent.setData(Uri.parse("https://drive.google.com/open?id=12PG7TSuH8kOKvSRI_q5Kf8kKoAJf32fo"));
                startActivity(intent);
            }
        });
        mcabutton619.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setAction(Intent.ACTION_VIEW);
                intent.addCategory(Intent.CATEGORY_BROWSABLE);
                intent.setData(Uri.parse("https://drive.google.com/open?id=1vHq1s55FrJGbzFsX43FcidK__pPeoURh"));
                startActivity(intent);
            }
        });









        return view;
    }
}
