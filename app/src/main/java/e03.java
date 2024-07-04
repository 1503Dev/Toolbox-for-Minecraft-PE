package defpackage;

/* renamed from: e03  reason: default package */
public class e03 extends Exception {
    public final int P;
    public final long Q;

    static {
        Integer.toString(0, 36);
        Integer.toString(1, 36);
        Integer.toString(2, 36);
        Integer.toString(3, 36);
        Integer.toString(4, 36);
    }

    public e03(String str, Throwable th, int i, long j) {
        super(str, th);
        this.P = i;
        this.Q = j;
    }
}