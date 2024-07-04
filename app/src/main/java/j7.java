package defpackage;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* renamed from: j7  reason: default package */
public final class j7 {

    /* renamed from: j7$a */
    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public static class a<T> implements Iterator<T> {
        public final T[] P;
        public int Q = 0;

        public a(T[] tArr) {
            this.P = tArr;
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            return this.Q < this.P.length;
        }

        @Override // java.util.Iterator
        public final T next() {
            int i = this.Q;
            T[] tArr = this.P;
            if (i != tArr.length) {
                this.Q = i + 1;
                return tArr[i];
            }
            StringBuilder b = e5.b("Out of elements: ");
            b.append(this.Q);
            throw new NoSuchElementException(b.toString());
        }

        @Override // java.util.Iterator
        public final void remove() {
            throw new UnsupportedOperationException("Cannot remove element from an Array.");
        }
    }

    public static boolean a(byte[] bArr, byte[] bArr2) {
        if (bArr == bArr2) {
            return true;
        }
        if (bArr == null || bArr2 == null || bArr.length != bArr2.length) {
            return false;
        }
        for (int i = 0; i != bArr.length; i++) {
            if (bArr[i] != bArr2[i]) {
                return false;
            }
        }
        return true;
    }

    public static boolean b(int[] iArr, int[] iArr2) {
        if (iArr == iArr2) {
            return true;
        }
        if (iArr == null || iArr2 == null || iArr.length != iArr2.length) {
            return false;
        }
        for (int i = 0; i != iArr.length; i++) {
            if (iArr[i] != iArr2[i]) {
                return false;
            }
        }
        return true;
    }

    public static byte[] c(byte[] bArr) {
        if (bArr == null) {
            return null;
        }
        byte[] bArr2 = new byte[bArr.length];
        System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
        return bArr2;
    }

    public static short[] d(short[] sArr) {
        if (sArr == null) {
            return null;
        }
        short[] sArr2 = new short[sArr.length];
        System.arraycopy(sArr, 0, sArr2, 0, sArr.length);
        return sArr2;
    }

    public static byte[] e(byte[] bArr, byte[] bArr2) {
        if (bArr2 == null) {
            return bArr2 != null ? c(bArr2) : c(bArr);
        }
        byte[] bArr3 = new byte[bArr.length + bArr2.length];
        System.arraycopy(bArr, 0, bArr3, 0, bArr.length);
        System.arraycopy(bArr2, 0, bArr3, bArr.length, bArr2.length);
        return bArr3;
    }

    public static int[] f(int i, int[] iArr) {
        int i2 = i - 1;
        if (i2 < 0) {
            StringBuffer stringBuffer = new StringBuffer(1);
            stringBuffer.append(" > ");
            stringBuffer.append(i);
            throw new IllegalArgumentException(stringBuffer.toString());
        }
        int[] iArr2 = new int[i2];
        if (iArr.length - 1 < i2) {
            i2 = iArr.length - 1;
        }
        System.arraycopy(iArr, 1, iArr2, 0, i2);
        return iArr2;
    }

    public static int g(int i, int[] iArr) {
        if (iArr == null) {
            return 0;
        }
        int i2 = i + 1;
        while (true) {
            i--;
            if (i < 0) {
                return i2;
            }
            i2 = (i2 * 257) ^ iArr[0 + i];
        }
    }

    public static int h(byte[] bArr) {
        if (bArr == null) {
            return 0;
        }
        int length = bArr.length;
        int i = length + 1;
        while (true) {
            length--;
            if (length < 0) {
                return i;
            }
            i = (i * 257) ^ bArr[length];
        }
    }

    public static int i(int[] iArr) {
        if (iArr == null) {
            return 0;
        }
        int length = iArr.length;
        int i = length + 1;
        while (true) {
            length--;
            if (length < 0) {
                return i;
            }
            i = (i * 257) ^ iArr[length];
        }
    }

    public static int j(long[] jArr, int i) {
        if (jArr == null) {
            return 0;
        }
        int i2 = i + 1;
        while (true) {
            i--;
            if (i < 0) {
                return i2;
            }
            long j = jArr[0 + i];
            i2 = (((i2 * 257) ^ ((int) j)) * 257) ^ ((int) (j >>> 32));
        }
    }

    public static int k(short[] sArr) {
        if (sArr == null) {
            return 0;
        }
        int length = sArr.length;
        int i = length + 1;
        while (true) {
            length--;
            if (length < 0) {
                return i;
            }
            i = (i * 257) ^ (sArr[length] & 255);
        }
    }

    public static int l(short[][] sArr) {
        int i = 0;
        for (int i2 = 0; i2 != sArr.length; i2++) {
            i = (i * 257) + k(sArr[i2]);
        }
        return i;
    }
}