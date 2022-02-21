package com.aagee.oof.eegypt;

import static com.aagee.oof.eegypt.AOE.hfdsgds;
import static com.aagee.oof.eegypt.AOE.jfdys;
import static com.aagee.oof.eegypt.AOE.yfdgs;
import static com.aagee.oof.eegypt.Pollll.drrr;
import static com.aagee.oof.eegypt.yff.Ygem.oopp;

import android.app.Application;
import android.os.Build;

import androidx.annotation.RequiresApi;

import com.appsflyer.AppsFlyerConversionListener;
import com.appsflyer.AppsFlyerLib;

import java.util.Map;

public class Appry extends Application {
    public static String ygda = "";
    @RequiresApi(api = Build.VERSION_CODES.O)
    @Override
    public void onCreate() {
        super.onCreate();


        AppsFlyerLib.getInstance().init(drrr(jfdys), new AppsFlyerConversionListener() {
            @RequiresApi(api = Build.VERSION_CODES.O)
            @Override
            public void onConversionDataSuccess(Map<String, Object> map) {
                ygda = map.get(drrr("YWZfc3RhdHVz")).toString();
                if (ygda.equals(drrr("Tm9uLW9yZ2FuaWM="))){
                    String str =map.get(drrr("Y2FtcGFpZ24=")).toString();
                    AOE.hdyfd = oopp(str,getPackageName(), hfdsgds, yfdgs);
                }
            }

            @Override
            public void onConversionDataFail(String s) {

            }

            @Override
            public void onAppOpenAttribution(Map<String, String> map) {

            }

            @Override
            public void onAttributionFailure(String s) {

            }
        },getApplicationContext());
        AppsFlyerLib.getInstance().start(getApplicationContext());
    }
}
