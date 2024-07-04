package defpackage;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* renamed from: cu1  reason: default package */
public final class cu1 {
    public static final /* synthetic */ int F = 0;
    public final int A;
    public final int B;
    public final int C;
    public final int D;
    public int E;
    public final String a;
    public final String b;
    public final String c;
    public final int d;
    public final int e;
    public final int f;
    public final int g;
    public final String h;
    public final yt2 i;
    public final String j;
    public final String k;
    public final int l;
    public final List m;
    public final al1 n;
    public final long o;
    public final int p;
    public final int q;
    public final float r;
    public final int s;
    public final float t;
    public final byte[] u;
    public final int v;
    public final eu5 w;
    public final int x;
    public final int y;
    public final int z;

    static {
        new cu1(new bs1());
        Integer.toString(0, 36);
        Integer.toString(1, 36);
        Integer.toString(2, 36);
        Integer.toString(3, 36);
        Integer.toString(4, 36);
        Integer.toString(5, 36);
        Integer.toString(6, 36);
        Integer.toString(7, 36);
        Integer.toString(8, 36);
        Integer.toString(9, 36);
        Integer.toString(10, 36);
        Integer.toString(11, 36);
        Integer.toString(12, 36);
        Integer.toString(13, 36);
        Integer.toString(14, 36);
        Integer.toString(15, 36);
        Integer.toString(16, 36);
        Integer.toString(17, 36);
        Integer.toString(18, 36);
        Integer.toString(19, 36);
        Integer.toString(20, 36);
        Integer.toString(21, 36);
        Integer.toString(22, 36);
        Integer.toString(23, 36);
        Integer.toString(24, 36);
        Integer.toString(25, 36);
        Integer.toString(26, 36);
        Integer.toString(27, 36);
        Integer.toString(28, 36);
        Integer.toString(29, 36);
        Integer.toString(30, 36);
        Integer.toString(31, 36);
    }

    public cu1(bs1 bs1Var) {
        this.a = bs1Var.a;
        this.b = bs1Var.b;
        this.c = zn4.w(bs1Var.c);
        this.d = bs1Var.d;
        int i = bs1Var.e;
        this.e = i;
        int i2 = bs1Var.f;
        this.f = i2;
        this.g = i2 != -1 ? i2 : i;
        this.h = bs1Var.g;
        this.i = bs1Var.h;
        this.j = bs1Var.i;
        this.k = bs1Var.j;
        this.l = bs1Var.k;
        List list = bs1Var.l;
        this.m = list == null ? Collections.emptyList() : list;
        al1 al1Var = bs1Var.m;
        this.n = al1Var;
        this.o = bs1Var.n;
        this.p = bs1Var.o;
        this.q = bs1Var.p;
        this.r = bs1Var.q;
        int i3 = bs1Var.r;
        this.s = i3 == -1 ? 0 : i3;
        float f = bs1Var.s;
        this.t = f == -1.0f ? 1.0f : f;
        this.u = bs1Var.t;
        this.v = bs1Var.u;
        this.w = bs1Var.v;
        this.x = bs1Var.w;
        this.y = bs1Var.x;
        this.z = bs1Var.y;
        int i4 = bs1Var.z;
        this.A = i4 == -1 ? 0 : i4;
        int i5 = bs1Var.A;
        this.B = i5 != -1 ? i5 : 0;
        this.C = bs1Var.B;
        int i6 = bs1Var.C;
        if (i6 == 0 && al1Var != null) {
            this.D = 1;
        } else {
            this.D = i6;
        }
    }

    public final boolean a(cu1 cu1Var) {
        if (this.m.size() == cu1Var.m.size()) {
            for (int i = 0; i < this.m.size(); i++) {
                if (!Arrays.equals((byte[]) this.m.get(i), (byte[]) cu1Var.m.get(i))) {
                    return false;
                }
            }
            return true;
        }
        return false;
    }

