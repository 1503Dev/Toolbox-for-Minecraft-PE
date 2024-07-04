package defpackage;

import java.util.Arrays;

/* renamed from: t25  reason: default package */
public final class t25 extends b15 {
    public final int U;
    public final s25 V;

    public /* synthetic */ t25(int i, s25 s25Var) {
        this.U = i;
        this.V = s25Var;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof t25) {
            t25 t25Var = (t25) obj;
            return t25Var.U == this.U && t25Var.V == this.V;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.U), this.V});
    }

    public final String toString() {
        String valueOf = String.valueOf(this.V);
        int i = this.U;
        return "AesGcmSiv Parameters (variant: " + valueOf + ", " + i + "-byte key)";
    }
}