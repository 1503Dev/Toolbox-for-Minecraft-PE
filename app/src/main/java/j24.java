package defpackage;

import android.content.Context;
import android.os.RemoteException;
import android.view.View;
import java.util.concurrent.ExecutionException;

/* renamed from: j24  reason: default package */
public final class j24 implements k14 {
    public final Context a;
    public final d93 b;
    public View c;
    public jl2 d;

    public j24(Context context, d93 d93Var) {
        this.a = context;
        this.b = d93Var;
    }

    @Override // defpackage.k14
    public final Object a(hi4 hi4Var, final yh4 yh4Var, h14 h14Var) {
        final View view;
        if (((Boolean) w82.d.c.a(x92.A6)).booleanValue() && yh4Var.g0) {
            try {
                view = (View) va0.c0(this.d.b());
                boolean e = this.d.e();
                if (view != null) {
                    if (e) {
                        try {
                            view = (View) zw4.F(zw4.C(null), new ky4() { // from class: h24
                                @Override // defpackage.ky4
                                public final dz4 e(Object obj) {
                                    j24 j24Var = j24.this;
                                    return zw4.C(r93.a(j24Var.a, view, yh4Var));
                                }
                            }, zw2.e).get();
                        } catch (InterruptedException | ExecutionException e2) {
                            throw new ni4(e2);
                        }
                    }
                } else {
                    throw new ni4(new Exception("BannerRtbAdapterWrapper interscrollerView should not be null"));
                }
            } catch (RemoteException e3) {
                throw new ni4(e3);
            }
        } else {
            view = this.c;
        }
        c43 a = this.b.a(new ts1(hi4Var, yh4Var, h14Var.a), new q83(view, null, new u04(7, h14Var), (zh4) yh4Var.u.get(0)));
        a.r().S0(view);
        ((w24) h14Var.c).u4(a.t());
        return a.p();
    }

    @Override // defpackage.k14
    public final void b(hi4 hi4Var, yh4 yh4Var, h14 h14Var) {
        try {
            ((zm2) h14Var.b).E3(yh4Var.Z);
            if (((Boolean) w82.d.c.a(x92.A6)).booleanValue() && yh4Var.g0) {
                ((zm2) h14Var.b).N2(yh4Var.U, yh4Var.v.toString(), ((li4) hi4Var.a.P).d, new va0(this.a), new i24(this, h14Var), (cl2) h14Var.c, ((li4) hi4Var.a.P).e);
            } else {
                ((zm2) h14Var.b).X3(yh4Var.U, yh4Var.v.toString(), ((li4) hi4Var.a.P).d, new va0(this.a), new i24(this, h14Var), (cl2) h14Var.c, ((li4) hi4Var.a.P).e);
            }
        } catch (RemoteException e) {
            throw new ni4(e);
        }
    }
}