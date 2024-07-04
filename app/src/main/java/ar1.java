package defpackage;

import java.util.Arrays;

/* renamed from: ar1  reason: default package */
public final class ar1 {
    public final xq1 a;
    public final int b;
    public final long[] c;
    public final int[] d;
    public final int e;
    public final long[] f;
    public final int[] g;
    public final long h;

    public ar1(xq1 xq1Var, long[] jArr, int[] iArr, int i, long[] jArr2, int[] iArr2, long j) {
        int length = iArr.length;
        int length2 = jArr2.length;
        tv2.G(length == length2);
        int length3 = jArr.length;
        tv2.G(length3 == length2);
        int length4 = iArr2.length;
        tv2.G(length4 == length2);
        this.a = xq1Var;
        this.c = jArr;
        this.d = iArr;
        this.e = i;
        this.f = jArr2;
        this.g = iArr2;
        this.h = j;
        this.b = length3;
        if (length4 > 0) {
            int i2 = length4 - 1;
            iArr2[i2] = iArr2[i2] | 536870912;
        }
    }

    public final int a(long j) {
        int i;
        long[] jArr = this.f;
        int i2 = zn4.a;
        int binarySearch = Arrays.binarySearch(jArr, j);
        if (binarySearch < 0) {
            i = binarySearch ^ (-1);
        } else {
            do {
                binarySearch++;
                if (binarySearch >= jArr.length) {
                    break;
                }
            } while (jArr[binarySearch] == j);
            i = binarySearch - 1;
        }
        while (i < this.f.length) {
            if ((this.g[i] & 1) != 0) {
                return i;
            }
            i++;
        }
        return -1;
    }
}