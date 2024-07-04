package defpackage;

import java.util.HashMap;

/* renamed from: yz1  reason: default package */
public final class yz1 extends sy1 {
    public long a;
    public long b;

    public yz1(String str) {
        this.a = -1L;
        this.b = -1L;
        HashMap a = sy1.a(str);
        if (a != null) {
            this.a = ((Long) a.get(0)).longValue();
            this.b = ((Long) a.get(1)).longValue();
        }
    }

    @Override // defpackage.sy1
    public final HashMap b() {
        HashMap hashMap = new HashMap();
        hashMap.put(0, Long.valueOf(this.a));
        hashMap.put(1, Long.valueOf(this.b));
        return hashMap;
    }
}