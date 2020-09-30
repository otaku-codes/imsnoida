package com.himanshu.myimsguide.bca.semester6;

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

public class BcaSem6PapersCns extends Fragment {

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_bcasem6papers_cns,container,false);

        Button button430 = view.findViewById(R.id.buttonBcaSem6CnsUnit1Paper);
        Button button431 = view.findViewById(R.id.buttonBcaSem6CnsUnit2Paper);
        Button button432 = view.findViewById(R.id.buttonBcaSem6CnsUnit3Paper);
        Button button433 = view.findViewById(R.id.buttonBcaSem6CnsUnit4Paper);
        Button buttons433 = view.findViewById(R.id.buttonBcaSem6CnsUnit5Paper);




        button430.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setAction(Intent.ACTION_VIEW);
                intent.addCategory(Intent.CATEGORY_BROWSABLE);
                intent.setData(Uri.parse("https://drive.google.com/open?id=1Dc6PlS8rd3cgZg8aLz47-bb32BqN7Ifm"));
                startActivity(intent);
            }
        });
        button431.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setAction(Intent.ACTION_VIEW);
                intent.addCategory(Intent.CATEGORY_BROWSABLE);
                intent.setData(Uri.parse("https://drive.google.com/open?id=1KcOdLkApN0HKYsllEJzslwOZLG13B7Y7"));
                startActivity(intent);
            }
        });
        button432.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setAction(Intent.ACTION_VIEW);
                intent.addCategory(Intent.CATEGORY_BROWSABLE);
                intent.setData(Uri.parse("https://drive.google.com/open?id=1gnpU55qELAXmt36cDOduQkzJsE-I6eTZ"));
                startActivity(intent);
            }
        });
        button433.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setAction(Intent.ACTION_VIEW);
                intent.addCategory(Intent.CATEGORY_BROWSABLE);
                intent.setData(Uri.parse("https://drive.google.com/open?id=1UjN6FKV_qTkOsnSTbKYP9dVn-16rp_1f"));
                startActivity(intent);
            }
        });

        buttons433.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setAction(Intent.ACTION_VIEW);
                intent.addCategory(Intent.CATEGORY_BROWSABLE);
                intent.setData(Uri.parse("https://drive.google.com/open?id=1uRTNfwivM0-sSOj6cMHSGBvBIUjGoL7x"));
                startActivity(intent);
            }
        });




        return view;
    }
}

