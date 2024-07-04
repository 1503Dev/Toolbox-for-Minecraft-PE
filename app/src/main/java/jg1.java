package defpackage;

import java.util.Map;

/* renamed from: jg1  reason: default package */
public final class jg1 implements yb0, wy4, cl4 {
    public final Object P;
    public final Object Q;

    public /* synthetic */ jg1(Object obj, Object obj2) {
        this.P = obj;
        this.Q = obj2;
    }

    public /* synthetic */ jg1(String str, ov1 ov1Var) {
        this.P = str;
        this.Q = ov1Var;
    }

    public /* synthetic */ jg1(Map map) {
        this.P = "sendMessageToNativeJs";
        this.Q = map;
    }

    public /* synthetic */ jg1(kg1 kg1Var, aw0 aw0Var) {
        this.Q = kg1Var;
        this.P = aw0Var;
    }

    @Override // defpackage.cl4
    public final void a() {
        ((x54) this.P).a.M3((ma2) this.Q);
    }

    @Override // defpackage.yb0
    public final void c(yv0 yv0Var) {
        ((kg1) this.Q).b.remove((aw0) this.P);
    }

    @Override // defpackage.wy4
    public final /* bridge */ /* synthetic */ void f(Object obj) {
        ((y03) obj).a((String) this.P, (Map) this.Q);
    }

    @Override // defpackage.wy4
    public final void h(Throwable th) {
    }
}