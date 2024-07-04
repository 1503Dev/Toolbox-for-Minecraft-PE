package defpackage;

import java.util.Arrays;

/* renamed from: wx  reason: default package */
public final class wx extends h7<int[]> implements Comparable<wx> {
    public static final int[] V = new int[0];

    public wx() {
        super(V);
    }

    public wx(int[] iArr) {
        super(iArr);
    }

    @Override // defpackage.tv0
    public final Object clone() {
        return new wx(Arrays.copyOf((int[]) this.P, x()));
    }

    @Override // java.lang.Comparable
    public final int compareTo(wx wxVar) {
        return Integer.compare(x(), wxVar.x());
    }

    @Override // defpackage.tv0
    public final boolean equals(Object obj) {
        if (super.equals(obj) && Arrays.equals((int[]) this.P, (int[]) ((wx) obj).P)) {
            return true;
        }
        return false;
    }

    @Override // defpackage.tv0
    public final int hashCode() {
        return Arrays.hashCode((int[]) this.P);
    }

    @Override // defpackage.tv0
    public final tv0 m() {
        return new wx(Arrays.copyOf((int[]) this.P, x()));
    }

    @Override // defpackage.tv0
    public final void o(o00 o00Var, int i) {
        int readInt = o00Var.readInt();
        r(new int[readInt]);
        for (int i2 = 0; i2 < readInt; i2++) {
            ((int[]) this.P)[i2] = o00Var.readInt();
        }
    }

    @Override // defpackage.tv0
    public final void q(p00 p00Var, int i) {
        p00Var.writeInt(x());
        for (int i2 : (int[]) this.P) {
            p00Var.writeInt(i2);
        }
    }

    @Override // defpackage.tv0
    public final String v(int i) {
        return w("I", "");
    }
}