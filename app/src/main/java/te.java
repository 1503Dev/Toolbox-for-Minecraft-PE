package defpackage;

/* renamed from: te  reason: default package */
public final class te implements lg<Object> {
    public static final te P = new te();

    @Override // defpackage.lg
    public final void a(Object obj) {
        throw new IllegalStateException("This continuation is already complete".toString());
    }

    @Override // defpackage.lg
    public final ug getContext() {
        throw new IllegalStateException("This continuation is already complete".toString());
    }

    public final String toString() {
        return "This continuation is already complete";
    }
}