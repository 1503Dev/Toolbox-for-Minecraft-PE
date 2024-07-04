package io.mrarm.yurai.msa.ui.web;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.webkit.WebView;
import androidx.appcompat.app.AppCompatActivity;
import io.mrarm.yurai.msa.LegacyToken;
import io.mrarm.yurai.msa.MSASingleton;
import io.mrarm.yurai.msa.ServerConfig;
import io.mrarm.yurai.msa.ui.web.a;

public class WebLoginActivity extends AppCompatActivity implements a.InterfaceC0041a {
    public WebView c0;

    @Override // io.mrarm.yurai.msa.ui.web.a.InterfaceC0041a
    public final void d(kz kzVar) {
        String a = kzVar.a("CID");
        String a2 = kzVar.a("PUID");
        String a3 = kzVar.a("Username");
        LegacyToken b = kzVar.b();
        if (a == null || a2 == null || a3 == null || b == null) {
            finish();
            return;
        }
        Log.d("WebLoginActivity", "Adding account: " + a);
        MSASingleton.getInstance(this).getAccountManager().addAccount(a3, a, a2, b);
        Log.d("WebLoginActivity", "Account added successfully!");
        Intent intent = new Intent();
        intent.putExtra("cid", a);
        setResult(-1, intent);
        finish();
    }

    @Override // io.mrarm.yurai.msa.ui.web.a.InterfaceC0041a
    public final void g() {
        finish();
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    @SuppressLint({"SetJavaScriptEnabled"})
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        WebView webView = new WebView(this);
        this.c0 = webView;
        webView.getSettings().setJavaScriptEnabled(true);
        this.c0.addJavascriptInterface(new a(this), "external");
        Intent intent = getIntent();
        Uri.Builder buildUpon = Uri.parse(ServerConfig.getInlineConnectPartnerUrl()).buildUpon();
        buildUpon.appendQueryParameter("platform", "android2.1.0504.0524");
        if (intent.hasExtra("client_id")) {
            buildUpon.appendQueryParameter("client_id", intent.getStringExtra("client_id"));
        }
        if (intent.hasExtra("cobrandid")) {
            buildUpon.appendQueryParameter("cobrandid", intent.getStringExtra("cobrandid"));
        }
        String uri = buildUpon.build().toString();
        Log.d("WebLoginActivity", "Sign in url is: " + uri);
        this.c0.loadUrl(uri);
        setContentView(this.c0);
    }
}