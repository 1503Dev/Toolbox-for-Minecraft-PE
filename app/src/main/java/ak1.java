package defpackage;

import android.content.Context;

/* renamed from: ak1  reason: default package */
public final class ak1 implements hh, iu4, v64, jy5 {
    public final Object P;
    public final Object Q;

    public /* synthetic */ ak1(Context context) {
        o15 o15Var = new o15();
        this.P = context.getApplicationContext();
        this.Q = o15Var;
    }

    public /* synthetic */ ak1(Object obj, Object obj2) {
        this.P = obj;
        this.Q = obj2;
    }

    @Override // defpackage.iu4
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ fv4 mo4a() {
        return new t05((Context) this.P, ((o15) ((iu4) this.Q)).mo4a());
    }

    @Override // defpackage.jy5
    public final nw4 b(int i, qe3 qe3Var, int[] iArr) {
        dy5 dy5Var = (dy5) this.P;
        String str = (String) this.Q;
        mw4 mw4Var = oy5.j;
        kv4 kv4Var = new kv4();
        int i2 = 0;
        while (true) {
            qe3Var.getClass();
            if (i2 <= 0) {
                kv4Var.p(new iy5(i, qe3Var, i2, dy5Var, iArr[i2], str));
                i2++;
            } else {
                return kv4Var.s();
            }
        }
    }

    @Override // defpackage.v64
    /* renamed from: e */
    public final void mo5e(Object obj) {
        wo3 wo3Var = (wo3) this.Q;
        ((jo5) obj).c(wo3Var);
        int i = wo3Var.a;
    }
}