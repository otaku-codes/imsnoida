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

public class BcaSem1PapersMaths1 extends Fragment {

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_bca_sem1_papers_maths1,container,false);


        Button button161 = view.findViewById(R.id.buttonBcaSem1Maths1Unit1Paper);
        Button button162 = view.findViewById(R.id.buttonBcaSem1Maths1Unit2Paper);
        Button button163 = view.findViewById(R.id.buttonBcaSem1Maths1Unit3Paper);
        Button button164 = view.findViewById(R.id.buttonBcaSem1Maths1Unit4Paper);
        Button button165 = view.findViewById(R.id.buttonBcaSem1Maths1Unit5Paper);

        button161.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setAction(Intent.ACTION_VIEW);
                intent.addCategory(Intent.CATEGORY_BROWSABLE);
                intent.setData(Uri.parse("https://drive.google.com/file/d/1iAUlrGqPnp8ibvX37zuwVSmvBqmiS9U2/view?usp=sharing"));
                startActivity(intent);
            }
        });
        button162.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setAction(Intent.ACTION_VIEW);
                intent.addCategory(Intent.CATEGORY_BROWSABLE);
                intent.setData(Uri.parse("https://drive.google.com/file/d/11-OIVBHdn87vr6jT4Gr4K7OAgOtlTClP/view?usp=sharing"));
                startActivity(intent);
            }
        });
        button163.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setAction(Intent.ACTION_VIEW);
                intent.addCategory(Intent.CATEGORY_BROWSABLE);
                intent.setData(Uri.parse("https://drive.google.com/file/d/1LANZ1dKBUn4EJXF_iLFaOj0EBoAvoDKu/view?usp=sharing"));
                startActivity(intent);
            }
        });
        button164.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setAction(Intent.ACTION_VIEW);
                intent.addCategory(Intent.CATEGORY_BROWSABLE);
                intent.setData(Uri.parse("https://drive.google.com/file/d/1vL9t1_EOcBMUfDjy9DN4sWzk-688jOpe/view?usp=sharing"));
                startActivity(intent);
            }
        });
        button165.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setAction(Intent.ACTION_VIEW);
                intent.addCategory(Intent.CATEGORY_BROWSABLE);
                intent.setData(Uri.parse("https://drive.google.com/file/d/1csCS1vLSrbN8_NxShyitYC6faUYR37Mw/view?usp=sharing"));
                startActivity(intent);
            }
        });

        return view;
    }
}


