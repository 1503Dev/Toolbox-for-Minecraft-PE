package defpackage;

import io.mrarm.mctoolbox.bridge.a;
import io.mrarm.mctoolbox.bridge.b;
import java.util.Objects;

/* renamed from: nw0  reason: default package */
public final class nw0 extends xc0 {
    public static final lj l;
    public final za0<String> k;

    static {
        int i = l41.b;
        lj ljVar = new lj();
        ljVar.d = 2131492939;
        ljVar.e = 35;
        l = ljVar;
    }

    public nw0(a aVar) {
        super(aVar);
        za0<String> za0Var = new za0<>();
        this.k = za0Var;
        za0Var.a(new xs0(new yd0(this)));
    }

    @Override // defpackage.iw
    public final void e(oj ojVar, boolean z) {
        ojVar.o(new ct0(this, l));
    }

    @Override // defpackage.xc0
    public final void g() {
        String r = ((b) this.a).r(this.f);
        if (!Objects.equals(this.k.Q, r)) {
            this.k.H(r);
        }
    }
}