package defpackage;

import java.util.Arrays;

/* renamed from: m65  reason: default package */
public final class m65 {
    public final Class a;
    public final Class b;

    public /* synthetic */ m65(Class cls, Class cls2) {
        this.a = cls;
        this.b = cls2;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof m65) {
            m65 m65Var = (m65) obj;
            return m65Var.a.equals(this.a) && m65Var.b.equals(this.b);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b});
    }

    public final String toString() {
        return ij.c(this.a.getSimpleName(), " with primitive type: ", this.b.getSimpleName());
    }
}