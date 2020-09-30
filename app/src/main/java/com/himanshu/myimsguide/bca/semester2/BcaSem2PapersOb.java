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

public class BcaSem2PapersOb extends Fragment {

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_bcasem2papers_ob,container,false);

        Button button266 = view.findViewById(R.id.buttonBcaSem2ObUnit1Paper);
        Button button267 = view.findViewById(R.id.buttonBcaSem2ObUnit2Paper);
        Button button268 = view.findViewById(R.id.buttonBcaSem2ObUnit3Paper);
        Button button269 = view.findViewById(R.id.buttonBcaSem2ObUnit4Paper);


        button266.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setAction(Intent.ACTION_VIEW);
                intent.addCategory(Intent.CATEGORY_BROWSABLE);
                intent.setData(Uri.parse("https://drive.google.com/open?id=19FzBE-f05T1vFseUQ_fXDP6iQh2rT5W2"));
                startActivity(intent);
            }
        });
        button267.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setAction(Intent.ACTION_VIEW);
                intent.addCategory(Intent.CATEGORY_BROWSABLE);
                intent.setData(Uri.parse("https://drive.google.com/open?id=1IJlMO-7cQvs8eaMMZMEvm3PH7JjOERcO"));
                startActivity(intent);
            }
        });
        button268.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setAction(Intent.ACTION_VIEW);
                intent.addCategory(Intent.CATEGORY_BROWSABLE);
                intent.setData(Uri.parse("https://drive.google.com/open?id=1zQuN8yLJEr8kq330N3RAorUnQTw0HhV7"));
                startActivity(intent);
            }
        });
        button269.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setAction(Intent.ACTION_VIEW);
                intent.addCategory(Intent.CATEGORY_BROWSABLE);
                intent.setData(Uri.parse("https://drive.google.com/open?id=1B6-AD8KQryZzAI7OLSDgPSx0xF2RNV4b"));
                startActivity(intent);
            }
        });







        return view;
    }
}


