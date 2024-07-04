package defpackage;

/* renamed from: rr0  reason: default package */
public final class rr0 extends ma0<Short> implements Comparable<rr0> {
    public rr0() {
        super((short) 0);
    }

    public rr0(short s) {
        super(Short.valueOf(s));
    }

    @Override // defpackage.tv0
    public final Object clone() {
        return new rr0(((Short) this.P).shortValue());
    }

    @Override // java.lang.Comparable
    public final int compareTo(rr0 rr0Var) {
        return ((Short) this.P).compareTo((Short) rr0Var.P);
    }

    @Override // defpackage.tv0
    public final boolean equals(Object obj) {
        if (super.equals(obj) && ((Number) this.P).shortValue() == ((Number) ((rr0) obj).P).shortValue()) {
            return true;
        }
        return false;
    }

    @Override // defpackage.tv0
    public final tv0 m() {
        return new rr0(((Short) this.P).shortValue());
    }

    @Override // defpackage.tv0
    public final void o(o00 o00Var, int i) {
        r(Short.valueOf((short) o00Var.readUnsignedShort()));
    }

    @Override // defpackage.tv0
    public final void q(p00 p00Var, int i) {
        p00Var.writeShort(((Short) this.P).shortValue());
    }

    @Override // defpackage.tv0
    public final String v(int i) {
        return this.P + "s";
    }
}