package defpackage;

/* renamed from: la1  reason: default package */
public final class la1 implements zc1 {
    public final /* synthetic */ ka1 a;

    /* renamed from: la1$a */
    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public static final class a extends s00 implements os<j21> {
        public final /* synthetic */ ka1 P;
        public final /* synthetic */ rc1 Q;

        public a(ka1 ka1Var, rc1 rc1Var) {
            this.P = ka1Var;
            this.Q = rc1Var;
        }

        @Override // defpackage.os
        public final j21 a() {
            this.P.k(this.Q.b.q("custom_js"));
            return j21.a;
        }
    }

    public la1(ka1 ka1Var) {
        this.a = ka1Var;
    }

    @Override // defpackage.zc1
    public final void a(rc1 rc1Var) {
        ka1 ka1Var = this.a;
        ka1.g(ka1Var, rc1Var, new a(ka1Var, rc1Var));
    }
}