package defpackage;

import java.util.HashSet;

/* renamed from: ai3  reason: default package */
public class ai3 {
    public final int a;
    public final int b;
    public final boolean c;
    public final nv4 d;
    public final nv4 e;
    public final nv4 f;
    public final nv4 g;
    public final int h;
    public final sw4 i;
    public final sv4 j;

    static {
        new ai3(new eh3());
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
    }

    public ai3(eh3 eh3Var) {
        this.a = eh3Var.a;
        this.b = eh3Var.b;
        this.c = eh3Var.c;
        this.d = eh3Var.d;
        this.e = eh3Var.e;
        this.f = eh3Var.f;
        this.g = eh3Var.g;
        this.h = eh3Var.h;
        this.i = qv4.b(eh3Var.i);
        HashSet hashSet = eh3Var.j;
        int i = sv4.R;
        Object[] array = hashSet.toArray();
        this.j = sv4.u(array.length, array);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            ai3 ai3Var = (ai3) obj;
            if (this.c == ai3Var.c && this.a == ai3Var.a && this.b == ai3Var.b && this.d.equals(ai3Var.d) && this.e.equals(ai3Var.e) && this.f.equals(ai3Var.f) && this.g.equals(ai3Var.g) && this.h == ai3Var.h) {
                sw4 sw4Var = this.i;
                sw4 sw4Var2 = ai3Var.i;
                sw4Var.getClass();
                if (fw4.a(sw4Var2, sw4Var) && this.j.equals(ai3Var.j)) {
                    return true;
                }
            }
        }
        return false;
    }

    public int hashCode() {
        return (((((((((((((((((((((((this.c ? 1 : 0) - 1048002209) * 31) + this.a) * 31) + this.b) * 31) + this.d.hashCode()) * 961) + this.e.hashCode()) * 961) + Integer.MAX_VALUE) * 31) + Integer.MAX_VALUE) * 31) + this.f.hashCode()) * 31) + this.g.hashCode()) * 31) + this.h) * 28629151) + this.i.hashCode()) * 31) + this.j.hashCode();
    }
}