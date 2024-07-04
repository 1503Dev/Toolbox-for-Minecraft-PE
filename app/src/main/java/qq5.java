package defpackage;

/* renamed from: qq5  reason: default package */
public final class qq5 extends Exception {
    public final int P;
    public final boolean Q;
    public final cu1 R;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public qq5(int i, int i2, int i3, int i4, cu1 cu1Var, boolean z, RuntimeException runtimeException) {
        super(r0.toString(), runtimeException);
        StringBuilder sb = new StringBuilder();
        sb.append("AudioTrack init failed ");
        sb.append(i);
        sb.append(" Config(");
        sb.append(i2);
        sb.append(", ");
        sb.append(i3);
        sb.append(", ");
        sb.append(i4);
        sb.append(")");
        sb.append(true != z ? "" : " (recoverable)");
        this.P = i;
        this.Q = z;
        this.R = cu1Var;
    }
}