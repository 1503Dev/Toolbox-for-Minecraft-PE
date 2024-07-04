package defpackage;

import android.content.Context;
import android.net.Uri;
import android.os.RemoteException;
import android.text.TextUtils;
import android.view.View;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: a73  reason: default package */
public final class a73 implements nd3, le3, ae3, vj1, yd3 {
    public final Context P;
    public final Executor Q;
    public final Executor R;
    public final ScheduledExecutorService S;
    public final hi4 T;
    public final yh4 U;
    public final bn4 V;
    public final fj4 W;
    public final rz1 X;
    public final va2 Y;
    public final WeakReference Z;
    public final WeakReference a0;
    public final rc3 b0;
    public boolean c0;
    public final AtomicBoolean d0 = new AtomicBoolean();

    public a73(Context context, yw2 yw2Var, Executor executor, ScheduledExecutorService scheduledExecutorService, hi4 hi4Var, yh4 yh4Var, bn4 bn4Var, fj4 fj4Var, View view, y03 y03Var, rz1 rz1Var, va2 va2Var, rc3 rc3Var) {
        this.P = context;
        this.Q = yw2Var;
        this.R = executor;
        this.S = scheduledExecutorService;
        this.T = hi4Var;
        this.U = yh4Var;
        this.V = bn4Var;
        this.W = fj4Var;
        this.X = rz1Var;
        this.Z = new WeakReference(view);
        this.a0 = new WeakReference(y03Var);
        this.Y = va2Var;
        this.b0 = rc3Var;
    }

    @Override // defpackage.vj1
    public final void J() {
        if ((!((Boolean) w82.d.c.a(x92.h0)).booleanValue() || !((ci4) this.T.b.Q).g) && ((Boolean) lb2.d.d()).booleanValue()) {
            zw4.J(zw4.z(sy4.r(this.Y.a()), Throwable.class, new at4() { // from class: x63
                @Override // defpackage.at4
                public final Object apply(Object obj) {
                    Throwable th = (Throwable) obj;
                    return "failure_click_attok";
                }
            }, zw2.f), new z63(0, this), this.Q);
            return;
        }
        fj4 fj4Var = this.W;
        bn4 bn4Var = this.V;
        hi4 hi4Var = this.T;
        yh4 yh4Var = this.U;
        ArrayList a = bn4Var.a(hi4Var, yh4Var, yh4Var.c);
        int i = 1;
        if (true == jv5.A.g.g(this.P)) {
            i = 2;
        }
        fj4Var.getClass();
        Iterator it = a.iterator();
        while (it.hasNext()) {
            fj4Var.b(i, (String) it.next());
        }
    }

    @Override // defpackage.nd3
    public final void K() {
    }

    public final void a() {
        String str;
        int i;
        l92 l92Var = x92.O2;
        w82 w82Var = w82.d;
        if (((Boolean) w82Var.c.a(l92Var)).booleanValue()) {
            str = this.X.b.e(this.P, (View) this.Z.get(), null);
        } else {
            str = null;
        }
        if ((((Boolean) w82Var.c.a(x92.h0)).booleanValue() && ((ci4) this.T.b.Q).g) || !((Boolean) lb2.h.d()).booleanValue()) {
            fj4 fj4Var = this.W;
            bn4 bn4Var = this.V;
            hi4 hi4Var = this.T;
            yh4 yh4Var = this.U;
            fj4Var.a(bn4Var.b(hi4Var, yh4Var, false, str, null, yh4Var.d));
            return;
        }
        if (((Boolean) lb2.g.d()).booleanValue() && ((i = this.U.b) == 1 || i == 2 || i == 5)) {
            y03 y03Var = (y03) this.a0.get();
        }
        zw4.J((sy4) zw4.G(sy4.r(zw4.C(null)), ((Long) w82Var.c.a(x92.H0)).longValue(), TimeUnit.MILLISECONDS, this.S), new wq1(this, str), this.Q);
    }

    public final void b(final int i, final int i2) {
        View view;
        if (i <= 0 || !((view = (View) this.Z.get()) == null || view.getHeight() == 0 || view.getWidth() == 0)) {
            a();
        } else {
            this.S.schedule(new Runnable() { // from class: w63
                @Override // java.lang.Runnable
                public final void run() {
                    final a73 a73Var = a73.this;
                    final int i3 = i;
                    final int i4 = i2;
                    a73Var.Q.execute(new Runnable() { // from class: y63
                        @Override // java.lang.Runnable
                        public final void run() {
                            a73.this.b(i3 - 1, i4);
                        }
                    });
                }
            }, i2, TimeUnit.MILLISECONDS);
        }
    }

    @Override // defpackage.yd3
    public final void g0(tz3 tz3Var) {
        if (((Boolean) w82.d.c.a(x92.f1)).booleanValue()) {
            int i = tz3Var.P;
            List<String> list = this.U.o;
            ArrayList arrayList = new ArrayList();
            for (String str : list) {
                arrayList.add(bn4.c(str, "@gw_mpe@", "2." + i));
            }
            this.W.a(this.V.a(this.T, this.U, arrayList));
        }
    }

    @Override // defpackage.nd3
    public final void j() {
    }

