package com.google.ads.consent;

import android.annotation.TargetApi;
import android.app.Activity;
import android.app.Dialog;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.text.TextUtils;
import android.util.Base64;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import defpackage.cy0;
import java.io.ByteArrayOutputStream;
import java.net.URL;
import java.util.HashMap;
import java.util.HashSet;

public class ConsentForm {
    private final boolean adFreeOption;
    private final URL appPrivacyPolicyURL;
    private final Context context;
    private final Dialog dialog;
    private final ConsentFormListener listener;
    private LoadState loadState;
    private final boolean nonPersonalizedAdsOption;
    private final boolean personalizedAdsOption;
    private final WebView webView;

    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public static class Builder {
        private final URL appPrivacyPolicyURL;
        private final Context context;
        private ConsentFormListener listener;
        private boolean personalizedAdsOption = false;
        private boolean nonPersonalizedAdsOption = false;
        private boolean adFreeOption = false;

        public Builder(Activity activity, URL url) {
            this.context = activity;
            this.appPrivacyPolicyURL = url;
            if (url == null) {
                throw new IllegalArgumentException("Must provide valid app privacy policy url to create a ConsentForm");
            }
        }

        public final void g(cy0.b bVar) {
            this.listener = bVar;
        }

        public final void h() {
            this.nonPersonalizedAdsOption = true;
        }

        public final void i() {
            this.personalizedAdsOption = true;
        }
    }

    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public enum LoadState {
        NOT_READY,
        LOADING,
        LOADED
    }

    public ConsentForm(Builder builder) {
        Context context = builder.context;
        this.context = context;
        this.listener = builder.listener == null ? new ConsentFormListener() { // from class: com.google.ads.consent.ConsentForm.1
        } : builder.listener;
        this.personalizedAdsOption = builder.personalizedAdsOption;
        this.nonPersonalizedAdsOption = builder.nonPersonalizedAdsOption;
        this.adFreeOption = builder.adFreeOption;
        this.appPrivacyPolicyURL = builder.appPrivacyPolicyURL;
        Dialog dialog = new Dialog(context, 16973840);
        this.dialog = dialog;
        this.loadState = LoadState.NOT_READY;
        WebView webView = new WebView(context);
        this.webView = webView;
        webView.setBackgroundColor(0);
        dialog.setContentView(webView);
        dialog.setCancelable(false);
        webView.getSettings().setJavaScriptEnabled(true);
        webView.setWebViewClient(new WebViewClient() { // from class: com.google.ads.consent.ConsentForm.2
            public boolean isInternalRedirect;

            public static boolean b(String str) {
                return !TextUtils.isEmpty(str) && str.startsWith("consent://");
            }

            public final void a(String str) {
                char c;
                if (b(str)) {
                    this.isInternalRedirect = true;
                    Uri parse = Uri.parse(str);
                    String queryParameter = parse.getQueryParameter("action");
                    String queryParameter2 = parse.getQueryParameter("status");
                    String queryParameter3 = parse.getQueryParameter("url");
                    queryParameter.getClass();
                    int hashCode = queryParameter.hashCode();
                    if (hashCode == -1370505102) {
                        if (queryParameter.equals("load_complete")) {
                            c = 0;
                        }
                        c = 65535;
                    } else if (hashCode != 150940456) {
                        if (hashCode == 1671672458 && queryParameter.equals("dismiss")) {
                            c = 2;
                        }
                        c = 65535;
                    } else {
                        if (queryParameter.equals("browser")) {
                            c = 1;
                        }
                        c = 65535;
                    }
                    if (c == 0) {
                        ConsentForm.c(ConsentForm.this, queryParameter2);
                    } else if (c == 1) {
                        ConsentForm.e(ConsentForm.this, queryParameter3);
                    } else if (c != 2) {
                    } else {
                        this.isInternalRedirect = false;
                        ConsentForm.d(ConsentForm.this, queryParameter2);
                    }
                }
            }

            @Override // android.webkit.WebViewClient
            public final void onLoadResource(WebView webView2, String str) {
                a(str);
            }

            @Override // android.webkit.WebViewClient
            public final void onPageFinished(WebView webView2, String str) {
                if (!this.isInternalRedirect) {
                    ConsentForm.f(ConsentForm.this, webView2);
                }
                super.onPageFinished(webView2, str);
            }

            @Override // android.webkit.WebViewClient
            public final void onReceivedError(WebView webView2, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
                super.onReceivedError(webView2, webResourceRequest, webResourceError);
                ConsentForm.this.loadState = LoadState.NOT_READY;
                ConsentFormListener consentFormListener = ConsentForm.this.listener;
                webResourceError.toString();
                consentFormListener.b();
            }

            @Override // android.webkit.WebViewClient
            @TargetApi(24)
            public final boolean shouldOverrideUrlLoading(WebView webView2, WebResourceRequest webResourceRequest) {
                String uri = webResourceRequest.getUrl().toString();
                if (b(uri)) {
                    a(uri);
                    return true;
                }
                return false;
            }

            @Override // android.webkit.WebViewClient
            public final boolean shouldOverrideUrlLoading(WebView webView2, String str) {
                if (b(str)) {
                    a(str);
                    return true;
                }
                return false;
            }
        });
    }

    public static void c(ConsentForm consentForm, String str) {
        consentForm.getClass();
        if (TextUtils.isEmpty(str) || str.contains("Error")) {
            consentForm.loadState = LoadState.NOT_READY;
            consentForm.listener.b();
            return;
        }
        consentForm.loadState = LoadState.LOADED;
        consentForm.listener.c();
    }

