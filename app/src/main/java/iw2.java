package defpackage;

import android.net.Uri;
import java.util.Arrays;

/* renamed from: iw2  reason: default package */
public final class iw2 {
    public final int a;
    public final Uri[] b;
    public final int[] c;
    public final long[] d;

    static {
        Integer.toString(0, 36);
        Integer.toString(1, 36);
        Integer.toString(2, 36);
        Integer.toString(3, 36);
        Integer.toString(4, 36);
        Integer.toString(5, 36);
        Integer.toString(6, 36);
        Integer.toString(7, 36);
    }

    public iw2(int i, int[] iArr, Uri[] uriArr, long[] jArr) {
        tv2.G(iArr.length == uriArr.length);
        this.a = i;
        this.c = iArr;
        this.b = uriArr;
        this.d = jArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && iw2.class == obj.getClass()) {
            iw2 iw2Var = (iw2) obj;
            if (this.a == iw2Var.a && Arrays.equals(this.b, iw2Var.b) && Arrays.equals(this.c, iw2Var.c) && Arrays.equals(this.d, iw2Var.d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((((this.a * 31) - 1) * 961) + Arrays.hashCode(this.b)) * 31) + Arrays.hashCode(this.c)) * 31) + Arrays.hashCode(this.d)) * 961;
    }
}