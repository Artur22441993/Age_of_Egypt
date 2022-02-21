package com.aagee.oof.eegypt.yff;

import static com.aagee.oof.eegypt.AOE.dsdd;

import android.content.Context;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.os.Vibrator;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.aagee.oof.eegypt.AOE;
import com.aagee.oof.eegypt.R;

import ng.max.slideview.SlideView;

public class Ybuuu extends Fragment {


   public static AOE aoe;
   public static boolean qqqq = false;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View weqs = inflater.inflate(R.layout.fragment_ybuuu, container, false);

        SlideView slideView = (SlideView) weqs.findViewById(R.id.slideView);
        slideView.setOnSlideCompleteListener(new SlideView.OnSlideCompleteListener() {
            @Override
            public void onSlideComplete(SlideView slideView) {

                Vibrator vibrator = (Vibrator) aoe.getSystemService(Context.VIBRATOR_SERVICE);
                vibrator.vibrate(300);

                qqqq = true;
                dsdd.navigate(R.id.ygem);

            }
        });

        SlideView slideView1 = (SlideView) weqs.findViewById(R.id.slideView1);
        slideView1.setOnSlideCompleteListener(new SlideView.OnSlideCompleteListener() {
            @Override
            public void onSlideComplete(SlideView slideView) {
                // vibrate the device
                Vibrator vibrator = (Vibrator) aoe.getSystemService(Context.VIBRATOR_SERVICE);
                vibrator.vibrate(300);

                qqqq = true;
                dsdd.navigate(R.id.pollll);

            }
        });

        SlideView slideView2 = (SlideView) weqs.findViewById(R.id.slideView2);
        slideView2.setOnSlideCompleteListener(new SlideView.OnSlideCompleteListener() {
            @Override
            public void onSlideComplete(SlideView slideView) {

                Vibrator vibrator = (Vibrator) aoe.getSystemService(Context.VIBRATOR_SERVICE);
                vibrator.vibrate(300);

                aoe.finishAffinity();

            }
        });

        return weqs;
    }
}