package defpackage;

import android.content.Context;
import org.json.JSONObject;

/* renamed from: sk3  reason: default package */
public final class sk3 implements lj5 {
    public final uj5 a;
    public final uj5 b;
    public final uj5 c;
    public final uj5 d;
    public final uj5 e;
    public final uj5 f;
    public final uj5 g;
    public final uj5 h;
    public final uj5 i;
    public final uj5 j;
    public final uj5 k;
    public final uj5 l;
    public final uj5 m;
    public final uj5 n;
    public final uj5 o;
    public final uj5 p;
    public final uj5 q;
    public final uj5 r;

    public sk3(uj5 uj5Var, mk3 mk3Var, uj5 uj5Var2, al3 al3Var, uj5 uj5Var3, uj5 uj5Var4, uj5 uj5Var5, uj5 uj5Var6, uj5 uj5Var7, uj5 uj5Var8, f33 f33Var, ed3 ed3Var, uj5 uj5Var9, uj5 uj5Var10, uj5 uj5Var11, uj5 uj5Var12, uj5 uj5Var13, uj5 uj5Var14) {
        this.a = uj5Var;
        this.b = mk3Var;
        this.c = uj5Var2;
        this.d = al3Var;
        this.e = uj5Var3;
        this.f = uj5Var4;
        this.g = uj5Var5;
        this.h = uj5Var6;
        this.i = uj5Var7;
        this.j = uj5Var8;
        this.k = f33Var;
        this.l = ed3Var;
        this.m = uj5Var9;
        this.n = uj5Var10;
        this.o = uj5Var11;
        this.p = uj5Var12;
        this.q = uj5Var13;
        this.r = uj5Var14;
    }

    @Override // defpackage.uj5
    public final Object c() {
        Context context = (Context) this.a.c();
        wl3 wl3Var = (wl3) ((mk3) this.b).a.P;
        tv2.C(wl3Var);
        JSONObject c = ((tk3) this.c).a.c();
        tv2.C(c);
        kp3 kp3Var = (kp3) ((al3) this.d).a.R;
        tv2.C(kp3Var);
        return new rk3(context, wl3Var, c, kp3Var, ((yl3) this.e).a(), (rz1) this.f.c(), (zd3) this.g.c(), (ld3) this.h.c(), (ni3) this.i.c(), ((pa3) this.j).a(), ((f33) this.k).a(), ((ed3) this.l).a(), (j73) this.m.c(), (km3) this.n.c(), (kd) this.o.c(), (ji3) this.p.c(), (gn4) this.q.c(), (qm4) this.r.c());
    }
}