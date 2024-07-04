package defpackage;

/* renamed from: pg4  reason: default package */
public final class pg4 implements at4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ pg4(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // defpackage.at4
    public final Object apply(Object obj) {
        switch (this.a) {
            case 0:
                rq2 rq2Var = (rq2) obj;
                qg4 qg4Var = new qg4(rq2Var, new gk4(rq2Var.Y));
                ((rg4) this.b).d = qg4Var;
                return qg4Var;
            case 1:
                String str = (String) this.b;
                Throwable th = (Throwable) obj;
                zf2 zf2Var = lg2.a;
                if (((Boolean) lb2.i.d()).booleanValue()) {
                    jv5.A.g.f("prepareClickUrl.attestation2", th);
                }
                return str;
            default:
                ((td4) this.b).a.f("AttestationTokenSignal", (Exception) obj);
                return null;
        }
    }
}