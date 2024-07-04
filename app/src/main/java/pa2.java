package defpackage;

import defpackage.wa0;
import java.util.Arrays;

/* renamed from: pa2  reason: default package */
public final class pa2 {
    public final String a;
    public final double b;
    public final double c;
    public final double d;
    public final int e;

    public pa2(String str, double d, double d2, double d3, int i) {
        this.a = str;
        this.c = d;
        this.b = d2;
        this.d = d3;
        this.e = i;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof pa2) {
            pa2 pa2Var = (pa2) obj;
            return wa0.a(this.a, pa2Var.a) && this.b == pa2Var.b && this.c == pa2Var.c && this.e == pa2Var.e && Double.compare(this.d, pa2Var.d) == 0;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, Double.valueOf(this.b), Double.valueOf(this.c), Double.valueOf(this.d), Integer.valueOf(this.e)});
    }

    public final String toString() {
        wa0.a aVar = new wa0.a(this);
        aVar.a("name", this.a);
        aVar.a("minBound", Double.valueOf(this.c));
        aVar.a("maxBound", Double.valueOf(this.b));
        aVar.a("percent", Double.valueOf(this.d));
        aVar.a("count", Integer.valueOf(this.e));
        return aVar.toString();
    }
}