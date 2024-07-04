package defpackage;

import android.content.Context;
import android.os.StrictMode;
import java.util.concurrent.Callable;

/* renamed from: lx2  reason: default package */
public final class lx2 {
    @Deprecated
    public static Object a(Context context, Callable callable) {
        try {
            StrictMode.ThreadPolicy threadPolicy = StrictMode.getThreadPolicy();
            StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder(threadPolicy).permitDiskReads().permitDiskWrites().build());
            Object call = callable.call();
            StrictMode.setThreadPolicy(threadPolicy);
            return call;
        } catch (Throwable th) {
            sv2.e("Unexpected exception.", th);
            ip2.a(context).d("StrictModeUtil.runWithLaxStrictMode", th);
            return null;
        }
    }
}