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

public class BcaSem4PapersCgma extends Fragment {

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_bcasem4papers_cgma,container,false);

        Button button306 = view.findViewById(R.id.buttonBcaSem4CgmaUnit1Paper);
        Button button307 = view.findViewById(R.id.buttonBcaSem4CgmaUnit2Paper);
        Button button308 = view.findViewById(R.id.buttonBcaSem4CgmaUnit3Paper);
        Button button309 = view.findViewById(R.id.buttonBcaSem4CgmaUnit4Paper);
        Button button310 = view.findViewById(R.id.buttonBcaSem4CgmaUnit5Paper);

        button306.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setAction(Intent.ACTION_VIEW);
                intent.addCategory(Intent.CATEGORY_BROWSABLE);
                intent.setData(Uri.parse("https://drive.google.com/open?id=1heL9rRr0nskC1kph6nCNuclcvF_OQD9P"));
                startActivity(intent);
            }
        });
        button307.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setAction(Intent.ACTION_VIEW);
                intent.addCategory(Intent.CATEGORY_BROWSABLE);
                intent.setData(Uri.parse("https://drive.google.com/open?id=1yyNTekcnDexXHI6ygFIp845BixWELa5Q"));
                startActivity(intent);
            }
        });
        button308.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setAction(Intent.ACTION_VIEW);
                intent.addCategory(Intent.CATEGORY_BROWSABLE);
                intent.setData(Uri.parse("https://drive.google.com/open?id=1bQi1y_np3lmFA5R4quak5xDi7SZNjw1W"));
                startActivity(intent);
            }
        });
        button309.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setAction(Intent.ACTION_VIEW);
                intent.addCategory(Intent.CATEGORY_BROWSABLE);
                intent.setData(Uri.parse("https://drive.google.com/open?id=1lLpnBTrdEecsuhDruIpWa1AR1GWU1j_v"));
                startActivity(intent);
            }
        });
        button310.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setAction(Intent.ACTION_VIEW);
                intent.addCategory(Intent.CATEGORY_BROWSABLE);
                intent.setData(Uri.parse("https://drive.google.com/open?id=1G9b8LAhI1i8POZT8sLlObgmeyK2SokLc"));
                startActivity(intent);
            }
        });

        return view;
    }
}


