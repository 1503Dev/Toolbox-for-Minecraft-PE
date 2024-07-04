package defpackage;

import android.content.Context;
import android.text.TextUtils;
import android.util.Pair;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.RandomAccess;

/* renamed from: oy5  reason: default package */
public final class oy5 extends ty5 {
    public static final mw4 j;
    public static final mw4 k;
    public final Object c;
    public final Context d;
    public final boolean e;
    public dy5 f;
    public hy5 g;
    public pm5 h;
    public final a53 i;

    static {
        mw4 zu4Var;
        mw4 zu4Var2;
        tx5 tx5Var = new Comparator() { // from class: tx5
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                Integer num = (Integer) obj;
                Integer num2 = (Integer) obj2;
                mw4 mw4Var = oy5.j;
                if (num.intValue() == -1) {
                    return num2.intValue() == -1 ? 0 : -1;
                } else if (num2.intValue() == -1) {
                    return 1;
                } else {
                    return num.intValue() - num2.intValue();
                }
            }
        };
        if (tx5Var instanceof mw4) {
            zu4Var = (mw4) tx5Var;
        } else {
            zu4Var = new zu4(tx5Var);
        }
        j = zu4Var;
        ux5 ux5Var = new Comparator() { // from class: ux5
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                Integer num = (Integer) obj;
                Integer num2 = (Integer) obj2;
                mw4 mw4Var = oy5.j;
                return 0;
            }
        };
        if (ux5Var instanceof mw4) {
            zu4Var2 = (mw4) ux5Var;
        } else {
            zu4Var2 = new zu4(ux5Var);
        }
        k = zu4Var2;
    }

    public oy5(Context context) {
        a53 a53Var = new a53();
        int i = dy5.s;
        dy5 dy5Var = new dy5(new cy5(context));
        this.c = new Object();
        this.d = context.getApplicationContext();
        this.i = a53Var;
        this.f = dy5Var;
        this.h = pm5.b;
        boolean d = zn4.d(context);
        this.e = d;
        if (!d && zn4.a >= 32) {
            this.g = hy5.a(context);
        }
        boolean z = this.f.n;
    }

    public static int f(cu1 cu1Var, String str, boolean z) {
        if (TextUtils.isEmpty(str) || !str.equals(cu1Var.c)) {
            String g = g(str);
            String g2 = g(cu1Var.c);
            if (g2 == null || g == null) {
                return (z && g2 == null) ? 1 : 0;
            } else if (g2.startsWith(g) || g.startsWith(g2)) {
                return 3;
            } else {
                int i = zn4.a;
                return g2.split("-", 2)[0].equals(g.split("-", 2)[0]) ? 2 : 0;
            }
        }
        return 4;
    }

    public static String g(String str) {
        if (TextUtils.isEmpty(str) || TextUtils.equals(str, "und")) {
            return null;
        }
        return str;
    }

    public static boolean h(int i, boolean z) {
        int i2 = i & 7;
        return i2 == 4 || (z && i2 == 3);
    }

    public static final Pair j(int i, sy5 sy5Var, int[][][] iArr, jy5 jy5Var, Comparator comparator) {
        RandomAccess randomAccess;
        ArrayList arrayList = new ArrayList();
        for (int i2 = 0; i2 < 2; i2++) {
            if (i == sy5Var.a[i2]) {
                hx5 hx5Var = sy5Var.b[i2];
                for (int i3 = 0; i3 < hx5Var.a; i3++) {
                    nw4 b = jy5Var.b(i2, hx5Var.a(i3), iArr[i2][i3]);
                    int i4 = 1;
                    boolean[] zArr = new boolean[1];
                    int i5 = 0;
                    while (i5 <= 0) {
                        ky5 ky5Var = (ky5) b.get(i5);
                        int b2 = ky5Var.b();
                        if (!zArr[i5] && b2 != 0) {
                            if (b2 == i4) {
                                randomAccess = nv4.v(ky5Var);
                            } else {
                                ArrayList arrayList2 = new ArrayList();
                                arrayList2.add(ky5Var);
                                for (int i6 = i5 + 1; i6 <= 0; i6++) {
                                    ky5 ky5Var2 = (ky5) b.get(i6);
                                    if (ky5Var2.b() == 2 && ky5Var.e(ky5Var2)) {
                                        arrayList2.add(ky5Var2);
                                        zArr[i6] = true;
                                    }
                                }
                                randomAccess = arrayList2;
                            }
                            arrayList.add(randomAccess);
                        }
                        i5++;
                        i4 = 1;
                    }
                }
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        List list = (List) Collections.max(arrayList, comparator);
        int[] iArr2 = new int[list.size()];
        for (int i7 = 0; i7 < list.size(); i7++) {
            iArr2[i7] = ((ky5) list.get(i7)).R;
        }
        ky5 ky5Var3 = (ky5) list.get(0);
        return Pair.create(new py5(ky5Var3.Q, iArr2), Integer.valueOf(ky5Var3.P));
    }

    @Override // defpackage.wy5
    public final void a() {
        hy5 hy5Var;
        synchronized (this.c) {
            if (zn4.a >= 32 && (hy5Var = this.g) != null) {
                hy5Var.c();
            }
        }
        super.a();
    }

    @Override // defpackage.wy5
    public final void b(pm5 pm5Var) {
        boolean z;
        synchronized (this.c) {
            z = !this.h.equals(pm5Var);
            this.h = pm5Var;
        }
        if (z) {
            i();
        }
    }

    @Override // defpackage.wy5
    public final void c() {
    }

    public final void i() {
        boolean z;
        vy5 vy5Var;
        hy5 hy5Var;
        synchronized (this.c) {
            z = false;
            if (this.f.n && !this.e && zn4.a >= 32 && (hy5Var = this.g) != null && hy5Var.b) {
                z = true;
            }
        }
        if (z && (vy5Var = this.a) != null) {
            ((dl4) ((im5) vy5Var).W).c(10);
        }
    }
}