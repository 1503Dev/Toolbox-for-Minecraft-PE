package defpackage;

import java.nio.charset.StandardCharsets;

/* renamed from: gu0  reason: default package */
public final class gu0 extends tv0<String> implements Comparable<gu0> {
    public gu0() {
        super("");
    }

    public gu0(String str) {
        super(str);
    }

    @Override // defpackage.tv0
    public final Object clone() {
        return new gu0((String) this.P);
    }

    @Override // java.lang.Comparable
    public final int compareTo(gu0 gu0Var) {
        return ((String) this.P).compareTo((String) gu0Var.P);
    }

    @Override // defpackage.tv0
    public final boolean equals(Object obj) {
        if (super.equals(obj) && ((String) this.P).equals((String) ((gu0) obj).P)) {
            return true;
        }
        return false;
    }

    @Override // defpackage.tv0
    public final tv0<String> m() {
        return new gu0((String) this.P);
    }

    @Override // defpackage.tv0
    public final void o(o00 o00Var, int i) {
        int readUnsignedShort = o00Var.readUnsignedShort();
        byte[] bArr = new byte[readUnsignedShort];
        o00Var.readFully(bArr, 0, readUnsignedShort);
        super.r(new String(bArr, StandardCharsets.UTF_8));
    }

    @Override // defpackage.tv0
    public final void q(p00 p00Var, int i) {
        byte[] bytes = ((String) this.P).getBytes(StandardCharsets.UTF_8);
        p00Var.writeShort(bytes.length);
        p00Var.write(bytes);
    }

    @Override // defpackage.tv0
    public final void r(String str) {
        super.r(str);
    }

    @Override // defpackage.tv0
    public final String u(int i) {
        return tv0.p((String) this.P, false);
    }

    @Override // defpackage.tv0
    public final String v(int i) {
        return tv0.p((String) this.P, true);
    }
}