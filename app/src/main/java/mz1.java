package defpackage;

import android.os.Build;
import android.os.ConditionVariable;
import android.os.RemoteException;
import android.util.Log;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

/* renamed from: mz1  reason: default package */
public final class mz1 {
    public static final ConditionVariable c = new ConditionVariable();
    public static volatile qq4 d = null;
    public static volatile Random e = null;
    public final l02 a;
    public volatile Boolean b;

    public mz1(l02 l02Var) {
        this.a = l02Var;
        l02Var.b.execute(new lz1(0, this));
    }

    public static final int b() {
        try {
            if (Build.VERSION.SDK_INT >= 21) {
                return ThreadLocalRandom.current().nextInt();
            }
            if (e == null) {
                synchronized (mz1.class) {
                    if (e == null) {
                        e = new Random();
                    }
                }
            }
            return e.nextInt();
        } catch (RuntimeException unused) {
            if (e == null) {
                synchronized (mz1.class) {
                    if (e == null) {
                        e = new Random();
                    }
                }
            }
            return e.nextInt();
        }
    }

    public final void a(int i, int i2, long j, String str, Exception exc) {
        try {
            c.block();
            if (this.b.booleanValue() && d != null) {
                uw1 w = yw1.w();
                String packageName = this.a.a.getPackageName();
                w.j();
                yw1.E((yw1) w.Q, packageName);
                w.j();
                yw1.y((yw1) w.Q, j);
                if (str != null) {
                    w.j();
                    yw1.B((yw1) w.Q, str);
                }
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
                qq4 qq4Var = d;
                byte[] D = ((yw1) w.h()).D();
                qq4Var.getClass();
                if (i2 == -1) {
                    i2 = 0;
                }
                try {
                    if (qq4Var.b) {
                        qq4Var.a.p0(D);
                        qq4Var.a.X(i2);
                        qq4Var.a.v(i);
                        qq4Var.a.r0();
                        qq4Var.a.e();
                    }
                } catch (RemoteException e2) {
                    Log.d("GASS", "Clearcut log failed", e2);
                }
            }
        } catch (Exception unused) {
        }
    }
}