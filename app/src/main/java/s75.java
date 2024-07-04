package defpackage;

import java.util.Arrays;

/* renamed from: s75  reason: default package */
public final class s75 extends w75 {
    public final int U;
    public final int V;
    public final r75 W;
    public final q75 X;

    public /* synthetic */ s75(int i, int i2, r75 r75Var, q75 q75Var) {
        this.U = i;
        this.V = i2;
        this.W = r75Var;
        this.X = q75Var;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof s75) {
            s75 s75Var = (s75) obj;
            return s75Var.U == this.U && s75Var.o() == o() && s75Var.W == this.W && s75Var.X == this.X;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.U), Integer.valueOf(this.V), this.W, this.X});
    }

    public final int o() {
        r75 r75Var = this.W;
        if (r75Var == r75.e) {
            return this.V;
        }
        if (r75Var == r75.b || r75Var == r75.c || r75Var == r75.d) {
            return this.V + 5;
        }
        throw new IllegalStateException("Unknown variant");
    }

    public final String toString() {
        String valueOf = String.valueOf(this.W);
        String valueOf2 = String.valueOf(this.X);
        int i = this.V;
        int i2 = this.U;
        StringBuilder b = sd1.b("HMAC Parameters (variant: ", valueOf, ", hashType: ", valueOf2, ", ");
        b.append(i);
        b.append("-byte tags, and ");
        b.append(i2);
        b.append("-byte key)");
        return b.toString();
    }
}