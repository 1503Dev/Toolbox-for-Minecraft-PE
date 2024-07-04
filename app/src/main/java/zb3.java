package defpackage;

import android.content.Context;
import android.webkit.CookieManager;
import java.util.Collections;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* renamed from: zb3  reason: default package */
public final class zb3 implements lj5 {
    public final /* synthetic */ int a;
    public final uj5 b;
    public final uj5 c;

    public /* synthetic */ zb3(uj5 uj5Var, uj5 uj5Var2, int i) {
        this.a = i;
        this.b = uj5Var;
        this.c = uj5Var2;
    }

    @Override // defpackage.uj5
    public final Object c() {
        switch (this.a) {
            case 0:
                return new ii3((of3) this.b.c(), (Executor) this.c.c());
            case 1:
                ol4 ol4Var = (ol4) this.b.c();
                CookieManager b = jv5.A.e.b((Context) this.c.c());
                ml4 ml4Var = ml4.WEBVIEW_COOKIE;
                dv3 dv3Var = new dv3(0, b);
                jl4 jl4Var = new jl4(ol4Var, ml4Var, null, kl4.d, Collections.emptyList(), zw4.G(ol4Var.a.b(dv3Var), 1L, TimeUnit.SECONDS, ol4Var.b));
                xa3 xa3Var = new xa3(2, ar.T);
                kl4 kl4Var = jl4Var.f;
                return new jl4(kl4Var, jl4Var.a, jl4Var.b, jl4Var.c, jl4Var.d, zw4.B(jl4Var.e, Exception.class, xa3Var, kl4Var.a)).a();
            default:
                yw2 yw2Var = zw2.a;
                tv2.C(yw2Var);
                return new ra4(yw2Var, (xh4) this.c.c());
        }
    }
}