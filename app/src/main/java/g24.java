package defpackage;

import android.content.Context;
import android.os.RemoteException;
import android.view.View;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;

/* renamed from: g24  reason: default package */
public final class g24 implements k14 {
    public final Context a;
    public final d93 b;
    public final Executor c;

    public g24(Context context, d93 d93Var, Executor executor) {
        this.a = context;
        this.b = d93Var;
        this.c = executor;
    }

    @Override // defpackage.k14
    public final Object a(hi4 hi4Var, final yh4 yh4Var, h14 h14Var) {
        ni4 ni4Var;
        final View view;
        if (((Boolean) w82.d.c.a(x92.A6)).booleanValue() && yh4Var.g0) {
            mj4 mj4Var = (mj4) h14Var.b;
            mj4Var.getClass();
            try {
                jl2 j = mj4Var.a.j();
                if (j != null) {
                    try {
                        view = (View) va0.c0(j.b());
                        boolean e = j.e();
                        if (view != null) {
                            if (e) {
                                try {
                                    view = (View) zw4.F(zw4.C(null), new ky4() { // from class: f24
                                        @Override // defpackage.ky4
                                        public final dz4 e(Object obj) {
                                            g24 g24Var = g24.this;
                                            return zw4.C(r93.a(g24Var.a, view, yh4Var));
                                        }
                                    }, zw2.e).get();
                                } catch (InterruptedException | ExecutionException e2) {
                                    throw new ni4(e2);
                                }
                            }
                        } else {
                            throw new ni4(new Exception("BannerAdapterWrapper interscrollerView should not be null"));
                        }
                    } catch (RemoteException e22) {
                        throw new ni4(e22);
                    }
                } else {
                    sv2.d("getInterscrollerAd should not be null after loadInterscrollerAd loaded ad.");
                    throw new ni4(new Exception("getInterscrollerAd should not be null after loadInterscrollerAd loaded ad."));
                }
            } finally {
            }
        } else {
            mj4 mj4Var2 = (mj4) h14Var.b;
            mj4Var2.getClass();
            try {
                view = (View) va0.c0(mj4Var2.a.k());
            } finally {
            }
        }
        c43 a = this.b.a(new ts1(hi4Var, yh4Var, h14Var.a), new q83(view, null, new s82(5, (mj4) h14Var.b), (zh4) yh4Var.u.get(0)));
        a.r().S0(view);
        a.q().Q0(new u63((mj4) h14Var.b), this.c);
        ((w24) h14Var.c).u4(a.u());
        return a.p();
    }

    @Override // defpackage.k14
    public final void b(hi4 hi4Var, yh4 yh4Var, h14 h14Var) {
        zr5 y;
        ni4 ni4Var;
        zr5 zr5Var = ((li4) hi4Var.a.P).e;
        if (zr5Var.c0) {
            Context context = this.a;
            int i = zr5Var.T;
            int i2 = zr5Var.Q;
            h3 h3Var = new h3(i, i2);
            h3Var.d = true;
            h3Var.e = i2;
            y = new zr5(context, h3Var);
        } else {
            if (((Boolean) w82.d.c.a(x92.A6)).booleanValue() && yh4Var.g0) {
                Context context2 = this.a;
                int i3 = zr5Var.T;
                int i4 = zr5Var.Q;
                h3 h3Var2 = new h3(i3, i4);
                h3Var2.f = true;
                h3Var2.g = i4;
                y = new zr5(context2, h3Var2);
            } else {
                y = ea2.y(this.a, yh4Var.u);
            }
        }
        zr5 zr5Var2 = y;
        if (((Boolean) w82.d.c.a(x92.A6)).booleanValue() && yh4Var.g0) {
            mj4 mj4Var = (mj4) h14Var.b;
            Context context3 = this.a;
            pn5 pn5Var = ((li4) hi4Var.a.P).d;
            String jSONObject = yh4Var.v.toString();
            String j = mq2.j(yh4Var.s);
            cl2 cl2Var = (cl2) h14Var.c;
            mj4Var.getClass();
            try {
                mj4Var.a.Y0(new va0(context3), zr5Var2, pn5Var, jSONObject, j, cl2Var);
                return;
            } finally {
            }
        }
        mj4 mj4Var2 = (mj4) h14Var.b;
        Context context4 = this.a;
        pn5 pn5Var2 = ((li4) hi4Var.a.P).d;
        String jSONObject2 = yh4Var.v.toString();
        String j2 = mq2.j(yh4Var.s);
        cl2 cl2Var2 = (cl2) h14Var.c;
        mj4Var2.getClass();
        try {
            mj4Var2.a.W0(new va0(context4), zr5Var2, pn5Var2, jSONObject2, j2, cl2Var2);
        } finally {
        }
    }
}