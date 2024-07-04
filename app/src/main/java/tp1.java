package defpackage;

import android.util.Pair;

/* renamed from: tp1  reason: default package */
public final class tp1 implements wp1 {
    public final long[] a;
    public final long[] b;
    public final long c;

    public tp1(long j, long[] jArr, long[] jArr2) {
        this.a = jArr;
        this.b = jArr2;
        this.c = j == -9223372036854775807L ? zn4.q(jArr2[jArr2.length - 1]) : j;
    }

    public static Pair a(long j, long[] jArr, long[] jArr2) {
        double d;
        Long valueOf;
        Long valueOf2;
        int i = zn4.i(jArr, j, true);
        long j2 = jArr[i];
        long j3 = jArr2[i];
        int i2 = i + 1;
        if (i2 == jArr.length) {
            valueOf = Long.valueOf(j2);
            valueOf2 = Long.valueOf(j3);
        } else {
            long j4 = jArr[i2];
            long j5 = jArr2[i2];
            if (j4 == j2) {
                d = 0.0d;
            } else {
                double d2 = j;
                double d3 = j2;
                Double.isNaN(d2);
                Double.isNaN(d3);
                Double.isNaN(d2);
                Double.isNaN(d3);
                double d4 = j4 - j2;
                Double.isNaN(d4);
                Double.isNaN(d4);
                d = (d2 - d3) / d4;
            }
            double d5 = j5 - j3;
            Double.isNaN(d5);
            Double.isNaN(d5);
            valueOf = Long.valueOf(j);
            valueOf2 = Long.valueOf(((long) (d * d5)) + j3);
        }
        return Pair.create(valueOf, valueOf2);
    }

    @Override // defpackage.ml1
    public final long b() {
        return this.c;
    }

    @Override // defpackage.wp1
    public final long c() {
        return -1L;
    }

    @Override // defpackage.ml1
    public final boolean f() {
        return true;
    }

    @Override // defpackage.ml1
    public final kl1 g(long j) {
        Pair a = a(zn4.s(Math.max(0L, Math.min(j, this.c))), this.b, this.a);
        nl1 nl1Var = new nl1(zn4.q(((Long) a.first).longValue()), ((Long) a.second).longValue());
        return new kl1(nl1Var, nl1Var);
    }

    @Override // defpackage.wp1
    public final long h(long j) {
        return zn4.q(((Long) a(j, this.a, this.b).second).longValue());
    }
}