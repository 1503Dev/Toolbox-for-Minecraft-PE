package defpackage;

import java.util.HashMap;

/* renamed from: fm4  reason: default package */
public final class fm4 implements wl4 {
    public final em4 a;
    public final cm4 b;

    public fm4(em4 em4Var, cm4 cm4Var) {
        this.a = em4Var;
        this.b = cm4Var;
    }

    @Override // defpackage.wl4
    public final void a(vl4 vl4Var) {
    }

    @Override // defpackage.wl4
    public final String b(vl4 vl4Var) {
        em4 em4Var = this.a;
        HashMap g = vl4Var.g();
        this.b.a(g);
        return em4Var.a(g);
    }
}