    public static void d(ConsentForm consentForm, String str) {
        ConsentStatus consentStatus;
        HashSet<AdProvider> a;
        consentForm.loadState = LoadState.NOT_READY;
        consentForm.dialog.dismiss();
        if (TextUtils.isEmpty(str) || str.contains("Error")) {
            consentForm.listener.b();
            return;
        }
        char c = 65535;
        switch (str.hashCode()) {
            case -1152655096:
                if (str.equals("ad_free")) {
                    c = 0;
                    break;
                }
                break;
            case -258041904:
                if (str.equals("personalized")) {
                    c = 1;
                    break;
                }
                break;
            case 1666911234:
                if (str.equals("non_personalized")) {
                    c = 2;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
            default:
                consentStatus = ConsentStatus.UNKNOWN;
                break;
            case 1:
                consentStatus = ConsentStatus.PERSONALIZED;
                break;
            case 2:
                consentStatus = ConsentStatus.NON_PERSONALIZED;
                break;
        }
        ConsentInformation e = ConsentInformation.e(consentForm.context);
        synchronized (e) {
            ConsentData i = e.i();
            if (consentStatus == ConsentStatus.UNKNOWN) {
                a = new HashSet<>();
            } else {
                a = i.a();
            }
            i.l(a);
            i.j("form");
            i.k(consentStatus);
            e.k(i);
        }
        consentForm.listener.a(consentStatus);
    }

    public static void e(ConsentForm consentForm, String str) {
        consentForm.getClass();
        if (!TextUtils.isEmpty(str)) {
            try {
                consentForm.context.startActivity(new Intent("android.intent.action.VIEW", Uri.parse(str)));
                return;
            } catch (ActivityNotFoundException unused) {
            }
        }
        consentForm.listener.b();
    }

    public static void f(ConsentForm consentForm, WebView webView) {
        String str;
        consentForm.getClass();
        HashMap hashMap = new HashMap();
        Context context = consentForm.context;
        hashMap.put("app_name", context.getApplicationInfo().loadLabel(context.getPackageManager()).toString());
        Context context2 = consentForm.context;
        Drawable applicationIcon = context2.getPackageManager().getApplicationIcon(context2.getApplicationInfo());
        Bitmap createBitmap = Bitmap.createBitmap(applicationIcon.getIntrinsicWidth(), applicationIcon.getIntrinsicHeight(), Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        applicationIcon.setBounds(0, 0, canvas.getWidth(), canvas.getHeight());
        applicationIcon.draw(canvas);
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        createBitmap.compress(Bitmap.CompressFormat.PNG, 100, byteArrayOutputStream);
        String valueOf = String.valueOf(Base64.encodeToString(byteArrayOutputStream.toByteArray(), 0));
        if (valueOf.length() != 0) {
            str = "data:image/png;base64,".concat(valueOf);
        } else {
            str = new String("data:image/png;base64,");
        }
        hashMap.put("app_icon", str);
        hashMap.put("offer_personalized", Boolean.valueOf(consentForm.personalizedAdsOption));
        hashMap.put("offer_non_personalized", Boolean.valueOf(consentForm.nonPersonalizedAdsOption));
        hashMap.put("offer_ad_free", Boolean.valueOf(consentForm.adFreeOption));
        hashMap.put("is_request_in_eea_or_unknown", Boolean.valueOf(ConsentInformation.e(consentForm.context).g()));
        hashMap.put("app_privacy_url", consentForm.appPrivacyPolicyURL);
        ConsentData i = ConsentInformation.e(consentForm.context).i();
        hashMap.put("plat", i.d());
        hashMap.put("consent_info", i);
        String i2 = new xt().i(hashMap);
        HashMap hashMap2 = new HashMap();
        hashMap2.put("info", i2);
        HashMap hashMap3 = new HashMap();
        hashMap3.put("args", hashMap2);
        webView.loadUrl(String.format("javascript:%s(%s)", "setUpConsentDialog", new xt().i(hashMap3)));
    }

    public final void g() {
        LoadState loadState = this.loadState;
        LoadState loadState2 = LoadState.LOADING;
        if (loadState == loadState2) {
            this.listener.b();
        } else if (loadState == LoadState.LOADED) {
            this.listener.c();
        } else {
            this.loadState = loadState2;
            this.webView.loadUrl("file:///android_asset/consentform.html");
        }
    }

    public final void h() {
        boolean h;
        ConsentFormListener consentFormListener;
        if (this.loadState != LoadState.LOADED) {
            consentFormListener = this.listener;
        } else {
            ConsentInformation e = ConsentInformation.e(this.context);
            synchronized (e) {
                h = e.i().h();
            }
            if (h) {
                consentFormListener = this.listener;
            } else {
                this.dialog.getWindow().setLayout(-1, -1);
                this.dialog.getWindow().setBackgroundDrawable(new ColorDrawable(0));
                this.dialog.setOnShowListener(new DialogInterface.OnShowListener() { // from class: com.google.ads.consent.ConsentForm.3
                    @Override // android.content.DialogInterface.OnShowListener
                    public final void onShow(DialogInterface dialogInterface) {
                        ConsentForm.this.listener.getClass();
                    }
                });
                this.dialog.show();
                if (!this.dialog.isShowing()) {
                    this.listener.b();
                    return;
                }
                return;
            }
        }
        consentFormListener.b();
    }
}