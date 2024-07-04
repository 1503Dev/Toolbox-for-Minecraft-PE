package defpackage;

import android.content.Context;

/* renamed from: cw1  reason: default package */
public final class cw1 extends q52 {
    public final /* synthetic */ Context b;
    public final /* synthetic */ zr5 c;
    public final /* synthetic */ String d;
    public final /* synthetic */ wk2 e;
    public final /* synthetic */ t42 f;

    public cw1(t42 t42Var, Context context, zr5 zr5Var, String str, tk2 tk2Var) {
        this.f = t42Var;
        this.b = context;
        this.c = zr5Var;
        this.d = str;
        this.e = tk2Var;
    }

    @Override // defpackage.q52
    public final /* bridge */ /* synthetic */ Object a() {
        t42.a(this.b, "interstitial");
        return new ig4();
    }

    @Override // defpackage.q52
    public final Object b(h03 h03Var) {
        return h03Var.o1(new va0(this.b), this.c, this.d, this.e, 231004000);
    }

    @Override // defpackage.q52
    public final /* bridge */ /* synthetic */ Object c() {
        return this.f.a.c(this.b, this.c, this.d, this.e, 2);
    }
}