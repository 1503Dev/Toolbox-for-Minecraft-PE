package defpackage;

import defpackage.l4;
import defpackage.l4.c;
import java.util.Arrays;

/* renamed from: n4  reason: default package */
public final class n4<O extends l4.c> {
    public final int a;
    public final l4<O> b;
    public final O c;
    public final String d;

    public n4(l4<O> l4Var, O o, String str) {
        this.b = l4Var;
        this.c = o;
        this.d = str;
        this.a = Arrays.hashCode(new Object[]{l4Var, o, str});
    }

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (obj instanceof n4) {
            n4 n4Var = (n4) obj;
            return wa0.a(this.b, n4Var.b) && wa0.a(this.c, n4Var.c) && wa0.a(this.d, n4Var.d);
        }
        return false;
    }

    public final int hashCode() {
        return this.a;
    }
}