package defpackage;

import java.util.List;
import java.util.logging.Logger;

/* renamed from: ss3  reason: default package */
public final class ss3 {
    public static final Class a;
    public static final z44 b;
    public static final z44 c;
    public static final n64 d;

    static {
        Class<?> cls;
        try {
            cls = Class.forName("com.google.protobuf.GeneratedMessage");
        } catch (Throwable unused) {
            cls = null;
        }
        a = cls;
        b = u(false);
        c = u(true);
        d = new n64();
    }

    public static int A(List list) {
        return list.size() * 4;
    }

    public static int B(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (hg2.c0(i << 3) + 8) * size;
    }

    public static int C(List list) {
        return list.size() * 8;
    }

    public static int D(int i, List list, lr3 lr3Var) {
        int size = list.size();
        if (size != 0) {
            int i2 = 0;
            for (int i3 = 0; i3 < size; i3++) {
                i2 += hg2.Z(i, (fk3) list.get(i3), lr3Var);
            }
            return i2;
        }
        return 0;
    }

    public static int E(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (hg2.c0(i << 3) * size) + F(list);
    }

    public static int F(List list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof ly2) {
            ly2 ly2Var = (ly2) list;
            i = 0;
            while (i2 < size) {
                ly2Var.m(i2);
                i += hg2.a0(ly2Var.Q[i2]);
                i2++;
            }
        } else {
            i = 0;
            while (i2 < size) {
                i += hg2.a0(((Integer) list.get(i2)).intValue());
                i2++;
            }
        }
        return i;
    }

    public static int G(int i, List list) {
        if (list.size() == 0) {
            return 0;
        }
        return (hg2.c0(i << 3) * list.size()) + H(list);
    }

    public static int H(List list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof mc3) {
            mc3 mc3Var = (mc3) list;
            i = 0;
            while (i2 < size) {
                mc3Var.m(i2);
                i += hg2.d0(mc3Var.Q[i2]);
                i2++;
            }
        } else {
            i = 0;
            while (i2 < size) {
                i += hg2.d0(((Long) list.get(i2)).longValue());
                i2++;
            }
        }
        return i;
    }

    public static int I(int i, lr3 lr3Var, Object obj) {
        int i2;
        int a2;
        int c0;
        if (obj instanceof d53) {
            d53 d53Var = (d53) obj;
            i2 = i << 3;
            Logger logger = hg2.R;
            if (d53Var.b != null) {
                a2 = ((p52) d53Var.b).R.length;
            } else if (d53Var.a != null) {
                a2 = d53Var.a.i();
            } else {
                a2 = 0;
            }
            c0 = hg2.c0(a2);
        } else {
            i2 = i << 3;
            Logger logger2 = hg2.R;
            a2 = ((du1) ((fk3) obj)).a(lr3Var);
            c0 = hg2.c0(a2);
        }
        return hg2.c0(i2) + c0 + a2;
    }

    public static int J(int i, List list, lr3 lr3Var) {
        int a2;
        int c0;
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int c02 = hg2.c0(i << 3) * size;
        for (int i2 = 0; i2 < size; i2++) {
            Object obj = list.get(i2);
            if (obj instanceof d53) {
                d53 d53Var = (d53) obj;
                if (d53Var.b != null) {
                    a2 = ((p52) d53Var.b).R.length;
                } else if (d53Var.a != null) {
                    a2 = d53Var.a.i();
                } else {
                    a2 = 0;
                }
                c0 = hg2.c0(a2);
            } else {
                a2 = ((du1) ((fk3) obj)).a(lr3Var);
                c0 = hg2.c0(a2);
            }
            c02 = c0 + a2 + c02;
        }
        return c02;
    }

    public static int K(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (hg2.c0(i << 3) * size) + L(list);
    }

    public static int L(List list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof ly2) {
            ly2 ly2Var = (ly2) list;
            i = 0;
            while (i2 < size) {
                ly2Var.m(i2);
                int i3 = ly2Var.Q[i2];
                i += hg2.c0((i3 >> 31) ^ (i3 + i3));
                i2++;
            }
        } else {
            i = 0;
            while (i2 < size) {
                int intValue = ((Integer) list.get(i2)).intValue();
                i += hg2.c0((intValue >> 31) ^ (intValue + intValue));
                i2++;
            }
        }
        return i;
    }

    public static int M(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (hg2.c0(i << 3) * size) + N(list);
    }

    public static int N(List list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof mc3) {
            mc3 mc3Var = (mc3) list;
            i = 0;
            while (i2 < size) {
                mc3Var.m(i2);
                long j = mc3Var.Q[i2];
                i += hg2.d0((j >> 63) ^ (j + j));
                i2++;
            }
        } else {
            i = 0;
            while (i2 < size) {
                long longValue = ((Long) list.get(i2)).longValue();
                i += hg2.d0((longValue >> 63) ^ (longValue + longValue));
                i2++;
            }
        }
        return i;
    }

    public static int O(int i, List list) {
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        Logger logger = hg2.R;
        boolean z = list instanceof s63;
        int c0 = hg2.c0(i << 3) * size;
        if (z) {
            s63 s63Var = (s63) list;
            while (i2 < size) {
                Object A = s63Var.A(i2);
                if (A instanceof y82) {
                    int m = ((y82) A).m();
                    c0 = hg2.c0(m) + m + c0;
                } else {
                    c0 = hg2.b0((String) A) + c0;
                }
                i2++;
            }
        } else {
            while (i2 < size) {
                Object obj = list.get(i2);
                if (obj instanceof y82) {
                    int m2 = ((y82) obj).m();
                    c0 = hg2.c0(m2) + m2 + c0;
                } else {
                    c0 = hg2.b0((String) obj) + c0;
                }
                i2++;
            }
        }
        return c0;
    }

    public static int P(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (hg2.c0(i << 3) * size) + Q(list);
    }

    public static int Q(List list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof ly2) {
            ly2 ly2Var = (ly2) list;
            i = 0;
            while (i2 < size) {
                ly2Var.m(i2);
                i += hg2.c0(ly2Var.Q[i2]);
                i2++;
            }
        } else {
            i = 0;
            while (i2 < size) {
                i += hg2.c0(((Integer) list.get(i2)).intValue());
                i2++;
            }
        }
        return i;
    }

    public static int R(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (hg2.c0(i << 3) * size) + S(list);
    }

    public static int S(List list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof mc3) {
            mc3 mc3Var = (mc3) list;
            i = 0;
            while (i2 < size) {
                mc3Var.m(i2);
                i += hg2.d0(mc3Var.Q[i2]);
                i2++;
            }
        } else {
            i = 0;
            while (i2 < size) {
                i += hg2.d0(((Long) list.get(i2)).longValue());
                i2++;
            }
        }
        return i;
    }

    public static Object a(Object obj, int i, int i2, Object obj2, z44 z44Var) {
        if (obj2 == null) {
            obj2 = z44Var.c(obj);
        }
        z44Var.f(i, i2, obj2);
        return obj2;
    }

    public static void b(int i, List list, eh2 eh2Var, boolean z) {
        if (list != null && !list.isEmpty()) {
            int i2 = 0;
            if (z) {
                eh2Var.a.U(i, 2);
                int i3 = 0;
                for (int i4 = 0; i4 < list.size(); i4++) {
                    ((Boolean) list.get(i4)).booleanValue();
                    i3++;
                }
                eh2Var.a.W(i3);
                while (i2 < list.size()) {
                    eh2Var.a.K(((Boolean) list.get(i2)).booleanValue() ? (byte) 1 : (byte) 0);
                    i2++;
                }
                return;
            }
            eh2Var.getClass();
            while (i2 < list.size()) {
                eh2Var.a.L(i, ((Boolean) list.get(i2)).booleanValue());
                i2++;
            }
        }
    }

    public static void c(int i, List list, eh2 eh2Var) {
        if (list == null || list.isEmpty()) {
            return;
        }
        eh2Var.getClass();
        for (int i2 = 0; i2 < list.size(); i2++) {
            eh2Var.a.M(i, (y82) list.get(i2));
        }
    }

    public static void d(int i, List list, eh2 eh2Var, boolean z) {
        if (list != null && !list.isEmpty()) {
            int i2 = 0;
            if (z) {
                eh2Var.a.U(i, 2);
                int i3 = 0;
                for (int i4 = 0; i4 < list.size(); i4++) {
                    ((Double) list.get(i4)).doubleValue();
                    i3 += 8;
                }
                eh2Var.a.W(i3);
                while (i2 < list.size()) {
                    eh2Var.a.Q(Double.doubleToRawLongBits(((Double) list.get(i2)).doubleValue()));
                    i2++;
                }
                return;
            }
            eh2Var.getClass();
            while (i2 < list.size()) {
                eh2Var.a.P(Double.doubleToRawLongBits(((Double) list.get(i2)).doubleValue()), i);
                i2++;
            }
        }
    }

    public static void e(int i, List list, eh2 eh2Var, boolean z) {
        if (list != null && !list.isEmpty()) {
            int i2 = 0;
            if (z) {
                eh2Var.a.U(i, 2);
                int i3 = 0;
                for (int i4 = 0; i4 < list.size(); i4++) {
                    i3 += hg2.a0(((Integer) list.get(i4)).intValue());
                }
                eh2Var.a.W(i3);
                while (i2 < list.size()) {
                    eh2Var.a.S(((Integer) list.get(i2)).intValue());
                    i2++;
                }
                return;
            }
            eh2Var.getClass();
            while (i2 < list.size()) {
                eh2Var.a.R(i, ((Integer) list.get(i2)).intValue());
                i2++;
            }
        }
    }

    public static void f(int i, List list, eh2 eh2Var, boolean z) {
        if (list != null && !list.isEmpty()) {
            int i2 = 0;
            if (z) {
                eh2Var.a.U(i, 2);
                int i3 = 0;
                for (int i4 = 0; i4 < list.size(); i4++) {
                    ((Integer) list.get(i4)).intValue();
                    i3 += 4;
                }
                eh2Var.a.W(i3);
                while (i2 < list.size()) {
                    eh2Var.a.O(((Integer) list.get(i2)).intValue());
                    i2++;
                }
                return;
            }
            eh2Var.getClass();
            while (i2 < list.size()) {
                eh2Var.a.N(i, ((Integer) list.get(i2)).intValue());
                i2++;
            }
        }
    }

    public static void g(int i, List list, eh2 eh2Var, boolean z) {
        if (list != null && !list.isEmpty()) {
            int i2 = 0;
            if (z) {
                eh2Var.a.U(i, 2);
                int i3 = 0;
                for (int i4 = 0; i4 < list.size(); i4++) {
                    ((Long) list.get(i4)).longValue();
                    i3 += 8;
                }
                eh2Var.a.W(i3);
                while (i2 < list.size()) {
                    eh2Var.a.Q(((Long) list.get(i2)).longValue());
                    i2++;
                }
                return;
            }
            eh2Var.getClass();
            while (i2 < list.size()) {
                eh2Var.a.P(((Long) list.get(i2)).longValue(), i);
                i2++;
            }
        }
    }

    public static void h(int i, List list, eh2 eh2Var, boolean z) {
        if (list != null && !list.isEmpty()) {
            int i2 = 0;
            if (z) {
                eh2Var.a.U(i, 2);
                int i3 = 0;
                for (int i4 = 0; i4 < list.size(); i4++) {
                    ((Float) list.get(i4)).floatValue();
                    i3 += 4;
                }
                eh2Var.a.W(i3);
                while (i2 < list.size()) {
                    eh2Var.a.O(Float.floatToRawIntBits(((Float) list.get(i2)).floatValue()));
                    i2++;
                }
                return;
            }
            eh2Var.getClass();
            while (i2 < list.size()) {
                eh2Var.a.N(i, Float.floatToRawIntBits(((Float) list.get(i2)).floatValue()));
                i2++;
            }
        }
    }

    public static void i(int i, List list, eh2 eh2Var, lr3 lr3Var) {
        if (list == null || list.isEmpty()) {
            return;
        }
        for (int i2 = 0; i2 < list.size(); i2++) {
            eh2Var.l(i, lr3Var, list.get(i2));
        }
    }

    public static void j(int i, List list, eh2 eh2Var, boolean z) {
        if (list != null && !list.isEmpty()) {
            int i2 = 0;
            if (z) {
                eh2Var.a.U(i, 2);
                int i3 = 0;
                for (int i4 = 0; i4 < list.size(); i4++) {
                    i3 += hg2.a0(((Integer) list.get(i4)).intValue());
                }
                eh2Var.a.W(i3);
                while (i2 < list.size()) {
                    eh2Var.a.S(((Integer) list.get(i2)).intValue());
                    i2++;
                }
                return;
            }
            eh2Var.getClass();
            while (i2 < list.size()) {
                eh2Var.a.R(i, ((Integer) list.get(i2)).intValue());
                i2++;
            }
        }
    }

    public static void k(int i, List list, eh2 eh2Var, boolean z) {
        if (list != null && !list.isEmpty()) {
            int i2 = 0;
            if (z) {
                eh2Var.a.U(i, 2);
                int i3 = 0;
                for (int i4 = 0; i4 < list.size(); i4++) {
                    i3 += hg2.d0(((Long) list.get(i4)).longValue());
                }
                eh2Var.a.W(i3);
                while (i2 < list.size()) {
                    eh2Var.a.Y(((Long) list.get(i2)).longValue());
                    i2++;
                }
                return;
            }
            eh2Var.getClass();
            while (i2 < list.size()) {
                eh2Var.a.X(((Long) list.get(i2)).longValue(), i);
                i2++;
            }
        }
    }

    public static void l(int i, List list, eh2 eh2Var, lr3 lr3Var) {
        if (list == null || list.isEmpty()) {
            return;
        }
        for (int i2 = 0; i2 < list.size(); i2++) {
            eh2Var.o(i, lr3Var, list.get(i2));
        }
    }

    public static void m(int i, List list, eh2 eh2Var, boolean z) {
        if (list != null && !list.isEmpty()) {
            int i2 = 0;
            if (z) {
                eh2Var.a.U(i, 2);
                int i3 = 0;
                for (int i4 = 0; i4 < list.size(); i4++) {
                    ((Integer) list.get(i4)).intValue();
                    i3 += 4;
                }
                eh2Var.a.W(i3);
                while (i2 < list.size()) {
                    eh2Var.a.O(((Integer) list.get(i2)).intValue());
                    i2++;
                }
                return;
            }
            eh2Var.getClass();
            while (i2 < list.size()) {
                eh2Var.a.N(i, ((Integer) list.get(i2)).intValue());
                i2++;
            }
        }
    }

    public static void n(int i, List list, eh2 eh2Var, boolean z) {
        if (list != null && !list.isEmpty()) {
            int i2 = 0;
            if (z) {
                eh2Var.a.U(i, 2);
                int i3 = 0;
                for (int i4 = 0; i4 < list.size(); i4++) {
                    ((Long) list.get(i4)).longValue();
                    i3 += 8;
                }
                eh2Var.a.W(i3);
                while (i2 < list.size()) {
                    eh2Var.a.Q(((Long) list.get(i2)).longValue());
                    i2++;
                }
                return;
            }
            eh2Var.getClass();
            while (i2 < list.size()) {
                eh2Var.a.P(((Long) list.get(i2)).longValue(), i);
                i2++;
            }
        }
    }

    public static void o(int i, List list, eh2 eh2Var, boolean z) {
        if (list != null && !list.isEmpty()) {
            int i2 = 0;
            if (z) {
                eh2Var.a.U(i, 2);
                int i3 = 0;
                for (int i4 = 0; i4 < list.size(); i4++) {
                    int intValue = ((Integer) list.get(i4)).intValue();
                    i3 += hg2.c0((intValue >> 31) ^ (intValue + intValue));
                }
                eh2Var.a.W(i3);
                while (i2 < list.size()) {
                    hg2 hg2Var = eh2Var.a;
                    int intValue2 = ((Integer) list.get(i2)).intValue();
                    hg2Var.W((intValue2 >> 31) ^ (intValue2 + intValue2));
                    i2++;
                }
                return;
            }
            eh2Var.getClass();
            while (i2 < list.size()) {
                hg2 hg2Var2 = eh2Var.a;
                int intValue3 = ((Integer) list.get(i2)).intValue();
                hg2Var2.V(i, (intValue3 >> 31) ^ (intValue3 + intValue3));
                i2++;
            }
        }
    }

    public static void p(int i, List list, eh2 eh2Var, boolean z) {
        if (list != null && !list.isEmpty()) {
            int i2 = 0;
            if (z) {
                eh2Var.a.U(i, 2);
                int i3 = 0;
                for (int i4 = 0; i4 < list.size(); i4++) {
                    long longValue = ((Long) list.get(i4)).longValue();
                    i3 += hg2.d0((longValue >> 63) ^ (longValue + longValue));
                }
                eh2Var.a.W(i3);
                while (i2 < list.size()) {
                    hg2 hg2Var = eh2Var.a;
                    long longValue2 = ((Long) list.get(i2)).longValue();
                    hg2Var.Y((longValue2 >> 63) ^ (longValue2 + longValue2));
                    i2++;
                }
                return;
            }
            eh2Var.getClass();
            while (i2 < list.size()) {
                hg2 hg2Var2 = eh2Var.a;
                long longValue3 = ((Long) list.get(i2)).longValue();
                hg2Var2.X((longValue3 >> 63) ^ (longValue3 + longValue3), i);
                i2++;
            }
        }
    }

    public static void q(int i, List list, eh2 eh2Var) {
        if (list == null || list.isEmpty()) {
            return;
        }
        eh2Var.getClass();
        int i2 = 0;
        if (!(list instanceof s63)) {
            while (i2 < list.size()) {
                eh2Var.a.T(i, (String) list.get(i2));
                i2++;
            }
            return;
        }
        s63 s63Var = (s63) list;
        while (i2 < list.size()) {
            Object A = s63Var.A(i2);
            if (A instanceof String) {
                eh2Var.a.T(i, (String) A);
            } else {
                eh2Var.a.M(i, (y82) A);
            }
            i2++;
        }
    }

    public static void r(int i, List list, eh2 eh2Var, boolean z) {
        if (list != null && !list.isEmpty()) {
            int i2 = 0;
            if (z) {
                eh2Var.a.U(i, 2);
                int i3 = 0;
                for (int i4 = 0; i4 < list.size(); i4++) {
                    i3 += hg2.c0(((Integer) list.get(i4)).intValue());
                }
                eh2Var.a.W(i3);
                while (i2 < list.size()) {
                    eh2Var.a.W(((Integer) list.get(i2)).intValue());
                    i2++;
                }
                return;
            }
            eh2Var.getClass();
            while (i2 < list.size()) {
                eh2Var.a.V(i, ((Integer) list.get(i2)).intValue());
                i2++;
            }
        }
    }

    public static void s(int i, List list, eh2 eh2Var, boolean z) {
        if (list != null && !list.isEmpty()) {
            int i2 = 0;
            if (z) {
                eh2Var.a.U(i, 2);
                int i3 = 0;
                for (int i4 = 0; i4 < list.size(); i4++) {
                    i3 += hg2.d0(((Long) list.get(i4)).longValue());
                }
                eh2Var.a.W(i3);
                while (i2 < list.size()) {
                    eh2Var.a.Y(((Long) list.get(i2)).longValue());
                    i2++;
                }
                return;
            }
            eh2Var.getClass();
            while (i2 < list.size()) {
                eh2Var.a.X(((Long) list.get(i2)).longValue(), i);
                i2++;
            }
        }
    }

    public static boolean t(Object obj, Object obj2) {
        return obj == obj2 || (obj != null && obj.equals(obj2));
    }

    public static z44 u(boolean z) {
        Class<?> cls;
        try {
            cls = Class.forName("com.google.protobuf.UnknownFieldSetSchema");
        } catch (Throwable unused) {
            cls = null;
        }
        if (cls == null) {
            return null;
        }
        try {
            return (z44) cls.getConstructor(Boolean.TYPE).newInstance(Boolean.valueOf(z));
        } catch (Throwable unused2) {
            return null;
        }
    }

    public static int v(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (hg2.c0(i << 3) + 1) * size;
    }

    public static int w(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int c0 = hg2.c0(i << 3) * size;
        for (int i2 = 0; i2 < list.size(); i2++) {
            int m = ((y82) list.get(i2)).m();
            c0 += hg2.c0(m) + m;
        }
        return c0;
    }

    public static int x(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (hg2.c0(i << 3) * size) + y(list);
    }

    public static int y(List list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof ly2) {
            ly2 ly2Var = (ly2) list;
            i = 0;
            while (i2 < size) {
                ly2Var.m(i2);
                i += hg2.a0(ly2Var.Q[i2]);
                i2++;
            }
        } else {
            i = 0;
            while (i2 < size) {
                i += hg2.a0(((Integer) list.get(i2)).intValue());
                i2++;
            }
        }
        return i;
    }

    public static int z(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (hg2.c0(i << 3) + 4) * size;
    }
}