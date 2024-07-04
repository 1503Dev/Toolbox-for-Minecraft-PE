package defpackage;

import java.security.AccessControlException;
import java.security.AccessController;

/* renamed from: hg0  reason: default package */
public final class hg0 {
    public static final ThreadLocal a = new ThreadLocal();

    public static boolean a(String str) {
        try {
            String str2 = (String) AccessController.doPrivileged(new gg0(str));
            if (str2 != null) {
                return "true".equals(hu0.b(str2));
            }
            return false;
        } catch (AccessControlException unused) {
            return false;
        }
    }
}