package defpackage;

/* renamed from: yp1  reason: default package */
public final class yp1 implements wp1 {
    public final long a;
    public final int b;
    public final long c;
    public final long d;
    public final long e;
    public final long[] f;

    public yp1(long j, int i, long j2, long j3, long[] jArr) {
        this.a = j;
        this.b = i;
        this.c = j2;
        this.f = jArr;
        this.d = j3;
        this.e = j3 != -1 ? j + j3 : -1L;
    }

    @Override // defpackage.ml1
    public final long b() {
        return this.c;
    }

    @Override // defpackage.wp1
    public final long c() {
        return this.e;
    }

    @Override // defpackage.ml1
    public final boolean f() {
        return this.f != null;
    }

    @Override // defpackage.ml1
    public final kl1 g(long j) {
        if (!f()) {
            nl1 nl1Var = new nl1(0L, this.a + this.b);
            return new kl1(nl1Var, nl1Var);
        }
        long max = Math.max(0L, Math.min(j, this.c));
        double d = max;
        long j2 = this.c;
        Double.isNaN(d);
        Double.isNaN(d);
        double d2 = j2;
        Double.isNaN(d2);
        Double.isNaN(d2);
        double d3 = (d * 100.0d) / d2;
        double d4 = 0.0d;
        if (d3 > 0.0d) {
            if (d3 >= 100.0d) {
                d4 = 256.0d;
            } else {
                int i = (int) d3;
                long[] jArr = this.f;
                tv2.B(jArr);
                double d5 = jArr[i];
                double d6 = i == 99 ? 256.0d : jArr[i + 1];
                double d7 = i;
                Double.isNaN(d7);
                Double.isNaN(d7);
                Double.isNaN(d5);
                Double.isNaN(d5);
                Double.isNaN(d5);
                Double.isNaN(d5);
                d4 = ((d6 - d5) * (d3 - d7)) + d5;
            }
        }
        double d8 = this.d;
        Double.isNaN(d8);
        Double.isNaN(d8);
        nl1 nl1Var2 = new nl1(max, this.a + Math.max(this.b, Math.min(Math.round((d4 / 256.0d) * d8), this.d - 1)));
        return new kl1(nl1Var2, nl1Var2);
    }

    @Override // defpackage.wp1
    public final long h(long j) {
        long j2;
        double d;
        long j3 = j - this.a;
        if (f() && j3 > this.b) {
            long[] jArr = this.f;
            tv2.B(jArr);
            double d2 = j3;
            long j4 = this.d;
            Double.isNaN(d2);
            Double.isNaN(d2);
            double d3 = j4;
            Double.isNaN(d3);
            Double.isNaN(d3);
            double d4 = (d2 * 256.0d) / d3;
            int i = zn4.i(jArr, (long) d4, true);
            long j5 = this.c;
            long j6 = (i * j5) / 100;
            long j7 = jArr[i];
            int i2 = i + 1;
            long j8 = (j5 * i2) / 100;
            if (i == 99) {
                j2 = 256;
            } else {
                j2 = jArr[i2];
            }
            if (j7 == j2) {
                d = 0.0d;
            } else {
                double d5 = j7;
                Double.isNaN(d5);
                Double.isNaN(d5);
                double d6 = j2 - j7;
                Double.isNaN(d6);
                Double.isNaN(d6);
                d = (d4 - d5) / d6;
            }
            double d7 = j8 - j6;
            Double.isNaN(d7);
            Double.isNaN(d7);
            return Math.round(d * d7) + j6;
        }
        return 0L;
    }
}