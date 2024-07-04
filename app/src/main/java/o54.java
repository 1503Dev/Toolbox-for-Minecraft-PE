package defpackage;

import android.os.Bundle;
import com.google.ads.mediation.admob.AdMobAdapter;
import java.util.Collections;
import java.util.Iterator;

/* renamed from: o54  reason: default package */
public final class o54 implements e14 {
    public final g14 a;
    public final k14 b;
    public final ol4 c;
    public final ez4 d;

    public o54(ol4 ol4Var, ez4 ez4Var, g14 g14Var, k14 k14Var) {
        this.c = ol4Var;
        this.d = ez4Var;
        this.b = k14Var;
        this.a = g14Var;
    }

    @Override // defpackage.e14
    public final boolean a(hi4 hi4Var, yh4 yh4Var) {
        return !yh4Var.t.isEmpty();
    }

    @Override // defpackage.e14
    public final dz4 b(final hi4 hi4Var, final yh4 yh4Var) {
        final h14 h14Var;
        Iterator it = yh4Var.t.iterator();
        while (true) {
            if (it.hasNext()) {
                try {
                    h14Var = this.a.a((String) it.next(), yh4Var.v);
                    break;
                } catch (ni4 unused) {
                }
            } else {
                h14Var = null;
                break;
            }
        }
        if (h14Var == null) {
            return new yy4(new u34());
        }
        bx2 bx2Var = new bx2();
        h14Var.c.e4(new n54(h14Var, bx2Var));
        if (yh4Var.M) {
            Bundle bundle = ((li4) hi4Var.a.P).d.b0;
            Bundle bundle2 = bundle.getBundle(AdMobAdapter.class.getName());
            if (bundle2 == null) {
                bundle2 = new Bundle();
                bundle.putBundle(AdMobAdapter.class.getName(), bundle2);
            }
            bundle2.putBoolean("render_test_ad_label", true);
        }
        ol4 ol4Var = this.c;
        ml4 ml4Var = ml4.ADAPTER_LOAD_AD_SYN;
        cl4 cl4Var = new cl4() { // from class: m54
            @Override // defpackage.cl4
            public final void a() {
                o54 o54Var = o54.this;
                o54Var.b.b(hi4Var, yh4Var, h14Var);
            }
        };
        jl4 b = new jl4(ol4Var, ml4Var, kl4.d, Collections.emptyList(), this.d.b(new ac4(1, cl4Var))).b(ml4.ADAPTER_LOAD_AD_ACK);
        return new jl4(b.f, b.a, b.b, b.c, b.d, zw4.F(b.e, new bt1(1, bx2Var), zw2.f)).b(ml4.ADAPTER_WRAP_ADAPTER).c(new sv1(this, hi4Var, yh4Var, h14Var)).a();
    }
}