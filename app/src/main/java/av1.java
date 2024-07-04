package defpackage;

import android.content.Context;

/* renamed from: av1  reason: default package */
public final class av1 extends q52 {
    public final /* synthetic */ Context b;
    public final /* synthetic */ zr5 c;
    public final /* synthetic */ String d;
    public final /* synthetic */ t42 e;

    public av1(t42 t42Var, Context context, zr5 zr5Var, String str) {
        this.e = t42Var;
        this.b = context;
        this.c = zr5Var;
        this.d = str;
    }

    @Override // defpackage.q52
    public final /* bridge */ /* synthetic */ Object a() {
        t42.a(this.b, "search");
        return new ig4();
    }

    @Override // defpackage.q52
    public final Object b(h03 h03Var) {
        return h03Var.Z0(new va0(this.b), this.c, this.d, 231004000);
    }

    @Override // defpackage.q52
    public final /* bridge */ /* synthetic */ Object c() {
        return this.e.a.c(this.b, this.c, this.d, null, 3);
    }
}