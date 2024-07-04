package defpackage;

import android.app.Activity;
import defpackage.b3;
import defpackage.r2;

/* renamed from: x2  reason: default package */
public final class x2 extends gy {
    public final /* synthetic */ r2.d f;
    public final /* synthetic */ b3 g;

    public x2(b3 b3Var, r2.a aVar) {
        this.g = b3Var;
        this.f = aVar;
    }

    @Override // defpackage.z61
    public final void M0(l20 l20Var) {
        ((r2.a) this.f).b();
    }

    @Override // defpackage.z61
    public final void O0(Object obj) {
        fy fyVar = (fy) obj;
        fyVar.c(new w2(this));
        r2.d dVar = this.f;
        Activity activity = this.g.a;
        ((r2.a) dVar).c(new b3.a(fyVar));
    }
}