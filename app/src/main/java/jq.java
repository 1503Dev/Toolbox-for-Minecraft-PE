package defpackage;

/* renamed from: jq  reason: default package */
public final class jq extends ma0<Float> implements Comparable<jq> {
    public jq() {
        super(Float.valueOf(0.0f));
    }

    public jq(float f) {
        super(Float.valueOf(f));
    }

    @Override // defpackage.tv0
    public final Object clone() {
        return new jq(((Float) this.P).floatValue());
    }

    @Override // java.lang.Comparable
    public final int compareTo(jq jqVar) {
        return ((Float) this.P).compareTo((Float) jqVar.P);
    }

    @Override // defpackage.tv0
    public final boolean equals(Object obj) {
        if (super.equals(obj) && ((Float) this.P).equals(((jq) obj).P)) {
            return true;
        }
        return false;
    }

    @Override // defpackage.tv0
    public final tv0 m() {
        return new jq(((Float) this.P).floatValue());
    }

    @Override // defpackage.tv0
    public final void o(o00 o00Var, int i) {
        r(Float.valueOf(o00Var.readFloat()));
    }

    @Override // defpackage.tv0
    public final void q(p00 p00Var, int i) {
        p00Var.writeFloat(((Float) this.P).floatValue());
    }

    @Override // defpackage.tv0
    public final String v(int i) {
        return this.P + "f";
    }
}