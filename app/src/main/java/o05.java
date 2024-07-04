package defpackage;

import java.security.GeneralSecurityException;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: o05  reason: default package */
public final class o05 {
    public static final CopyOnWriteArrayList a = new CopyOnWriteArrayList();

    public static n05 a(String str) {
        Iterator it = a.iterator();
        while (it.hasNext()) {
            n05 n05Var = (n05) it.next();
            if (n05Var.a()) {
                return n05Var;
            }
        }
        throw new GeneralSecurityException("No KMS client does support: ".concat(String.valueOf(str)));
    }
}