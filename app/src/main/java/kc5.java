package defpackage;

import java.security.GeneralSecurityException;
import javax.crypto.Mac;

/* renamed from: kc5  reason: default package */
public final class kc5 extends ThreadLocal {
    public final /* synthetic */ lc5 a;

    public kc5(lc5 lc5Var) {
        this.a = lc5Var;
    }

    @Override // java.lang.ThreadLocal
    public final Object initialValue() {
        try {
            Mac mac = (Mac) gc5.c.a(this.a.b);
            mac.init(this.a.c);
            return mac;
        } catch (GeneralSecurityException e) {
            throw new IllegalStateException(e);
        }
    }
}