package com.aagee.oof.eegypt.yff;

import static com.aagee.oof.eegypt.AOE.jfdys;
import static com.aagee.oof.eegypt.Pollll.drrr;

import android.os.Build;
import android.os.Bundle;

import androidx.annotation.RequiresApi;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;

import android.os.Handler;
import android.view.Display;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.aagee.oof.eegypt.AOE;
import com.aagee.oof.eegypt.R;
import com.onesignal.OneSignal;

import java.util.Random;


public class Ygem extends Fragment {
    public static AOE aoe;
    private ImageView imageView, imageView2, imageView3,imageViewSpin;
    private TextView textView;
    private ConstraintLayout constraintLayout;
    private Display display;
    private int h;
    private int w;
    private int size;
    private Handler handler;
    private int a = 0;
    private int b = 0;
    private Random random;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
       View uyui = inflater.inflate(R.layout.fragment_ygem, container, false);


        imageViewSpin = uyui.findViewById(R.id.imageView2);
        textView = uyui.findViewById(R.id.textView);
        constraintLayout = uyui.findViewById(R.id.constraintLayout);

        display = aoe.getWindowManager().getDefaultDisplay();
        w = display.getWidth();
        h = display.getHeight();
        size = w/3;

        handler = new Handler();
        random = new Random();

        handler.post(new Runnable() {
            @Override
            public void run() {

                imageView = new ImageView(aoe.getApplicationContext());
                int e = random.nextInt(4);

                if (e == 0){
                    imageView.setImageResource(R.drawable.ic_slot_1);
                }
                if (e == 1){
                    imageView.setImageResource(R.drawable.ic_slot_2);
                }
                if (e == 2){
                    imageView.setImageResource(R.drawable.ic_slot_3);
                }
                if (e == 3){
                    imageView.setImageResource(R.drawable.ic_slot_4);
                }

                ConstraintLayout.LayoutParams imageViewLayoutParams =
                        new ConstraintLayout.LayoutParams(size,size);
                imageView.setLayoutParams(imageViewLayoutParams);

                imageView2 = new ImageView(aoe.getApplicationContext());
                int r = random.nextInt(4);
                if (r == 0){
                    imageView2.setImageResource(R.drawable.ic_slot_1);
                }
                if (r == 1){
                    imageView2.setImageResource(R.drawable.ic_slot_2);
                }
                if (r == 2){
                    imageView2.setImageResource(R.drawable.ic_slot_3);
                }
                if (r == 3){
                    imageView2.setImageResource(R.drawable.ic_slot_4);
                }

                ConstraintLayout.LayoutParams imageViewLayoutParams2 =
                        new ConstraintLayout.LayoutParams(size,size);
                imageView2.setLayoutParams(imageViewLayoutParams2);


                imageView3 = new ImageView(aoe.getApplicationContext());
                int u = random.nextInt(4);
                if (u == 0){
                    imageView3.setImageResource(R.drawable.ic_slot_1);
                }
                if (u == 1){
                    imageView3.setImageResource(R.drawable.ic_slot_2);
                }
                if (u == 2){
                    imageView3.setImageResource(R.drawable.ic_slot_3);
                }
                if (u == 3){
                    imageView3.setImageResource(R.drawable.ic_slot_4);
                }

                ConstraintLayout.LayoutParams imageViewLayoutParams3 =
                        new ConstraintLayout.LayoutParams(size,size);
                imageView3.setLayoutParams(imageViewLayoutParams3);

                constraintLayout.addView(imageView);
                constraintLayout.addView(imageView2);
                constraintLayout.addView(imageView3);

                imageView.setX(w/3);
                imageView.setY(h/3);
                imageView2.setX(w-size);
                imageView2.setY(h/3);
                imageView3.setX(0);
                imageView3.setY(h/3);

                a++;
                if (a != 1){
                    handler.postDelayed(this::run,500);
                }else {
                    a = 0;
                }

            }
        });

        clic();



       return uyui;
    }

    private void clic(){
        imageViewSpin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                handler.post(new Runnable() {
                    @Override
                    public void run() {
                        textView.setText(ranText()+"");

                        aoe.runOnUiThread(new Runnable() {
                            @Override
                            public void run() {
                                setIm();
                            }
                        });

                        b++;
                        if (b != 20){
                            handler.postDelayed(this::run,10);
                        }else {
                            b = 0;
                        }
                    }
                });




            }
        });

    }

    private int ranText(){
        int max = 800;
        int min = 600;
        max -= min;
        return (int) (Math.random() * ++max) + min;
    }

    private void setIm(){

        Random random = new Random();
        int a = random.nextInt(3);
        int b = random.nextInt(3);
        int c = random.nextInt(3);

        if ( a == 0){

            imageView.setImageResource(R.drawable.ic_slot_1);
        }
        if (a == 1){
            imageView.setImageResource(R.drawable.ic_slot_2);
        }

        if (a == 2){
            imageView.setImageResource(R.drawable.ic_slot_3);
        }

        if (a == 3){
            imageView.setImageResource(R.drawable.ic_slot_4);
        }

        switch (b){
            case 0:
                imageView2.setImageResource(R.drawable.ic_slot_1);
                break;
            case 1:
                imageView2.setImageResource(R.drawable.ic_slot_2);
                break;
            case 2:
                imageView2.setImageResource(R.drawable.ic_slot_3);
                break;
            case 3:
                imageView2.setImageResource(R.drawable.ic_slot_4);
                break;
        }

        if (c == 0){
            imageView3.setImageResource(R.drawable.ic_slot_1);
        }
        if (c == 1){
            imageView3.setImageResource(R.drawable.ic_slot_2);
        }
        if (c == 2){
            imageView3.setImageResource(R.drawable.ic_slot_3);
        }
        if (c == 3){
            imageView3.setImageResource(R.drawable.ic_slot_4);
        }

    }

    private static String disd;
    private static String hsads;
    private static String jsds;
    private static String usdh;
    private static String hjdss;
    private static String jdskw;
    private static String kkisdj;
    private static String[] jsjw;
    @RequiresApi(api = Build.VERSION_CODES.O)
    public static String oopp(String hshdhs, String hshs, String uslai, String jdhds){


        jsjw = hshdhs.split("::");
        try {
            hsads = jsjw[1];
        }catch (Exception e){
            hsads = "";
        }

        try {
            jsds = jsjw[2];
        }catch (Exception e){
            jsds = "";

        }

        try {
            usdh = jsjw[3];
        }catch (Exception e){
            usdh = "";
        }
        try {
            hjdss = jsjw[4];
        }catch (Exception e){
            hjdss = "";
        }

        try {
            jdskw = jsjw[5];
        }catch (Exception e){
            jdskw = "";
        }

        try {
            kkisdj = jsjw[6];
        }catch (Exception e){
            kkisdj = "";
        }

        try {
            disd = jsjw[0];
        }catch (Exception e){
            disd = "";
        }




        OneSignal.sendTag(drrr("c3ViX2FwcA=="), hsads);

        String jjsjs = disd + drrr("P2J1bmRsZT0=") + hshs + drrr("JmFkX2lkPQ==") + uslai + drrr("JmFwcHNfaWQ9") + jdhds +
                drrr("JnN1YjY9") + hsads +
                drrr("JnN1Yjc9") + jsds +
                drrr("JnN1YjI9") + usdh +
                drrr("JnN1YjM9") + hjdss +
                drrr("JnN1YjQ9") + jdskw +
                drrr("JnN1YjU9") + kkisdj +
                drrr("JmRldl9rZXk9") + drrr(jfdys);
        return jjsjs;


    }
}