package defpackage;

/* renamed from: t21  reason: default package */
public final class t21 extends UnsupportedOperationException {
    public final wp P;

    public t21(wp wpVar) {
        this.P = wpVar;
    }

    @Override // java.lang.Throwable
    public final String getMessage() {
        return "Missing ".concat(String.valueOf(this.P));
    }
}