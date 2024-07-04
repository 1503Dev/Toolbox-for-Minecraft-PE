package defpackage;

/* renamed from: da  reason: default package */
public final class da {
    public int a;
    public String b;

    public final String toString() {
        rj1 rj1Var;
        int i = this.a;
        int i2 = m82.a;
        ip1 ip1Var = rj1.R;
        Integer valueOf = Integer.valueOf(i);
        if (!ip1Var.containsKey(valueOf)) {
            rj1Var = rj1.Q;
        } else {
            rj1Var = (rj1) ip1Var.get(valueOf);
        }
        return ho.b("Response Code: ", rj1Var.toString(), ", Debug Message: ", this.b);
    }
}