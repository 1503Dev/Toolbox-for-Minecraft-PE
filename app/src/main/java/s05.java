package defpackage;

import java.util.Arrays;

/* renamed from: s05  reason: default package */
public final class s05 implements Comparable {
    public final byte[] P;

    public /* synthetic */ s05(byte[] bArr) {
        this.P = Arrays.copyOf(bArr, bArr.length);
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        s05 s05Var = (s05) obj;
        int length = this.P.length;
        int length2 = s05Var.P.length;
        if (length != length2) {
            return length - length2;
        }
        int i = 0;
        while (true) {
            byte[] bArr = this.P;
            if (i >= bArr.length) {
                return 0;
            }
            byte b = bArr[i];
            byte b2 = s05Var.P[i];
            if (b != b2) {
                return b - b2;
            }
            i++;
        }
    }

    public final boolean equals(Object obj) {
        if (obj instanceof s05) {
            return Arrays.equals(this.P, ((s05) obj).P);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.P);
    }

    public final String toString() {
        return mh.z(this.P);
    }
}