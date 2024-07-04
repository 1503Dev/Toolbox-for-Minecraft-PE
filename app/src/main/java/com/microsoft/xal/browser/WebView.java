package com.microsoft.xal.browser;

import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.util.Log;
import android.webkit.CookieManager;
import io.mrarm.yurai.xal.XalLoginActivity;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;

public class WebView {
    public static final String DEFAULT_BROWSER_INFO = "webkit";
    public static final int SHOW_ADDITIONAL_UI = 3;
    public static final int SHOW_DELETE_COOKIES = 1;
    public static final int SHOW_DELETE_COOKIES_ALT = 2;
    public static final int SHOW_NORMAL = 0;

    public static void showUrl(long j, Context context, String str, String str2, int i, boolean z, long j2) {
        showUrlInternal(j, context, str, str2, i, null, null, false);
    }

    public static void showUrlInternal(long j, Context context, String str, String str2, int i, String[] strArr, String[] strArr2, boolean z) {
        Log.d("WebView", "showUrl: type=" + i);
        if (i != 1 && i != 2) {
            if (str.startsWith("https://sisu.xboxlive.com/client/v8/0000000048183522/view/splash.html?msa=")) {
                try {
                    str = URLDecoder.decode(str.substring(74), "UTF-8");
                } catch (UnsupportedEncodingException unused) {
                }
            }
            Intent intent = new Intent(context, XalLoginActivity.class);
            intent.putExtra("native_op", j);
            intent.putExtra("start_url", str);
            intent.putExtra("end_url", str2);
            if (strArr != null && strArr2 != null) {
                intent.putExtra("header_keys", strArr);
                intent.putExtra("header_vals", strArr2);
            }
            intent.putExtra("browser_launch_activity_natives", z);
            context.startActivity(intent);
            return;
        }
        int i2 = XalLoginActivity.h0;
        String[] strArr3 = {"login.live.com", "account.live.com", "live.com", "xboxlive.com", "sisu.xboxlive.com"};
        int i3 = 0;
        int i4 = 0;
        while (i4 < 5) {
            String str3 = strArr3[i4];
            CookieManager cookieManager = CookieManager.getInstance();
            String cookie = cookieManager.getCookie("https://" + str3);
            if (cookie != null) {
                String[] split = cookie.split(";");
                int length = split.length;
                int i5 = 0;
                while (i5 < length) {
                    String str4 = split[i5];
                    int indexOf = str4.indexOf("=");
                    if (indexOf != -1) {
                        String trim = str4.substring(i3, indexOf).trim();
                        Log.d("XalLoginActivity", "Deleting cookie: " + str4);
                        cookieManager.setCookie("https://" + str3, ho.b(trim, "=;Expires=Thu, 01 Jan 1970 00:00:01 GMT;Domain=", str3, ";Path=/"));
                    }
                    i5++;
                    i3 = 0;
                }
            }
            i4++;
            i3 = 0;
        }
        if (Build.VERSION.SDK_INT >= 21) {
            CookieManager.getInstance().flush();
        }
        if (z) {
            BrowserLaunchActivity.urlOperationSucceeded(j, str2, false, DEFAULT_BROWSER_INFO);
        } else {
            urlOperationSucceeded(j, str2, false, DEFAULT_BROWSER_INFO);
        }
    }

    public static native void urlOperationCanceled(long j, boolean z, String str);

    public static native void urlOperationFailed(long j, boolean z, String str);

    public static native void urlOperationSucceeded(long j, String str, boolean z, String str2);
}