package defpackage;

import android.app.Activity;
import android.content.Context;

/* renamed from: fy  reason: default package */
public abstract class fy {
    public static void b(final Context context, final String str, final d3 d3Var, final gy gyVar) {
        if (context != null) {
            if (str != null) {
                if (d3Var != null) {
                    uf0.b("#008 Must be called on the main UI thread.");
                    x92.a(context);
                    if (((Boolean) kb2.i.d()).booleanValue()) {
                        if (((Boolean) w82.d.c.a(x92.K8)).booleanValue()) {
                            jv2.b.execute(new Runnable() { // from class: yj1
                                @Override // java.lang.Runnable
                                public final void run() {
                                    Context context2 = context;
                                    String str2 = str;
                                    d3 d3Var2 = d3Var;
                                    try {
                                        new oi2(context2, str2).f(d3Var2.a, gyVar);
                                    } catch (IllegalStateException e) {
                                        ip2.a(context2).d("InterstitialAd.load", e);
                                    }
                                }
                            });
                            return;
                        }
                    }
                    new oi2(context, str).f(d3Var.a, gyVar);
                    return;
                }
                throw new NullPointerException("AdRequest cannot be null.");
            }
            throw new NullPointerException("AdUnitId cannot be null.");
        }
        throw new NullPointerException("Context cannot be null.");
    }

    public abstract rl0 a();

    public abstract void c(z61 z61Var);

    public abstract void d(boolean z);

    public abstract void e(Activity activity);
}