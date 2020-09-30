package com.himanshu.myimsguide.bca.semester4;

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

public class BcaSem4PapersMaths3 extends Fragment {

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_bcasem4papers_maths3,container,false);

        Button button317 = view.findViewById(R.id.buttonBcaSem4Maths3Unit1Paper);
        Button button318 = view.findViewById(R.id.buttonBcaSem4Maths3Unit2Paper);
        Button button319 = view.findViewById(R.id.buttonBcaSem4Maths3Unit3Paper);
        Button button320 = view.findViewById(R.id.buttonBcaSem4Maths3Unit4Paper);
        Button button321 = view.findViewById(R.id.buttonBcaSem4Maths3Unit5Paper);

        button317.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setAction(Intent.ACTION_VIEW);
                intent.addCategory(Intent.CATEGORY_BROWSABLE);
                intent.setData(Uri.parse("https://drive.google.com/open?id=1fss9OB76VSIbVdY39-e3g9rbuYZ47WTd"));
                startActivity(intent);
            }
        });
        button318.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setAction(Intent.ACTION_VIEW);
                intent.addCategory(Intent.CATEGORY_BROWSABLE);
                intent.setData(Uri.parse("https://drive.google.com/open?id=12UQSjNC2BHU1ACknENjJu5rzdQxvZ6mW"));
                startActivity(intent);
            }
        });
        button319.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setAction(Intent.ACTION_VIEW);
                intent.addCategory(Intent.CATEGORY_BROWSABLE);
                intent.setData(Uri.parse("https://drive.google.com/open?id=1mtvT0rgzecjrhtm30bVZfLlit1ILRqRG"));
                startActivity(intent);
            }
        });
        button320.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setAction(Intent.ACTION_VIEW);
                intent.addCategory(Intent.CATEGORY_BROWSABLE);
                intent.setData(Uri.parse("https://drive.google.com/open?id=16VF2b0V5-yREEbgTTVntRpNpSK2vUBIm"));
                startActivity(intent);
            }
        });
        button321.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setAction(Intent.ACTION_VIEW);
                intent.addCategory(Intent.CATEGORY_BROWSABLE);
                intent.setData(Uri.parse("https://drive.google.com/open?id=12jNGCOm32MC3GxjnUBZwZYXQmeNgIdxE"));
                startActivity(intent);
            }
        });

        return view;
    }
}


