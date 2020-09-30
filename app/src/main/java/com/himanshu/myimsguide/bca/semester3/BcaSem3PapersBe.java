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

public class BcaSem3PapersBe extends Fragment {

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_bcasem3papers_be,container,false);


        Button button342 = view.findViewById(R.id.buttonBcaSem3BeUnit1Paper);
        Button button343 = view.findViewById(R.id.buttonBcaSem3BeUnit2Paper);
        Button button344 = view.findViewById(R.id.buttonBcaSem3BeUnit3Paper);
        Button button345 = view.findViewById(R.id.buttonBcaSem3BeUnit4Paper);
        Button button346 = view.findViewById(R.id.buttonBcaSem3BeUnit5Paper);

        button342.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setAction(Intent.ACTION_VIEW);
                intent.addCategory(Intent.CATEGORY_BROWSABLE);
                intent.setData(Uri.parse("https://drive.google.com/file/d/1eHDH1YdreZXOjKNVeA1nEMdDO2_pGiDv/view?usp=sharing"));
                startActivity(intent);
            }
        });
        button343.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setAction(Intent.ACTION_VIEW);
                intent.addCategory(Intent.CATEGORY_BROWSABLE);
                intent.setData(Uri.parse("https://drive.google.com/file/d/1-qnYWeP0QZQ38VWmr2xLplhHDV4rxSpG/view?usp=sharing"));
                startActivity(intent);
            }
        });
        button344.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setAction(Intent.ACTION_VIEW);
                intent.addCategory(Intent.CATEGORY_BROWSABLE);
                intent.setData(Uri.parse("https://drive.google.com/file/d/18SM0wu_aQVIcV1O5nLHC7O_5RLyf5ELl/view?usp=sharing"));
                startActivity(intent);
            }
        });
        button345.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setAction(Intent.ACTION_VIEW);
                intent.addCategory(Intent.CATEGORY_BROWSABLE);
                intent.setData(Uri.parse("https://drive.google.com/file/d/16tIQ4t_x2GdnLk3HWeIvK7P4Mfj3pczW/view?usp=sharing"));
                startActivity(intent);
            }
        });
        button346.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setAction(Intent.ACTION_VIEW);
                intent.addCategory(Intent.CATEGORY_BROWSABLE);
                intent.setData(Uri.parse("https://drive.google.com/file/d/10yZjvy8rGHH084YOBu9KoTbGX50LyNwF/view?usp=sharing"));
                startActivity(intent);
            }
        });


        return view;
    }
}


