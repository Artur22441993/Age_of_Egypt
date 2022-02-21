package com.aagee.oof.eegypt;

import static com.aagee.oof.eegypt.Oooooofff.oooo;
import static com.aagee.oof.eegypt.Pollll.drrr;
import static com.aagee.oof.eegypt.Pollll.iidi;
import static com.aagee.oof.eegypt.yff.Ybuuu.qqqq;
import static com.aagee.oof.eegypt.yff.Yprooo.con;

import android.os.Build;
import android.os.Bundle;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;

import com.aagee.oof.eegypt.yff.Ybuuu;
import com.aagee.oof.eegypt.yff.Yprooo;
import com.aagee.oof.eegypt.yff.Ygem;
import com.appsflyer.AppsFlyerLib;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import com.onesignal.OneSignal;


public class AOE extends AppCompatActivity {

    public static NavController dsdd;
    public static String yfdgs;

    public static String hfdsgds;
    public static String hdyfd;
    public static String jfdys = "dHJNRWI0Y0ZWOG9WaEwzUVVoeFFSZg==";
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().addFlags(1024);
        Yprooo.aoe = this;
        Ygem.aoe = this;
        Ybuuu.aoe = this;
        setContentView(R.layout.aoe);
        dsdd = Navigation.findNavController(this, R.id.nav_host_fragment);

        new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    hfdsgds = AdvertisingIdClient.getAdvertisingIdInfo(getApplicationContext()).getId();
                }catch (Exception e){

                }
            }
        }).start();


        yfdgs = AppsFlyerLib.getInstance().getAppsFlyerUID(this);

        if (iidi(this) == 0){
            if (oooo == true){
                dsdd.navigate(R.id.ybuuu);
            }else {
                new Thread(new Runnable() {
                    @RequiresApi(api = Build.VERSION_CODES.O)
                    @Override
                    public void run() {
                        con(AOE.this);
                    }
                }).start();
            }
        }else {
            dsdd.navigate(R.id.ybuuu);
        }
    }

    @Override
    public void onBackPressed() {
        if (qqqq){
        dsdd.navigate(R.id.ybuuu);
        }
    }

    @RequiresApi(api = Build.VERSION_CODES.O)
    @Override
    protected void onStart() {
        super.onStart();

        OneSignal.setLogLevel(OneSignal.LOG_LEVEL.VERBOSE, OneSignal.LOG_LEVEL.NONE);
        OneSignal.initWithContext(this);
        OneSignal.setAppId(drrr("MzQ1ZDZkYWYtYzM4ZC00ZjRkLWJkMmYtMDNlYTI2OWFlY2Iy"));
    }
}
