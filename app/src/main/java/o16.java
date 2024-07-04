package defpackage;

import java.util.Arrays;

/* renamed from: o16  reason: default package */
public final class o16 implements ml1 {
    public final int a;
    public final int[] b;
    public final long[] c;
    public final long[] d;
    public final long[] e;
    public final long f;

    public o16(int[] iArr, long[] jArr, long[] jArr2, long[] jArr3) {
        this.b = iArr;
        this.c = jArr;
        this.d = jArr2;
        this.e = jArr3;
        int length = iArr.length;
        this.a = length;
        if (length <= 0) {
            this.f = 0L;
            return;
        }
        int i = length - 1;
        this.f = jArr2[i] + jArr3[i];
    }

    @Override // defpackage.ml1
    public final long b() {
        return this.f;
    }

    @Override // defpackage.ml1
    public final boolean f() {
        return true;
    }

    @Override // defpackage.ml1
    public final kl1 g(long j) {
        int i = zn4.i(this.e, j, true);
        long[] jArr = this.e;
        long j2 = jArr[i];
        long[] jArr2 = this.c;
        nl1 nl1Var = new nl1(j2, jArr2[i]);
        if (j2 >= j || i == this.a - 1) {
            return new kl1(nl1Var, nl1Var);
        }
        int i2 = i + 1;
        return new kl1(nl1Var, new nl1(jArr[i2], jArr2[i2]));
    }

    public final String toString() {
        int i = this.a;
        String arrays = Arrays.toString(this.b);
        String arrays2 = Arrays.toString(this.c);
        String arrays3 = Arrays.toString(this.e);
        String arrays4 = Arrays.toString(this.d);
        StringBuilder sb = new StringBuilder();
        sb.append("ChunkIndex(length=");
        sb.append(i);
        sb.append(", sizes=");
        sb.append(arrays);
        sb.append(", offsets=");
        sb.append(arrays2);
        sb.append(", timeUs=");
        sb.append(arrays3);
        sb.append(", durationsUs=");
        return qq.d(sb, arrays4, ")");
    }
}