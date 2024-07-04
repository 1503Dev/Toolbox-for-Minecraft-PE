package defpackage;

import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;
import java.util.logging.Logger;

/* renamed from: eg5  reason: default package */
public final class eg5 {
    public static final Class a;
    public static final og5 b;
    public static final og5 c;
    public static final qg5 d;

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
        d = new qg5();
    }

    public static int A(List list) {
        return list.size() * 4;
    }

    public static int B(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (qd5.p(i << 3) + 8) * size;
    }

    public static int C(List list) {
        return list.size() * 8;
    }

    public static int D(int i, List list, dg5 dg5Var) {
        int size = list.size();
        if (size != 0) {
            int i2 = 0;
            for (int i3 = 0; i3 < size; i3++) {
                i2 += qd5.I(i, (nf5) list.get(i3), dg5Var);
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
        return (qd5.p(i << 3) * size) + F(list);
    }

    public static int F(List list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof je5) {
            je5 je5Var = (je5) list;
            i = 0;
            while (i2 < size) {
                je5Var.m(i2);
                i += qd5.J(je5Var.Q[i2]);
                i2++;
            }
        } else {
            i = 0;
            while (i2 < size) {
                i += qd5.J(((Integer) list.get(i2)).intValue());
                i2++;
            }
        }
        return i;
    }

    public static int G(int i, List list) {
        if (list.size() == 0) {
            return 0;
        }
        return (qd5.p(i << 3) * list.size()) + H(list);
    }

    public static int H(List list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof df5) {
            df5 df5Var = (df5) list;
            i = 0;
            while (i2 < size) {
                df5Var.m(i2);
                i += qd5.q(df5Var.Q[i2]);
                i2++;
            }
        } else {
            i = 0;
            while (i2 < size) {
                i += qd5.q(((Long) list.get(i2)).longValue());
                i2++;
            }
        }
        return i;
    }

    public static int I(int i, dg5 dg5Var, Object obj) {
        int i2;
        int e;
        int p;
        if (obj instanceof we5) {
            we5 we5Var = (we5) obj;
            i2 = i << 3;
            Logger logger = qd5.R;
            if (we5Var.b != null) {
                e = ((ed5) we5Var.b).R.length;
            } else if (we5Var.a != null) {
                e = we5Var.a.d();
            } else {
                e = 0;
            }
            p = qd5.p(e);
        } else {
            i2 = i << 3;
            Logger logger2 = qd5.R;
            e = ((vc5) ((nf5) obj)).e(dg5Var);
            p = qd5.p(e);
        }
        return qd5.p(i2) + p + e;
    }

    public static int J(int i, List list, dg5 dg5Var) {
        int e;
        int p;
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int p2 = qd5.p(i << 3) * size;
        for (int i2 = 0; i2 < size; i2++) {
            Object obj = list.get(i2);
            if (obj instanceof we5) {
                we5 we5Var = (we5) obj;
                if (we5Var.b != null) {
                    e = ((ed5) we5Var.b).R.length;
                } else if (we5Var.a != null) {
                    e = we5Var.a.d();
                } else {
                    e = 0;
                }
                p = qd5.p(e);
            } else {
                e = ((vc5) ((nf5) obj)).e(dg5Var);
                p = qd5.p(e);
            }
            p2 = p + e + p2;
        }
        return p2;
    }

    public static int K(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (qd5.p(i << 3) * size) + L(list);
    }

    public static int L(List list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof je5) {
            je5 je5Var = (je5) list;
            i = 0;
            while (i2 < size) {
                je5Var.m(i2);
                int i3 = je5Var.Q[i2];
                i += qd5.p((i3 >> 31) ^ (i3 + i3));
                i2++;
            }
        } else {
            i = 0;
            while (i2 < size) {
                int intValue = ((Integer) list.get(i2)).intValue();
                i += qd5.p((intValue >> 31) ^ (intValue + intValue));
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
        return (qd5.p(i << 3) * size) + N(list);
    }

    public static int N(List list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof df5) {
            df5 df5Var = (df5) list;
            i = 0;
            while (i2 < size) {
                df5Var.m(i2);
                long j = df5Var.Q[i2];
                i += qd5.q((j >> 63) ^ (j + j));
                i2++;
            }
        } else {
            i = 0;
            while (i2 < size) {
                long longValue = ((Long) list.get(i2)).longValue();
                i += qd5.q((longValue >> 63) ^ (longValue + longValue));
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
        Logger logger = qd5.R;
        boolean z = list instanceof ye5;
        int p = qd5.p(i << 3) * size;
        if (z) {
            ye5 ye5Var = (ye5) list;
            while (i2 < size) {
                Object A = ye5Var.A(i2);
                if (A instanceof gd5) {
                    int o = ((gd5) A).o();
                    p = qd5.p(o) + o + p;
                } else {
                    p = qd5.K((String) A) + p;
                }
                i2++;
            }
        } else {
            while (i2 < size) {
                Object obj = list.get(i2);
                if (obj instanceof gd5) {
                    int o2 = ((gd5) obj).o();
                    p = qd5.p(o2) + o2 + p;
                } else {
                    p = qd5.K((String) obj) + p;
                }
                i2++;
            }
        }
        return p;
    }

    public static int P(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (qd5.p(i << 3) * size) + Q(list);
    }

    public static int Q(List list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof je5) {
            je5 je5Var = (je5) list;
            i = 0;
            while (i2 < size) {
                je5Var.m(i2);
                i += qd5.p(je5Var.Q[i2]);
                i2++;
            }
        } else {
            i = 0;
            while (i2 < size) {
                i += qd5.p(((Integer) list.get(i2)).intValue());
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
        return (qd5.p(i << 3) * size) + S(list);
    }

    public static int S(List list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof df5) {
            df5 df5Var = (df5) list;
            i = 0;
            while (i2 < size) {
                df5Var.m(i2);
                i += qd5.q(df5Var.Q[i2]);
                i2++;
            }
        } else {
            i = 0;
            while (i2 < size) {
                i += qd5.q(((Long) list.get(i2)).longValue());
                i2++;
            }
        }
        return i;
    }

    public static Object a(Object obj, int i, List list, le5 le5Var, Object obj2, og5 og5Var) {
        if (le5Var == null) {
            return obj2;
        }
        if (list instanceof RandomAccess) {
            int size = list.size();
            int i2 = 0;
            for (int i3 = 0; i3 < size; i3++) {
                int intValue = ((Integer) list.get(i3)).intValue();
                if (le5Var.a(intValue)) {
                    if (i3 != i2) {
                        list.set(i2, Integer.valueOf(intValue));
                    }
                    i2++;
                } else {
                    if (obj2 == null) {
                        obj2 = og5Var.c(obj);
                    }
                    og5Var.l(i, intValue, obj2);
                }
            }
            if (i2 != size) {
                list.subList(i2, size).clear();
                return obj2;
            }
        } else {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                int intValue2 = ((Integer) it.next()).intValue();
                if (!le5Var.a(intValue2)) {
                    if (obj2 == null) {
                        obj2 = og5Var.c(obj);
                    }
                    og5Var.l(i, intValue2, obj2);
                    it.remove();
                }
            }
        }
        return obj2;
    }

    public static boolean b(Object obj, Object obj2) {
        return obj == obj2 || (obj != null && obj.equals(obj2));
    }

    public static void c(int i, List list, rd5 rd5Var, boolean z) {
        if (list != null && !list.isEmpty()) {
            int i2 = 0;
            if (z) {
                rd5Var.a.D(i, 2);
                int i3 = 0;
                for (int i4 = 0; i4 < list.size(); i4++) {
                    ((Boolean) list.get(i4)).booleanValue();
                    i3++;
                }
                rd5Var.a.F(i3);
                while (i2 < list.size()) {
                    rd5Var.a.s(((Boolean) list.get(i2)).booleanValue() ? (byte) 1 : (byte) 0);
                    i2++;
                }
                return;
            }
            rd5Var.getClass();
            while (i2 < list.size()) {
                rd5Var.a.t(i, ((Boolean) list.get(i2)).booleanValue());
                i2++;
            }
        }
    }

    public static void d(int i, List list, rd5 rd5Var) {
        if (list == null || list.isEmpty()) {
            return;
        }
        rd5Var.getClass();
        for (int i2 = 0; i2 < list.size(); i2++) {
            rd5Var.a.u(i, (gd5) list.get(i2));
        }
    }

    public static void e(int i, List list, rd5 rd5Var, boolean z) {
        if (list != null && !list.isEmpty()) {
            int i2 = 0;
            if (z) {
                rd5Var.a.D(i, 2);
                int i3 = 0;
                for (int i4 = 0; i4 < list.size(); i4++) {
                    ((Double) list.get(i4)).doubleValue();
                    i3 += 8;
                }
                rd5Var.a.F(i3);
                while (i2 < list.size()) {
                    rd5Var.a.y(Double.doubleToRawLongBits(((Double) list.get(i2)).doubleValue()));
                    i2++;
                }
                return;
            }
            rd5Var.getClass();
            while (i2 < list.size()) {
                rd5Var.a.x(Double.doubleToRawLongBits(((Double) list.get(i2)).doubleValue()), i);
                i2++;
            }
        }
    }

    public static void f(int i, List list, rd5 rd5Var, boolean z) {
        if (list != null && !list.isEmpty()) {
            int i2 = 0;
            if (z) {
                rd5Var.a.D(i, 2);
                int i3 = 0;
                for (int i4 = 0; i4 < list.size(); i4++) {
                    i3 += qd5.J(((Integer) list.get(i4)).intValue());
                }
                rd5Var.a.F(i3);
                while (i2 < list.size()) {
                    rd5Var.a.A(((Integer) list.get(i2)).intValue());
                    i2++;
                }
                return;
            }
            rd5Var.getClass();
            while (i2 < list.size()) {
                rd5Var.a.z(i, ((Integer) list.get(i2)).intValue());
                i2++;
            }
        }
    }

    public static void g(int i, List list, rd5 rd5Var, boolean z) {
        if (list != null && !list.isEmpty()) {
            int i2 = 0;
            if (z) {
                rd5Var.a.D(i, 2);
                int i3 = 0;
                for (int i4 = 0; i4 < list.size(); i4++) {
                    ((Integer) list.get(i4)).intValue();
                    i3 += 4;
                }
                rd5Var.a.F(i3);
                while (i2 < list.size()) {
                    rd5Var.a.w(((Integer) list.get(i2)).intValue());
                    i2++;
                }
                return;
            }
            rd5Var.getClass();
            while (i2 < list.size()) {
                rd5Var.a.v(i, ((Integer) list.get(i2)).intValue());
                i2++;
            }
        }
    }

    public static void h(int i, List list, rd5 rd5Var, boolean z) {
        if (list != null && !list.isEmpty()) {
            int i2 = 0;
            if (z) {
                rd5Var.a.D(i, 2);
                int i3 = 0;
                for (int i4 = 0; i4 < list.size(); i4++) {
                    ((Long) list.get(i4)).longValue();
                    i3 += 8;
                }
                rd5Var.a.F(i3);
                while (i2 < list.size()) {
                    rd5Var.a.y(((Long) list.get(i2)).longValue());
                    i2++;
                }
                return;
            }
            rd5Var.getClass();
            while (i2 < list.size()) {
                rd5Var.a.x(((Long) list.get(i2)).longValue(), i);
                i2++;
            }
        }
    }

    public static void i(int i, List list, rd5 rd5Var, boolean z) {
        if (list != null && !list.isEmpty()) {
            int i2 = 0;
            if (z) {
                rd5Var.a.D(i, 2);
                int i3 = 0;
                for (int i4 = 0; i4 < list.size(); i4++) {
                    ((Float) list.get(i4)).floatValue();
                    i3 += 4;
                }
                rd5Var.a.F(i3);
                while (i2 < list.size()) {
                    rd5Var.a.w(Float.floatToRawIntBits(((Float) list.get(i2)).floatValue()));
                    i2++;
                }
                return;
            }
            rd5Var.getClass();
            while (i2 < list.size()) {
                rd5Var.a.v(i, Float.floatToRawIntBits(((Float) list.get(i2)).floatValue()));
                i2++;
            }
        }
    }

    public static void j(int i, List list, rd5 rd5Var, dg5 dg5Var) {
        if (list == null || list.isEmpty()) {
            return;
        }
        for (int i2 = 0; i2 < list.size(); i2++) {
            rd5Var.l(i, dg5Var, list.get(i2));
        }
    }

    public static void k(int i, List list, rd5 rd5Var, boolean z) {
        if (list != null && !list.isEmpty()) {
            int i2 = 0;
            if (z) {
                rd5Var.a.D(i, 2);
                int i3 = 0;
                for (int i4 = 0; i4 < list.size(); i4++) {
                    i3 += qd5.J(((Integer) list.get(i4)).intValue());
                }
                rd5Var.a.F(i3);
                while (i2 < list.size()) {
                    rd5Var.a.A(((Integer) list.get(i2)).intValue());
                    i2++;
                }
                return;
            }
            rd5Var.getClass();
            while (i2 < list.size()) {
                rd5Var.a.z(i, ((Integer) list.get(i2)).intValue());
                i2++;
            }
        }
    }

    public static void l(int i, List list, rd5 rd5Var, boolean z) {
        if (list != null && !list.isEmpty()) {
            int i2 = 0;
            if (z) {
                rd5Var.a.D(i, 2);
                int i3 = 0;
                for (int i4 = 0; i4 < list.size(); i4++) {
                    i3 += qd5.q(((Long) list.get(i4)).longValue());
                }
                rd5Var.a.F(i3);
                while (i2 < list.size()) {
                    rd5Var.a.H(((Long) list.get(i2)).longValue());
                    i2++;
                }
                return;
            }
            rd5Var.getClass();
            while (i2 < list.size()) {
                rd5Var.a.G(((Long) list.get(i2)).longValue(), i);
                i2++;
            }
        }
    }

    public static void m(int i, List list, rd5 rd5Var, dg5 dg5Var) {
        if (list == null || list.isEmpty()) {
            return;
        }
        for (int i2 = 0; i2 < list.size(); i2++) {
            rd5Var.o(i, dg5Var, list.get(i2));
        }
    }

    public static void n(int i, List list, rd5 rd5Var, boolean z) {
        if (list != null && !list.isEmpty()) {
            int i2 = 0;
            if (z) {
                rd5Var.a.D(i, 2);
                int i3 = 0;
                for (int i4 = 0; i4 < list.size(); i4++) {
                    ((Integer) list.get(i4)).intValue();
                    i3 += 4;
                }
                rd5Var.a.F(i3);
                while (i2 < list.size()) {
                    rd5Var.a.w(((Integer) list.get(i2)).intValue());
                    i2++;
                }
                return;
            }
            rd5Var.getClass();
            while (i2 < list.size()) {
                rd5Var.a.v(i, ((Integer) list.get(i2)).intValue());
                i2++;
            }
        }
    }

    public static void o(int i, List list, rd5 rd5Var, boolean z) {
        if (list != null && !list.isEmpty()) {
            int i2 = 0;
            if (z) {
                rd5Var.a.D(i, 2);
                int i3 = 0;
                for (int i4 = 0; i4 < list.size(); i4++) {
                    ((Long) list.get(i4)).longValue();
                    i3 += 8;
                }
                rd5Var.a.F(i3);
                while (i2 < list.size()) {
                    rd5Var.a.y(((Long) list.get(i2)).longValue());
                    i2++;
                }
                return;
            }
            rd5Var.getClass();
            while (i2 < list.size()) {
                rd5Var.a.x(((Long) list.get(i2)).longValue(), i);
                i2++;
            }
        }
    }

    public static void p(int i, List list, rd5 rd5Var, boolean z) {
        if (list != null && !list.isEmpty()) {
            int i2 = 0;
            if (z) {
                rd5Var.a.D(i, 2);
                int i3 = 0;
                for (int i4 = 0; i4 < list.size(); i4++) {
                    int intValue = ((Integer) list.get(i4)).intValue();
                    i3 += qd5.p((intValue >> 31) ^ (intValue + intValue));
                }
                rd5Var.a.F(i3);
                while (i2 < list.size()) {
                    qd5 qd5Var = rd5Var.a;
                    int intValue2 = ((Integer) list.get(i2)).intValue();
                    qd5Var.F((intValue2 >> 31) ^ (intValue2 + intValue2));
                    i2++;
                }
                return;
            }
            rd5Var.getClass();
            while (i2 < list.size()) {
                qd5 qd5Var2 = rd5Var.a;
                int intValue3 = ((Integer) list.get(i2)).intValue();
                qd5Var2.E(i, (intValue3 >> 31) ^ (intValue3 + intValue3));
                i2++;
            }
        }
    }

    public static void q(int i, List list, rd5 rd5Var, boolean z) {
        if (list != null && !list.isEmpty()) {
            int i2 = 0;
            if (z) {
                rd5Var.a.D(i, 2);
                int i3 = 0;
                for (int i4 = 0; i4 < list.size(); i4++) {
                    long longValue = ((Long) list.get(i4)).longValue();
                    i3 += qd5.q((longValue >> 63) ^ (longValue + longValue));
                }
                rd5Var.a.F(i3);
                while (i2 < list.size()) {
                    qd5 qd5Var = rd5Var.a;
                    long longValue2 = ((Long) list.get(i2)).longValue();
                    qd5Var.H((longValue2 >> 63) ^ (longValue2 + longValue2));
                    i2++;
                }
                return;
            }
            rd5Var.getClass();
            while (i2 < list.size()) {
                qd5 qd5Var2 = rd5Var.a;
                long longValue3 = ((Long) list.get(i2)).longValue();
                qd5Var2.G((longValue3 >> 63) ^ (longValue3 + longValue3), i);
                i2++;
            }
        }
    }

    public static void r(int i, List list, rd5 rd5Var) {
        if (list == null || list.isEmpty()) {
            return;
        }
        rd5Var.getClass();
        int i2 = 0;
        if (!(list instanceof ye5)) {
            while (i2 < list.size()) {
                rd5Var.a.C(i, (String) list.get(i2));
                i2++;
            }
            return;
        }
        ye5 ye5Var = (ye5) list;
        while (i2 < list.size()) {
            Object A = ye5Var.A(i2);
            if (A instanceof String) {
                rd5Var.a.C(i, (String) A);
            } else {
                rd5Var.a.u(i, (gd5) A);
            }
            i2++;
        }
    }

    public static void s(int i, List list, rd5 rd5Var, boolean z) {
        if (list != null && !list.isEmpty()) {
            int i2 = 0;
            if (z) {
                rd5Var.a.D(i, 2);
                int i3 = 0;
                for (int i4 = 0; i4 < list.size(); i4++) {
                    i3 += qd5.p(((Integer) list.get(i4)).intValue());
                }
                rd5Var.a.F(i3);
                while (i2 < list.size()) {
                    rd5Var.a.F(((Integer) list.get(i2)).intValue());
                    i2++;
                }
                return;
            }
            rd5Var.getClass();
            while (i2 < list.size()) {
                rd5Var.a.E(i, ((Integer) list.get(i2)).intValue());
                i2++;
            }
        }
    }

    public static void t(int i, List list, rd5 rd5Var, boolean z) {
        if (list != null && !list.isEmpty()) {
            int i2 = 0;
            if (z) {
                rd5Var.a.D(i, 2);
                int i3 = 0;
                for (int i4 = 0; i4 < list.size(); i4++) {
                    i3 += qd5.q(((Long) list.get(i4)).longValue());
                }
                rd5Var.a.F(i3);
                while (i2 < list.size()) {
                    rd5Var.a.H(((Long) list.get(i2)).longValue());
                    i2++;
                }
                return;
            }
            rd5Var.getClass();
            while (i2 < list.size()) {
                rd5Var.a.G(((Long) list.get(i2)).longValue(), i);
                i2++;
            }
        }
    }

    public static og5 u(boolean z) {
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
            return (og5) cls.getConstructor(Boolean.TYPE).newInstance(Boolean.valueOf(z));
        } catch (Throwable unused2) {
            return null;
        }
    }

    public static int v(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (qd5.p(i << 3) + 1) * size;
    }

    public static int w(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int p = qd5.p(i << 3) * size;
        for (int i2 = 0; i2 < list.size(); i2++) {
            int o = ((gd5) list.get(i2)).o();
            p += qd5.p(o) + o;
        }
        return p;
    }

    public static int x(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (qd5.p(i << 3) * size) + y(list);
    }

    public static int y(List list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof je5) {
            je5 je5Var = (je5) list;
            i = 0;
            while (i2 < size) {
                je5Var.m(i2);
                i += qd5.J(je5Var.Q[i2]);
                i2++;
            }
        } else {
            i = 0;
            while (i2 < size) {
                i += qd5.J(((Integer) list.get(i2)).intValue());
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
        return (qd5.p(i << 3) + 4) * size;
    }
}