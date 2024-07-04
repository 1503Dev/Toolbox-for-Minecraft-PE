package defpackage;

import android.view.View;
import defpackage.cw;
import defpackage.ns0;
import defpackage.qs0;
import defpackage.xs0;

/* renamed from: ia0  reason: default package */
public final /* synthetic */ class ia0 implements qs0.a, cw.a, xs0.a {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ ia0(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // defpackage.xs0.a
    public final void a() {
        switch (this.a) {
            case 1:
                ((View) this.b).requestLayout();
                return;
            default:
                fz0 fz0Var = (fz0) this.b;
                if (!fz0Var.e.Q) {
                    fz0Var.a(false);
                    return;
                }
                return;
        }
    }

    @Override // defpackage.qs0.a
    public final void b(Throwable th) {
        switch (this.a) {
            case 0:
                ((ka0) this.b).a(300L);
                return;
            default:
                ((ns0.c) this.b).b();
                return;
        }
    }
}