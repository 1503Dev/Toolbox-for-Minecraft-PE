package defpackage;

import android.view.Surface;

/* renamed from: u06  reason: default package */
public final /* synthetic */ class u06 implements Runnable {
    public final /* synthetic */ c16 P;
    public final /* synthetic */ Object Q;
    public final /* synthetic */ long R;

    public /* synthetic */ u06(c16 c16Var, Surface surface, long j) {
        this.P = c16Var;
        this.Q = surface;
        this.R = j;
    }

    @Override // java.lang.Runnable
    public final void run() {
        c16 c16Var = this.P;
        final Object obj = this.Q;
        final long j = this.R;
        d16 d16Var = c16Var.b;
        int i = zn4.a;
        xl5 xl5Var = (xl5) d16Var;
        pp5 pp5Var = xl5Var.P.p;
        final io5 G = pp5Var.G();
        pp5Var.D(G, 26, new v64(G, obj, j) { // from class: op5
            public final /* synthetic */ Object P;

            {
                this.P = obj;
            }

            @Override // defpackage.v64
            /* renamed from: e */
            public final void mo5e(Object obj2) {
                ((jo5) obj2).o();
            }
        });
        bm5 bm5Var = xl5Var.P;
        if (bm5Var.G == obj) {
            i94 i94Var = bm5Var.k;
            i94Var.b(26, new v64() { // from class: vl5
                @Override // defpackage.v64
                /* renamed from: e */
                public final void mo5e(Object obj2) {
                    b53 b53Var = (b53) obj2;
                }
            });
            i94Var.a();
        }
    }
}