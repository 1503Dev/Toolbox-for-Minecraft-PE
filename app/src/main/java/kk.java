package defpackage;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* renamed from: kk  reason: default package */
public final class kk {
    public static final Map<String, kk> b;
    public final String a;

    static {
        HashMap hashMap = new HashMap();
        hashMap.put(a("SHA-256", 32, 16, 67, 10), new kk("XMSS_SHA2-256_W16_H10"));
        hashMap.put(a("SHA-256", 32, 16, 67, 16), new kk("XMSS_SHA2-256_W16_H16"));
        hashMap.put(a("SHA-256", 32, 16, 67, 20), new kk("XMSS_SHA2-256_W16_H20"));
        hashMap.put(a("SHA-512", 64, 16, 131, 10), new kk("XMSS_SHA2-512_W16_H10"));
        hashMap.put(a("SHA-512", 64, 16, 131, 16), new kk("XMSS_SHA2-512_W16_H16"));
        hashMap.put(a("SHA-512", 64, 16, 131, 20), new kk("XMSS_SHA2-512_W16_H20"));
        hashMap.put(a("SHAKE128", 32, 16, 67, 10), new kk("XMSS_SHAKE128_W16_H10"));
        hashMap.put(a("SHAKE128", 32, 16, 67, 16), new kk("XMSS_SHAKE128_W16_H16"));
        hashMap.put(a("SHAKE128", 32, 16, 67, 20), new kk("XMSS_SHAKE128_W16_H20"));
        hashMap.put(a("SHAKE256", 64, 16, 131, 10), new kk("XMSS_SHAKE256_W16_H10"));
        hashMap.put(a("SHAKE256", 64, 16, 131, 16), new kk("XMSS_SHAKE256_W16_H16"));
        hashMap.put(a("SHAKE256", 64, 16, 131, 20), new kk("XMSS_SHAKE256_W16_H20"));
        b = Collections.unmodifiableMap(hashMap);
    }

    public kk(String str) {
        this.a = str;
    }

    public static String a(String str, int i, int i2, int i3, int i4) {
        return str + "-" + i + "-" + i2 + "-" + i3 + "-" + i4;
    }

    public final String toString() {
        return this.a;
    }
}