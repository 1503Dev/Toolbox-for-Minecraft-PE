package defpackage;

/* renamed from: e30  reason: default package */
public final class e30 extends ma0<Long> implements Comparable<e30> {
    public e30() {
        super(0L);
    }

    public e30(long j) {
        super(Long.valueOf(j));
    }

    @Override // defpackage.tv0
    public final Object clone() {
        return new e30(((Long) this.P).longValue());
    }

    @Override // java.lang.Comparable
    public final int compareTo(e30 e30Var) {
        return ((Long) this.P).compareTo((Long) e30Var.P);
    }

    @Override // defpackage.tv0
    public final boolean equals(Object obj) {
        if (super.equals(obj) && ((Number) this.P).longValue() == ((Number) ((e30) obj).P).longValue()) {
            return true;
        }
        return false;
    }

    @Override // defpackage.tv0
    public final tv0 m() {
        return new e30(((Long) this.P).longValue());
    }

    @Override // defpackage.tv0
    public final void o(o00 o00Var, int i) {
        r(Long.valueOf(o00Var.readLong()));
    }

    @Override // defpackage.tv0
    public final void q(p00 p00Var, int i) {
        p00Var.writeLong(((Long) this.P).longValue());
    }

    @Override // defpackage.tv0
    public final String v(int i) {
        return this.P + "l";
    }
}