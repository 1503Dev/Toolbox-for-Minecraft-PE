package defpackage;

import java.util.HashMap;

/* renamed from: n02  reason: default package */
public final class n02 extends sy1 {
    public Long a;
    public Long b;
    public Long c;
    public Long d;
    public Long e;
    public Long f;
    public Long g;
    public Long h;
    public Long i;
    public Long j;
    public Long k;

    public n02(String str) {
        HashMap a = sy1.a(str);
        if (a != null) {
            this.a = (Long) a.get(0);
            this.b = (Long) a.get(1);
            this.c = (Long) a.get(2);
            this.d = (Long) a.get(3);
            this.e = (Long) a.get(4);
            this.f = (Long) a.get(5);
            this.g = (Long) a.get(6);
            this.h = (Long) a.get(7);
            this.i = (Long) a.get(8);
            this.j = (Long) a.get(9);
            this.k = (Long) a.get(10);
        }
    }

    @Override // defpackage.sy1
    public final HashMap b() {
        HashMap hashMap = new HashMap();
        hashMap.put(0, this.a);
        hashMap.put(1, this.b);
        hashMap.put(2, this.c);
        hashMap.put(3, this.d);
        hashMap.put(4, this.e);
        hashMap.put(5, this.f);
        hashMap.put(6, this.g);
        hashMap.put(7, this.h);
        hashMap.put(8, this.i);
        hashMap.put(9, this.j);
        hashMap.put(10, this.k);
        return hashMap;
    }
}