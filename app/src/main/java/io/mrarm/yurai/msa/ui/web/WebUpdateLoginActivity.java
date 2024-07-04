package io.mrarm.yurai.msa.ui.web;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.webkit.WebView;
import androidx.appcompat.app.AppCompatActivity;
import io.mrarm.yurai.msa.Account;
import io.mrarm.yurai.msa.AccountManager;
import io.mrarm.yurai.msa.LegacyToken;
import io.mrarm.yurai.msa.MSASingleton;
import io.mrarm.yurai.msa.ui.web.a;

public class WebUpdateLoginActivity extends AppCompatActivity implements a.InterfaceC0041a {
    public String c0;
    public WebView d0;

    @Override // io.mrarm.yurai.msa.ui.web.a.InterfaceC0041a
    public final void d(kz kzVar) {
        String a = kzVar.a("CID");
        if (a != null && !a.equals(this.c0)) {
            Log.e("WebUpdateLoginActivity", "Different account returned");
            r("Different account returned");
            return;
        }
        try {
            Account findAccount = MSASingleton.getInstance(this).getAccountManager().findAccount(this.c0);
            String a2 = kzVar.a("PUID");
            if (a2 != null && a2.equals(findAccount.getPUID())) {
                String a3 = kzVar.a("Username");
                LegacyToken b = kzVar.b();
                if (a3 != null && b != null) {
                    StringBuilder b2 = e5.b("Updating account details: ");
                    b2.append(this.c0);
                    Log.d("WebLoginActivity", b2.toString());
                    findAccount.updateDetails(a3, b);
                    Log.d("WebLoginActivity", "Account details updated successfully!");
                    setResult(-1);
                    finish();
                    return;
                }
                Log.e("WebUpdateLoginActivity", "No username or token");
                r("No username or token");
                return;
            }
            Log.e("WebUpdateLoginActivity", "PUID does not match");
            r("PUID does not match");
        } catch (AccountManager.NoSuchAccountException unused) {
            Log.e("WebUpdateLoginActivity", "Failed to find account");
            r("Failed to find account");
        }
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
        this.d0 = webView;
        webView.getSettings().setJavaScriptEnabled(true);
        this.d0.addJavascriptInterface(new a(this), "external");
        this.c0 = getIntent().getStringExtra("cid");
        String stringExtra = getIntent().getStringExtra("url");
        Log.d("WebUpdateLoginActivity", "Sign in url is: " + stringExtra);
        this.d0.loadUrl(stringExtra);
        setContentView(this.d0);
    }

    public final void r(String str) {
        Intent intent = new Intent();
        intent.putExtra("error", str);
        setResult(1, intent);
        finish();
    }
}