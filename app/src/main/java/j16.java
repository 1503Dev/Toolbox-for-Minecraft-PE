package defpackage;

/* renamed from: j16  reason: default package */
public final class j16 {
    public final long a;
    public final long b;
    public final long c;
    public long d = 0;
    public long e;
    public long f;
    public long g;
    public long h;

    public j16(long j, long j2, long j3, long j4, long j5, long j6) {
        this.a = j;
        this.b = j2;
        this.e = j3;
        this.f = j4;
        this.g = j5;
        this.c = j6;
        this.h = a(j2, 0L, j3, j4, j5, j6);
    }

    public static long a(long j, long j2, long j3, long j4, long j5, long j6) {
        if (j4 + 1 >= j5 || 1 + j2 >= j3) {
            return j4;
        }
        long j7 = (((float) (j5 - j4)) / ((float) (j3 - j2))) * ((float) (j - j2));
        return Math.max(j4, Math.min(((j4 + j7) - j6) - (j7 / 20), j5 - 1));
    }
}