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

public class BcaSem6PapersEcom extends Fragment {

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_bcasem6papers_ecom,container,false);

        Button button434 = view.findViewById(R.id.buttonBcaSem6EcomUnit1Paper);
        Button button435 = view.findViewById(R.id.buttonBcaSem6EcomUnit2Paper);
        Button button436 = view.findViewById(R.id.buttonBcaSem6EcomUnit3Paper);
        Button button437 = view.findViewById(R.id.buttonBcaSem6EcomUnit4Paper);
        Button buttons438 = view.findViewById(R.id.buttonBcaSem6EcomUnit5Paper);



        button434.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setAction(Intent.ACTION_VIEW);
                intent.addCategory(Intent.CATEGORY_BROWSABLE);
                intent.setData(Uri.parse("https://drive.google.com/open?id=1iJh7LU3hZVtsNk93nA7DogRGcIE2kLV4"));
                startActivity(intent);
            }
        });
        button435.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setAction(Intent.ACTION_VIEW);
                intent.addCategory(Intent.CATEGORY_BROWSABLE);
                intent.setData(Uri.parse("https://drive.google.com/open?id=1-zak8ZpMC4DZeZ_DwWruCb9ZCaeQPVLq"));
                startActivity(intent);
            }
        });
        button436.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setAction(Intent.ACTION_VIEW);
                intent.addCategory(Intent.CATEGORY_BROWSABLE);
                intent.setData(Uri.parse("https://drive.google.com/open?id=1CHHUUivvI4Wa7lDaJste6Ew7ku17Y2cX"));
                startActivity(intent);
            }
        });
        button437.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setAction(Intent.ACTION_VIEW);
                intent.addCategory(Intent.CATEGORY_BROWSABLE);
                intent.setData(Uri.parse("https://drive.google.com/open?id=1p2hljI0aYbbFj0sFoRhjhzXa5gYoODs7"));
                startActivity(intent);
            }
        });

        buttons438.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setAction(Intent.ACTION_VIEW);
                intent.addCategory(Intent.CATEGORY_BROWSABLE);
                intent.setData(Uri.parse("https://drive.google.com/open?id=1qf_6GwF-uMiWwUm6IikMz_RVq8yzn4kU"));
                startActivity(intent);
            }
        });





        return view;
    }
}

