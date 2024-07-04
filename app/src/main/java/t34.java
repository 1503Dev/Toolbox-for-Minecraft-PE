package defpackage;

import android.content.Context;
import android.os.RemoteException;

/* renamed from: t34  reason: default package */
public final class t34 implements k14 {
    public final Context a;
    public final nk3 b;
    public pl2 c;
    public final xv2 d;

    public t34(Context context, nk3 nk3Var, xv2 xv2Var) {
        this.a = context;
        this.b = nk3Var;
        this.d = xv2Var;
    }

    @Override // defpackage.k14
    public final /* bridge */ /* synthetic */ Object a(hi4 hi4Var, yh4 yh4Var, h14 h14Var) {
        if (((li4) hi4Var.a.P).g.contains(Integer.toString(6))) {
            nl3 k = nl3.k(this.c);
            if (((li4) hi4Var.a.P).g.contains(Integer.toString(k.e()))) {
                z43 d = this.b.d(new ts1(hi4Var, yh4Var, h14Var.a), new z63(1, k), new cn3(null, null, this.c));
                ((w24) h14Var.c).u4(d.s());
                return d.q();
            }
            throw new l44(1, "No corresponding native ad listener");
        }
        throw new l44(2, "Unified must be used for RTB.");
    }

    @Override // defpackage.k14
    public final void b(hi4 hi4Var, yh4 yh4Var, h14 h14Var) {
        try {
            ((zm2) h14Var.b).E3(yh4Var.Z);
            if (this.d.R < ((Integer) w82.d.c.a(x92.p1)).intValue()) {
                ((zm2) h14Var.b).c1(yh4Var.U, yh4Var.v.toString(), ((li4) hi4Var.a.P).d, new va0(this.a), new s34(this, h14Var), (cl2) h14Var.c);
            } else {
                ((zm2) h14Var.b).M2(yh4Var.U, yh4Var.v.toString(), ((li4) hi4Var.a.P).d, new va0(this.a), new s34(this, h14Var), (cl2) h14Var.c, ((li4) hi4Var.a.P).i);
            }
        } catch (RemoteException e) {
            throw new ni4(e);
        }
    }
}