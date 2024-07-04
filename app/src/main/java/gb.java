package defpackage;

/* renamed from: gb  reason: default package */
public final class gb extends ma0<Byte> implements Comparable<gb> {
    public gb() {
        super((byte) 0);
    }

    public gb(byte b) {
        super(Byte.valueOf(b));
    }

    public gb(boolean z) {
        super(Byte.valueOf(z ? (byte) 1 : (byte) 0));
    }

    @Override // defpackage.tv0
    public final Object clone() {
        return new gb(((Byte) this.P).byteValue());
    }

    @Override // java.lang.Comparable
    public final int compareTo(gb gbVar) {
        return ((Byte) this.P).compareTo((Byte) gbVar.P);
    }

    @Override // defpackage.tv0
    public final boolean equals(Object obj) {
        if (super.equals(obj) && ((Number) this.P).byteValue() == ((Number) ((gb) obj).P).byteValue()) {
            return true;
        }
        return false;
    }

    @Override // defpackage.tv0
    public final tv0 m() {
        return new gb(((Byte) this.P).byteValue());
    }

    @Override // defpackage.tv0
    public final void o(o00 o00Var, int i) {
        r(Byte.valueOf((byte) o00Var.readUnsignedByte()));
    }

    @Override // defpackage.tv0
    public final void q(p00 p00Var, int i) {
        p00Var.writeByte(((Byte) this.P).byteValue());
    }

    @Override // defpackage.tv0
    public final String v(int i) {
        return this.P + "b";
    }
}