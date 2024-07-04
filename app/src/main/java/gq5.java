package defpackage;

import android.util.Pair;
import java.util.ArrayList;
import java.util.Arrays;

/* renamed from: gq5  reason: default package */
public final class gq5 {
    public static final gq5 b = new gq5(new int[]{2});
    public static final sw4 c;
    public final int[] a;

    static {
        new gq5(new int[]{2, 5, 6});
        pv4 pv4Var = new pv4(4);
        pv4Var.a(5, 6);
        pv4Var.a(17, 6);
        pv4Var.a(7, 6);
        pv4Var.a(18, 6);
        pv4Var.a(6, 8);
        pv4Var.a(8, 8);
        pv4Var.a(14, 8);
        c = pv4Var.b();
    }

    public gq5(int[] iArr) {
        int[] copyOf = Arrays.copyOf(iArr, iArr.length);
        this.a = copyOf;
        Arrays.sort(copyOf);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0150 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0151  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00f4 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00f5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Pair a(cu1 cu1Var) {
        char c2;
        boolean z;
        boolean z2;
        int j;
        boolean z3;
        fl1 b2;
        String str = cu1Var.k;
        str.getClass();
        String str2 = cu1Var.h;
        ArrayList arrayList = mx2.a;
        int i = 9;
        int i2 = 2;
        int i3 = 8;
        switch (str.hashCode()) {
            case -2123537834:
                if (str.equals("audio/eac3-joc")) {
                    c2 = 4;
                    break;
                }
                c2 = 65535;
                break;
            case -1095064472:
                if (str.equals("audio/vnd.dts")) {
                    c2 = 6;
                    break;
                }
                c2 = 65535;
                break;
            case -53558318:
                if (str.equals("audio/mp4a-latm")) {
                    c2 = 1;
                    break;
                }
                c2 = 65535;
                break;
            case 187078296:
                if (str.equals("audio/ac3")) {
                    c2 = 2;
                    break;
                }
                c2 = 65535;
                break;
            case 187078297:
                if (str.equals("audio/ac4")) {
                    c2 = 5;
                    break;
                }
                c2 = 65535;
                break;
            case 1504578661:
                if (str.equals("audio/eac3")) {
                    c2 = 3;
                    break;
                }
                c2 = 65535;
                break;
            case 1504831518:
                if (str.equals("audio/mpeg")) {
                    c2 = 0;
                    break;
                }
                c2 = 65535;
                break;
            case 1504891608:
                if (str.equals("audio/opus")) {
                    c2 = '\t';
                    break;
                }
                c2 = 65535;
                break;
            case 1505942594:
                if (str.equals("audio/vnd.dts.hd")) {
                    c2 = 7;
                    break;
                }
                c2 = 65535;
                break;
            case 1556697186:
                if (str.equals("audio/true-hd")) {
                    c2 = '\b';
                    break;
                }
                c2 = 65535;
                break;
            default:
                c2 = 65535;
                break;
        }
        switch (c2) {
            case 0:
                break;
            case 1:
                if (str2 != null && (b2 = mx2.b(str2)) != null) {
                    i = b2.a();
                    break;
                }
                i = 0;
                break;
            case 2:
                i = 5;
                break;
            case 3:
                i = 6;
                break;
            case 4:
                i = 18;
                break;
            case 5:
                i = 17;
                break;
            case 6:
                i = 7;
                break;
            case 7:
                i = 8;
                break;
            case '\b':
                i = 14;
                break;
            case '\t':
                i = 20;
                break;
            default:
                i = 0;
                break;
        }
        sw4 sw4Var = c;
        if (!sw4Var.containsKey(Integer.valueOf(i))) {
            return null;
        }
        if (i == 18) {
            if (Arrays.binarySearch(this.a, 18) >= 0) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (!z3) {
                i = 6;
                if (Arrays.binarySearch(this.a, i) < 0) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (z2) {
                    return null;
                }
                int i4 = cu1Var.x;
                if (i4 != -1 && i != 18) {
                    if (i4 > 8) {
                        return null;
                    }
                } else {
                    int i5 = cu1Var.y;
                    if (i5 == -1) {
                        i5 = 48000;
                    }
                    if (zn4.a >= 29) {
                        i4 = fq5.a(i, i5);
                    } else {
                        Integer num = (Integer) sw4Var.getOrDefault(Integer.valueOf(i), 0);
                        num.getClass();
                        i4 = num.intValue();
                    }
                }
                int i6 = zn4.a;
                if (i6 <= 28) {
                    if (i4 != 7) {
                        if (i4 == 3 || i4 == 4 || i4 == 5) {
                            i3 = 6;
                        }
                    }
                    if (i6 <= 26 || !"fugu".equals(zn4.b) || i3 != 1) {
                        i2 = i3;
                    }
                    j = zn4.j(i2);
                    if (j != 0) {
                        return null;
                    }
                    return Pair.create(Integer.valueOf(i), Integer.valueOf(j));
                }
                i3 = i4;
                if (i6 <= 26) {
                }
                i2 = i3;
                j = zn4.j(i2);
                if (j != 0) {
                }
            } else {
                i = 18;
            }
        }
        if (i == 8) {
            if (Arrays.binarySearch(this.a, 8) >= 0) {
                z = true;
            } else {
                z = false;
            }
            if (!z) {
                i = 7;
            }
        }
        if (Arrays.binarySearch(this.a, i) < 0) {
        }
        if (z2) {
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof gq5) && Arrays.equals(this.a, ((gq5) obj).a);
    }

    public final int hashCode() {
        return (Arrays.hashCode(this.a) * 31) + 8;
    }

    public final String toString() {
        return ij.c("AudioCapabilities[maxChannelCount=8, supportedEncodings=", Arrays.toString(this.a), "]");
    }
}