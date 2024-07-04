package defpackage;

/* renamed from: a02  reason: default package */
public final class a02 extends a22 {
    public int P = 0;
    public final int Q;
    public final /* synthetic */ y82 R;

    public a02(y82 y82Var) {
        this.R = y82Var;
        this.Q = y82Var.m();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.P < this.Q;
    }
}