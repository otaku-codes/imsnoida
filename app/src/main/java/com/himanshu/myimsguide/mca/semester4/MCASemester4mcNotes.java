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

import com.himanshu.myimsguide.R;;

public class MCASemester4mcNotes extends Fragment {



    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_mcasem4notes_mc, container, false);

        Button mcabutton440 = view.findViewById(R.id.buttonMcaSem4mcUnit1);
        Button mcabutton441 = view.findViewById(R.id.buttonMcaSem4mcUnit2);
        Button mcabutton442 = view.findViewById(R.id.buttonMcaSem4mcUnit3);
        Button mcabutton443 = view.findViewById(R.id.buttonMcaSem4mcUnit4);
        Button mcabutton444 = view.findViewById(R.id.buttonMcaSem4mcUnit5);

        mcabutton440.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setAction(Intent.ACTION_VIEW);
                intent.addCategory(Intent.CATEGORY_BROWSABLE);
                intent.setData(Uri.parse("https://drive.google.com/open?id=17VOOtS7LppLCHHM2HtTk6HlaZunS8pMB"));
                startActivity(intent);
            }
        });
        mcabutton441.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setAction(Intent.ACTION_VIEW);
                intent.addCategory(Intent.CATEGORY_BROWSABLE);
                intent.setData(Uri.parse("https://drive.google.com/open?id=1HvbGsPy7IMMzorCbLXnThNST2LAgCB-1"));
                startActivity(intent);
            }
        });
        mcabutton442.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setAction(Intent.ACTION_VIEW);
                intent.addCategory(Intent.CATEGORY_BROWSABLE);
                intent.setData(Uri.parse("https://drive.google.com/open?id=1T8BMFG4RI39gQT60xaxmeVLoEuEY87iu"));
                startActivity(intent);
            }
        });
        mcabutton443.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setAction(Intent.ACTION_VIEW);
                intent.addCategory(Intent.CATEGORY_BROWSABLE);
                intent.setData(Uri.parse("https://drive.google.com/open?id=1gra8TKORnbsYcQVB3B8V-9QXW6p_kb2B"));
                startActivity(intent);
            }
        });
        mcabutton444.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setAction(Intent.ACTION_VIEW);
                intent.addCategory(Intent.CATEGORY_BROWSABLE);
                intent.setData(Uri.parse("https://drive.google.com/open?id=17Hzoqx59KscxJwb2rFUohl2JEGNcdHto"));
                startActivity(intent);
            }
        });



        return view;
    }

}