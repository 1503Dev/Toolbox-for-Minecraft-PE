package defpackage;

/* renamed from: s  reason: default package */
public final class s extends IllegalStateException {
    public final /* synthetic */ int P;
    public Throwable Q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ s(int i, String str, Exception exc) {
        super(str);
        this.P = i;
        this.Q = exc;
    }

    @Override // java.lang.Throwable
    public final Throwable getCause() {
        switch (this.P) {
            case 0:
                return this.Q;
            default:
                return this.Q;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(String str) {
        super(str);
        this.P = 0;
    }
}