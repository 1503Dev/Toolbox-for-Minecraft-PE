package defpackage;

import android.util.Log;
import java.util.Iterator;

/* renamed from: vz3  reason: default package */
public final class vz3 extends sv2 {
    public static void k(String str) {
        if (m()) {
            if (str != null && str.length() > 4000) {
                Iterator b = sv2.a.b(str);
                boolean z = true;
                while (b.hasNext()) {
                    String str2 = (String) b.next();
                    if (z) {
                        Log.v("Ads", str2);
                    } else {
                        Log.v("Ads-cont", str2);
                    }
                    z = false;
                }
                return;
            }
            Log.v("Ads", str);
        }
    }

    public static void l(String str, Throwable th) {
        if (m()) {
            Log.v("Ads", str, th);
        }
    }

    public static boolean m() {
        return sv2.j(2) && ((Boolean) rb2.a.d()).booleanValue();
    }
}