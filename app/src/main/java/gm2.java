package defpackage;

import java.util.HashSet;

/* renamed from: gm2  reason: default package */
public final class gm2 {
    public static final HashSet a = new HashSet();
    public static String b = "media3.common";

    public static synchronized void a(String str) {
        synchronized (gm2.class) {
            if (a.add(str)) {
                String str2 = b;
                b = str2 + ", " + str;
            }
        }
    }
}