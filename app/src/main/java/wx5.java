package defpackage;

/* renamed from: wx5  reason: default package */
public final class wx5 implements Comparable {
    public final boolean P;
    public final boolean Q;

    public wx5(cu1 cu1Var, int i) {
        this.P = 1 == (cu1Var.d & 1);
        this.Q = oy5.h(i, false);
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        wx5 wx5Var = (wx5) obj;
        return cv4.a.d(this.Q, wx5Var.Q).d(this.P, wx5Var.P).a();
    }
}