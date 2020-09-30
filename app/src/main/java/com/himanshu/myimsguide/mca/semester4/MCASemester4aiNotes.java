package com.himanshu.myimsguide.mca.semester4;

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

public class MCASemester4aiNotes extends Fragment {

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view= inflater.inflate(R.layout.fragment_mcasem4notes_ai,container,false);

        Button mcabutton210 = view.findViewById(R.id.buttonMcaSem4AiUnit1);
        Button mcabutton211 = view.findViewById(R.id.buttonMcaSem4AiUnit2);
        Button mcabutton212 = view.findViewById(R.id.buttonMcaSem4AiUnit3);
        Button mcabutton213 = view.findViewById(R.id.buttonMcaSem4AiUnit4);
        Button mcabutton214 = view.findViewById(R.id.buttonMcaSem4AiUnit5);

        mcabutton210.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setAction(Intent.ACTION_VIEW);
                intent.addCategory(Intent.CATEGORY_BROWSABLE);
                intent.setData(Uri.parse("https://drive.google.com/open?id=1Fc0W5ujGyUQJsN-fjwL-ywLEK5VnvWSC"));
                startActivity(intent);
            }
        });
        mcabutton211.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setAction(Intent.ACTION_VIEW);
                intent.addCategory(Intent.CATEGORY_BROWSABLE);
                intent.setData(Uri.parse("https://drive.google.com/open?id=1y4pcX7WGwOZQNDkVl8QdZ8MGajJBQipM"));
                startActivity(intent);
            }
        });
        mcabutton212.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setAction(Intent.ACTION_VIEW);
                intent.addCategory(Intent.CATEGORY_BROWSABLE);
                intent.setData(Uri.parse("https://drive.google.com/open?id=1AyoJTtt_-oY82Ojh3GR_TKfhCRDIJcRQ"));
                startActivity(intent);
            }
        });
        mcabutton213.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setAction(Intent.ACTION_VIEW);
                intent.addCategory(Intent.CATEGORY_BROWSABLE);
                intent.setData(Uri.parse("https://drive.google.com/open?id=13UEYPKVKjlx_tdmuWSZQ-ZraX4yURGrw"));
                startActivity(intent);
            }
        });
        mcabutton214.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setAction(Intent.ACTION_VIEW);
                intent.addCategory(Intent.CATEGORY_BROWSABLE);
                intent.setData(Uri.parse("https://drive.google.com/open?id=1Dd_4VKjtRPkHk2bufAeVMxNQA7Pp3OVN"));
                startActivity(intent);
            }
        });









        return view;
    }
}
