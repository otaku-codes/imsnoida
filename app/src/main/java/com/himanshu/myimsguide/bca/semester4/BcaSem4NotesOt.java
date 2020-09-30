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

public class BcaSem4NotesOt extends Fragment {

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_bcasem4notes_ot,container,false);

        Button button337 = view.findViewById(R.id.buttonBcaSem4OtUnit1);
        Button button338 = view.findViewById(R.id.buttonBcaSem4OtUnit2);
        Button button339 = view.findViewById(R.id.buttonBcaSem4OtUnit3);
        Button button340 = view.findViewById(R.id.buttonBcaSem4OtUnit4);
        Button button341 = view.findViewById(R.id.buttonBcaSem4OtUnit5);

        button337.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setAction(Intent.ACTION_VIEW);
                intent.addCategory(Intent.CATEGORY_BROWSABLE);
                intent.setData(Uri.parse("https://drive.google.com/open?id=1pD99T9lbCn3hbqeM39dBumXeYyVY9XRf"));
                startActivity(intent);
            }
        });
        button338.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setAction(Intent.ACTION_VIEW);
                intent.addCategory(Intent.CATEGORY_BROWSABLE);
                intent.setData(Uri.parse("https://drive.google.com/open?id=1YXIMK3YA-GDRSMwHexztK-C4nTMyTHDH"));
                startActivity(intent);
            }
        });
        button339.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setAction(Intent.ACTION_VIEW);
                intent.addCategory(Intent.CATEGORY_BROWSABLE);
                intent.setData(Uri.parse("https://drive.google.com/open?id=1Lu0ecebsonTz5eidv0jNQKvMFTYD3xE6"));
                startActivity(intent);
            }
        });
        button340.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setAction(Intent.ACTION_VIEW);
                intent.addCategory(Intent.CATEGORY_BROWSABLE);
                intent.setData(Uri.parse("https://drive.google.com/open?id=1CSpGKlfkkmYxDks5Ge5PfzRXHxUCNruI"));
                startActivity(intent);
            }
        });
        button341.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setAction(Intent.ACTION_VIEW);
                intent.addCategory(Intent.CATEGORY_BROWSABLE);
                intent.setData(Uri.parse("https://drive.google.com/open?id=1yIo_sfrXH2Q4PcZc6dZ3IkAwjiSUk3eB"));
                startActivity(intent);
            }
        });

        return view;
    }
}
