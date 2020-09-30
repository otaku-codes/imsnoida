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

public class MCASemester4cnNotes extends Fragment {

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view= inflater.inflate(R.layout.fragment_mcasem4notes_cn,container,false);

        Button mcabutton220 = view.findViewById(R.id.buttonMcaSem4CnUnit1);
        Button mcabutton221 = view.findViewById(R.id.buttonMcaSem4CnUnit2);
        Button mcabutton222 = view.findViewById(R.id.buttonMcaSem4CnUnit3);
        Button mcabutton223 = view.findViewById(R.id.buttonMcaSem4CnUnit4);
        Button mcabutton224 = view.findViewById(R.id.buttonMcaSem4CnUnit5);

        mcabutton220.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setAction(Intent.ACTION_VIEW);
                intent.addCategory(Intent.CATEGORY_BROWSABLE);
                intent.setData(Uri.parse("https://drive.google.com/open?id=1IBNlUWwl0FbLPPmwAdcae6gt84jDOD-N"));
                startActivity(intent);
            }
        });
        mcabutton221.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setAction(Intent.ACTION_VIEW);
                intent.addCategory(Intent.CATEGORY_BROWSABLE);
                intent.setData(Uri.parse("https://drive.google.com/open?id=1weOnOqjcghcg8BGZxemfI0VsPQuA2uNU"));
                startActivity(intent);
            }
        });
        mcabutton222.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setAction(Intent.ACTION_VIEW);
                intent.addCategory(Intent.CATEGORY_BROWSABLE);
                intent.setData(Uri.parse("https://drive.google.com/open?id=164nAQd2mIWjAJIAB2FzzyWp6u0YbavV8"));
                startActivity(intent);
            }
        });
        mcabutton223.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setAction(Intent.ACTION_VIEW);
                intent.addCategory(Intent.CATEGORY_BROWSABLE);
                intent.setData(Uri.parse("https://drive.google.com/open?id=1KaAz_cr4U6-B1WhA59JdLKEqcAwFOYcQ"));
                startActivity(intent);
            }
        });
        mcabutton224.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setAction(Intent.ACTION_VIEW);
                intent.addCategory(Intent.CATEGORY_BROWSABLE);
                intent.setData(Uri.parse("https://drive.google.com/open?id=1m4UY9S4R2_sCLV5TgQJ6dx-fWRxXVL-D"));
                startActivity(intent);
            }
        });









        return view;
    }

}