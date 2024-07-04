package defpackage;

import java.util.Arrays;

/* renamed from: u65  reason: default package */
public final class u65 {
    public final Class a;
    public final Class b;

    public /* synthetic */ u65(Class cls, Class cls2) {
        this.a = cls;
        this.b = cls2;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof u65) {
            u65 u65Var = (u65) obj;
            return u65Var.a.equals(this.a) && u65Var.b.equals(this.b);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b});
    }

    public final String toString() {
        return ij.c(this.a.getSimpleName(), " with serialization type: ", this.b.getSimpleName());
    }
}