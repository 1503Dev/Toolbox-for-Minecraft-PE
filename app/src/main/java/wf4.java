package defpackage;

import java.util.Iterator;
import java.util.List;

/* renamed from: wf4  reason: default package */
public final class wf4 implements vg4 {
    public wc3 a;
    public final py4 b = py4.P;

    @Override // defpackage.vg4
    public final /* bridge */ /* synthetic */ dz4 a(wg4 wg4Var, ug4 ug4Var) {
        return b(wg4Var, ug4Var, null);
    }

    public final dz4 b(wg4 wg4Var, ug4 ug4Var, wc3 wc3Var) {
        vc3 b = ug4Var.b(wg4Var.b);
        b.b(new zg4());
        wc3 wc3Var2 = (wc3) b.f();
        this.a = wc3Var2;
        final hb3 c = wc3Var2.c();
        final dk4 dk4Var = new dk4();
        return zw4.E(zw4.F(sy4.r(c.c()), new ky4() { // from class: vf4
            @Override // defpackage.ky4
            public final dz4 e(Object obj) {
                dk4 dk4Var2 = dk4.this;
                hb3 hb3Var = c;
                hi4 hi4Var = (hi4) obj;
                dk4Var2.b = hi4Var;
                Iterator it = ((List) hi4Var.b.P).iterator();
                boolean z = false;
                loop0: while (true) {
                    if (it.hasNext()) {
                        for (String str : ((yh4) it.next()).a) {
                            if (!str.contains("FirstPartyRenderer")) {
                                break loop0;
                            }
                            z = true;
                        }
                    } else if (z) {
                        return hb3Var.b(zw4.C(hi4Var));
                    }
                }
                return zw4.C(null);
            }
        }, this.b), new oq1(2, dk4Var), this.b);
    }

    @Override // defpackage.vg4
    public final /* synthetic */ Object i() {
        return this.a;
    }
}