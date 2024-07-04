package defpackage;

import java.util.Arrays;

/* renamed from: z15  reason: default package */
public final class z15 extends b15 {
    public final int U;
    public final y15 V;

    public /* synthetic */ z15(int i, y15 y15Var) {
        this.U = i;
        this.V = y15Var;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof z15) {
            z15 z15Var = (z15) obj;
            return z15Var.U == this.U && z15Var.V == this.V;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.U), 12, 16, this.V});
    }

    public final String toString() {
        String valueOf = String.valueOf(this.V);
        int i = this.U;
        return "AesGcm Parameters (variant: " + valueOf + ", 12-byte IV, 16-byte tag, and " + i + "-byte key)";
    }
}