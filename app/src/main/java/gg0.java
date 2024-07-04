package defpackage;

import java.security.PrivilegedAction;
import java.util.Map;

/* renamed from: gg0  reason: default package */
public final class gg0 implements PrivilegedAction {
    public final /* synthetic */ String a;

    public gg0(String str) {
        this.a = str;
    }

    @Override // java.security.PrivilegedAction
    public final Object run() {
        Map map = (Map) hg0.a.get();
        if (map != null) {
            return map.get(this.a);
        }
        return System.getProperty(this.a);
    }
}