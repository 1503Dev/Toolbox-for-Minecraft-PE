package defpackage;

import android.os.Bundle;

/* renamed from: hj4  reason: default package */
public final class hj4 {
    public static Bundle a(Bundle bundle, String str) {
        Bundle bundle2 = bundle.getBundle(str);
        return bundle2 == null ? new Bundle() : bundle2;
    }

    public static void b(Bundle bundle, String str, String str2) {
        if (str2 != null) {
            bundle.putString(str, str2);
        }
    }

    public static void c(Bundle bundle, String str, String str2, boolean z) {
        if (!z || str2 == null) {
            return;
        }
        bundle.putString(str, str2);
    }

    public static void d(Bundle bundle, String str, boolean z, boolean z2) {
        if (z2) {
            bundle.putBoolean(str, z);
        }
    }
}