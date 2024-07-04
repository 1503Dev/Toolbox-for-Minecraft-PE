package defpackage;

import android.content.Context;
import defpackage.xc0;
import java.util.List;

/* renamed from: g1  reason: default package */
public class g1 extends xc0 {
    public static final lj n;
    public boolean k;
    public final sv l;
    public final a m;

    /* renamed from: g1$a */
    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public static class a extends xc0.a {
        public g1 b;

        public a(g1 g1Var) {
            super(g1Var);
            this.b = g1Var;
        }

        @Override // defpackage.lw
        public final ya0 a() {
            return null;
        }

        @Override // defpackage.lw
        public final void d() {
            g1 g1Var = this.b;
            g1Var.l.a(g1Var.f);
        }
    }

    static {
        int i = l41.b;
        lj ljVar = new lj();
        ljVar.d = 2131492932;
        ljVar.e = 35;
        n = ljVar;
    }

    public g1(io.mrarm.mctoolbox.bridge.a aVar, sv svVar) {
        super(aVar);
        this.k = true;
        this.m = new a(this);
        this.l = svVar;
    }

    @Override // defpackage.xc0, defpackage.iw
    public final void c(rz0 rz0Var) {
        if (this.k) {
            ((List) rz0Var.a).add(this.m);
        }
    }

    @Override // defpackage.iw
    public void e(oj ojVar, boolean z) {
        ojVar.o(new ct0(this, n));
    }

    @Override // defpackage.xc0
    public final void i(Context context, zz zzVar) {
        super.i(context, zzVar);
        if (zzVar.s("has_shortcut")) {
            this.k = zzVar.r("has_shortcut").g();
        }
    }
}