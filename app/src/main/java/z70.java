package defpackage;

import defpackage.iy0;
import io.mrarm.mctoolbox.ui.d;

/* renamed from: z70  reason: default package */
public abstract class z70 {
    public static y70 a;

    public static synchronized void a(long j) {
        byte[] z0;
        ze K0;
        synchronized (z70.class) {
            y70 y70Var = a;
            if (y70Var != null) {
                iy0.a aVar = new iy0.a(j);
                z0 = iy0.z0(j);
                K0 = iy0.K0(z0);
                h21.a(new r80((d) y70Var, aVar, K0));
            }
        }
    }

    public static synchronized void b(int i, int i2, int i3) {
        synchronized (z70.class) {
            y70 y70Var = a;
            if (y70Var != null) {
                ((d) y70Var).g(i, i2, i3);
            }
        }
    }

    public static synchronized void c() {
        synchronized (z70.class) {
            y70 y70Var = a;
            if (y70Var != null) {
                ((d) y70Var).h();
            }
        }
    }

    public static synchronized y70 d() {
        y70 y70Var;
        synchronized (z70.class) {
            y70Var = a;
        }
        return y70Var;
    }

    public static synchronized void e(y70 y70Var) {
        synchronized (z70.class) {
            a = y70Var;
        }
    }
}