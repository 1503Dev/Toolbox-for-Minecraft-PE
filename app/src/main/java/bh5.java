package defpackage;

/* renamed from: bh5  reason: default package */
public final class bh5 extends ah5 {
    /* JADX WARN: Code restructure failed: missing block: B:10:0x001c, code lost:
        if (r15[r13] <= (-65)) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0047, code lost:
        if (r15[r13] <= (-65)) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x008f, code lost:
        if (r15[r13] <= (-65)) goto L11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int a(int i, int i2, int i3, byte[] bArr) {
        byte b;
        int i4;
        if (i != 0) {
            if (i2 >= i3) {
                return i;
            }
            byte b2 = (byte) i;
            if (b2 < -32) {
                if (b2 >= -62) {
                    i4 = i2 + 1;
                }
                return -1;
            } else if (b2 < -16) {
                byte b3 = (byte) ((i >> 8) ^ (-1));
                if (b3 == 0) {
                    int i5 = i2 + 1;
                    byte b4 = bArr[i2];
                    if (i5 < i3) {
                        i2 = i5;
                        b3 = b4;
                    } else {
                        return dh5.e(b2, b4);
                    }
                }
                if (b3 <= -65 && ((b2 != -32 || b3 >= -96) && (b2 != -19 || b3 < -96))) {
                    i4 = i2 + 1;
                }
                return -1;
            } else {
                byte b5 = (byte) ((i >> 8) ^ (-1));
                if (b5 == 0) {
                    int i6 = i2 + 1;
                    b5 = bArr[i2];
                    if (i6 < i3) {
                        i2 = i6;
                        b = 0;
                    } else {
                        return dh5.e(b2, b5);
                    }
                } else {
                    b = i >> 16;
                }
                if (b == 0) {
                    int i7 = i2 + 1;
                    byte b6 = bArr[i2];
                    if (i7 < i3) {
                        i2 = i7;
                        b = b6;
                    } else if (b2 > -12 || b5 > -65 || b6 > -65) {
                        return -1;
                    } else {
                        return ((b5 << 8) ^ b2) ^ (b6 << 16);
                    }
                }
                if (b5 <= -65) {
                    if ((((b5 + 112) + (b2 << 28)) >> 30) == 0 && b <= -65) {
                        i4 = i2 + 1;
                    }
                }
                return -1;
            }
            i2 = i4;
        }
        while (i2 < i3 && bArr[i2] >= 0) {
            i2++;
        }
        if (i2 >= i3) {
            return 0;
        }
        while (i2 < i3) {
            int i8 = i2 + 1;
            byte b7 = bArr[i2];
            if (b7 < 0) {
                if (b7 < -32) {
                    if (i8 >= i3) {
                        return b7;
                    }
                    if (b7 >= -62) {
                        i2 = i8 + 1;
                        if (bArr[i8] > -65) {
                        }
                    }
                    return -1;
                } else if (b7 < -16) {
                    if (i8 < i3 - 1) {
                        int i9 = i8 + 1;
                        byte b8 = bArr[i8];
                        if (b8 <= -65 && ((b7 != -32 || b8 >= -96) && (b7 != -19 || b8 < -96))) {
                            i2 = i9 + 1;
                            if (bArr[i9] > -65) {
                            }
                        }
                        return -1;
                    }
                    return dh5.a(bArr, i8, i3);
                } else if (i8 >= i3 - 2) {
                    return dh5.a(bArr, i8, i3);
                } else {
                    int i10 = i8 + 1;
                    byte b9 = bArr[i8];
                    if (b9 <= -65) {
                        if ((((b9 + 112) + (b7 << 28)) >> 30) == 0) {
                            int i11 = i10 + 1;
                            if (bArr[i10] <= -65) {
                                i2 = i11 + 1;
                                if (bArr[i11] > -65) {
                                }
                            }
                        }
                    }
                    return -1;
                }
            }
            i2 = i8;
        }
        return 0;
    }

    public final String b(byte[] bArr, int i, int i2) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        int length = bArr.length;
        if ((((length - i) - i2) | i | i2) >= 0) {
            int i3 = i + i2;
            char[] cArr = new char[i2];
            int i4 = 0;
            while (i < i3) {
                byte b = bArr[i];
                if (b >= 0) {
                    z5 = true;
                } else {
                    z5 = false;
                }
                if (!z5) {
                    break;
                }
                i++;
                cArr[i4] = (char) b;
                i4++;
            }
            while (i < i3) {
                int i5 = i + 1;
                byte b2 = bArr[i];
                if (b2 >= 0) {
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    int i6 = i4 + 1;
                    cArr[i4] = (char) b2;
                    i = i5;
                    while (true) {
                        i4 = i6;
                        if (i >= i3) {
                            break;
                        }
                        byte b3 = bArr[i];
                        if (b3 >= 0) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        if (z2) {
                            i++;
                            i6 = i4 + 1;
                            cArr[i4] = (char) b3;
                        }
                    }
                } else {
                    if (b2 < -32) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    if (z3) {
                        if (i5 < i3) {
                            int i7 = i5 + 1;
                            byte b4 = bArr[i5];
                            int i8 = i4 + 1;
                            if (b2 >= -62 && !tv2.J(b4)) {
                                cArr[i4] = (char) (((b2 & 31) << 6) | (b4 & 63));
                                i = i7;
                                i4 = i8;
                            } else {
                                throw te5.b();
                            }
                        } else {
                            throw te5.b();
                        }
                    } else {
                        if (b2 < -16) {
                            z4 = true;
                        } else {
                            z4 = false;
                        }
                        if (z4) {
                            if (i5 < i3 - 1) {
                                int i9 = i5 + 1;
                                tv2.z(b2, bArr[i5], bArr[i9], cArr, i4);
                                i = i9 + 1;
                                i4++;
                            } else {
                                throw te5.b();
                            }
                        } else if (i5 < i3 - 2) {
                            int i10 = i5 + 1;
                            byte b5 = bArr[i5];
                            int i11 = i10 + 1;
                            tv2.v(b2, b5, bArr[i10], bArr[i11], cArr, i4);
                            i4 += 2;
                            i = i11 + 1;
                        } else {
                            throw te5.b();
                        }
                    }
                }
            }
            return new String(cArr, 0, i4);
        }
        throw new ArrayIndexOutOfBoundsException(String.format("buffer length=%d, index=%d, size=%d", Integer.valueOf(length), Integer.valueOf(i), Integer.valueOf(i2)));
    }
}