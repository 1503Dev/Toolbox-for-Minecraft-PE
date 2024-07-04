package defpackage;

/* renamed from: vu3  reason: default package */
public class vu3 extends Exception {
    public final int P;

    public vu3(int i) {
        this.P = i;
    }

    public vu3(int i, String str) {
        super(str);
        this.P = i;
    }

    public vu3(String str, Throwable th) {
        super(str, th);
        this.P = 1;
    }
}