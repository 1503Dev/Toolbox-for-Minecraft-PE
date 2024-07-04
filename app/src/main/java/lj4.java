package defpackage;

import android.content.Context;

/* renamed from: lj4  reason: default package */
public final class lj4 {
    public static void a(Context context, boolean z) {
        String str;
        if (z) {
            str = "This request is sent from a test device.";
        } else {
            mv2 mv2Var = n62.f.a;
            str = "Use RequestConfiguration.Builder().setTestDeviceIds(Arrays.asList(\"" + mv2.l(context) + "\")) to get test ads on this device.";
        }
        sv2.f(str);
    }

    public static void b(int i, String str, Throwable th) {
        sv2.f("Ad failed to load : " + i);
        vz3.l(str, th);
        if (i == 3) {
            return;
        }
        jv5.A.g.e(str, th);
    }
}