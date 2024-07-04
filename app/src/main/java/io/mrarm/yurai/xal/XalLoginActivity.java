package io.mrarm.yurai.xal;

import android.os.Bundle;
import android.util.Log;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import androidx.appcompat.app.AppCompatActivity;
import com.microsoft.xal.browser.BrowserLaunchActivity;
import java.util.HashMap;

public class XalLoginActivity extends AppCompatActivity {
    public static final /* synthetic */ int h0 = 0;
    public WebView c0;
    public long d0;
    public String e0;
    public boolean f0;
    public boolean g0;

    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public class a extends WebViewClient {
        public a() {
        }

        @Override // android.webkit.WebViewClient
        public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
            if (!str.startsWith(XalLoginActivity.this.e0)) {
                return false;
            }
            Log.d("XalLoginActivity", "Reached endUrl: " + str);
            XalLoginActivity xalLoginActivity = XalLoginActivity.this;
            if (xalLoginActivity.g0) {
                BrowserLaunchActivity.urlOperationSucceeded(xalLoginActivity.d0, str, false, com.microsoft.xal.browser.WebView.DEFAULT_BROWSER_INFO);
            } else {
                com.microsoft.xal.browser.WebView.urlOperationSucceeded(xalLoginActivity.d0, str, false, com.microsoft.xal.browser.WebView.DEFAULT_BROWSER_INFO);
            }
            XalLoginActivity xalLoginActivity2 = XalLoginActivity.this;
            xalLoginActivity2.f0 = true;
            xalLoginActivity2.finish();
            return true;
        }
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.d0 = getIntent().getLongExtra("native_op", 0L);
        String stringExtra = getIntent().getStringExtra("start_url");
        this.e0 = getIntent().getStringExtra("end_url");
        this.g0 = getIntent().getBooleanExtra("browser_launch_activity_natives", false);
        String[] stringArrayExtra = getIntent().getStringArrayExtra("header_keys");
        String[] stringArrayExtra2 = getIntent().getStringArrayExtra("header_vals");
        HashMap hashMap = new HashMap();
        if (stringArrayExtra != null && stringArrayExtra2 != null && stringArrayExtra.length == stringArrayExtra2.length) {
            for (int i = 0; i < stringArrayExtra.length; i++) {
                hashMap.put(stringArrayExtra[i], stringArrayExtra2[i]);
            }
        }
        WebView webView = new WebView(this);
        this.c0 = webView;
        webView.getSettings().setJavaScriptEnabled(true);
        this.c0.setWebViewClient(new a());
        Log.d("XalLoginActivity", "Sign in url is: " + stringExtra);
        Log.d("XalLoginActivity", "End url is: " + this.e0);
        this.c0.loadUrl(stringExtra, hashMap);
        setContentView(this.c0);
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onDestroy() {
        super.onDestroy();
        if (this.f0) {
            return;
        }
        boolean z = this.g0;
        long j = this.d0;
        if (z) {
            BrowserLaunchActivity.urlOperationCanceled(j, false, com.microsoft.xal.browser.WebView.DEFAULT_BROWSER_INFO);
        } else {
            com.microsoft.xal.browser.WebView.urlOperationCanceled(j, false, com.microsoft.xal.browser.WebView.DEFAULT_BROWSER_INFO);
        }
    }
}