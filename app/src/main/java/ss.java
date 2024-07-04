package defpackage;

/* renamed from: ss  reason: default package */
public final class ss {
    public final int[] a;

    public ss(int[] iArr) {
        int[] iArr2 = new int[iArr.length];
        System.arraycopy(iArr, 0, iArr2, 0, iArr.length);
        this.a = iArr2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ss) {
            return j7.b(this.a, ((ss) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return j7.i(this.a);
    }
}