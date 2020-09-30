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

public class BcaSem2NotesDe extends Fragment {

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_bcasem2notes_deco,container,false);

        Button button241 = view.findViewById(R.id.buttonBcaSem2DecoUnit1);
        Button button242 = view.findViewById(R.id.buttonBcaSem2DecoUnit2);
        Button button243 = view.findViewById(R.id.buttonBcaSem2DecoUnit3);
        Button button244 = view.findViewById(R.id.buttonBcaSem2DecoUnit4);
        Button button245 = view.findViewById(R.id.buttonBcaSem2DecoUnit5);

        button241.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setAction(Intent.ACTION_VIEW);
                intent.addCategory(Intent.CATEGORY_BROWSABLE);
                intent.setData(Uri.parse("https://drive.google.com/open?id=1CqhoCFqvEXVtLRf8q1ACLkDEp-PhVCvO"));
                startActivity(intent);
            }
        });
        button242.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setAction(Intent.ACTION_VIEW);
                intent.addCategory(Intent.CATEGORY_BROWSABLE);
                intent.setData(Uri.parse("https://drive.google.com/open?id=181Qj9ANK-S2RoEMyT0wFQwdEc8Xt5qI5"));
                startActivity(intent);
            }
        });
        button243.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setAction(Intent.ACTION_VIEW);
                intent.addCategory(Intent.CATEGORY_BROWSABLE);
                intent.setData(Uri.parse("https://drive.google.com/open?id=1ARg84MDBJgLGFO3q3xxiFFUcCnJxPKsF"));
                startActivity(intent);
            }
        });
        button244.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setAction(Intent.ACTION_VIEW);
                intent.addCategory(Intent.CATEGORY_BROWSABLE);
                intent.setData(Uri.parse("https://drive.google.com/open?id=1UlMYYV1eMymlfFg5n6Wm2L76Ge8buPow"));
                startActivity(intent);
            }
        });
        button245.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setAction(Intent.ACTION_VIEW);
                intent.addCategory(Intent.CATEGORY_BROWSABLE);
                intent.setData(Uri.parse("https://drive.google.com/open?id=1dAeZghjexsLpYcRZzakfAMOYcTN-BWhf"));
                startActivity(intent);
            }
        });


        return view;
    }
}


