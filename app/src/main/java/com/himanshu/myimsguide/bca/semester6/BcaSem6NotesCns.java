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

public class BcaSem6NotesCns extends Fragment {

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_bcasem6notes_cns,container,false);

        Button button500 = view.findViewById(R.id.buttonBcaSem6CnsUnit1);
        Button button501 = view.findViewById(R.id.buttonBcaSem6CnsUnit2);
        Button button502 = view.findViewById(R.id.buttonBcaSem6CnsUnit3);
        Button button503 = view.findViewById(R.id.buttonBcaSem6CnsUnit4);
        Button button504 = view.findViewById(R.id.buttonBcaSem6CnsUnit5);
        Button button505 = view.findViewById(R.id.buttonBcaSem6CnsUnit6);



        button500.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setAction(Intent.ACTION_VIEW);
                intent.addCategory(Intent.CATEGORY_BROWSABLE);
                intent.setData(Uri.parse("https://drive.google.com/open?id=19AKVEFCrce7draD1flDhRZM504HRfT3V"));
                startActivity(intent);
            }
        });
        button501.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setAction(Intent.ACTION_VIEW);
                intent.addCategory(Intent.CATEGORY_BROWSABLE);
                intent.setData(Uri.parse("https://drive.google.com/open?id=1Hvppo8fvftW8EWw_hlEfTAZNqqMuiNkm"));
                startActivity(intent);
            }
        });
        button502.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setAction(Intent.ACTION_VIEW);
                intent.addCategory(Intent.CATEGORY_BROWSABLE);
                intent.setData(Uri.parse("https://drive.google.com/open?id=1d27P76IfHwhO31ns7UhdO78W6DdfKybA"));
                startActivity(intent);
            }
        });
        button503.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setAction(Intent.ACTION_VIEW);
                intent.addCategory(Intent.CATEGORY_BROWSABLE);
                intent.setData(Uri.parse("https://drive.google.com/open?id=1R6HdmPwnbRyNqOGg-8cu_098Huc7ZzSy"));
                startActivity(intent);
            }
        });
        button504.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setAction(Intent.ACTION_VIEW);
                intent.addCategory(Intent.CATEGORY_BROWSABLE);
                intent.setData(Uri.parse("https://drive.google.com/open?id=1qZa2u4jnMcTHyETvRmcl28cxqa6fuYmT"));
                startActivity(intent);
            }
        });
        button505.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setAction(Intent.ACTION_VIEW);
                intent.addCategory(Intent.CATEGORY_BROWSABLE);
                intent.setData(Uri.parse("https://drive.google.com/open?id=1hNVioimlXQjpu3eLJaN0W7gZHkYXruQN"));
                startActivity(intent);
            }
        });

        return view;
    }
}


