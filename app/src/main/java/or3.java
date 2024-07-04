package defpackage;

import java.util.Map;

/* renamed from: or3  reason: default package */
public final class or3 implements pl4 {
    public final Map P;
    public final j52 Q;

    public or3(j52 j52Var, Map map) {
        this.P = map;
        this.Q = j52Var;
    }

    @Override // defpackage.pl4
    public final void b(ml4 ml4Var, String str) {
        if (this.P.containsKey(ml4Var)) {
            this.Q.b(((nr3) this.P.get(ml4Var)).b);
        }
    }

    @Override // defpackage.pl4
    public final void c(String str) {
    }

    @Override // defpackage.pl4
    public final void h(ml4 ml4Var, String str) {
        if (this.P.containsKey(ml4Var)) {
            this.Q.b(((nr3) this.P.get(ml4Var)).a);
        }
    }

    @Override // defpackage.pl4
    public final void s(ml4 ml4Var, String str, Throwable th) {
        if (this.P.containsKey(ml4Var)) {
            this.Q.b(((nr3) this.P.get(ml4Var)).c);
        }
    }
}