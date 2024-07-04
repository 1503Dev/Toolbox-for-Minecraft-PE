package defpackage;

import android.content.Context;
import android.util.Log;

/* renamed from: wg  reason: default package */
public final class wg {
    public static void a(Context context, Throwable th) {
        try {
            uf0.f(context);
        } catch (Exception e) {
            Log.e("CrashUtils", "Error adding exception to DropBox!", e);
        }
    }
}