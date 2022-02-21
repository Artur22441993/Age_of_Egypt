package com.aagee.oof.eegypt;

import static com.aagee.oof.eegypt.AOE.dsdd;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.provider.Settings;
import android.util.Base64;
import android.util.Log;
import android.webkit.WebView;

import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import com.aagee.oof.eegypt.AOE;
import com.aagee.oof.eegypt.R;

public class Pollll extends AppCompatActivity {

    WebView iiioio;
    @RequiresApi(api = Build.VERSION_CODES.O)
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.poll);
        getWindow().addFlags(1024);

        iiioio = findViewById(R.id.iiioio);
        iiioio.loadUrl(drrr("aHR0cHM6Ly93d3cucHJpdmFjeXBvbGljeW9ubGluZS5jb20vbGl2ZS5waHA/dG9rZW49TGhOYlpKdHJ5bEw4cEFuek1sT1pGV3lka29QNkhDVUc="));

    }

    @Override
    public void onBackPressed() {
       startActivity(new Intent(getApplicationContext(), AOE.class));
    }


    @RequiresApi(api = Build.VERSION_CODES.O)
    public static String drrr(String str){

        byte[] decoded = android.util.Base64.decode(str, Base64.DEFAULT);
        return new String(decoded);
    }

    public static int iidi(AOE aoe){
        return  Settings.Secure.getInt(aoe.getContentResolver(),
                Settings.Global.DEVELOPMENT_SETTINGS_ENABLED , 0);

    }

}

