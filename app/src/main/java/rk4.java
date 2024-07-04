package defpackage;

/* renamed from: rk4  reason: default package */
public final class rk4 {
    public final long a;
    public long c;
    public final qk4 b = new qk4();
    public int d = 0;
    public int e = 0;
    public int f = 0;

    public rk4() {
        jv5.A.j.getClass();
        long currentTimeMillis = System.currentTimeMillis();
        this.a = currentTimeMillis;
        this.c = currentTimeMillis;
    }
}