package defpackage;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* renamed from: v51  reason: default package */
public final class v51 {
    public static final Map<String, v51> b;
    public final String a;

    static {
        HashMap hashMap = new HashMap();
        hashMap.put(a(32, 67, "SHA-256"), new v51("WOTSP_SHA2-256_W16"));
        hashMap.put(a(64, 131, "SHA-512"), new v51("WOTSP_SHA2-512_W16"));
        hashMap.put(a(32, 67, "SHAKE128"), new v51("WOTSP_SHAKE128_W16"));
        hashMap.put(a(64, 131, "SHAKE256"), new v51("WOTSP_SHAKE256_W16"));
        b = Collections.unmodifiableMap(hashMap);
    }

    public v51(String str) {
        this.a = str;
    }

    public static String a(int i, int i2, String str) {
        return str + "-" + i + "-16-" + i2;
    }

    public final String toString() {
        return this.a;
    }
}