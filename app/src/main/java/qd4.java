package defpackage;

/* renamed from: qd4  reason: default package */
public abstract class qd4 {
    /* JADX WARN: Code restructure failed: missing block: B:59:0x008b, code lost:
        if (r9 > (-12)) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x00ab, code lost:
        return true;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x008b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean a(byte[] bArr, int i, int i2) {
        int i3;
        int i4;
        while (i < i2 && bArr[i] >= 0) {
            i++;
        }
        int i5 = -1;
        if (i < i2) {
            while (i < i2) {
                int i6 = i + 1;
                int i7 = bArr[i];
                if (i7 < 0) {
                    if (i7 < -32) {
                        if (i6 >= i2) {
                            i5 = i7;
                            break;
                        } else if (i7 < -62) {
                            break;
                        } else {
                            i = i6 + 1;
                            if (bArr[i6] > -65) {
                                break;
                            }
                        }
                    } else if (i7 < -16) {
                        if (i6 < i2 - 1) {
                            int i8 = i6 + 1;
                            char c = bArr[i6];
                            if (c > -65 || ((i7 == -32 && c < -96) || (i7 == -19 && c >= -96))) {
                                break;
                            }
                            i = i8 + 1;
                            if (bArr[i8] > -65) {
                                break;
                            }
                        } else {
                            ie4 ie4Var = nf4.a;
                            i3 = i2 - i6;
                            i7 = bArr[i6 - 1];
                            if (i3 == 0) {
                                if (i3 != 1) {
                                    if (i3 == 2) {
                                        int i9 = bArr[i6];
                                        int i10 = bArr[i6 + 1];
                                        if (i7 <= -12 && i9 <= -65 && i10 <= -65) {
                                            i4 = i10 << 16;
                                            i7 ^= i9 << 8;
                                            i5 = i7 ^ i4;
                                        }
                                    } else {
                                        throw new AssertionError();
                                    }
                                } else {
                                    int i11 = bArr[i6];
                                    if (i7 <= -12 && i11 <= -65) {
                                        i4 = i11 << 8;
                                        i5 = i7 ^ i4;
                                    }
                                }
                            }
                        }
                    } else if (i6 >= i2 - 2) {
                        ie4 ie4Var2 = nf4.a;
                        i3 = i2 - i6;
                        i7 = bArr[i6 - 1];
                        if (i3 == 0) {
                        }
                    } else {
                        int i12 = i6 + 1;
                        int i13 = bArr[i6];
                        if (i13 > -65) {
                            break;
                        }
                        if ((((i13 + 112) + (i7 << 28)) >> 30) != 0) {
                            break;
                        }
                        int i14 = i12 + 1;
                        if (bArr[i12] > -65) {
                            break;
                        }
                        i6 = i14 + 1;
                        if (bArr[i14] > -65) {
                            break;
                        }
                    }
                }
                i = i6;
            }
        }
        i5 = 0;
        return false;
    }
}