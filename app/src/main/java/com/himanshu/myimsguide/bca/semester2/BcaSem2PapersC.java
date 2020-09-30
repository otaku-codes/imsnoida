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

public class BcaSem2PapersC extends Fragment {

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_bcasem2papers_c,container,false);

        Button button216 = view.findViewById(R.id.buttonBcaSem2CUnit1Paper);
        Button button217 = view.findViewById(R.id.buttonBcaSem2CUnit2Paper);
        Button button218 = view.findViewById(R.id.buttonBcaSem2CUnit3Paper);
        Button button219 = view.findViewById(R.id.buttonBcaSem2CUnit4Paper);


        button216.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setAction(Intent.ACTION_VIEW);
                intent.addCategory(Intent.CATEGORY_BROWSABLE);
                intent.setData(Uri.parse("https://drive.google.com/open?id=1sRfr32j3tDU7LmNZjhfsujp0DA40X9Wu"));
                startActivity(intent);
            }
        });
        button217.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setAction(Intent.ACTION_VIEW);
                intent.addCategory(Intent.CATEGORY_BROWSABLE);
                intent.setData(Uri.parse("https://drive.google.com/open?id=1N5i0CgBwhiU-wZxiKpxkyDQ45q50013C"));
                startActivity(intent);
            }
        });
        button218.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setAction(Intent.ACTION_VIEW);
                intent.addCategory(Intent.CATEGORY_BROWSABLE);
                intent.setData(Uri.parse("https://drive.google.com/open?id=1mDvxDpLoCFifPd36ohJOFBmZdyFM7rmo"));
                startActivity(intent);
            }
        });
        button219.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setAction(Intent.ACTION_VIEW);
                intent.addCategory(Intent.CATEGORY_BROWSABLE);
                intent.setData(Uri.parse("https://drive.google.com/open?id=1rVpgS-yLBEe58mG-shWQxa6U1KxcTJGd"));
                startActivity(intent);
            }
        });


        Button button2220 = view.findViewById(R.id.buttonBcaSem2CUnit6Paper);

        button2220.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setAction(Intent.ACTION_VIEW);
                intent.addCategory(Intent.CATEGORY_BROWSABLE);
                intent.setData(Uri.parse("https://drive.google.com/open?id=1QYvs2ahaP209cm40W5zaphRztx7_gFGz"));
                startActivity(intent);
            }
        });




        return view;
    }
}


