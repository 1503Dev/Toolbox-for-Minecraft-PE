package defpackage;

/* renamed from: ht1  reason: default package */
public final class ht1 implements m16 {
    public final km4 P;
    public final kh4 Q = new kh4();
    public final int R;

    public ht1(int i, km4 km4Var) {
        this.R = i;
        this.P = km4Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x008c, code lost:
        if (r12 == (-9223372036854775807L)) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x009a, code lost:
        return defpackage.l16.d;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:?, code lost:
        return defpackage.l16.a(r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:?, code lost:
        return new defpackage.l16(r12, -2, r5 + r3);
     */
    @Override // defpackage.m16
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final l16 a(p16 p16Var, long j) {
        long j2;
        long j3 = p16Var.d;
        int min = (int) Math.min(112800L, p16Var.c - j3);
        this.Q.b(min);
        p16Var.B(this.Q.a, 0, min, false);
        kh4 kh4Var = this.Q;
        int i = kh4Var.c;
        long j4 = -1;
        long j5 = -1;
        long j6 = -9223372036854775807L;
        while (true) {
            int i2 = kh4Var.c;
            int i3 = kh4Var.b;
            if (i2 - i3 < 188) {
                break;
            }
            byte[] bArr = kh4Var.a;
            while (i3 < i && bArr[i3] != 71) {
                i3++;
            }
            int i4 = i3 + 188;
            if (i4 > i) {
                break;
            }
            long m = dt4.m(kh4Var, i3, this.R);
            if (m != -9223372036854775807L) {
                long b = this.P.b(m);
                if (b > j) {
                    if (j6 == -9223372036854775807L) {
                        return new l16(b, -1, j3);
                    }
                    j2 = j3 + j5;
                } else if (100000 + b > j) {
                    j2 = j3 + i3;
                    break;
                } else {
                    j6 = b;
                    j5 = i3;
                }
            }
            kh4Var.e(i4);
            j4 = i4;
        }
    }

    @Override // defpackage.m16
    public final void c() {
        kh4 kh4Var = this.Q;
        byte[] bArr = zn4.f;
        int length = bArr.length;
        kh4Var.c(bArr, 0);
    }
}