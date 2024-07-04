package defpackage;

import android.content.Context;
import io.mrarm.mctoolbox.bridge.a;
import io.mrarm.mctoolbox.bridge.b;

/* renamed from: pd  reason: default package */
public final class pd extends xc0 {
    public static final lj l;
    public final bb0 k;

    static {
        int i = l41.b;
        lj ljVar = new lj();
        ljVar.d = 2131492934;
        ljVar.e = 35;
        l = ljVar;
    }

    public pd(a aVar) {
        super(aVar);
        bb0 bb0Var = new bb0();
        this.k = bb0Var;
        bb0Var.a(new xs0(new ey0(2, this)));
    }

    @Override // defpackage.iw
    public final void e(oj ojVar, boolean z) {
        ojVar.o(new ct0(this, l));
    }

    @Override // defpackage.xc0
    public final void g() {
        this.k.I(((b) this.a).p(this.f));
    }

    @Override // defpackage.xc0
    public final void i(Context context, zz zzVar) {
        super.i(context, zzVar);
        g();
    }
}