package io.mrarm.mctoolbox;

import android.app.Activity;
import android.os.Bundle;
import android.webkit.WebView;

public class OssActivity extends Activity {
    @Override // android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        WebView webView = new WebView(this);
        setContentView(webView);
        webView.loadUrl("file:///android_asset/oss.html");
    }
}