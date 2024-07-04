package defpackage;

/* renamed from: am  reason: default package */
public final class am extends ma0<Double> implements Comparable<am> {
    public am() {
        super(Double.valueOf(0.0d));
    }

    public am(double d) {
        super(Double.valueOf(d));
    }

    @Override // defpackage.tv0
    public final Object clone() {
        return new am(((Double) this.P).doubleValue());
    }

    @Override // java.lang.Comparable
    public final int compareTo(am amVar) {
        return ((Double) this.P).compareTo((Double) amVar.P);
    }

    @Override // defpackage.tv0
    public final boolean equals(Object obj) {
        if (super.equals(obj) && ((Double) this.P).equals(((am) obj).P)) {
            return true;
        }
        return false;
    }

    @Override // defpackage.tv0
    public final tv0 m() {
        return new am(((Double) this.P).doubleValue());
    }

    @Override // defpackage.tv0
    public final void o(o00 o00Var, int i) {
        r(Double.valueOf(o00Var.readDouble()));
    }

    @Override // defpackage.tv0
    public final void q(p00 p00Var, int i) {
        p00Var.writeDouble(((Double) this.P).doubleValue());
    }

    @Override // defpackage.tv0
    public final String v(int i) {
        return this.P + "d";
    }
}