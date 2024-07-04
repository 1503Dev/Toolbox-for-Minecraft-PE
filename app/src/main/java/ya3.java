package defpackage;

/* renamed from: ya3  reason: default package */
public final class ya3 {
    public Object a;
    public Object b;
    public int c;
    public long d;
    public boolean e;
    public jg3 f = jg3.b;

    static {
        Integer.toString(0, 36);
        Integer.toString(1, 36);
        Integer.toString(2, 36);
        Integer.toString(3, 36);
        Integer.toString(4, 36);
    }

    public final int a(int i) {
        int i2;
        iw2 a = this.f.a(i);
        int i3 = 0;
        while (true) {
            int[] iArr = a.c;
            if (i3 >= iArr.length || (i2 = iArr[i3]) == 0 || i2 == 1) {
                break;
            }
            i3++;
        }
        return i3;
    }

    public final long b(int i, int i2) {
        iw2 a = this.f.a(i);
        if (a.a != -1) {
            return a.d[i2];
        }
        return -9223372036854775807L;
    }

    public final void c(int i) {
        this.f.a(i).getClass();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && ya3.class.equals(obj.getClass())) {
            ya3 ya3Var = (ya3) obj;
            if (zn4.b(this.a, ya3Var.a) && zn4.b(this.b, ya3Var.b) && this.c == ya3Var.c && this.d == ya3Var.d && this.e == ya3Var.e && zn4.b(this.f, ya3Var.f)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        Object obj = this.a;
        int hashCode = obj == null ? 0 : obj.hashCode();
        Object obj2 = this.b;
        int hashCode2 = ((((hashCode + 217) * 31) + (obj2 != null ? obj2.hashCode() : 0)) * 31) + this.c;
        long j = this.d;
        return this.f.hashCode() + (((((hashCode2 * 31) + ((int) (j ^ (j >>> 32)))) * 961) + (this.e ? 1 : 0)) * 31);
    }
}