package com.himanshu.myimsguide.bca.semester3;

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

public class BcaSem3PapersCaal extends Fragment {

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_bcasem3papers_caal,container,false);


        Button button347 = view.findViewById(R.id.buttonBcaSem3CaalUnit1Paper);
        Button button348 = view.findViewById(R.id.buttonBcaSem3CaalUnit2Paper);
        Button button349 = view.findViewById(R.id.buttonBcaSem3CaalUnit3Paper);
        Button button350 = view.findViewById(R.id.buttonBcaSem3CaalUnit4Paper);
        Button button351 = view.findViewById(R.id.buttonBcaSem3CaalUnit5Paper);

        button347.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setAction(Intent.ACTION_VIEW);
                intent.addCategory(Intent.CATEGORY_BROWSABLE);
                intent.setData(Uri.parse("https://drive.google.com/file/d/15eNFW96fWXTrXO7EvEp_ISHM9n0K6De3/view?usp=sharing"));
                startActivity(intent);
            }
        });
        button348.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setAction(Intent.ACTION_VIEW);
                intent.addCategory(Intent.CATEGORY_BROWSABLE);
                intent.setData(Uri.parse("https://drive.google.com/file/d/1lrNHRgUzTLegzEIJhvzEjcIp3f_nH2D9/view?usp=sharing"));
                startActivity(intent);
            }
        });
        button349.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setAction(Intent.ACTION_VIEW);
                intent.addCategory(Intent.CATEGORY_BROWSABLE);
                intent.setData(Uri.parse("https://drive.google.com/file/d/1vPQUWxK58rO-1yt5CWuIh7byrBxxtvhU/view?usp=sharing"));
                startActivity(intent);
            }
        });
        button350.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setAction(Intent.ACTION_VIEW);
                intent.addCategory(Intent.CATEGORY_BROWSABLE);
                intent.setData(Uri.parse("https://drive.google.com/file/d/1FZXym8iJ_BoJuMUcb-G1oGpVPvlxQ3Zr/view?usp=sharing"));
                startActivity(intent);
            }
        });
        button351.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setAction(Intent.ACTION_VIEW);
                intent.addCategory(Intent.CATEGORY_BROWSABLE);
                intent.setData(Uri.parse("https://drive.google.com/file/d/1BxOprHbnNDyROGrxolH9dK-sQnRvvQLM/view?usp=sharing"));
                startActivity(intent);
            }
        });


        return view;
    }
}


