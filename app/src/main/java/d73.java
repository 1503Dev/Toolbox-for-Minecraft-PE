package defpackage;

import java.util.Map;

/* renamed from: d73  reason: default package */
public final class d73 implements mg2 {
    public final /* synthetic */ e73 P;

    public d73(e73 e73Var) {
        this.P = e73Var;
    }

    @Override // defpackage.mg2
    public final void b(Object obj, Map map) {
        if (!e73.a(this.P, map)) {
            return;
        }
        this.P.c.execute(new dd4(3, this));
    }
}