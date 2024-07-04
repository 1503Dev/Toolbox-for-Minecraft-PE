package defpackage;

import android.util.DisplayMetrics;

/* renamed from: o02  reason: default package */
public final class o02 {
    public static final char[] a = "0123456789abcdef".toCharArray();

    public static long a(double d, DisplayMetrics displayMetrics) {
        double d2 = displayMetrics.density;
        Double.isNaN(d2);
        Double.isNaN(d2);
        return Math.round(d / d2);
    }

    public static boolean b(String str) {
        return str == null || str.isEmpty();
    }

    public static byte[] c(String str) {
        int length = str.length();
        if (length % 2 == 0) {
            byte[] bArr = new byte[length / 2];
            for (int i = 0; i < length; i += 2) {
                bArr[i / 2] = (byte) (Character.digit(str.charAt(i + 1), 16) + (Character.digit(str.charAt(i), 16) << 4));
            }
            return bArr;
        }
        throw new IllegalArgumentException("String must be of even-length");
    }
}