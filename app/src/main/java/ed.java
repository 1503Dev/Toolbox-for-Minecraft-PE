package defpackage;

import java.security.PrivilegedAction;

/* renamed from: ed  reason: default package */
public final class ed implements PrivilegedAction {
    public final /* synthetic */ String a;

    public ed(String str) {
        this.a = str;
    }

    @Override // java.security.PrivilegedAction
    public final Object run() {
        try {
            return Class.forName(this.a);
        } catch (Exception unused) {
            return null;
        }
    }
}