package defpackage;

/* renamed from: pc2  reason: default package */
public class pc2 {
    public static int a(int i) {
        return (i >>> 1) ^ (-(i & 1));
    }

    public static long b(long j) {
        return (j >>> 1) ^ (-(1 & j));
    }
}