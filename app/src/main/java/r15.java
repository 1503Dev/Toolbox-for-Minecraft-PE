package defpackage;

import java.util.Arrays;

/* renamed from: r15  reason: default package */
public final class r15 extends b15 {
    public final int U;
    public final int V;
    public final q15 W;

    public /* synthetic */ r15(int i, int i2, q15 q15Var) {
        this.U = i;
        this.V = i2;
        this.W = q15Var;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof r15) {
            r15 r15Var = (r15) obj;
            return r15Var.U == this.U && r15Var.V == this.V && r15Var.W == this.W;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.U), Integer.valueOf(this.V), 16, this.W});
    }

    public final String toString() {
        String valueOf = String.valueOf(this.W);
        int i = this.V;
        int i2 = this.U;
        return "AesEax Parameters (variant: " + valueOf + ", " + i + "-byte IV, 16-byte tag, and " + i2 + "-byte key)";
    }
}