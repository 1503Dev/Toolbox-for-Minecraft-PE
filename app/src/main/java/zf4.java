package defpackage;

import java.util.concurrent.Executor;

/* renamed from: zf4  reason: default package */
public final class zf4 implements lk4 {
    public final ug4 a;
    public final wg4 b;
    public final pn5 c;
    public final String d;
    public final Executor e;
    public final by5 f;
    public final ek4 g;

    public zf4(ug4 ug4Var, wg4 wg4Var, pn5 pn5Var, String str, Executor executor, by5 by5Var, ek4 ek4Var) {
        this.a = ug4Var;
        this.b = wg4Var;
        this.c = pn5Var;
        this.d = str;
        this.e = executor;
        this.f = by5Var;
        this.g = ek4Var;
    }

    @Override // defpackage.lk4
    public final ek4 a() {
        return this.g;
    }

    @Override // defpackage.lk4
    public final Executor c() {
        return this.e;
    }
}