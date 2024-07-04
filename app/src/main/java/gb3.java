package defpackage;

import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* renamed from: gb3  reason: default package */
public final class gb3 implements wy4, kg4, wg3, v64 {
    public final /* synthetic */ int P;
    public final Object Q;

    public /* synthetic */ gb3(int i, Object obj) {
        this.P = i;
        this.Q = obj;
    }

    @Override // defpackage.kg4, defpackage.v64
    /* renamed from: e */
    public final void mo5e(Object obj) {
        switch (this.P) {
            case 2:
                ((i42) obj).B(((tz3) this.Q).P);
                return;
            case 3:
                el4 el4Var = (el4) this.Q;
                ((pl4) obj).b((ml4) el4Var.P, el4Var.Q);
                return;
            case 4:
                ((b53) obj).g((cz5) this.Q);
                return;
            default:
                jo5 jo5Var = (jo5) obj;
                return;
        }
    }

    @Override // defpackage.wy4
    public final /* bridge */ /* synthetic */ void f(@NullableDecl Object obj) {
        Void r2 = (Void) obj;
        ((hb3) this.Q).f.U(true);
    }

    @Override // defpackage.wy4
    public final void h(Throwable th) {
        ((hb3) this.Q).f.U(false);
    }

    public /* synthetic */ gb3(io5 io5Var) {
        this.P = 5;
        this.Q = io5Var;
    }
}