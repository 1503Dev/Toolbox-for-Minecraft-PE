package defpackage;

import java.io.Serializable;

/* renamed from: uj1  reason: default package */
public final class uj1 implements wy4, wg3, v64 {
    public final /* synthetic */ int P;
    public final Object Q;
    public final Object R;

    public /* synthetic */ uj1(Object obj, Serializable serializable, int i) {
        this.P = i;
        this.Q = obj;
        this.R = serializable;
    }

    public static uj1 a() {
        return new uj1(new v32(), new o7());
    }

    @Override // defpackage.wg3
    /* renamed from: e */
    public final void mo0e(Object obj) {
        switch (this.P) {
            case 2:
                el4 el4Var = (el4) this.Q;
                Object obj2 = el4Var.P;
                ml4 ml4Var = (ml4) obj2;
                ((pl4) obj).s(ml4Var, el4Var.Q, (Throwable) this.R);
                return;
            default:
                jo5 jo5Var = (jo5) obj;
                return;
        }
    }

    @Override // defpackage.wy4
    public final /* bridge */ /* synthetic */ void f(Object obj) {
        ((y03) obj).D0((String) this.Q, (mg2) this.R);
    }

    @Override // defpackage.wy4
    public final void h(Throwable th) {
    }

    public uj1(String str, mg2 mg2Var) {
        this.P = 1;
        this.Q = str;
        this.R = mg2Var;
    }

    public uj1(v32 v32Var, o7 o7Var) {
        this.P = 0;
        this.R = v32Var;
        this.Q = o7Var;
    }
}