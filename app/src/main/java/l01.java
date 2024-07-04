package defpackage;

import android.content.Context;

/* renamed from: l01  reason: default package */
public final class l01 {
    public static l01 e;
    public u9 a;
    public w9 b;
    public n90 c;
    public cu0 d;

    public l01(Context context, bw0 bw0Var) {
        Context applicationContext = context.getApplicationContext();
        this.a = new u9(applicationContext, bw0Var);
        this.b = new w9(applicationContext, bw0Var);
        this.c = new n90(applicationContext, bw0Var);
        this.d = new cu0(applicationContext, bw0Var);
    }

    public static synchronized l01 a(Context context, bw0 bw0Var) {
        l01 l01Var;
        synchronized (l01.class) {
            if (e == null) {
                e = new l01(context, bw0Var);
            }
            l01Var = e;
        }
        return l01Var;
    }
}