package com.aagee.oof.eegypt;

import static com.aagee.oof.eegypt.Pollll.drrr;
import static com.aagee.oof.eegypt.yff.Yprooo.idhds;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.webkit.CookieManager;
import android.webkit.ValueCallback;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

public class Oooooofff extends AppCompatActivity {


    @Override
    public void onBackPressed() {
        if (uuyud.isFocused() && uuyud.canGoBack()) {
            uuyud.goBack();
        }
    }

    WebView uuyud;
    public static boolean oooo = false;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.oooooff);
        getWindow().addFlags(1024);
        uuyud =  findViewById(R.id.uuyud);
        seert();
        uuyud.loadUrl(idhds);
    }

    private void seert() {

        CookieManager.getInstance().setAcceptThirdPartyCookies(uuyud, true);
        CookieManager.getInstance().setAcceptCookie(true);
        uuyud.setVisibility(View.VISIBLE);
        uuyud.getSettings().setAllowFileAccessFromFileURLs(true);
        uuyud.getSettings().setSavePassword(true);
        uuyud.getSettings().setDatabaseEnabled(true);
        uuyud.getSettings().setRenderPriority(android.webkit.WebSettings.RenderPriority.HIGH);
        uuyud.getSettings().setCacheMode(android.webkit.WebSettings.LOAD_DEFAULT);
        uuyud.getSettings().setAppCacheEnabled(true);
        uuyud.getSettings().setLoadsImagesAutomatically(true);
        uuyud.setSaveEnabled(true);
        uuyud.getSettings().setMixedContentMode(0);
        uuyud.setFocusable(true);
        uuyud.getSettings().setAllowUniversalAccessFromFileURLs(true);
        uuyud.getSettings().setJavaScriptEnabled(true);
        uuyud.getSettings().setAllowContentAccess(true);
        uuyud.getSettings().setLoadWithOverviewMode(true);
        uuyud.getSettings().setEnableSmoothTransition(true);
        uuyud.getSettings().setUseWideViewPort(true);
        uuyud.getSettings().setSaveFormData(true);
        uuyud.getSettings().setAllowFileAccess(true);
        uuyud.getSettings().setJavaScriptCanOpenWindowsAutomatically(true);
        uuyud.getSettings().setDomStorageEnabled(true);
        uuyud.setFocusableInTouchMode(true);
        uuyud.setWebViewClient(new WebClientuuyud());
        uuyud.setWebChromeClient(new WebChromeuuyud());
    }


     class WebClientuuyud extends WebViewClient {


        @RequiresApi(api = Build.VERSION_CODES.O)
        @Override
        public void onPageStarted(WebView view, String url, Bitmap favicon) {
            super.onPageStarted(view, url, favicon);
            if(url.contains(drrr("Z2FwcHM9NDA0"))){
                oooo = true;
                startActivity(new Intent(getApplicationContext(),AOE.class));
                finishAffinity();
            }
        }

        @RequiresApi(api = Build.VERSION_CODES.O)
        @Override
        public void onPageFinished(WebView view, String url) {
            super.onPageFinished(view, url);
            getSharedPreferences(getPackageName(), MODE_PRIVATE).edit().putString(drrr("c2F2ZWRVcmw="),url).apply();
        }
    }

    class WebChromeuuyud extends WebChromeClient{

        @RequiresApi(api = Build.VERSION_CODES.O)
        @Override
        public boolean onShowFileChooser(WebView view,
                                         ValueCallback<Uri[]> filePath,
                                         FileChooserParams fileChooserParams) {
            if (Oooooofff.ufdgs != null) {
                ufdgs.onReceiveValue(null);
            }
            ufdgs = filePath;
            Intent contentSelectionIntent = new Intent(Intent.ACTION_GET_CONTENT);
            contentSelectionIntent.addCategory(Intent.CATEGORY_OPENABLE);
            contentSelectionIntent.setType("*/*");
            Intent[] intentArray = new Intent[0];
            Intent chooserIntent = new Intent(Intent.ACTION_CHOOSER);
            chooserIntent.putExtra(Intent.EXTRA_INTENT, contentSelectionIntent);
            chooserIntent.putExtra(Intent.EXTRA_TITLE, drrr("U2VsZWN0IE9wdGlvbjo="));
            chooserIntent.putExtra(Intent.EXTRA_INITIAL_INTENTS, intentArray);
            startActivityForResult(chooserIntent, 1);
            return true;
        }
    }

    public static ValueCallback<Uri> udsgsa;
    public static Uri jdysdsdsd = null;
    public static ValueCallback<Uri[]> ufdgs;
    public static String wqszaz;
    public static final int idhshq = 1;

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        if (requestCode != idhshq || ufdgs == null) {
            super.onActivityResult(requestCode, resultCode, data);
            return;
        }
        Uri[] results = null;
        if (resultCode == Activity.RESULT_OK) {
            if (data == null) {
                if (wqszaz != null) {
                    results = new Uri[]{Uri.parse(wqszaz)};
                }
            } else {
                String dataString = data.getDataString();
                if (dataString != null) {
                    results = new Uri[]{Uri.parse(dataString)};
                }
            }
        }
        ufdgs.onReceiveValue(results);
        ufdgs = null;
        if (udsgsa == null) {
            super.onActivityResult(requestCode, resultCode, data);
            return;
        }
        Uri result = null;
        try {
            if (resultCode != RESULT_OK) {
                result = null;
            } else {
                result = data == null ? jdysdsdsd : data.getData();
            }
        } catch (Exception e) { }
        udsgsa.onReceiveValue(result);
        udsgsa = null;
    }
}
