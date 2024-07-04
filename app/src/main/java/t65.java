package defpackage;

import java.util.Arrays;

/* renamed from: t65  reason: default package */
public final class t65 {
    public final Class a;
    public final sc5 b;

    public /* synthetic */ t65(Class cls, sc5 sc5Var) {
        this.a = cls;
        this.b = sc5Var;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof t65) {
            t65 t65Var = (t65) obj;
            return t65Var.a.equals(this.a) && t65Var.b.equals(this.b);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b});
    }

    public final String toString() {
        return ij.c(this.a.getSimpleName(), ", object identifier: ", String.valueOf(this.b));
    }
}