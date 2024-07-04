package defpackage;

/* renamed from: ow1  reason: default package */
public final class ow1 extends bj5 {
    static {
        fy4.k(ow1.class);
    }

    public ow1(yy2 yy2Var, az2 az2Var) {
        this.Q = yy2Var;
        this.S = yy2Var.d();
        yy2Var.P.position((int) (yy2Var.d() + yy2Var.P.limit()));
        this.T = yy2Var.d();
        this.P = az2Var;
    }

    @Override // defpackage.bj5, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }

    @Override // defpackage.bj5
    public final String toString() {
        String obj = this.Q.toString();
        StringBuilder sb = new StringBuilder(String.valueOf(obj).length() + 7);
        sb.append("model(");
        sb.append(obj);
        sb.append(")");
        return sb.toString();
    }
}