package com.himanshu.myimsguide.bca.semester2;

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

public class BcaSem2PapersFam extends Fragment {

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_bcasem2papers_fam,container,false);

        Button button251 = view.findViewById(R.id.buttonBcaSem2FamUnit1Paper);
        Button button252 = view.findViewById(R.id.buttonBcaSem2FamUnit2Paper);
        Button button253 = view.findViewById(R.id.buttonBcaSem2FamUnit3Paper);
        Button button254 = view.findViewById(R.id.buttonBcaSem2FamUnit5Paper);

        button251.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setAction(Intent.ACTION_VIEW);
                intent.addCategory(Intent.CATEGORY_BROWSABLE);
                intent.setData(Uri.parse("https://drive.google.com/open?id=1lgIakrB4kwQ7fVRD51fv0mop3IPJ-lqn"));
                startActivity(intent);
            }
        });
        button252.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setAction(Intent.ACTION_VIEW);
                intent.addCategory(Intent.CATEGORY_BROWSABLE);
                intent.setData(Uri.parse("https://drive.google.com/open?id=1RIdINH2Y2oyG50W4GeaWQyJrBHr95_dC"));
                startActivity(intent);
            }
        });
        button253.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setAction(Intent.ACTION_VIEW);
                intent.addCategory(Intent.CATEGORY_BROWSABLE);
                intent.setData(Uri.parse("https://drive.google.com/open?id=1p8esyFxrkqU40GNz4es4nIyvhT1ujsgd"));
                startActivity(intent);
            }
        });
        button254.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setAction(Intent.ACTION_VIEW);
                intent.addCategory(Intent.CATEGORY_BROWSABLE);
                intent.setData(Uri.parse("https://drive.google.com/open?id=1yGZ4hOPTYV38iD1a8O-NF7A71FpYfUII"));
                startActivity(intent);
            }
        });



        return view;
    }
}


