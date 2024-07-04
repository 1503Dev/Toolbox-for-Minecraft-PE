package defpackage;

/* renamed from: wj  reason: default package */
public final class wj extends IllegalStateException {
    public Throwable P;

    public wj(String str, Exception exc) {
        super(str);
        this.P = exc;
    }

    @Override // java.lang.Throwable
    public final Throwable getCause() {
        return this.P;
    }
}