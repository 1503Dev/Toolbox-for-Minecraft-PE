package defpackage;

import android.content.Context;
import android.os.Binder;
import android.os.Build;
import java.util.HashMap;
import java.util.concurrent.TimeUnit;

/* renamed from: rm4  reason: default package */
public final class rm4 implements Runnable {
    public static Boolean W;
    public final Context P;
    public final xv2 Q;
    public String S;
    public int T;
    public final yq3 U;
    public final um4 R = xm4.x();
    public boolean V = false;

    public rm4(Context context, xv2 xv2Var, yq3 yq3Var, o7 o7Var) {
        this.P = context;
        this.Q = xv2Var;
        this.U = yq3Var;
    }

    public static synchronized boolean b() {
        boolean booleanValue;
        Boolean valueOf;
        synchronized (rm4.class) {
            if (W == null) {
                if (((Boolean) fb2.b.d()).booleanValue()) {
                    valueOf = Boolean.valueOf(Math.random() < ((Double) fb2.a.d()).doubleValue());
                } else {
                    valueOf = Boolean.FALSE;
                }
                W = valueOf;
            }
            booleanValue = W.booleanValue();
        }
        return booleanValue;
    }

    public final synchronized void c(nm4 nm4Var) {
        String str;
        mn2 mn2Var;
        if (!this.V) {
            d();
        }
        if (!b()) {
            return;
        }
        if (nm4Var == null) {
            return;
        }
        if (((xm4) this.R.Q).w() >= ((Integer) w82.d.c.a(x92.q7)).intValue()) {
            return;
        }
        um4 um4Var = this.R;
        vm4 w = wm4.w();
        sm4 w2 = tm4.w();
        int i = nm4Var.k;
        w2.j();
        tm4.P((tm4) w2.Q, i);
        boolean z = nm4Var.b;
        w2.j();
        tm4.C((tm4) w2.Q, z);
        long j = nm4Var.a;
        w2.j();
        tm4.I((tm4) w2.Q, j);
        w2.j();
        tm4.S((tm4) w2.Q);
        String str2 = this.Q.P;
        w2.j();
        tm4.y((tm4) w2.Q, str2);
        String str3 = this.S;
        w2.j();
        tm4.z((tm4) w2.Q, str3);
        String str4 = Build.VERSION.RELEASE;
        w2.j();
        tm4.A((tm4) w2.Q, str4);
        int i2 = Build.VERSION.SDK_INT;
        w2.j();
        tm4.B((tm4) w2.Q, i2);
        int i3 = nm4Var.m;
        w2.j();
        tm4.Q((tm4) w2.Q, i3);
        int i4 = nm4Var.c;
        w2.j();
        tm4.E((tm4) w2.Q, i4);
        w2.j();
        tm4.F((tm4) w2.Q, this.T);
        int i5 = nm4Var.l;
        w2.j();
        tm4.R((tm4) w2.Q, i5);
        String str5 = nm4Var.d;
        w2.j();
        tm4.G((tm4) w2.Q, str5);
        String str6 = nm4Var.e;
        w2.j();
        tm4.H((tm4) w2.Q, str6);
        String str7 = nm4Var.f;
        w2.j();
        tm4.J((tm4) w2.Q, str7);
        xq3 a = this.U.a(nm4Var.f);
        if (a != null && (mn2Var = a.b) != null) {
            str = mn2Var.toString();
            w2.j();
            tm4.K((tm4) w2.Q, str);
            String str8 = nm4Var.g;
            w2.j();
            tm4.L((tm4) w2.Q, str8);
            String str9 = nm4Var.j;
            w2.j();
            tm4.O((tm4) w2.Q, str9);
            String str10 = nm4Var.h;
            w2.j();
            tm4.M((tm4) w2.Q, str10);
            String str11 = nm4Var.i;
            w2.j();
            tm4.N((tm4) w2.Q, str11);
            w.j();
            wm4.y((wm4) w.Q, (tm4) w2.h());
            um4Var.j();
            xm4.A((xm4) um4Var.Q, (wm4) w.h());
        }
        str = "";
        w2.j();
        tm4.K((tm4) w2.Q, str);
        String str82 = nm4Var.g;
        w2.j();
        tm4.L((tm4) w2.Q, str82);
        String str92 = nm4Var.j;
        w2.j();
        tm4.O((tm4) w2.Q, str92);
        String str102 = nm4Var.h;
        w2.j();
        tm4.M((tm4) w2.Q, str102);
        String str112 = nm4Var.i;
        w2.j();
        tm4.N((tm4) w2.Q, str112);
        w.j();
        wm4.y((wm4) w.Q, (tm4) w2.h());
        um4Var.j();
        xm4.A((xm4) um4Var.Q, (wm4) w.h());
    }

    public final synchronized void d() {
        if (this.V) {
            return;
        }
        this.V = true;
        if (!b()) {
            return;
        }
        cu5 cu5Var = jv5.A.c;
        this.S = cu5.y(this.P);
        jt jtVar = jt.b;
        Context context = this.P;
        jtVar.getClass();
        this.T = jt.a(context);
        long intValue = ((Integer) w82.d.c.a(x92.p7)).intValue();
        zw2.d.scheduleAtFixedRate(this, intValue, intValue, TimeUnit.MILLISECONDS);
    }

    public final synchronized void e() {
        try {
            ky3 ky3Var = new ky3((String) w82.d.c.a(x92.o7), 60000, new HashMap(), ((xm4) this.R.h()).D(), "application/x-protobuf", false);
            Context context = this.P;
            String str = this.Q.P;
            Binder.getCallingUid();
            new my3(context, str).e(ky3Var);
            um4 um4Var = this.R;
            um4Var.j();
            xm4.z((xm4) um4Var.Q);
        } catch (Exception e) {
            if ((e instanceof vu3) && ((vu3) e).P == 3) {
                um4 um4Var2 = this.R;
                um4Var2.j();
                xm4.z((xm4) um4Var2.Q);
                return;
            }
            jv5.A.g.e("CuiMonitor.sendCuiPing", e);
        }
    }

    @Override // java.lang.Runnable
    public final synchronized void run() {
        if (!b()) {
            return;
        }
        if (((xm4) this.R.Q).w() == 0) {
            return;
        }
        e();
    }
}