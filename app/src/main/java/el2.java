package defpackage;

import java.util.Collections;

/* renamed from: el2  reason: default package */
public final class el2 {
    public final String a;
    public final gg2 b;
    public final oc2 c;
    public final nq2 d;
    public final o52 e;
    public final si2 f;

    static {
        sw4 sw4Var = sw4.V;
        lv4 lv4Var = nv4.Q;
        nw4 nw4Var = nw4.T;
        Collections.emptyList();
        nw4 nw4Var2 = nw4.T;
        si2 si2Var = si2.a;
        nq2 nq2Var = nq2.y;
        Integer.toString(0, 36);
        Integer.toString(1, 36);
        Integer.toString(2, 36);
        Integer.toString(3, 36);
        Integer.toString(4, 36);
    }

    public /* synthetic */ el2(String str, o52 o52Var, gg2 gg2Var, oc2 oc2Var, nq2 nq2Var, si2 si2Var) {
        this.a = str;
        this.b = gg2Var;
        this.c = oc2Var;
        this.d = nq2Var;
        this.e = o52Var;
        this.f = si2Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof el2) {
            el2 el2Var = (el2) obj;
            return zn4.b(this.a, el2Var.a) && this.e.equals(el2Var.e) && zn4.b(this.b, el2Var.b) && zn4.b(this.c, el2Var.c) && zn4.b(this.d, el2Var.d) && zn4.b(this.f, el2Var.f);
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        gg2 gg2Var = this.b;
        int hashCode2 = gg2Var != null ? gg2Var.hashCode() : 0;
        int hashCode3 = this.c.hashCode();
        return (this.d.hashCode() + ((this.e.hashCode() + ((hashCode3 + ((hashCode + hashCode2) * 31)) * 31)) * 31)) * 31;
    }
}