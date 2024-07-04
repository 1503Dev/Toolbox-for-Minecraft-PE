package defpackage;

import java.util.Arrays;

/* renamed from: rl4  reason: default package */
public final class rl4 {
    public long[] a = new long[10];
    public Object[] b = new Object[10];
    public int c;
    public int d;

    public final synchronized void a(long j, cu1 cu1Var) {
        int i = this.d;
        if (i > 0) {
            if (j <= this.a[((this.c + i) - 1) % this.b.length]) {
                synchronized (this) {
                    this.c = 0;
                    this.d = 0;
                    Arrays.fill(this.b, (Object) null);
                }
            }
        }
        int length = this.b.length;
        if (this.d >= length) {
            int i2 = length + length;
            long[] jArr = new long[i2];
            Object[] objArr = new Object[i2];
            int i3 = this.c;
            int i4 = length - i3;
            System.arraycopy(this.a, i3, jArr, 0, i4);
            System.arraycopy(this.b, this.c, objArr, 0, i4);
            int i5 = this.c;
            if (i5 > 0) {
                System.arraycopy(this.a, 0, jArr, i4, i5);
                System.arraycopy(this.b, 0, objArr, i4, this.c);
            }
            this.a = jArr;
            this.b = objArr;
            this.c = 0;
        }
        int i6 = this.c;
        int i7 = this.d;
        Object[] objArr2 = this.b;
        int length2 = (i6 + i7) % objArr2.length;
        this.a[length2] = j;
        objArr2[length2] = cu1Var;
        this.d = i7 + 1;
    }

    public final Object b() {
        tv2.I(this.d > 0);
        Object[] objArr = this.b;
        int i = this.c;
        Object obj = objArr[i];
        objArr[i] = null;
        this.c = (i + 1) % objArr.length;
        this.d--;
        return obj;
    }
}