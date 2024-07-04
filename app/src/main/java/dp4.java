package defpackage;

import android.content.Context;
import android.os.RemoteException;
import android.util.Log;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;

/* renamed from: dp4  reason: default package */
public final class dp4 {
    public static volatile int e = 1;
    public final Context a;
    public final Executor b;
    public final yv0 c;
    public final boolean d;

    public dp4(Context context, ExecutorService executorService, ay5 ay5Var, boolean z) {
        this.a = context;
        this.b = executorService;
        this.c = ay5Var;
        this.d = z;
    }

    public static dp4 a(Context context, ExecutorService executorService, boolean z) {
        Runnable j02Var;
        aw0 aw0Var = new aw0();
        if (z) {
            j02Var = new tx1(3, context, aw0Var);
        } else {
            j02Var = new j02(5, aw0Var);
        }
        executorService.execute(j02Var);
        return new dp4(context, executorService, aw0Var.a, z);
    }

    public final void b(int i, String str) {
        e(i, 0L, null, null, str);
    }

    public final void c(int i, long j, Exception exc) {
        e(i, j, exc, null, null);
    }

    public final void d(long j, int i) {
        e(i, j, null, null, null);
    }

    public final yv0 e(final int i, long j, Exception exc, String str, String str2) {
        if (!this.d) {
            return this.c.f(this.b, da2.U);
        }
        final uw1 w = yw1.w();
        String packageName = this.a.getPackageName();
        w.j();
        yw1.E((yw1) w.Q, packageName);
        w.j();
        yw1.y((yw1) w.Q, j);
        int i2 = e;
        w.j();
        yw1.F((yw1) w.Q, i2);
        if (exc != null) {
            StringWriter stringWriter = new StringWriter();
            exc.printStackTrace(new PrintWriter(stringWriter));
            String stringWriter2 = stringWriter.toString();
            w.j();
            yw1.z((yw1) w.Q, stringWriter2);
            String name = exc.getClass().getName();
            w.j();
            yw1.A((yw1) w.Q, name);
        }
        if (str2 != null) {
            w.j();
            yw1.B((yw1) w.Q, str2);
        }
        if (str != null) {
            w.j();
            yw1.C((yw1) w.Q, str);
        }
        return this.c.f(this.b, new mg() { // from class: cp4
            @Override // defpackage.mg
            public final Object b(yv0 yv0Var) {
                uw1 uw1Var = uw1.this;
                int i3 = i;
                if (yv0Var.l()) {
                    qq4 qq4Var = (qq4) yv0Var.i();
                    byte[] D = ((yw1) uw1Var.h()).D();
                    qq4Var.getClass();
                    try {
                        if (qq4Var.b) {
                            qq4Var.a.p0(D);
                            qq4Var.a.X(0);
                            qq4Var.a.v(i3);
                            qq4Var.a.r0();
                            qq4Var.a.e();
                        }
                    } catch (RemoteException e2) {
                        Log.d("GASS", "Clearcut log failed", e2);
                    }
                    return Boolean.TRUE;
                }
                return Boolean.FALSE;
            }
        });
    }
}