    public final boolean equals(Object obj) {
        int i;
        if (this == obj) {
            return true;
        }
        if (obj != null && cu1.class == obj.getClass()) {
            cu1 cu1Var = (cu1) obj;
            int i2 = this.E;
            if ((i2 == 0 || (i = cu1Var.E) == 0 || i2 == i) && this.d == cu1Var.d && this.e == cu1Var.e && this.f == cu1Var.f && this.l == cu1Var.l && this.o == cu1Var.o && this.p == cu1Var.p && this.q == cu1Var.q && this.s == cu1Var.s && this.v == cu1Var.v && this.x == cu1Var.x && this.y == cu1Var.y && this.z == cu1Var.z && this.A == cu1Var.A && this.B == cu1Var.B && this.C == cu1Var.C && this.D == cu1Var.D && Float.compare(this.r, cu1Var.r) == 0 && Float.compare(this.t, cu1Var.t) == 0 && zn4.b(this.a, cu1Var.a) && zn4.b(this.b, cu1Var.b) && zn4.b(this.h, cu1Var.h) && zn4.b(this.j, cu1Var.j) && zn4.b(this.k, cu1Var.k) && zn4.b(this.c, cu1Var.c) && Arrays.equals(this.u, cu1Var.u) && zn4.b(this.i, cu1Var.i) && zn4.b(this.w, cu1Var.w) && zn4.b(this.n, cu1Var.n) && a(cu1Var)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = this.E;
        if (i == 0) {
            String str = this.a;
            int hashCode = str == null ? 0 : str.hashCode();
            String str2 = this.b;
            int hashCode2 = str2 != null ? str2.hashCode() : 0;
            int i2 = hashCode + 527;
            String str3 = this.c;
            int hashCode3 = (((((((((i2 * 31) + hashCode2) * 31) + (str3 == null ? 0 : str3.hashCode())) * 31) + this.d) * 961) + this.e) * 31) + this.f;
            String str4 = this.h;
            int hashCode4 = ((hashCode3 * 31) + (str4 == null ? 0 : str4.hashCode())) * 31;
            yt2 yt2Var = this.i;
            int hashCode5 = (hashCode4 + (yt2Var == null ? 0 : yt2Var.hashCode())) * 31;
            String str5 = this.j;
            int hashCode6 = (hashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
            String str6 = this.k;
            int hashCode7 = str6 != null ? str6.hashCode() : 0;
            int floatToIntBits = ((((((((((((((((((((Float.floatToIntBits(this.t) + ((((Float.floatToIntBits(this.r) + ((((((((((hashCode6 + hashCode7) * 31) + this.l) * 31) + ((int) this.o)) * 31) + this.p) * 31) + this.q) * 31)) * 31) + this.s) * 31)) * 31) + this.v) * 31) + this.x) * 31) + this.y) * 31) + this.z) * 31) + this.A) * 31) + this.B) * 31) + this.C) * 31) - 1) * 31) - 1) * 31) + this.D;
            this.E = floatToIntBits;
            return floatToIntBits;
        }
        return i;
    }

    public final String toString() {
        String str = this.a;
        String str2 = this.b;
        String str3 = this.j;
        String str4 = this.k;
        String str5 = this.h;
        int i = this.g;
        String str6 = this.c;
        int i2 = this.p;
        int i3 = this.q;
        float f = this.r;
        int i4 = this.x;
        int i5 = this.y;
        StringBuilder b = sd1.b("Format(", str, ", ", str2, ", ");
        b.append(str3);
        b.append(", ");
        b.append(str4);
        b.append(", ");
        b.append(str5);
        b.append(", ");
        b.append(i);
        b.append(", ");
        b.append(str6);
        b.append(", [");
        b.append(i2);
        b.append(", ");
        b.append(i3);
        b.append(", ");
        b.append(f);
        b.append("], [");
        b.append(i4);
        b.append(", ");
        b.append(i5);
        b.append("])");
        return b.toString();
    }
}