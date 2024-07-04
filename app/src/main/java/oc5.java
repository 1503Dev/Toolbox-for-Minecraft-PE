package defpackage;

import java.security.SecureRandom;

/* renamed from: oc5  reason: default package */
public final class oc5 {
    public static final nc5 a = new nc5();

    public static byte[] a(int i) {
        byte[] bArr = new byte[i];
        ((SecureRandom) a.get()).nextBytes(bArr);
        return bArr;
    }
}