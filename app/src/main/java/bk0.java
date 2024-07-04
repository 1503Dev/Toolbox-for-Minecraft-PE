package defpackage;

import defpackage.cy;
import java.util.List;
import javax.annotation.Nullable;

/* renamed from: bk0  reason: default package */
public final class bk0 implements cy.a {
    public final List<cy> a;
    public final d11 b;
    @Nullable
    public final hp c;
    public final int d;
    public final uk0 e;
    public final ob f;
    public final int g;
    public final int h;
    public final int i;
    public int j;

    public bk0(List<cy> list, d11 d11Var, @Nullable hp hpVar, int i, uk0 uk0Var, ob obVar, int i2, int i3, int i4) {
        this.a = list;
        this.b = d11Var;
        this.c = hpVar;
        this.d = i;
        this.e = uk0Var;
        this.f = obVar;
        this.g = i2;
        this.h = i3;
        this.i = i4;
    }

    public final nl0 a(uk0 uk0Var) {
        return b(uk0Var, this.b, this.c);
    }

    public final nl0 b(uk0 uk0Var, d11 d11Var, @Nullable hp hpVar) {
        if (this.d < this.a.size()) {
            this.j++;
            hp hpVar2 = this.c;
            if (hpVar2 != null && !hpVar2.b().j(uk0Var.a)) {
                StringBuilder b = e5.b("network interceptor ");
                b.append(this.a.get(this.d - 1));
                b.append(" must retain the same host and port");
                throw new IllegalStateException(b.toString());
            }
            if (this.c != null && this.j > 1) {
                StringBuilder b2 = e5.b("network interceptor ");
                b2.append(this.a.get(this.d - 1));
                b2.append(" must call proceed() exactly once");
                throw new IllegalStateException(b2.toString());
            }
            List<cy> list = this.a;
            int i = this.d;
            bk0 bk0Var = new bk0(list, d11Var, hpVar, i + 1, uk0Var, this.f, this.g, this.h, this.i);
            cy cyVar = list.get(i);
            nl0 a = cyVar.a(bk0Var);
            if (hpVar != null && this.d + 1 < this.a.size() && bk0Var.j != 1) {
                throw new IllegalStateException("network interceptor " + cyVar + " must call proceed() exactly once");
            } else if (a != null) {
                if (a.V != null) {
                    return a;
                }
                throw new IllegalStateException("interceptor " + cyVar + " returned a response with no body");
            } else {
                throw new NullPointerException("interceptor " + cyVar + " returned null");
            }
        }
        throw new AssertionError();
    }
}