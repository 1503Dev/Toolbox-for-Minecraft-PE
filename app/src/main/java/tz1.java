package defpackage;

import java.util.HashMap;

/* renamed from: tz1  reason: default package */
public final class tz1 extends sy1 {
    public Long a;
    public Long b;
    public Long c;

    public tz1(String str) {
        HashMap a = sy1.a(str);
        if (a != null) {
            this.a = (Long) a.get(0);
            this.b = (Long) a.get(1);
            this.c = (Long) a.get(2);
        }
    }

    @Override // defpackage.sy1
    public final HashMap b() {
        HashMap hashMap = new HashMap();
        hashMap.put(0, this.a);
        hashMap.put(1, this.b);
        hashMap.put(2, this.c);
        return hashMap;
    }
}