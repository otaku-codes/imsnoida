package com.himanshu.myimsguide;


import android.content.Intent;
import android.graphics.Color;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.VideoView;


import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;


import com.smarteist.autoimageslider.IndicatorAnimations;
import com.smarteist.autoimageslider.SliderAnimations;
import com.smarteist.autoimageslider.SliderView;

import java.util.ArrayList;
import java.util.List;

public class EventsFragment extends Fragment {

    SliderView sliderView;
    List<ImageSliderModel>imageSliderModelList;

    private VideoView videoview;

    @Override
    public void onPause() {

        super.onPause();
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
            videoview.setAudioFocusRequest(AudioManager.AUDIOFOCUS_NONE);
        }
        videoview.start();
    }
    @Override
    public void onResume() {

        super.onResume();
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
            videoview.setAudioFocusRequest(AudioManager.AUDIOFOCUS_NONE);
        }

        videoview.start(); //Or use resume() if it doesn't work. I'm not sure
    }


    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {


        View view = inflater.inflate(R.layout.fragment_events, container, false);


        videoview = view.findViewById(R.id.videoView22);
        Uri uri = Uri.parse("android.resource://"+getActivity().getPackageName()+"/"+R.raw.testo);
        videoview.setVideoURI(uri);

        videoview.setOnPreparedListener(new MediaPlayer.OnPreparedListener() {
            @Override
            public void onPrepared(MediaPlayer mp) {
                mp.setLooping(true);
            }
        });
        videoview.start();


        sliderView = view.findViewById(R.id.imageSlider);
        imageSliderModelList = new ArrayList<>();
        sliderView = view.findViewById(R.id.imageSlider);

        imageSliderModelList.add(new ImageSliderModel(R.drawable.a));
        imageSliderModelList.add(new ImageSliderModel(R.drawable.b));
        imageSliderModelList.add(new ImageSliderModel(R.drawable.c));
        imageSliderModelList.add(new ImageSliderModel(R.drawable.d));
        imageSliderModelList.add(new ImageSliderModel(R.drawable.e));
        imageSliderModelList.add(new ImageSliderModel(R.drawable.j));
        imageSliderModelList.add(new ImageSliderModel(R.drawable.f));
        imageSliderModelList.add(new ImageSliderModel(R.drawable.g));
        imageSliderModelList.add(new ImageSliderModel(R.drawable.h));
        imageSliderModelList.add(new ImageSliderModel(R.drawable.d));
        imageSliderModelList.add(new ImageSliderModel(R.drawable.i));
        imageSliderModelList.add(new ImageSliderModel(R.drawable.k));
        imageSliderModelList.add(new ImageSliderModel(R.drawable.l));
        imageSliderModelList.add(new ImageSliderModel(R.drawable.m));
        imageSliderModelList.add(new ImageSliderModel(R.drawable.n));
        imageSliderModelList.add(new ImageSliderModel(R.drawable.frien));
        imageSliderModelList.add(new ImageSliderModel(R.drawable.o));
        imageSliderModelList.add(new ImageSliderModel(R.drawable.p));
        imageSliderModelList.add(new ImageSliderModel(R.drawable.q));
        imageSliderModelList.add(new ImageSliderModel(R.drawable.r));
        imageSliderModelList.add(new ImageSliderModel(R.drawable.frie));
        imageSliderModelList.add(new ImageSliderModel(R.drawable.s));
        imageSliderModelList.add(new ImageSliderModel(R.drawable.t));
        imageSliderModelList.add(new ImageSliderModel(R.drawable.u));
        imageSliderModelList.add(new ImageSliderModel(R.drawable.v));
        imageSliderModelList.add(new ImageSliderModel(R.drawable.w));
        imageSliderModelList.add(new ImageSliderModel(R.drawable.x));
        imageSliderModelList.add(new ImageSliderModel(R.drawable.dd));
        imageSliderModelList.add(new ImageSliderModel(R.drawable.z));
        imageSliderModelList.add(new ImageSliderModel(R.drawable.aa));
        imageSliderModelList.add(new ImageSliderModel(R.drawable.bb));
        imageSliderModelList.add(new ImageSliderModel(R.drawable.cc));

        imageSliderModelList.add(new ImageSliderModel(R.drawable.ee));



        sliderView.setSliderAdapter(new ImageSliderAdapter(this, imageSliderModelList));

        sliderView.setIndicatorAnimation(IndicatorAnimations.COLOR); //set indicator animation by using SliderLayout.IndicatorAnimations. :WORM or THIN_WORM or COLOR or DROP or FILL or NONE or SCALE or SCALE_DOWN or SLIDE and SWAP!!
        sliderView.setSliderTransformAnimation(SliderAnimations.SIMPLETRANSFORMATION);
        sliderView.setAutoCycleDirection(SliderView.AUTO_CYCLE_DIRECTION_BACK_AND_FORTH);
        sliderView.setIndicatorSelectedColor(Color.WHITE);
        sliderView.setIndicatorUnselectedColor(Color.GRAY);
        sliderView.setScrollTimeInSec(3); //set scroll delay in seconds :
        sliderView.startAutoCycle();





        Button fbbutton165 = view.findViewById(R.id.buttonfb);

        fbbutton165.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setAction(Intent.ACTION_VIEW);
                intent.addCategory(Intent.CATEGORY_BROWSABLE);
                intent.setData(Uri.parse("https://www.facebook.com/IMS.NOIDA.SEC62/"));
                startActivity(intent);
            }
        });
        Button fbbutton167 = view.findViewById(R.id.buttonyou);

        fbbutton167.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setAction(Intent.ACTION_VIEW);
                intent.addCategory(Intent.CATEGORY_BROWSABLE);
                intent.setData(Uri.parse("https://www.youtube.com/channel/UCVEHeaVbCtIIORnyGnXqBfQ"));
                startActivity(intent);
            }
        });
        Button fbbutton166 = view.findViewById(R.id.buttonlink);

        fbbutton166.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setAction(Intent.ACTION_VIEW);
                intent.addCategory(Intent.CATEGORY_BROWSABLE);
                intent.setData(Uri.parse("https://www.linkedin.com/school/institute-of-management-studies-noida/"));
                startActivity(intent);
            }
        });
        Button fbbutton168 = view.findViewById(R.id.buttonInsta);

        fbbutton168.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setAction(Intent.ACTION_VIEW);
                intent.addCategory(Intent.CATEGORY_BROWSABLE);
                intent.setData(Uri.parse("https://www.instagram.com/noidaims/"));
                startActivity(intent);
            }
        });
        Button fbbutton169 = view.findViewById(R.id.buttontwitter);

        fbbutton169.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setAction(Intent.ACTION_VIEW);
                intent.addCategory(Intent.CATEGORY_BROWSABLE);
                intent.setData(Uri.parse("https://twitter.com/ims_noida"));
                startActivity(intent);
            }
        });
        Button fbbutton170 = view.findViewById(R.id.web);

        fbbutton170.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setAction(Intent.ACTION_VIEW);
                intent.addCategory(Intent.CATEGORY_BROWSABLE);
                intent.setData(Uri.parse("http://imsnoida.com/"));
                startActivity(intent);
            }
        });









        return view;
    }


}
