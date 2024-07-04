package defpackage;

/* renamed from: el1  reason: default package */
public final class el1 {
    public int a;
    public String b;
    public int c;
    public int d;
    public int e;
    public int f;
    public int g;

    /* JADX WARN: Removed duplicated region for block: B:29:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00a0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean a(int i) {
        boolean z;
        int i2;
        int i3;
        int i4;
        int i5;
        int c;
        int i6;
        int i7;
        if ((i & (-2097152)) == -2097152) {
            z = true;
        } else {
            z = false;
        }
        if (!z || (i2 = (i >>> 19) & 3) == 1 || (i3 = (i >>> 17) & 3) == 0 || (i4 = (i >>> 12) & 15) == 0 || i4 == 15 || (i5 = (i >>> 10) & 3) == 3) {
            return false;
        }
        this.a = i2;
        this.b = ga1.X[3 - i3];
        int i8 = ga1.Y[i5];
        this.d = i8;
        int i9 = 2;
        if (i2 == 2) {
            i8 /= 2;
        } else {
            if (i2 == 0) {
                i8 /= 4;
            }
            int i10 = (i >>> 9) & 1;
            int i11 = 1152;
            if (i3 == 1) {
                if (i3 != 2) {
                    i11 = 384;
                }
            } else if (i2 != 3) {
                i11 = 576;
            }
            this.g = i11;
            int i12 = i4 - 1;
            if (i3 != 3) {
                if (i2 == 3) {
                    i7 = ga1.Z[i12];
                } else {
                    i7 = ga1.a0[i12];
                }
                this.f = i7;
                c = (((i7 * 12) / i8) + i10) * 4;
            } else {
                int i13 = 144;
                if (i2 == 3) {
                    if (i3 == 2) {
                        i6 = ga1.b0[i12];
                    } else {
                        i6 = ga1.c0[i12];
                    }
                    this.f = i6;
                    c = qq.c(i6, 144, i8, i10);
                } else {
                    int i14 = ga1.d0[i12];
                    this.f = i14;
                    if (i3 == 1) {
                        i13 = 72;
                    }
                    c = qq.c(i13, i14, i8, i10);
                }
            }
            this.c = c;
            if (((i >> 6) & 3) == 3) {
                i9 = 1;
            }
            this.e = i9;
            return true;
        }
        this.d = i8;
        int i102 = (i >>> 9) & 1;
        int i112 = 1152;
        if (i3 == 1) {
        }
        this.g = i112;
        int i122 = i4 - 1;
        if (i3 != 3) {
        }
        this.c = c;
        if (((i >> 6) & 3) == 3) {
        }
        this.e = i9;
        return true;
    }
}