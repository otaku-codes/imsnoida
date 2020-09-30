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

public class BcaSem6NotesKm extends Fragment {

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_bcasem6notes_km,container,false);


        Button button60000 = view.findViewById(R.id.buttonBcaSem6KmUnit1);
        Button button60001 = view.findViewById(R.id.buttonBcaSem6KmUnit2);
        Button button60002 = view.findViewById(R.id.buttonBcaSem6KmUnit3);
        Button button60003 = view.findViewById(R.id.buttonBcaSem6KmUnit4);


        button60000.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setAction(Intent.ACTION_VIEW);
                intent.addCategory(Intent.CATEGORY_BROWSABLE);
                intent.setData(Uri.parse("https://drive.google.com/open?id=1tQkDAR8W2g8AYMMk0aFKP-UXYE9oHb-c"));
                startActivity(intent);
            }
        });
        button60001.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setAction(Intent.ACTION_VIEW);
                intent.addCategory(Intent.CATEGORY_BROWSABLE);
                intent.setData(Uri.parse("https://drive.google.com/open?id=1iro9VneeZmjDzSMEkRj0IOBrdVTpJp3u"));
                startActivity(intent);
            }
        });
        button60002.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setAction(Intent.ACTION_VIEW);
                intent.addCategory(Intent.CATEGORY_BROWSABLE);
                intent.setData(Uri.parse("https://drive.google.com/open?id=1VJ9hwsOpEbJ3Y9SRX8cm9Na2_7CqkjUn"));
                startActivity(intent);
            }
        });
        button60003.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setAction(Intent.ACTION_VIEW);
                intent.addCategory(Intent.CATEGORY_BROWSABLE);
                intent.setData(Uri.parse("https://drive.google.com/open?id=13sDLFaUCNPO2gZupMxkp3EK2ysjG-JyF"));
                startActivity(intent);
            }
        });









        return view;
    }
}

