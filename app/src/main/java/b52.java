package defpackage;

/* renamed from: b52  reason: default package */
public final class b52 extends bx2 {
    public final /* synthetic */ g52 Q;

    public b52(g52 g52Var) {
        this.Q = g52Var;
    }

    @Override // defpackage.bx2, java.util.concurrent.Future
    public final boolean cancel(boolean z) {
        g52.a(this.Q);
        return super.cancel(z);
    }
}