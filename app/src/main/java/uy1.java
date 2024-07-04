package defpackage;

import java.util.HashMap;

/* renamed from: uy1  reason: default package */
public final class uy1 extends sy1 {
    public String a;
    public long b;
    public String c;
    public String d;
    public String e;

    public uy1() {
        this.a = "E";
        this.b = -1L;
        this.c = "E";
        this.d = "E";
        this.e = "E";
    }

    public uy1(String str) {
        this.a = "E";
        this.b = -1L;
        this.c = "E";
        this.d = "E";
        this.e = "E";
        HashMap a = sy1.a(str);
        if (a != null) {
            this.a = a.get(0) == null ? "E" : (String) a.get(0);
            this.b = a.get(1) != null ? ((Long) a.get(1)).longValue() : -1L;
            this.c = a.get(2) == null ? "E" : (String) a.get(2);
            this.d = a.get(3) == null ? "E" : (String) a.get(3);
            this.e = a.get(4) != null ? (String) a.get(4) : "E";
        }
    }

    @Override // defpackage.sy1
    public final HashMap b() {
        HashMap hashMap = new HashMap();
        hashMap.put(0, this.a);
        hashMap.put(4, this.e);
        hashMap.put(3, this.d);
        hashMap.put(2, this.c);
        hashMap.put(1, Long.valueOf(this.b));
        return hashMap;
    }
}