package defpackage;

import java.util.HashMap;

/* renamed from: h02  reason: default package */
public final class h02 extends sy1 {
    public Long a;
    public Long b;

    public h02(String str) {
        HashMap a = sy1.a(str);
        if (a != null) {
            this.a = (Long) a.get(0);
            this.b = (Long) a.get(1);
        }
    }

    @Override // defpackage.sy1
    public final HashMap b() {
        HashMap hashMap = new HashMap();
        hashMap.put(0, this.a);
        hashMap.put(1, this.b);
        return hashMap;
    }
}