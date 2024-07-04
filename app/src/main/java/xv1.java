package defpackage;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* renamed from: xv1  reason: default package */
public final class xv1 {
    public long a;
    public final String b;
    public final String c;
    public final long d;
    public final long e;
    public final long f;
    public final long g;
    public final List h;

    public xv1(String str, String str2, long j, long j2, long j3, long j4, List list) {
        this.b = str;
        this.c = true == "".equals(str2) ? null : str2;
        this.d = j;
        this.e = j2;
        this.f = j3;
        this.g = j4;
        this.h = list;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v1, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r0v2 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public xv1(String str, nu1 nu1Var) {
        this(str, r2, r3, r5, r7, r9, r0);
        String str2 = nu1Var.b;
        long j = nu1Var.c;
        long j2 = nu1Var.d;
        long j3 = nu1Var.e;
        long j4 = nu1Var.f;
        ?? r0 = nu1Var.h;
        if (r0 == 0) {
            Map map = nu1Var.g;
            r0 = new ArrayList(map.size());
            for (Map.Entry entry : map.entrySet()) {
                r0.add(new uu1((String) entry.getKey(), (String) entry.getValue()));
            }
        }
    }

    public static xv1 a(yv1 yv1Var) {
        List arrayList;
        if ((aw1.k(yv1Var) | (aw1.k(yv1Var) << 8) | (aw1.k(yv1Var) << 16) | (aw1.k(yv1Var) << 24)) == 538247942) {
            String f = aw1.f(yv1Var);
            String f2 = aw1.f(yv1Var);
            long d = aw1.d(yv1Var);
            long d2 = aw1.d(yv1Var);
            long d3 = aw1.d(yv1Var);
            long d4 = aw1.d(yv1Var);
            int k = aw1.k(yv1Var) | (aw1.k(yv1Var) << 8) | (aw1.k(yv1Var) << 16) | (aw1.k(yv1Var) << 24);
            if (k >= 0) {
                if (k == 0) {
                    arrayList = Collections.emptyList();
                } else {
                    arrayList = new ArrayList();
                }
                List list = arrayList;
                for (int i = 0; i < k; i++) {
                    list.add(new uu1(aw1.f(yv1Var).intern(), aw1.f(yv1Var).intern()));
                }
                return new xv1(f, f2, d, d2, d3, d4, list);
            }
            throw new IOException(k6.a("readHeaderList size=", k));
        }
        throw new IOException();
    }
}