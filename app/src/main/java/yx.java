package defpackage;

/* renamed from: yx  reason: default package */
public final class yx extends ma0<Integer> implements Comparable<yx> {
    public yx() {
        super(0);
    }

    public yx(int i) {
        super(Integer.valueOf(i));
    }

    @Override // defpackage.tv0
    public final Object clone() {
        return new yx(((Integer) this.P).intValue());
    }

    @Override // java.lang.Comparable
    public final int compareTo(yx yxVar) {
        return ((Integer) this.P).compareTo((Integer) yxVar.P);
    }

    @Override // defpackage.tv0
    public final boolean equals(Object obj) {
        if (super.equals(obj) && ((Number) this.P).intValue() == ((Number) ((yx) obj).P).intValue()) {
            return true;
        }
        return false;
    }

    @Override // defpackage.tv0
    public final tv0 m() {
        return new yx(((Integer) this.P).intValue());
    }

    @Override // defpackage.tv0
    public final void o(o00 o00Var, int i) {
        r(Integer.valueOf(o00Var.readInt()));
    }

    @Override // defpackage.tv0
    public final void q(p00 p00Var, int i) {
        p00Var.writeInt(((Integer) this.P).intValue());
    }

    @Override // defpackage.tv0
    public final String v(int i) {
        return this.P + "";
    }
}