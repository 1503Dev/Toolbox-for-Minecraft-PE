package defpackage;

import android.content.Context;
import java.io.File;
import java.util.HashMap;
import java.util.Map;
import javax.annotation.ParametersAreNonnullByDefault;

@ParametersAreNonnullByDefault
/* renamed from: dl2  reason: default package */
public final class dl2 {
    public static jv1 a;
    public static final Object b = new Object();

    public dl2(Context context) {
        jv1 jv1Var;
        context = context.getApplicationContext() != null ? context.getApplicationContext() : context;
        synchronized (b) {
            try {
                if (a == null) {
                    x92.a(context);
                    if (((Boolean) w82.d.c.a(x92.E3)).booleanValue()) {
                        jv1Var = new jv1(new aw1(new File(context.getCacheDir(), "admob_volley")), new n52(context));
                        jv1Var.c();
                    } else {
                        jv1Var = new jv1(new aw1(new ln1(context.getApplicationContext())), new tv1());
                        jv1Var.c();
                    }
                    a = jv1Var;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static ri2 a(int i, String str, HashMap hashMap, byte[] bArr) {
        ri2 ri2Var = new ri2();
        hf2 hf2Var = new hf2(str, ri2Var);
        rv2 rv2Var = new rv2();
        fg2 fg2Var = new fg2(i, str, ri2Var, hf2Var, bArr, hashMap, rv2Var);
        if (rv2.c()) {
            try {
                Map f = fg2Var.f();
                if (bArr == null) {
                    bArr = null;
                }
                if (rv2.c()) {
                    rv2Var.d("onNetworkRequest", new pv2(str, "GET", f, bArr));
                }
            } catch (mu1 e) {
                sv2.g(e.getMessage());
            }
        }
        a.a(fg2Var);
        return ri2Var;
    }
}