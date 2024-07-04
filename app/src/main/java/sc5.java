package defpackage;

import java.util.Arrays;

/* renamed from: sc5  reason: default package */
public final class sc5 {
    public final byte[] a;

    public sc5(byte[] bArr, int i) {
        byte[] bArr2 = new byte[i];
        this.a = bArr2;
        System.arraycopy(bArr, 0, bArr2, 0, i);
    }

    public static sc5 a(byte[] bArr) {
        if (bArr != null) {
            return new sc5(bArr, bArr.length);
        }
        throw new NullPointerException("data must be non-null");
    }

    public final boolean equals(Object obj) {
        if (obj instanceof sc5) {
            return Arrays.equals(((sc5) obj).a, this.a);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.a);
    }

    public final String toString() {
        return ij.c("Bytes(", mh.z(this.a), ")");
    }
}