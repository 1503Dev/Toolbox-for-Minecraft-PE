package defpackage;

import java.util.Arrays;

/* renamed from: ol1  reason: default package */
public final class ol1 {
    public final int a;
    public final byte[] b;
    public final int c;
    public final int d;

    public ol1(int i, int i2, int i3, byte[] bArr) {
        this.a = i;
        this.b = bArr;
        this.c = i2;
        this.d = i3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && ol1.class == obj.getClass()) {
            ol1 ol1Var = (ol1) obj;
            if (this.a == ol1Var.a && this.c == ol1Var.c && this.d == ol1Var.d && Arrays.equals(this.b, ol1Var.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((Arrays.hashCode(this.b) + (this.a * 31)) * 31) + this.c) * 31) + this.d;
    }
}