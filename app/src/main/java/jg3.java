package defpackage;

import android.net.Uri;
import java.util.Arrays;

/* renamed from: jg3  reason: default package */
public final class jg3 {
    public static final jg3 b = new jg3(new iw2[0]);
    public static final iw2 c;
    public final iw2[] a;

    static {
        iw2 iw2Var = new iw2(-1, new int[0], new Uri[0], new long[0]);
        int[] iArr = iw2Var.c;
        int length = iArr.length;
        int max = Math.max(0, length);
        int[] copyOf = Arrays.copyOf(iArr, max);
        Arrays.fill(copyOf, length, max, 0);
        long[] jArr = iw2Var.d;
        int length2 = jArr.length;
        int max2 = Math.max(0, length2);
        long[] copyOf2 = Arrays.copyOf(jArr, max2);
        Arrays.fill(copyOf2, length2, max2, -9223372036854775807L);
        c = new iw2(0, copyOf, (Uri[]) Arrays.copyOf(iw2Var.b, 0), copyOf2);
        Integer.toString(1, 36);
        Integer.toString(2, 36);
        Integer.toString(3, 36);
        Integer.toString(4, 36);
    }

    public jg3(iw2[] iw2VarArr) {
        this.a = iw2VarArr;
    }

    public final iw2 a(int i) {
        return i < 0 ? c : this.a[i];
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && jg3.class == obj.getClass()) {
            jg3 jg3Var = (jg3) obj;
            if (zn4.b(null, null) && Arrays.equals(this.a, jg3Var.a)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((int) (-9223372036854775807L)) * 961) + Arrays.hashCode(this.a);
    }

    public final String toString() {
        return "AdPlaybackState(adsId=" + ((Object) null) + ", adResumePositionUs=0, adGroups=[])";
    }
}