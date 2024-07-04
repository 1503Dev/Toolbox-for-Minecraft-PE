package defpackage;

import java.util.Arrays;

/* renamed from: f75  reason: default package */
public final class f75 extends w75 {
    public final int U;
    public final int V;
    public final e75 W;

    public /* synthetic */ f75(int i, int i2, e75 e75Var) {
        this.U = i;
        this.V = i2;
        this.W = e75Var;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof f75) {
            f75 f75Var = (f75) obj;
            return f75Var.U == this.U && f75Var.o() == o() && f75Var.W == this.W;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.U), Integer.valueOf(this.V), this.W});
    }

    public final int o() {
        e75 e75Var = this.W;
        if (e75Var == e75.e) {
            return this.V;
        }
        if (e75Var == e75.b || e75Var == e75.c || e75Var == e75.d) {
            return this.V + 5;
        }
        throw new IllegalStateException("Unknown variant");
    }

    public final String toString() {
        String valueOf = String.valueOf(this.W);
        int i = this.V;
        int i2 = this.U;
        return "AES-CMAC Parameters (variant: " + valueOf + ", " + i + "-byte tags, and " + i2 + "-byte key)";
    }
}