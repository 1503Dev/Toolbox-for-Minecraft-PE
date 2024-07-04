package defpackage;

/* renamed from: rq5  reason: default package */
public final class rq5 extends Exception {
    public rq5(long j, long j2) {
        super("Unexpected audio track timestamp discontinuity: expected " + j2 + ", got " + j);
    }
}