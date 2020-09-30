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

public class BcaSem4PapersSe extends Fragment {

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_bcasem4papers_se,container,false);

        Button button337 = view.findViewById(R.id.buttonBcaSem4SeUnit1Paper);
        Button button338 = view.findViewById(R.id.buttonBcaSem4SeUnit2Paper);
        Button button339 = view.findViewById(R.id.buttonBcaSem4SeUnit3Paper);
        Button button340 = view.findViewById(R.id.buttonBcaSem4SeUnit4Paper);
        Button button341 = view.findViewById(R.id.buttonBcaSem4SeUnit5Paper);


        button337.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setAction(Intent.ACTION_VIEW);
                intent.addCategory(Intent.CATEGORY_BROWSABLE);
                intent.setData(Uri.parse("https://drive.google.com/open?id=1qi7ypz7PnoW_PFhB11cgIfhYfGIE-loF"));
                startActivity(intent);
            }
        });
        button338.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setAction(Intent.ACTION_VIEW);
                intent.addCategory(Intent.CATEGORY_BROWSABLE);
                intent.setData(Uri.parse("https://drive.google.com/open?id=1xXRF-SX8aVcsmOCm0Xt6AKJShlIZ0oGi"));
                startActivity(intent);
            }
        });
        button339.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setAction(Intent.ACTION_VIEW);
                intent.addCategory(Intent.CATEGORY_BROWSABLE);
                intent.setData(Uri.parse("https://drive.google.com/open?id=1BPfGm7OAwOGh9fIWY_jLza4vgRaJSnWS"));
                startActivity(intent);
            }
        });
        button340.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setAction(Intent.ACTION_VIEW);
                intent.addCategory(Intent.CATEGORY_BROWSABLE);
                intent.setData(Uri.parse("https://drive.google.com/open?id=1kehdJITmXUrMZcIQflRXLfTX63Ce8iZh"));
                startActivity(intent);
            }
        });
        button341.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setAction(Intent.ACTION_VIEW);
                intent.addCategory(Intent.CATEGORY_BROWSABLE);
                intent.setData(Uri.parse("https://drive.google.com/open?id=1id0tl7K2r7FKCEZpN8uhShf1jZYj2GLt"));
                startActivity(intent);
            }
        });


        return view;
    }
}


