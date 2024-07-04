package defpackage;

/* renamed from: b74  reason: default package */
public final class b74 implements v64 {
    public final Object P;
    public final Object Q;
    public Object R;

    public /* synthetic */ b74(io5 io5Var, xu5 xu5Var, lv5 lv5Var) {
        this.P = io5Var;
        this.Q = xu5Var;
        this.R = lv5Var;
    }

    public /* synthetic */ b74(j74 j74Var, String str) {
        this.P = j74Var;
        this.Q = str;
    }

    public final synchronized void a(pn5 pn5Var, int i) {
        this.R = null;
        ((f74) this.P).b(pn5Var, (String) this.Q, new g74(i), new fb3(4, this));
    }

    @Override // defpackage.v64
    /* renamed from: e */
    public final void mo5e(Object obj) {
        jo5 jo5Var = (jo5) obj;
    }
}