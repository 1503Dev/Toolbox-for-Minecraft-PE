package defpackage;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: um1  reason: default package */
public final class um1 extends yg5 {
    public long Q;
    public long[] R;
    public long[] S;

    public um1() {
        super(new kk1());
        this.Q = -9223372036854775807L;
        this.R = new long[0];
        this.S = new long[0];
    }

    public static Serializable n(int i, kh4 kh4Var) {
        if (i != 0) {
            boolean z = false;
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        if (i != 8) {
                            if (i != 10) {
                                if (i != 11) {
                                    return null;
                                }
                                Date date = new Date((long) Double.valueOf(Double.longBitsToDouble(kh4Var.t())).doubleValue());
                                kh4Var.f(2);
                                return date;
                            }
                            int p = kh4Var.p();
                            ArrayList arrayList = new ArrayList(p);
                            for (int i2 = 0; i2 < p; i2++) {
                                Serializable n = n(kh4Var.n(), kh4Var);
                                if (n != null) {
                                    arrayList.add(n);
                                }
                            }
                            return arrayList;
                        }
                        return p(kh4Var);
                    }
                    HashMap hashMap = new HashMap();
                    while (true) {
                        String o = o(kh4Var);
                        int n2 = kh4Var.n();
                        if (n2 == 9) {
                            return hashMap;
                        }
                        Serializable n3 = n(n2, kh4Var);
                        if (n3 != null) {
                            hashMap.put(o, n3);
                        }
                    }
                } else {
                    return o(kh4Var);
                }
            } else {
                if (kh4Var.n() == 1) {
                    z = true;
                }
                return Boolean.valueOf(z);
            }
        } else {
            return Double.valueOf(Double.longBitsToDouble(kh4Var.t()));
        }
    }

    public static String o(kh4 kh4Var) {
        int q = kh4Var.q();
        int i = kh4Var.b;
        kh4Var.f(q);
        return new String(kh4Var.a, i, q);
    }

    public static HashMap p(kh4 kh4Var) {
        int p = kh4Var.p();
        HashMap hashMap = new HashMap(p);
        for (int i = 0; i < p; i++) {
            String o = o(kh4Var);
            Serializable n = n(kh4Var.n(), kh4Var);
            if (n != null) {
                hashMap.put(o, n);
            }
        }
        return hashMap;
    }

    @Override // defpackage.yg5
    public final boolean b(kh4 kh4Var) {
        return true;
    }

    @Override // defpackage.yg5
    public final boolean d(long j, kh4 kh4Var) {
        if (kh4Var.n() != 2 || !"onMetaData".equals(o(kh4Var)) || kh4Var.c - kh4Var.b == 0 || kh4Var.n() != 8) {
            return false;
        }
        HashMap p = p(kh4Var);
        Object obj = p.get("duration");
        if (obj instanceof Double) {
            double doubleValue = ((Double) obj).doubleValue();
            if (doubleValue > 0.0d) {
                this.Q = (long) (doubleValue * 1000000.0d);
            }
        }
        Object obj2 = p.get("keyframes");
        if (obj2 instanceof Map) {
            Map map = (Map) obj2;
            Object obj3 = map.get("filepositions");
            Object obj4 = map.get("times");
            if ((obj3 instanceof List) && (obj4 instanceof List)) {
                List list = (List) obj3;
                List list2 = (List) obj4;
                int size = list2.size();
                this.R = new long[size];
                this.S = new long[size];
                for (int i = 0; i < size; i++) {
                    Object obj5 = list.get(i);
                    Object obj6 = list2.get(i);
                    if ((obj6 instanceof Double) && (obj5 instanceof Double)) {
                        this.R[i] = (long) (((Double) obj6).doubleValue() * 1000000.0d);
                        this.S[i] = ((Double) obj5).longValue();
                    } else {
                        this.R = new long[0];
                        this.S = new long[0];
                        break;
                    }
                }
            }
        }
        return false;
    }
}