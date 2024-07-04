package defpackage;

import android.content.ComponentName;

/* renamed from: rh  reason: default package */
public final class rh implements vc3 {
    public final Object a;
    public Object b;
    public Object c;
    public Object d;
    public Object e;

    public /* synthetic */ rh(w33 w33Var) {
        this.a = w33Var;
    }

    public /* synthetic */ rh(yv yvVar, nh nhVar, ComponentName componentName) {
        this.a = new Object();
        this.b = yvVar;
        this.c = nhVar;
        this.d = componentName;
        this.e = null;
    }

    @Override // defpackage.vc3
    public final /* synthetic */ vc3 a(bg4 bg4Var) {
        this.c = bg4Var;
        return this;
    }

    @Override // defpackage.vc3
    public final /* synthetic */ vc3 b(zg4 zg4Var) {
        this.b = zg4Var;
        return this;
    }

    @Override // defpackage.vc3
    /* renamed from: c */
    public final x43 f() {
        tv2.E(zg3.class, (zg3) this.d);
        tv2.E(yc3.class, (yc3) this.e);
        return new x43((w33) this.a, new xa2(), new zf(), new zf(), new ea2(), (zg3) this.d, (yc3) this.e, (zg4) this.b, (bg4) this.c);
    }
}