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

public class BcaSem2NotesC extends Fragment {


   // private InterstitialAd mInterstitialAd;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_bcasem2notes_c,container,false);

     /*   mInterstitialAd = new InterstitialAd(getContext());
        mInterstitialAd.setAdUnitId("ca-app-pub-8329525508764632/3408047450");
        mInterstitialAd.loadAd(new AdRequest.Builder().build());*/

        Button button210 = view.findViewById(R.id.buttonBcaSem2CUnit1);
        Button button211 = view.findViewById(R.id.buttonBcaSem2CUnit2);
        Button button212 = view.findViewById(R.id.buttonBcaSem2CUnit3);
        Button button213 = view.findViewById(R.id.buttonBcaSem2CUnit4);
        Button button214 = view.findViewById(R.id.buttonBcaSem2CUnit5);
        Button button215 = view.findViewById(R.id.buttonBcaSem2CUnit6);

        button210.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setAction(Intent.ACTION_VIEW);
                intent.addCategory(Intent.CATEGORY_BROWSABLE);
                intent.setData(Uri.parse("https://drive.google.com/open?id=1lUGYkoAC6fxftBeaxJQ7DH_blm7A2c_x"));

                startActivity(intent);
            }
        });
        button211.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setAction(Intent.ACTION_VIEW);
                intent.addCategory(Intent.CATEGORY_BROWSABLE);
                intent.setData(Uri.parse("https://drive.google.com/open?id=1Xl9L2jqdn2rykd5fHcggaOXLad7e2gqy"));
                startActivity(intent);
            }
        });
        button212.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setAction(Intent.ACTION_VIEW);
                intent.addCategory(Intent.CATEGORY_BROWSABLE);
                intent.setData(Uri.parse("https://drive.google.com/open?id=1IqwMxU4HneC5Zqx7kv0r8f2KC7YVRGor"));

                startActivity(intent);
            }
        });
        button213.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setAction(Intent.ACTION_VIEW);
                intent.addCategory(Intent.CATEGORY_BROWSABLE);
                intent.setData(Uri.parse("https://drive.google.com/open?id=1WP7lqbDJ_KzrMg26K_sibhD60texotpr"));

                startActivity(intent);
            }
        });
        button214.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setAction(Intent.ACTION_VIEW);
                intent.addCategory(Intent.CATEGORY_BROWSABLE);
                intent.setData(Uri.parse("https://drive.google.com/open?id=14FsV3MIhaenbAXOApF6dOaoalhaRHwt4"));
              /*  if (mInterstitialAd.isLoaded()) {
                    mInterstitialAd.show();
                }*/
                startActivity(intent);
            }
        });
        button215.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setAction(Intent.ACTION_VIEW);
                intent.addCategory(Intent.CATEGORY_BROWSABLE);
                intent.setData(Uri.parse("https://drive.google.com/open?id=1cEpdWwlVfDQtf0LJQVaH_OnXqMKNUBhh"));

                startActivity(intent);
            }
        });



        return view;
    }
}


