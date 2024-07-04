package defpackage;

/* renamed from: hf2  reason: default package */
public final class hf2 implements kv1 {
    public final /* synthetic */ String P;
    public final /* synthetic */ ri2 Q;

    public hf2(String str, ri2 ri2Var) {
        this.P = str;
        this.Q = ri2Var;
    }

    @Override // defpackage.kv1
    public final void c(ov1 ov1Var) {
        String str = this.P;
        String obj = ov1Var.toString();
        sv2.g("Failed to load URL: " + str + "\n" + obj);
        this.Q.a(null);
    }
}