package defpackage;

/* renamed from: ny5  reason: default package */
public final class ny5 extends ky5 {
    public final boolean T;
    public final dy5 U;
    public final boolean V;
    public final boolean W;
    public final int X;
    public final int Y;
    public final int Z;
    public final int a0;
    public final int b0;
    public final boolean c0;
    public final boolean d0;
    public final int e0;

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0098 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0118  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public ny5(int i, qe3 qe3Var, int i2, dy5 dy5Var, int i3, boolean z) {
        super(i, qe3Var, i2);
        int i4;
        boolean z2;
        boolean z3;
        int i5;
        int i6;
        int i7;
        boolean z4;
        boolean z5;
        String str;
        dy5 dy5Var2;
        boolean z6;
        char c;
        int i8;
        cu1 cu1Var;
        int i9;
        int i10;
        float f;
        int i11;
        this.U = dy5Var;
        int i12 = 1;
        if (true != dy5Var.l) {
            i4 = 16;
        } else {
            i4 = 24;
        }
        if (z) {
            cu1 cu1Var2 = this.S;
            int i13 = cu1Var2.p;
            float f2 = cu1Var2.r;
            if (f2 == -1.0f || f2 <= 2.14748365E9f) {
                z2 = true;
                this.T = z2;
                if (z && (((i9 = (cu1Var = this.S).p) == -1 || i9 >= 0) && ((i10 = cu1Var.q) == -1 || i10 >= 0))) {
                    f = cu1Var.r;
                    if ((f != -1.0f || f >= 0.0f) && ((i11 = cu1Var.g) == -1 || i11 >= 0)) {
                        z3 = true;
                        this.V = z3;
                        this.W = oy5.h(i3, false);
                        cu1 cu1Var3 = this.S;
                        this.X = cu1Var3.g;
                        i5 = cu1Var3.p;
                        if (i5 == -1 && (i8 = cu1Var3.q) != -1) {
                            i6 = i5 * i8;
                        } else {
                            i6 = -1;
                        }
                        this.Y = i6;
                        cu1Var3.getClass();
                        this.a0 = Integer.bitCount(0);
                        this.S.getClass();
                        i7 = 0;
                        while (true) {
                            if (i7 >= dy5Var.d.size()) {
                                String str2 = this.S.k;
                                if (str2 != null && str2.equals(dy5Var.d.get(i7))) {
                                    break;
                                }
                                i7++;
                            } else {
                                i7 = Integer.MAX_VALUE;
                                break;
                            }
                        }
                        this.Z = i7;
                        if ((i3 & 384) != 128) {
                            z4 = true;
                        } else {
                            z4 = false;
                        }
                        this.c0 = z4;
                        if ((i3 & 64) != 64) {
                            z5 = true;
                        } else {
                            z5 = false;
                        }
                        this.d0 = z5;
                        cu1 cu1Var4 = this.S;
                        str = cu1Var4.k;
                        int i14 = 4;
                        if (str != null) {
                            switch (str.hashCode()) {
                                case -1851077871:
                                    if (str.equals("video/dolby-vision")) {
                                        c = 0;
                                        break;
                                    }
                                    c = 65535;
                                    break;
                                case -1662735862:
                                    if (str.equals("video/av01")) {
                                        c = 1;
                                        break;
                                    }
                                    c = 65535;
                                    break;
                                case -1662541442:
                                    if (str.equals("video/hevc")) {
                                        c = 2;
                                        break;
                                    }
                                    c = 65535;
                                    break;
                                case 1331836730:
                                    if (str.equals("video/avc")) {
                                        c = 4;
                                        break;
                                    }
                                    c = 65535;
                                    break;
                                case 1599127257:
                                    if (str.equals("video/x-vnd.on2.vp9")) {
                                        c = 3;
                                        break;
                                    }
                                    c = 65535;
                                    break;
                                default:
                                    c = 65535;
                                    break;
                            }
                            if (c != 0) {
                                if (c != 1) {
                                    if (c != 2) {
                                        if (c != 3) {
                                            if (c == 4) {
                                                i14 = 1;
                                            }
                                        } else {
                                            i14 = 2;
                                        }
                                    } else {
                                        i14 = 3;
                                    }
                                }
                            } else {
                                i14 = 5;
                            }
                            this.e0 = i14;
                            dy5Var2 = this.U;
                            if (!oy5.h(i3, dy5Var2.o) || (!(z6 = this.T) && !dy5Var2.k)) {
                                i12 = 0;
                            } else if (oy5.h(i3, false) && this.V && z6 && cu1Var4.g != -1 && (i4 & i3) != 0) {
                                i12 = 2;
                            }
                            this.b0 = i12;
                        }
                        i14 = 0;
                        this.e0 = i14;
                        dy5Var2 = this.U;
                        if (!oy5.h(i3, dy5Var2.o)) {
                            if (oy5.h(i3, false)) {
                                i12 = 2;
                            }
                            this.b0 = i12;
                        }
                        i12 = 0;
                        this.b0 = i12;
                    }
                }
                z3 = false;
                this.V = z3;
                this.W = oy5.h(i3, false);
                cu1 cu1Var32 = this.S;
                this.X = cu1Var32.g;
                i5 = cu1Var32.p;
                if (i5 == -1) {
                }
                i6 = -1;
                this.Y = i6;
                cu1Var32.getClass();
                this.a0 = Integer.bitCount(0);
                this.S.getClass();
                i7 = 0;
                while (true) {
                    if (i7 >= dy5Var.d.size()) {
                    }
                    i7++;
                }
                this.Z = i7;
                if ((i3 & 384) != 128) {
                }
                this.c0 = z4;
                if ((i3 & 64) != 64) {
                }
                this.d0 = z5;
                cu1 cu1Var42 = this.S;
                str = cu1Var42.k;
                int i142 = 4;
                if (str != null) {
                }
                i142 = 0;
                this.e0 = i142;
                dy5Var2 = this.U;
                if (!oy5.h(i3, dy5Var2.o)) {
                }
                i12 = 0;
                this.b0 = i12;
            }
        }
        z2 = false;
        this.T = z2;
        if (z) {
            f = cu1Var.r;
            if (f != -1.0f) {
            }
            z3 = true;
            this.V = z3;
            this.W = oy5.h(i3, false);
            cu1 cu1Var322 = this.S;
            this.X = cu1Var322.g;
            i5 = cu1Var322.p;
            if (i5 == -1) {
            }
            i6 = -1;
            this.Y = i6;
            cu1Var322.getClass();
            this.a0 = Integer.bitCount(0);
            this.S.getClass();
            i7 = 0;
            while (true) {
                if (i7 >= dy5Var.d.size()) {
                }
                i7++;
            }
            this.Z = i7;
            if ((i3 & 384) != 128) {
            }
            this.c0 = z4;
            if ((i3 & 64) != 64) {
            }
            this.d0 = z5;
            cu1 cu1Var422 = this.S;
            str = cu1Var422.k;
            int i1422 = 4;
            if (str != null) {
            }
            i1422 = 0;
            this.e0 = i1422;
            dy5Var2 = this.U;
            if (!oy5.h(i3, dy5Var2.o)) {
            }
            i12 = 0;
            this.b0 = i12;
        }
        z3 = false;
        this.V = z3;
        this.W = oy5.h(i3, false);
        cu1 cu1Var3222 = this.S;
        this.X = cu1Var3222.g;
        i5 = cu1Var3222.p;
        if (i5 == -1) {
        }
        i6 = -1;
        this.Y = i6;
        cu1Var3222.getClass();
        this.a0 = Integer.bitCount(0);
        this.S.getClass();
        i7 = 0;
        while (true) {
            if (i7 >= dy5Var.d.size()) {
            }
            i7++;
        }
        this.Z = i7;
        if ((i3 & 384) != 128) {
        }
        this.c0 = z4;
        if ((i3 & 64) != 64) {
        }
        this.d0 = z5;
        cu1 cu1Var4222 = this.S;
        str = cu1Var4222.k;
        int i14222 = 4;
        if (str != null) {
        }
        i14222 = 0;
        this.e0 = i14222;
        dy5Var2 = this.U;
        if (!oy5.h(i3, dy5Var2.o)) {
        }
        i12 = 0;
        this.b0 = i12;
    }

    @Override // defpackage.ky5
    public final int b() {
        return this.b0;
    }

    @Override // defpackage.ky5
    public final /* bridge */ /* synthetic */ boolean e(ky5 ky5Var) {
        ny5 ny5Var = (ny5) ky5Var;
        if (zn4.b(this.S.k, ny5Var.S.k)) {
            this.U.getClass();
            return this.c0 == ny5Var.c0 && this.d0 == ny5Var.d0;
        }
        return false;
    }
}