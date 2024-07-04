package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.res.Configuration;
import android.media.AudioManager;
import android.os.Process;
import android.telephony.TelephonyManager;
import android.webkit.CookieManager;
import android.webkit.CookieSyncManager;
import android.webkit.WebResourceResponse;
import java.io.InputStream;
import java.util.HashMap;

/* renamed from: ck1  reason: default package */
public class ck1 {
    public ck1() {
    }

    public /* synthetic */ ck1(int i) {
    }

    public int a() {
        return 1;
    }

    public CookieManager b(Context context) {
        boolean z;
        cu5 cu5Var = jv5.A.c;
        int myUid = Process.myUid();
        if (myUid != 0 && myUid != 1000) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            return null;
        }
        try {
            CookieSyncManager.createInstance(context);
            return CookieManager.getInstance();
        } catch (Throwable th) {
            sv2.e("Failed to obtain CookieManager.", th);
            jv5.A.g.f("ApiLevelUtil.getCookieManager", th);
            return null;
        }
    }

    public WebResourceResponse c(String str, String str2, int i, String str3, HashMap hashMap, InputStream inputStream) {
        return new WebResourceResponse(str, str2, inputStream);
    }

    public g13 d(l13 l13Var, j52 j52Var, boolean z) {
        return new v13(l13Var, j52Var, z);
    }

    public boolean e(Activity activity, Configuration configuration) {
        return false;
    }

    public void f(Context context) {
    }

    public boolean g(Context context) {
        return false;
    }

    public int h(Context context, TelephonyManager telephonyManager) {
        return 1001;
    }

    public int i(AudioManager audioManager) {
        return 0;
    }

    public void j(Activity activity) {
    }

    public int k(Context context) {
        return ((TelephonyManager) context.getSystemService("phone")).getNetworkType();
    }
}