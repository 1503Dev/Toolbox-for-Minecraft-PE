package defpackage;

/* renamed from: nf4  reason: default package */
public final class nf4 {
    public static final ie4 a;

    static {
        if (hc4.e && hc4.d) {
            int i = fw1.a;
        }
        a = new ie4();
    }

    /* JADX WARN: Code restructure failed: missing block: B:51:0x00ff, code lost:
        return r9 + r0;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static int a(CharSequence charSequence, byte[] bArr, int i, int i2) {
        int i3;
        int i4;
        int i5;
        int i6;
        char charAt;
        int length = charSequence.length();
        int i7 = 0;
        while (true) {
            i3 = i + i2;
            if (i7 >= length || (i6 = i7 + i) >= i3 || (charAt = charSequence.charAt(i7)) >= 128) {
                break;
            }
            bArr[i6] = (byte) charAt;
            i7++;
        }
        int i8 = i + i7;
        while (i7 < length) {
            char charAt2 = charSequence.charAt(i7);
            if (charAt2 >= 128 || i8 >= i3) {
                if (charAt2 < 2048 && i8 <= i3 - 2) {
                    int i9 = i8 + 1;
                    bArr[i8] = (byte) ((charAt2 >>> 6) | 960);
                    i8 = i9 + 1;
                    bArr[i9] = (byte) ((charAt2 & '?') | 128);
                } else if ((charAt2 >= 55296 && charAt2 <= 57343) || i8 > i3 - 3) {
                    if (i8 > i3 - 4) {
                        if (charAt2 < 55296 || charAt2 > 57343 || ((i5 = i7 + 1) != charSequence.length() && Character.isSurrogatePair(charAt2, charSequence.charAt(i5)))) {
                            throw new ArrayIndexOutOfBoundsException("Failed writing " + charAt2 + " at index " + i8);
                        }
                        throw new ze4(i7, length);
                    }
                    int i10 = i7 + 1;
                    if (i10 != charSequence.length()) {
                        char charAt3 = charSequence.charAt(i10);
                        if (Character.isSurrogatePair(charAt2, charAt3)) {
                            int codePoint = Character.toCodePoint(charAt2, charAt3);
                            int i11 = i8 + 1;
                            bArr[i8] = (byte) ((codePoint >>> 18) | 240);
                            int i12 = i11 + 1;
                            bArr[i11] = (byte) (((codePoint >>> 12) & 63) | 128);
                            int i13 = i12 + 1;
                            bArr[i12] = (byte) (((codePoint >>> 6) & 63) | 128);
                            i8 = i13 + 1;
                            bArr[i13] = (byte) ((codePoint & 63) | 128);
                            i7 = i10;
                        } else {
                            i7 = i10;
                        }
                    }
                    throw new ze4(i7 - 1, length);
                } else {
                    int i14 = i8 + 1;
                    bArr[i8] = (byte) ((charAt2 >>> '\f') | 480);
                    int i15 = i14 + 1;
                    bArr[i14] = (byte) (((charAt2 >>> 6) & 63) | 128);
                    i4 = i15 + 1;
                    bArr[i15] = (byte) ((charAt2 & '?') | 128);
                }
                i7++;
            } else {
                i4 = i8 + 1;
                bArr[i8] = (byte) charAt2;
            }
            i8 = i4;
            i7++;
        }
        return i8;
    }

    public static int b(CharSequence charSequence) {
        int length = charSequence.length();
        int i = 0;
        int i2 = 0;
        while (i2 < length && charSequence.charAt(i2) < 128) {
            i2++;
        }
        int i3 = length;
        while (true) {
            if (i2 >= length) {
                break;
            }
            char charAt = charSequence.charAt(i2);
            if (charAt < 2048) {
                i3 += (127 - charAt) >>> 31;
                i2++;
            } else {
                int length2 = charSequence.length();
                while (i2 < length2) {
                    char charAt2 = charSequence.charAt(i2);
                    if (charAt2 < 2048) {
                        i += (127 - charAt2) >>> 31;
                    } else {
                        i += 2;
                        if (charAt2 >= 55296 && charAt2 <= 57343) {
                            if (Character.codePointAt(charSequence, i2) >= 65536) {
                                i2++;
                            } else {
                                throw new ze4(i2, length2);
                            }
                        }
                    }
                    i2++;
                }
                i3 += i;
            }
        }
        if (i3 >= length) {
            return i3;
        }
        StringBuilder b = e5.b("UTF-8 length does not fit in int: ");
        b.append(i3 + 4294967296L);
        throw new IllegalArgumentException(b.toString());
    }

    public static boolean c(byte[] bArr, int i, int i2) {
        a.getClass();
        return qd4.a(bArr, i, i2);
    }
}