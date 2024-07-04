package defpackage;

import android.content.Context;
import java.util.concurrent.Executors;

/* renamed from: c25  reason: default package */
public final /* synthetic */ class c25 implements Runnable {
    public final /* synthetic */ int P;
    public final /* synthetic */ boolean Q;
    public final /* synthetic */ Object R;

    public /* synthetic */ c25(Object obj, boolean z, int i) {
        this.P = i;
        this.R = obj;
        this.Q = z;
    }

    @Override // java.lang.Runnable
    public final void run() {
        kz1 a;
        switch (this.P) {
            case 0:
                el5 el5Var = (el5) this.R;
                boolean z = this.Q;
                el5Var.getClass();
                long currentTimeMillis = System.currentTimeMillis();
                try {
                    String str = el5Var.a0.P;
                    Context context = el5Var.Y;
                    Context applicationContext = context.getApplicationContext();
                    if (applicationContext != null) {
                        context = applicationContext;
                    }
                    boolean z2 = el5Var.b0;
                    synchronized (kz1.class) {
                        a = kz1.a(str, context, Executors.newCachedThreadPool(), z, z2);
                    }
                    a.l();
                    return;
                } catch (NullPointerException e) {
                    el5Var.W.c(2027, System.currentTimeMillis() - currentTimeMillis, e);
                    return;
                }
            default:
                String[] strArr = {"isVisible", String.valueOf(this.Q)};
                int i = vx2.k0;
                ((vx2) this.R).c("windowVisibilityChanged", strArr);
                return;
        }
    }
}