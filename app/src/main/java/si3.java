package defpackage;

import android.content.Context;

/* renamed from: si3  reason: default package */
public final /* synthetic */ class si3 implements wg3, nw3, wj3 {
    public final /* synthetic */ Object P;

    public /* synthetic */ si3(Object obj) {
        this.P = obj;
    }

    @Override // defpackage.wj3
    public final void c(boolean z, Context context, wd3 wd3Var) {
        h14 h14Var = (h14) this.P;
        try {
            ((mj4) h14Var.b).b(z);
            mj4 mj4Var = (mj4) h14Var.b;
            mj4Var.getClass();
            mj4Var.a.N();
        } catch (ni4 e) {
            sv2.h("Cannot show rewarded video.", e);
            throw new vj3(e.getCause());
        }
    }

    @Override // defpackage.nw3
    public final dz4 d(rq2 rq2Var) {
        dz4 dz4Var;
        zv3 zv3Var = (zv3) this.P;
        synchronized (zv3Var.b) {
            int i = zv3Var.h;
            if (i != 1 && i != 2) {
                dz4Var = new yy4(new gw3(2));
            } else {
                if (!zv3Var.c) {
                    zv3Var.h = 2;
                    zv3Var.c = true;
                    zv3Var.e = rq2Var;
                    zv3Var.f.n();
                    zv3Var.a.b(new b02(4, zv3Var), zw2.f);
                }
                dz4Var = zv3Var.a;
            }
        }
        return dz4Var;
    }

    @Override // defpackage.wg3
    /* renamed from: e */
    public final void mo0e(Object obj) {
        ((zg2) obj).E((qr2) this.P);
    }
}