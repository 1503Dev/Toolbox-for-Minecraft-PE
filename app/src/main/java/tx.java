package defpackage;

import android.graphics.Insets;

/* renamed from: tx  reason: default package */
public final class tx {
    public static final tx e = new tx(0, 0, 0, 0);
    public final int a;
    public final int b;
    public final int c;
    public final int d;

    public tx(int i, int i2, int i3, int i4) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = i4;
    }

    public static tx a(int i, int i2, int i3, int i4) {
        return (i == 0 && i2 == 0 && i3 == 0 && i4 == 0) ? e : new tx(i, i2, i3, i4);
    }

    public final Insets b() {
        return Insets.of(this.a, this.b, this.c, this.d);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || tx.class != obj.getClass()) {
            return false;
        }
        tx txVar = (tx) obj;
        return this.d == txVar.d && this.a == txVar.a && this.c == txVar.c && this.b == txVar.b;
    }

    public final int hashCode() {
        return (((((this.a * 31) + this.b) * 31) + this.c) * 31) + this.d;
    }

    public final String toString() {
        StringBuilder b = e5.b("Insets{left=");
        b.append(this.a);
        b.append(", top=");
        b.append(this.b);
        b.append(", right=");
        b.append(this.c);
        b.append(", bottom=");
        b.append(this.d);
        b.append('}');
        return b.toString();
    }
}