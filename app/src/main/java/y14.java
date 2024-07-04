package defpackage;

import android.content.Context;
import android.os.RemoteException;

/* renamed from: y14  reason: default package */
public final class y14 implements k14 {
    public final /* synthetic */ int a;
    public final Context b;
    public final Object c;

    public /* synthetic */ y14(Context context, Object obj, int i) {
        this.a = i;
        this.b = context;
        this.c = obj;
    }

    @Override // defpackage.k14
    public final Object a(hi4 hi4Var, yh4 yh4Var, h14 h14Var) {
        switch (this.a) {
            case 0:
                d34 d34Var = new d34(yh4Var, (zm2) h14Var.b, o2.APP_OPEN_AD);
                x33 a = ((y73) this.c).a(new ts1(hi4Var, yh4Var, h14Var.a), new hj3(d34Var, null), new x73(yh4Var.a0));
                d34Var.S = a.n();
                ((w24) h14Var.c).u4(a.t());
                return a.p();
            case 1:
                d34 d34Var2 = new d34(yh4Var, (zm2) h14Var.b, o2.INTERSTITIAL);
                o43 c = ((sj3) this.c).c(new ts1(hi4Var, yh4Var, h14Var.a), new hj3(d34Var2, null));
                d34Var2.S = c.n();
                ((w24) h14Var.c).u4(c.t());
                return c.p();
            default:
                d34 d34Var3 = new d34(yh4Var, (zm2) h14Var.b, o2.REWARDED);
                w43 b = ((bq3) this.c).b(new ts1(hi4Var, yh4Var, h14Var.a), new aq3(d34Var3));
                d34Var3.S = b.n();
                ((w24) h14Var.c).u4(b.x());
                return b.r();
        }
    }

    @Override // defpackage.k14
    public final void b(hi4 hi4Var, yh4 yh4Var, h14 h14Var) {
        switch (this.a) {
            case 0:
                try {
                    ((zm2) h14Var.b).E3(yh4Var.Z);
                    ((zm2) h14Var.b).W1(yh4Var.U, yh4Var.v.toString(), ((li4) hi4Var.a.P).d, new va0(this.b), new x14(h14Var), (cl2) h14Var.c);
                    return;
                } catch (RemoteException e) {
                    vz3.l("Remote exception loading an app open RTB ad", e);
                    throw new ni4(e);
                }
            case 1:
                try {
                    ((zm2) h14Var.b).E3(yh4Var.Z);
                    ((zm2) h14Var.b).u1(yh4Var.U, yh4Var.v.toString(), ((li4) hi4Var.a.P).d, new va0(this.b), new f34(h14Var), (cl2) h14Var.c);
                    return;
                } catch (RemoteException e2) {
                    vz3.l("Remote exception loading a interstitial RTB ad", e2);
                    throw new ni4(e2);
                }
            default:
                try {
                    ((zm2) h14Var.b).E3(yh4Var.Z);
                    if (((li4) hi4Var.a.P).o.P == 3) {
                        ((zm2) h14Var.b).f4(yh4Var.U, yh4Var.v.toString(), ((li4) hi4Var.a.P).d, new va0(this.b), new r44(h14Var), (cl2) h14Var.c);
                    } else {
                        ((zm2) h14Var.b).W2(yh4Var.U, yh4Var.v.toString(), ((li4) hi4Var.a.P).d, new va0(this.b), new r44(h14Var), (cl2) h14Var.c);
                    }
                    return;
                } catch (RemoteException e3) {
                    vz3.l("Remote exception loading a rewarded RTB ad", e3);
                    return;
                }
        }
    }
}