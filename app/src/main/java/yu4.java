package defpackage;

import javax.annotation.CheckForNull;

/* renamed from: yu4  reason: default package */
public final class yu4 {
    public static int a(int i) {
        return (i + 1) * (i < 32 ? 4 : 2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x002a, code lost:
        r9 = r6 & r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x002c, code lost:
        if (r5 != (-1)) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x002e, code lost:
        e(r1, r9, r12);
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0032, code lost:
        r13[r5] = (r9 & r11) | (r13[r5] & r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0039, code lost:
        return r2;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static int b(@CheckForNull Object obj, @CheckForNull Object obj2, int i, Object obj3, int[] iArr, Object[] objArr, @CheckForNull Object[] objArr2) {
        int h = gv4.h(obj);
        int i2 = h & i;
        int c = c(i2, obj3);
        if (c != 0) {
            int i3 = i ^ (-1);
            int i4 = h & i3;
            int i5 = -1;
            while (true) {
                int i6 = c - 1;
                int i7 = iArr[i6];
                if ((i7 & i3) != i4 || !dt4.l(obj, objArr[i6]) || (objArr2 != null && !dt4.l(obj2, objArr2[i6]))) {
                    int i8 = i7 & i;
                    if (i8 == 0) {
                        break;
                    }
                    i5 = i6;
                    c = i8;
                }
            }
        }
        return -1;
    }

    public static int c(int i, Object obj) {
        return obj instanceof byte[] ? ((byte[]) obj)[i] & 255 : obj instanceof short[] ? (char) ((short[]) obj)[i] : ((int[]) obj)[i];
    }

    public static Object d(int i) {
        if (i >= 2 && i <= 1073741824 && Integer.highestOneBit(i) == i) {
            if (i <= 256) {
                return new byte[i];
            }
            if (i <= 65536) {
                return new short[i];
            }
            return new int[i];
        }
        throw new IllegalArgumentException(k6.a("must be power of 2 between 2^1 and 2^30: ", i));
    }

    public static void e(int i, int i2, Object obj) {
        if (obj instanceof byte[]) {
            ((byte[]) obj)[i] = (byte) i2;
        } else if (obj instanceof short[]) {
            ((short[]) obj)[i] = (short) i2;
        } else {
            ((int[]) obj)[i] = i2;
        }
    }
}