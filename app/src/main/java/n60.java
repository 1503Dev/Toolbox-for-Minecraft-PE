package defpackage;

import java.util.Objects;

/* renamed from: n60  reason: default package */
public final class n60 {
    public static final n60 c = new n60(-1, null);
    public static final n60 d = new n60(2, null);
    public static final n60 e = new n60(3, null);
    public static final n60 f = new n60(4, null);
    public static final n60 g = new n60(5, null);
    public static final n60 h = new n60(6, null);
    public static final n60 i = new n60(7, null);
    public static final n60 j = new n60(8, null);
    public static final n60 k = new n60(9, null);
    public int a;
    public String b;

    public n60(int i2, String str) {
        this.a = i2;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof n60) {
            n60 n60Var = (n60) obj;
            return this.a == n60Var.a && Objects.equals(this.b, n60Var.b);
        }
        return false;
    }

    public final String toString() {
        StringBuilder b = e5.b("Token(");
        b.append(this.a);
        b.append(", ");
        return qq.d(b, this.b, ")");
    }
}