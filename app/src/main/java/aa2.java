package defpackage;

import android.os.StrictMode;

/* renamed from: aa2  reason: default package */
public final class aa2 {
    public static Object a(qt4 qt4Var) {
        StrictMode.ThreadPolicy threadPolicy = StrictMode.getThreadPolicy();
        try {
            StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder(threadPolicy).permitDiskReads().permitDiskWrites().build());
            return qt4Var.a();
        } finally {
            StrictMode.setThreadPolicy(threadPolicy);
        }
    }
}