    @Override // defpackage.le3
    public final synchronized void k() {
        fj4 fj4Var;
        ArrayList a;
        rc3 rc3Var;
        if (this.c0) {
            ArrayList arrayList = new ArrayList(this.U.d);
            arrayList.addAll(this.U.f);
            fj4Var = this.W;
            a = this.V.b(this.T, this.U, true, null, null, arrayList);
        } else {
            fj4 fj4Var2 = this.W;
            bn4 bn4Var = this.V;
            hi4 hi4Var = this.T;
            yh4 yh4Var = this.U;
            fj4Var2.a(bn4Var.a(hi4Var, yh4Var, yh4Var.m));
            if (((Boolean) w82.d.c.a(x92.T2)).booleanValue() && (rc3Var = this.b0) != null) {
                List<String> list = rc3Var.b.m;
                String join = TextUtils.join("_", rc3Var.c.d);
                ArrayList arrayList2 = new ArrayList();
                for (String str : list) {
                    arrayList2.add(bn4.c(str, "@gw_adnetstatus@", join));
                }
                fj4 fj4Var3 = this.W;
                bn4 bn4Var2 = this.V;
                rc3 rc3Var2 = this.b0;
                fj4Var3.a(bn4Var2.a(rc3Var2.a, rc3Var2.b, arrayList2));
            }
            fj4Var = this.W;
            bn4 bn4Var3 = this.V;
            hi4 hi4Var2 = this.T;
            yh4 yh4Var2 = this.U;
            a = bn4Var3.a(hi4Var2, yh4Var2, yh4Var2.f);
        }
        fj4Var.a(a);
        this.c0 = true;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x006e A[LOOP:0: B:15:0x0068->B:17:0x006e, LOOP_END] */
    @Override // defpackage.nd3
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void l(cr2 cr2Var, String str, String str2) {
        String str3;
        String num;
        ii4 ii4Var;
        et4 jt4Var;
        fj4 fj4Var = this.W;
        bn4 bn4Var = this.V;
        yh4 yh4Var = this.U;
        List<String> list = yh4Var.h;
        bn4Var.getClass();
        ArrayList arrayList = new ArrayList();
        long a = bn4Var.h.a();
        try {
            str3 = ((ar2) cr2Var).P;
            num = Integer.toString(((ar2) cr2Var).Q);
        } catch (RemoteException e) {
            sv2.e("Unable to determine award type and amount.", e);
        }
        if (((Boolean) w82.d.c.a(x92.P2)).booleanValue()) {
            ji4 ji4Var = bn4Var.g;
            if (ji4Var == null) {
                jt4Var = rs4.P;
                String str4 = (String) jt4Var.a(new at4() { // from class: zm4
                    @Override // defpackage.at4
                    public final Object apply(Object obj) {
                        String str5 = ((ii4) obj).a;
                        if (TextUtils.isEmpty(str5)) {
                            return "";
                        }
                        if (rv2.c()) {
                            return "fakeForAdDebugLog";
                        }
                        return str5;
                    }
                }).b();
                String str5 = (String) jt4Var.a(new at4() { // from class: an4
                    @Override // defpackage.at4
                    public final Object apply(Object obj) {
                        String str6 = ((ii4) obj).b;
                        if (TextUtils.isEmpty(str6)) {
                            return "";
                        }
                        if (rv2.c()) {
                            return "fakeForAdDebugLog";
                        }
                        return str6;
                    }
                }).b();
                for (String str6 : list) {
                    arrayList.add(rt2.b(bn4Var.e, bn4.c(bn4.c(bn4.c(bn4.c(bn4.c(bn4.c(str6, "@gw_rwd_userid@", Uri.encode(str4)), "@gw_rwd_custom_data@", Uri.encode(str5)), "@gw_tmstmp@", Long.toString(a)), "@gw_rwd_itm@", Uri.encode(str3)), "@gw_rwd_amt@", num), "@gw_sdkver@", bn4Var.b), yh4Var.W));
                }
                fj4Var.a(arrayList);
            }
            ii4Var = ji4Var.a;
        } else {
            ii4Var = bn4Var.f;
        }
        if (ii4Var == null) {
            jt4Var = rs4.P;
        } else {
            jt4Var = new jt4(ii4Var);
        }
        String str42 = (String) jt4Var.a(new at4() { // from class: zm4
            @Override // defpackage.at4
            public final Object apply(Object obj) {
                String str52 = ((ii4) obj).a;
                if (TextUtils.isEmpty(str52)) {
                    return "";
                }
                if (rv2.c()) {
                    return "fakeForAdDebugLog";
                }
                return str52;
            }
        }).b();
        String str52 = (String) jt4Var.a(new at4() { // from class: an4
            @Override // defpackage.at4
            public final Object apply(Object obj) {
                String str62 = ((ii4) obj).b;
                if (TextUtils.isEmpty(str62)) {
                    return "";
                }
                if (rv2.c()) {
                    return "fakeForAdDebugLog";
                }
                return str62;
            }
        }).b();
        while (r1.hasNext()) {
        }
        fj4Var.a(arrayList);
    }

    @Override // defpackage.nd3
    public final void m() {
        fj4 fj4Var = this.W;
        bn4 bn4Var = this.V;
        hi4 hi4Var = this.T;
        yh4 yh4Var = this.U;
        fj4Var.a(bn4Var.a(hi4Var, yh4Var, yh4Var.g));
    }

    @Override // defpackage.ae3
    public final void n() {
        if (!this.d0.compareAndSet(false, true)) {
            return;
        }
        m92 m92Var = x92.W2;
        w82 w82Var = w82.d;
        int intValue = ((Integer) w82Var.c.a(m92Var)).intValue();
        if (intValue > 0) {
            b(intValue, ((Integer) w82Var.c.a(x92.X2)).intValue());
            return;
        }
        if (((Boolean) w82Var.c.a(x92.V2)).booleanValue()) {
            this.R.execute(new cx1(3, this));
        } else {
            a();
        }
    }

    @Override // defpackage.nd3
    public final void o() {
    }

    @Override // defpackage.nd3
    public final void q() {
        fj4 fj4Var = this.W;
        bn4 bn4Var = this.V;
        hi4 hi4Var = this.T;
        yh4 yh4Var = this.U;
        fj4Var.a(bn4Var.a(hi4Var, yh4Var, yh4Var.i));
    }
}