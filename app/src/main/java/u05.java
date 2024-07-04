package defpackage;

import java.util.Collections;
import java.util.List;
import java.util.concurrent.ConcurrentMap;

/* renamed from: u05  reason: default package */
public final class u05 {
    public final ConcurrentMap a;
    public final r05 b;
    public final z75 c;

    public /* synthetic */ u05(ConcurrentMap concurrentMap, r05 r05Var, z75 z75Var, Class cls) {
        this.a = concurrentMap;
        this.b = r05Var;
        this.c = z75Var;
    }

    public final List a(byte[] bArr) {
        List list = (List) this.a.get(new s05(bArr));
        return list != null ? list : Collections.emptyList();
    }

    public final boolean b() {
        if (!this.c.a.isEmpty()) {
            return true;
        }
        return false;
    }
}