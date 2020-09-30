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

public class BcaSem3PapersFam extends Fragment {

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_bcasem3papers_fam,container,false);

        Button button357 = view.findViewById(R.id.buttonBcaSem3FamUnit1Paper);
        Button button358 = view.findViewById(R.id.buttonBcaSem3FamUnit2Paper);
        Button button359 = view.findViewById(R.id.buttonBcaSem3FamUnit3Paper);
        Button button360 = view.findViewById(R.id.buttonBcaSem3FamUnit4Paper);
        Button button361 = view.findViewById(R.id.buttonBcaSem3FamUnit5Paper);

        button357.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setAction(Intent.ACTION_VIEW);
                intent.addCategory(Intent.CATEGORY_BROWSABLE);
                intent.setData(Uri.parse("https://drive.google.com/file/d/1JaFWI31y82KnUeGjAv2Vp_88jPa9kdGR/view?usp=sharing"));
                startActivity(intent);
            }
        });
        button358.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setAction(Intent.ACTION_VIEW);
                intent.addCategory(Intent.CATEGORY_BROWSABLE);
                intent.setData(Uri.parse("https://drive.google.com/file/d/1nG0MtuaF5oC1Hmbt24KVAEespW-s-MLa/view?usp=sharing"));
                startActivity(intent);
            }
        });
        button359.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setAction(Intent.ACTION_VIEW);
                intent.addCategory(Intent.CATEGORY_BROWSABLE);
                intent.setData(Uri.parse("https://drive.google.com/file/d/1WW4GTqpd1Bki3ZsCd9rfSM1E1joizIGN/view?usp=sharing"));
                startActivity(intent);
            }
        });
        button360.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setAction(Intent.ACTION_VIEW);
                intent.addCategory(Intent.CATEGORY_BROWSABLE);
                intent.setData(Uri.parse("https://drive.google.com/file/d/1NVLkUQYM3OmQlqrCMh_8QSMQJdLnpqG-/view?usp=sharing"));
                startActivity(intent);
            }
        });
        button361.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setAction(Intent.ACTION_VIEW);
                intent.addCategory(Intent.CATEGORY_BROWSABLE);
                intent.setData(Uri.parse("https://drive.google.com/file/d/1gQg0-NxiIxZpiRtFpZrU_iIZr_rpfbAU/view?usp=sharing"));
                startActivity(intent);
            }
        });


        return view;
    }
}



