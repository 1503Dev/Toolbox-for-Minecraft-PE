package defpackage;

import java.util.ArrayList;

/* renamed from: lx5  reason: default package */
public final class lx5 extends nx5 {
    public lx5(qe3 qe3Var, int[] iArr, nv4 nv4Var, dx3 dx3Var) {
        super(qe3Var, iArr);
        nv4.t(nv4Var);
    }

    public static void c(ArrayList arrayList, long[] jArr) {
        long j = 0;
        for (int i = 0; i < 2; i++) {
            j += jArr[i];
        }
        for (int i2 = 0; i2 < arrayList.size(); i2++) {
            kv4 kv4Var = (kv4) arrayList.get(i2);
            if (kv4Var != null) {
                kv4Var.p(new kx5(j, jArr[i2]));
            }
        }
    }
}