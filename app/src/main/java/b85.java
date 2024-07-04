package defpackage;

import java.util.Arrays;

/* renamed from: b85  reason: default package */
public final class b85 {
    public final g05 a;
    public final int b;
    public final String c;
    public final String d;

    public /* synthetic */ b85(g05 g05Var, int i, String str, String str2) {
        this.a = g05Var;
        this.b = i;
        this.c = str;
        this.d = str2;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof b85) {
            b85 b85Var = (b85) obj;
            return this.a == b85Var.a && this.b == b85Var.b && this.c.equals(b85Var.c) && this.d.equals(b85Var.d);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, Integer.valueOf(this.b), this.c, this.d});
    }

    public final String toString() {
        return String.format("(status=%s, keyId=%s, keyType='%s', keyPrefix='%s')", this.a, Integer.valueOf(this.b), this.c, this.d);
    }
}