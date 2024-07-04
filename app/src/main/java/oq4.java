package defpackage;

/* renamed from: oq4  reason: default package */
public final class oq4 extends Exception {
    public final int P;

    public oq4(int i, Exception exc) {
        super(exc);
        this.P = i;
    }

    public oq4(int i, String str) {
        super(str);
        this.P = i;
    }
}