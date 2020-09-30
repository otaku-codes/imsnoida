package com.himanshu.myimsguide.bca.semester5;

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

public class BcaSem5PapersCn extends Fragment {
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_bcasem5papers_cn,container,false);


        Button button400 = view.findViewById(R.id.buttonBcaSem5CnUnit1Paper);
        Button button401 = view.findViewById(R.id.buttonBcaSem5CnUnit2Paper);
        Button button402 = view.findViewById(R.id.buttonBcaSem5CnUnit3Paper);
        Button button403 = view.findViewById(R.id.buttonBcaSem5CnUnit4Paper);
        Button button404 = view.findViewById(R.id.buttonBcaSem5CnUnit5Paper);

        button400.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setAction(Intent.ACTION_VIEW);
                intent.addCategory(Intent.CATEGORY_BROWSABLE);
                intent.setData(Uri.parse("https://drive.google.com/file/d/102n4RYbKVRaS9VnJKD3g7agesHkb9u12/view?usp=sharing"));
                startActivity(intent);
            }
        });
        button401.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setAction(Intent.ACTION_VIEW);
                intent.addCategory(Intent.CATEGORY_BROWSABLE);
                intent.setData(Uri.parse("https://drive.google.com/file/d/1WehaFEM-an0WOzMCGYD0LMxe7nDADJAe/view?usp=sharing"));
                startActivity(intent);
            }
        });
        button402.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setAction(Intent.ACTION_VIEW);
                intent.addCategory(Intent.CATEGORY_BROWSABLE);
                intent.setData(Uri.parse("https://drive.google.com/file/d/1kV8w-8FfJiPv5Y6cw2HYB1TnbkA9SDxi/view?usp=sharing"));
                startActivity(intent);
            }
        });
        button403.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setAction(Intent.ACTION_VIEW);
                intent.addCategory(Intent.CATEGORY_BROWSABLE);
                intent.setData(Uri.parse("https://drive.google.com/file/d/1Al8EG6udU-5b-o5EVXsb8ET7IFpe13LN/view?usp=sharing"));
                startActivity(intent);
            }
        });
        button404.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setAction(Intent.ACTION_VIEW);
                intent.addCategory(Intent.CATEGORY_BROWSABLE);
                intent.setData(Uri.parse("https://drive.google.com/file/d/1ud5VXiH3BTzO171kqMaFC3LQy9cTGVZo/view?usp=sharing"));
                startActivity(intent);
            }
        });









        return view;
    }
}


