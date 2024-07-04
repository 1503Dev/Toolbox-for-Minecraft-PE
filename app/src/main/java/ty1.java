package defpackage;

import android.util.Base64;

/* renamed from: ty1  reason: default package */
public final class ty1 {
    public static byte[] a(String str, boolean z) {
        byte[] decode = Base64.decode(str, true != z ? 2 : 11);
        if (decode.length != 0 || str.length() <= 0) {
            return decode;
        }
        throw new IllegalArgumentException("Unable to decode ".concat(str));
    }
}