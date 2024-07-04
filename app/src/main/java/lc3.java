package defpackage;

import android.net.Uri;
import java.util.Collections;
import java.util.List;

/* renamed from: lc3  reason: default package */
public final class lc3 {
    public static final Object n = new Object();
    public static final el2 o;
    public Object a = n;
    public el2 b = o;
    public long c;
    public long d;
    public long e;
    public boolean f;
    public boolean g;
    @Deprecated
    public boolean h;
    public oc2 i;
    public boolean j;
    public long k;
    public int l;
    public int m;

    static {
        gg2 gg2Var;
        sw4 sw4Var = sw4.V;
        lv4 lv4Var = nv4.Q;
        nw4 nw4Var = nw4.T;
        List emptyList = Collections.emptyList();
        nw4 nw4Var2 = nw4.T;
        si2 si2Var = si2.a;
        Uri uri = Uri.EMPTY;
        if (uri != null) {
            gg2Var = new gg2(uri, emptyList, nw4Var2);
        } else {
            gg2Var = null;
        }
        o = new el2("androidx.media3.common.Timeline", new o52(0), gg2Var, new oc2(), nq2.y, si2Var);
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
    }

    public final void a(el2 el2Var, boolean z, boolean z2, oc2 oc2Var, long j) {
        this.a = n;
        if (el2Var == null) {
            el2Var = o;
        }
        this.b = el2Var;
        this.c = -9223372036854775807L;
        this.d = -9223372036854775807L;
        this.e = -9223372036854775807L;
        this.f = z;
        this.g = z2;
        this.h = oc2Var != null;
        this.i = oc2Var;
        this.k = j;
        this.l = 0;
        this.m = 0;
        this.j = false;
    }

    public final boolean b() {
        tv2.I(this.h == (this.i != null));
        return this.i != null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && lc3.class.equals(obj.getClass())) {
            lc3 lc3Var = (lc3) obj;
            if (zn4.b(this.a, lc3Var.a) && zn4.b(this.b, lc3Var.b) && zn4.b(null, null) && zn4.b(this.i, lc3Var.i) && this.c == lc3Var.c && this.d == lc3Var.d && this.e == lc3Var.e && this.f == lc3Var.f && this.g == lc3Var.g && this.j == lc3Var.j && this.k == lc3Var.k && this.l == lc3Var.l && this.m == lc3Var.m) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = ((this.a.hashCode() + 217) * 31) + this.b.hashCode();
        oc2 oc2Var = this.i;
        int hashCode2 = oc2Var == null ? 0 : oc2Var.hashCode();
        long j = this.c;
        long j2 = this.d;
        long j3 = this.e;
        int i = (((((((((((((hashCode * 961) + hashCode2) * 31) + ((int) (j ^ (j >>> 32)))) * 31) + ((int) (j2 ^ (j2 >>> 32)))) * 31) + ((int) (j3 ^ (j3 >>> 32)))) * 31) + (this.f ? 1 : 0)) * 31) + (this.g ? 1 : 0)) * 31) + (this.j ? 1 : 0);
        long j4 = this.k;
        return ((((((i * 961) + ((int) (j4 ^ (j4 >>> 32)))) * 31) + this.l) * 31) + this.m) * 31;
    }
}