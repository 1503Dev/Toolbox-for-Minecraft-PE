package defpackage;

import android.content.Context;
import android.os.SystemClock;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;

/* renamed from: m02  reason: default package */
public final class m02 {
    public long a = -1;
    public long b = -1;
    public long c = -1;
    public long d = -1;
    public long e = -1;
    public long f = -1;
    public long g = -1;
    public long h = -1;

    /* JADX WARN: Code restructure failed: missing block: B:25:0x00c7, code lost:
        if (r9.contains("REWARDED") != false) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x00ca, code lost:
        if (r8 == false) goto L30;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(Context context, View view) {
        this.d = this.c;
        this.c = SystemClock.uptimeMillis();
        long j = this.e;
        if (j != -1) {
            this.f = j;
        }
        Display defaultDisplay = ((WindowManager) context.getSystemService("window")).getDefaultDisplay();
        DisplayMetrics displayMetrics = new DisplayMetrics();
        try {
            defaultDisplay.getRealMetrics(displayMetrics);
        } catch (NoSuchMethodError unused) {
            defaultDisplay.getMetrics(displayMetrics);
        }
        int i = displayMetrics.widthPixels * displayMetrics.heightPixels;
        if (view != null) {
            int min = Math.min(view.getHeight(), displayMetrics.heightPixels) * Math.min(view.getWidth(), displayMetrics.widthPixels);
            if (min + min < i) {
                if (min == 0) {
                    boolean z = false;
                    try {
                        if (view.getClass().getName().contains("DebugGestureViewWrapper")) {
                            view = ((ViewGroup) view).getChildAt(0);
                        }
                        Object invoke = view.getClass().getMethod("getAdConfiguration", new Class[0]).invoke(view, new Object[0]);
                        String str = (String) invoke.getClass().getMethod("adTypeToString", Integer.TYPE).invoke(null, Integer.valueOf(((Integer) invoke.getClass().getField("adType").get(invoke)).intValue()));
                        if (!str.contains("INTERSTITIAL") && !str.contains("APP_OPEN")) {
                        }
                        z = true;
                    } catch (ReflectiveOperationException | SecurityException unused2) {
                    }
                }
            }
            this.e = this.c;
            return;
        }
        this.e = -1L;
    }
}