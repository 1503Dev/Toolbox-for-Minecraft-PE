package defpackage;

import java.security.SecureRandom;

/* renamed from: nc5  reason: default package */
public final class nc5 extends ThreadLocal {
    @Override // java.lang.ThreadLocal
    public final /* synthetic */ Object initialValue() {
        SecureRandom secureRandom = new SecureRandom();
        secureRandom.nextLong();
        return secureRandom;
    }
}