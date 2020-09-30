package com.himanshu.myimsguide.bca.semester1;

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
public class BcaSem1PapersBc extends Fragment {

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_bca_sem1_papers_bc,container,false);

        Button button151 = view.findViewById(R.id.buttonBcaSem1BcUnit1Paper);
        Button button152 = view.findViewById(R.id.buttonBcaSem1BcUnit2Paper);
        Button button153 = view.findViewById(R.id.buttonBcaSem1BcUnit3Paper);
        Button button154 = view.findViewById(R.id.buttonBcaSem1BcUnit4Paper);
        Button button155 = view.findViewById(R.id.buttonBcaSem1BcUnit5Paper);

        button151.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setAction(Intent.ACTION_VIEW);
                intent.addCategory(Intent.CATEGORY_BROWSABLE);
                intent.setData(Uri.parse("https://drive.google.com/file/d/1M-uLc2JvrAl6I4RlZTiMfhxC1favYOqp/view?usp=sharing"));
                startActivity(intent);
            }
        });
        button152.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setAction(Intent.ACTION_VIEW);
                intent.addCategory(Intent.CATEGORY_BROWSABLE);
                intent.setData(Uri.parse("https://drive.google.com/file/d/15yf5nGlltBmj2WtYCIJllsdr9oFhMYC_/view?usp=sharing"));
                startActivity(intent);
            }
        });
        button153.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setAction(Intent.ACTION_VIEW);
                intent.addCategory(Intent.CATEGORY_BROWSABLE);
                intent.setData(Uri.parse("https://drive.google.com/file/d/1Ga7ZXpyDPfe2IsHW6uDVulTqJxKUFlOm/view?usp=sharing"));
                startActivity(intent);
            }
        });
        button154.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setAction(Intent.ACTION_VIEW);
                intent.addCategory(Intent.CATEGORY_BROWSABLE);
                intent.setData(Uri.parse("https://drive.google.com/file/d/1rG4cw0lDnS1uV6UlXOScnyG2ZuyAuGdS/view?usp=sharing"));
                startActivity(intent);
            }
        });
        button155.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setAction(Intent.ACTION_VIEW);
                intent.addCategory(Intent.CATEGORY_BROWSABLE);
                intent.setData(Uri.parse("https://drive.google.com/file/d/17up8dNI-ZsUOOexR_5L2H7f-NmIBO5eF/view?usp=sharing"));
                startActivity(intent);
            }
        });



        return view;
    }
}


