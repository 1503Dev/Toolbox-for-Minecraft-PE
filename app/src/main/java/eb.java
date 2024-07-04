package defpackage;

import java.util.Arrays;

/* renamed from: eb  reason: default package */
public final class eb extends h7<byte[]> implements Comparable<eb> {
    public static final byte[] V = new byte[0];

    public eb() {
        super(V);
    }

    public eb(byte[] bArr) {
        super(bArr);
    }

    @Override // defpackage.tv0
    public final Object clone() {
        return new eb(Arrays.copyOf((byte[]) this.P, x()));
    }

    @Override // java.lang.Comparable
    public final int compareTo(eb ebVar) {
        return Integer.compare(x(), ebVar.x());
    }

    @Override // defpackage.tv0
    public final boolean equals(Object obj) {
        if (super.equals(obj) && Arrays.equals((byte[]) this.P, (byte[]) ((eb) obj).P)) {
            return true;
        }
        return false;
    }

    @Override // defpackage.tv0
    public final int hashCode() {
        return Arrays.hashCode((byte[]) this.P);
    }

    @Override // defpackage.tv0
    public final tv0 m() {
        return new eb(Arrays.copyOf((byte[]) this.P, x()));
    }

    @Override // defpackage.tv0
    public final void o(o00 o00Var, int i) {
        r(new byte[o00Var.readInt()]);
        o00Var.readFully((byte[]) this.P);
    }

    @Override // defpackage.tv0
    public final void q(p00 p00Var, int i) {
        p00Var.writeInt(x());
        p00Var.write((byte[]) this.P);
    }

    @Override // defpackage.tv0
    public final String v(int i) {
        return w("B", "b");
    }
}